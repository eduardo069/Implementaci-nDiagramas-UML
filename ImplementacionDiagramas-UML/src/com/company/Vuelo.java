package com.company;
import java.util.Vector;


public class Vuelo {
    private Avion avion;
    private  Piloto pilotoArray[];
    private Compania_Aerea compania_aerea;
    private Vector<Reserva> reservas;

    public Vuelo(){
         avion = new Avion();
         pilotoArray = new Piloto[2];
        compania_aerea = new Compania_Aerea();
        reservas = new Vector<Reserva>();

    }
}
