package com.init.poker.poker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Container cont = new Container();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recview = findViewById(R.id.recycle);
        recview.setHasFixedSize(true);
        recview.setLayoutManager(new LinearLayoutManager(this));
        recview.setAdapter(new CardAdapter());
    }
    public void Shuffle(View v){
        cont.Randomize();
    }

    class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardStructure> {
        @NonNull
        @Override
        public CardStructure onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new CardStructure(getLayoutInflater().inflate(R.layout.poker_role, parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull CardStructure structure, int position) {
            structure.Cardshow.setText(cont.card[position].get());
        }
        @Override
        public int getItemCount() {
            return cont.card.length;
        }
        class CardStructure extends RecyclerView.ViewHolder{
            TextView Cardshow;
            public CardStructure(View itemView) {
                super(itemView);
                Cardshow = itemView.findViewById(R.id.poker_container);
            }
        }
    }
}
