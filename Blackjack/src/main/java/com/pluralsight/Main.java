package com.pluralsight;

public class Main {
    private static final Console console = new Console();
    public static void main(String[] args) {

        String firstPerson = console.promptForString("Player one please Enter Your name: ");

        String secondPerson = console.promptForString("Player two please Enter Your name: ");

        Deck d = new Deck();
        d.shuffle();

        Hand h1 = new Hand(firstPerson);
        Hand h2 = new Hand(secondPerson);

        for (int i = 0; i < 2; i++){
            Card c1 = d.deal();
            c1.flip();
            h1.deal(c1);

            Card c2 = d.deal();
            c2.flip();
            h2.deal(c2);
        }

        display(h1);

        display(h2);

        int v1 = h1.getValue();
        int v2 = h2.getValue();

        System.out.println("\n*====== RRSULT ======*");
        if (v1 > 21 && v2 > 21){
            System.out.println("Both hands lost!");
        } else if (v1 > 21) {
            System.out.println(h2.getPlayerName() + " Win!");
        } else if (v2 > 21) {
            System.out.println(h1.getPlayerName() + " Win!");
        } else if (v1 > v2) {
            System.out.println(h1.getPlayerName() + " Win!");
        } else if (v2 > v1) {
            System.out.println(h2.getPlayerName() + " Win!");
        } else {
            System.out.println("It's a Draw!");
        }

    }

    public static void display(Card c){
        if (c.getSuit().equalsIgnoreCase("Hearts") || c.getSuit().equalsIgnoreCase("Diamonds")){
            System.out.println(ColorCodes.RED +c.getValue()  + " " + c.getSuit() + ColorCodes.RESET);
        } else {
            System.out.println(c.getValue() + " " + c.getSuit());
        }
    }

    public static void display(Hand h){
        for(Card c : h.getCards()){
            display(c);
        }

        System.out.println(h.getPlayerName() + "'s Hand: " + h.getValue());

//        for(Card c : h2.getCards()){
//            display(c);
//        }
//
//        System.out.println(h2.getPlayerName() + "'s Hand: " + h2.getValue());

    }




}