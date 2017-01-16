package com.example.luis.calculadora_luismonge;


import java.util.ArrayList;


public class Operacion {

    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;

    private String memo="";



    public void sumar(int n1,int n2){
        suma=n1+n2;
    }

    public void restar(int n1, int n2){

        resta=n1-n2;

    }

    public void dividir(int n1, int n2){
        division=n1/n2;
    }

    public void multiplicar(int n1, int n2){
        multiplicacion=n1*n2;
    }


    public int getSuma() {
        return suma;
    }

    public int getResta() {
        return resta;
    }

    public int getMultiplicacion() {

        return multiplicacion;
    }

    public int getDivision() {
        return division;
    }


    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}

