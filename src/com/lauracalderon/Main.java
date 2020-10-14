package com.lauracalderon;



public class Main {

    public static void main(String[] args) {



        Deck deck = new Deck();
        deck.labaraja();


        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();
    }
}