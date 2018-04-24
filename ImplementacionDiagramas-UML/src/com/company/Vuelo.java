package com.company;
import java.util.Vector;


public class Vuelo {
    private Avion avion;
    private  Piloto pilotoArray[];
    private Compania_Aerea compania_aerea;
    private Vector<Reserva> reservas;

    public Vuelo(){
       Avion avion = new Avion();
       Piloto pilotoArray[] = new Piloto[2];
       Compania_Aerea compania_aerea = new Compania_Aerea();
      Vector<Reserva> reservas = new Vector<Reserva>();

    }
}
