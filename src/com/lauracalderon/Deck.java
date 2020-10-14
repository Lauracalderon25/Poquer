package com.lauracalderon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Deck {
    private HashMap<String,String> PALOS = new HashMap<String, String>();
    private ArrayList<Card> mimazo = new ArrayList<Card>(); //se refiere al mazo con el que estas jugando
    private String strFormat = "Quedan %s";

    public ArrayList<Card> getMimazo() { //este metodo manda a llamar la clase Card
        return mimazo;
    }

    public void mazo(){ //se definio que son 4 pares de atributos
        PALOS.put("Diamante", "Rojo");
        PALOS.put("Trebol", "Negro");
        PALOS.put("Pica", "Negro");
        PALOS.put("Corazon", "Rojo");
    }

    public void labaraja(){ //en este metodo crea todas las cartas se podria es ciclo(constructor)
        mazo();
        for (Map.Entry<String,String> palo:PALOS.entrySet()){
            var paloCard = palo.getKey();
            var color = palo.getValue();

            for (int i=1;i <= 13;i++){
                Card card = new Card(paloCard, color);
                card.setValor(i);
                mimazo.add(card);
            }
        }
    }

    public void shuffle(){ //se barajea la baraja
        Collections.shuffle(mimazo);
        System.out.println("Se mezcló el Deck");
    }

    public void head(){   //muestra la primera carta del Deck
        var card = mimazo.get(mimazo.size()-1);
        mimazo.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,mimazo.size()));
    }
    private Card randomCard(){  //Agarra cualquier carta al azar
        //inicio - final - constante - el tamaño
        var rnd = (int)Math.floor(Math.random()*(1-mimazo.size()+1)+mimazo.size());
        return mimazo.get(rnd);
    }
    public void pick(){  //sacar una carta random del mazo
        var card = randomCard();
        mimazo.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,mimazo.size()));
    }
    private void printHand(ArrayList<Card> cards){
        for (var card: cards) System.out.println(card.toString());
    }
    public void hand(){  //sacar una mano de 5 cartas
        if(mimazo.size() <= 5){
            for (var card:mimazo){
                printHand(mimazo);
            }
        }else {
            var cards = new ArrayList<Card>();
            Card card;
            for (int i=1;i<=5;i++){
                card = randomCard();
                mimazo.remove(card);
                cards.add(card);
            }
            printHand(cards); //String format se utilizo para darle un valor String a un int
            System.out.println(String.format(strFormat,mimazo.size()));
        }
    }

}

        //son pruebas de codigo
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