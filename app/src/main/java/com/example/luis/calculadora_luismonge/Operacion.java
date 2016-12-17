package com.example.luis.calculadora_luismonge;

import java.util.ArrayList;

/**
 * Created by usuario on 7/11/16.
 */

public class Operacion {

    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;

    public static ArrayList<Operacion>list=new ArrayList<>();



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



}

