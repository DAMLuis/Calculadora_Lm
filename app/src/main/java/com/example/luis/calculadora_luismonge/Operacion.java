package com.example.luis.calculadora_luismonge;


import java.util.ArrayList;

public class Operacion {

    private int n1, n2;
    private String opera;
    private String memo="";
    private ArrayList<String>datos=new ArrayList<>();


    public Operacion() {
    }

    public Operacion(int n1, int n2, String opera) {
        this.n1 = n1;
        this.n2 = n2;
        this.opera = opera;
    }


    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    public int getN2() {
        return n2;

    }

    public String getOpera() {
        return opera;
    }



    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}

