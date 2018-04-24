package com.company;

import java.util.Vector;

public class Avion {
    private Motor motores[];
    private Vector<Vuelo> vuelos;
    public Avion()
    {
        motores = new Motor[4];
        vuelos = new Vector<Vuelo>();

    }
}
