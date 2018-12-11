package com.init.poker.poker;

import java.util.Random;

public class Container {
    Cards[] card = new Cards[52];
    public Container(){
        for(int i=0;i<52;i++){
            card[i] = new Cards(i);
        }
    }
    public void Randomize(){
        Random ran = new Random();
        for(int i=0;i<52;i++){
            int R;
            do{
                R = ran.nextInt(52);
            }while(R==i);
            Cards tmp = card[i];
            card[i] = card[R];
            card[R] = card[i];
        }
    }
}
