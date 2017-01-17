package com.example.luis.calculadora_luismonge;


import java.util.ArrayList;

public class Operacion {

    private int n1, n2;
    private String opera;
    private String memo="";
    private String resultado="";
    public static ArrayList<String>datos=new ArrayList<>();


    public Operacion() {
    }

    public Operacion(int n1, int n2, String opera,String resultado) {
        this.n1 = n1;
        this.n2 = n2;
        this.opera = opera;
        this.resultado=resultado;
        datos.add(n1+opera +n2+"="+resultado);
    }




    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }



}

