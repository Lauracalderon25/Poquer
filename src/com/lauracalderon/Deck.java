package com.lauracalderon;
import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Deck {

    private Card cartas[];
    private int sigcarta;



    public void mazo () {
        int numerodecartas = 52;

        this.cartas = new Card[numerodecartas];
                this.sigcarta= 0;
    }
    private void crearBaraja(){
        String[] palos = Card.PALOS;

        for(int i=0; i<palos.length; i++){

            for(int j=0; j<Card.limitecartas; j++){

                cartas [((Card.limitecartas))+j] = new Card(j+1,palos[i]);

            }
        }

    }

}



        /*ArrayList<Object> mazo = new ArrayList<>();

        for (int i = 0; i <= 52; i++) {
            mazo.add(i);
        }
        System.out.println("Cartas"+mazo);

        List<Object> shuffleMe = new ArrayList<Object>(mazo);
        Collections.shuffle(shuffleMe);
        Set<Object> shuffledSet = new LinkedHashSet<Object>();
        shuffledSet.addAll(shuffleMe);
        System.out.println("\nSe mezclo el Deck" );*/