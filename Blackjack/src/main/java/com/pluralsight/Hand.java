package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;
    private String playerName;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Hand(String playerName){
        cards = new ArrayList<>();
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void deal(Card card){
        this.cards.add(card);
    }

    public int gotSize(){
        return  this.cards.size();
    }

    public int getValue(){
        int total = 0;
        for(Card c: this.cards){
            total += c.getPointValue();
        }
        return total;
    }
}
