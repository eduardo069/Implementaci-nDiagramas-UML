package com.company;

public class Player {

    private String name;
    private  String CoinOption;
    private int numero;


    public Player(String name){
        this.name=name;
    }

    public String getCoinOption() {
        return "";
    }

    public void setCoinOption(String opponentFlip) {
        if (opponentFlip=="Cruz")
            CoinOption="Cara";
        else
            CoinOption="Cruz";

    }

    public String getRandCoinOption(){
        numero = (int) (Math.random() * 2) + 1;
        if(numero==1)
            CoinOption="Cara";
        else
            CoinOption="Cruz";

        return CoinOption;
    }

    public void didPlayerWin(String winningFlip) {
        numero = (int) (Math.random() * 2) + 1;
        if(numero==1) {
            System.out.println("Salio cara tu tienes " + winningFlip);
            if("Cara"== winningFlip)
                System.out.println("Ganaste");
            else
                System.out.println("Perdiste");
        }
        else {
            System.out.println("Salio cruz tu tienes " + winningFlip);
            if("Cruz"== winningFlip)
                System.out.println("Ganaste");
            else
                System.out.println("Perdiste");
        }
    }
}
