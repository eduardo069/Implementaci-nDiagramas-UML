package com.company;

public class Cliente_Corporativa extends Cliente {

    private Contrato contrato;
    private Vendedor vendedor;

    public void Cliente_Corporativo(){
        contrato= new Contrato();
        vendedor= new Vendedor();


    }
}
