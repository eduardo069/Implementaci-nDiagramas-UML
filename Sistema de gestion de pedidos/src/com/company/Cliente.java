package com.company;

import java.util.Vector;

public class Cliente {

    private Vector<Pedido> pedidos;

    public void Cliente(){
        pedidos= new Vector<Pedido>();
    }

    public int ConsultarDesdePendedor(Sistema_Pago s1){

        return s1.Consultar_saldo();
    }
}
