package com.company;

import java.util.Vector;
import java.util.Scanner;


public class CoinGame {

    private Player players[] = new Player[2];
    private Coin theCoin;
    private int numero;
    private  String moneda;
    private int jugar=1;

    public CoinGame(){

        starGame();
    }
    public void starGame(){

        while (jugar==1) {
            System.out.println("Juego iniciado");
            players[0] = new Player("Player1");
            players[1] = new Player("Player2");

            numero = (int) (Math.random() * 2) + 1;
            if (numero == 1) {
                System.out.println("Inicia el jugador 1");
                moneda = players[0].getRandCoinOption();
                players[1].setCoinOption(moneda);
                players[0].didPlayerWin(moneda);

            } else {
                System.out.println("Inicia el jugador 2");
                moneda = players[1].getRandCoinOption();
                players[0].setCoinOption(moneda);
                players[1].didPlayerWin(moneda);
            }

            System.out.println("Quieres seguir jugando? Si=1 o No=0");
            Scanner reader = new Scanner(System.in);

            jugar = reader.nextInt();

        }
    }
}