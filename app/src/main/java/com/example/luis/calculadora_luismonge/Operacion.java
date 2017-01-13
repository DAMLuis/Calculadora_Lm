package com.example.luis.calculadora_luismonge;

import android.graphics.Path;
import android.widget.Toast;

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
        memo=String.valueOf(suma);
        return suma;
    }

    public int getResta() {
        memo=String.valueOf(resta);
        return resta;
    }

    public int getMultiplicacion() {
        memo=String.valueOf(multiplicacion);
        return multiplicacion;
    }

    public int getDivision() {
        memo=String.valueOf(division);
        return division;
    }


    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}

