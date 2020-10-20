package com.lauracalderon;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



            Deck deck = new Deck();
            deck.labaraja();


            Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;
            System.out.println("Bienvenido al poker");
            System.out.println("Selecciona una opcion");

            while (!salir) {

                System.out.println("1 Mezclar deck");
                System.out.println("2 Sacar una carta");
                System.out.println("3 Carta al azar");
                System.out.println("4 Generar una mano de 5 cartas");
                System.out.println("0 Salir");



                try {
                    System.out.println("Introduce un numero: ");
                    opcion = sn.nextInt();


                    switch (opcion) {
                        case 1:
                            deck.shuffle();
                            break;

                        case 2:
                            deck.head();
                            break;

                        case 3:
                            deck.pick();
                            break;
                        case 4:
                            deck.hand();
                            break;
                        case 0:
                            salir = true;
                            System.out.println("Fin del Juego");
                            break;

                    }
                } catch (InputMismatchException e) {
                    System.out.println("Tienes que introducir un numero!!!");
                    sn.next();
                }

            }

        }


            /*Deck deck = new Deck();
            deck.labaraja();


            deck.shuffle();
            deck.head();
            deck.pick();
            deck.hand();*/



}