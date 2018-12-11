package com.init.poker.poker;
public class Cards {
    char[] suit = {'\u2663','\u2666','\u2665','\u2660'};
    int number;
    public Cards(int number){
        this.number = number;
    }
    public String get(){
        return (number%13)+1+""+suit[number/13];
    }

}
