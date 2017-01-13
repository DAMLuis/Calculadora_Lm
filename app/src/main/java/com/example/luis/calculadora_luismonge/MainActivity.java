package com.example.luis.calculadora_luismonge;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Operacion opera= new Operacion();
    String tipoOpera;
    String n1 ,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Integer>memoria= new ArrayList<>();
        final EditText result=(EditText)findViewById(R.id.edt_result);
        Button num0 =(Button)findViewById(R.id.btn_0);
        Button num1 =(Button)findViewById(R.id.btn_1);
        Button num2 =(Button)findViewById(R.id.btn_2);
        Button num3 =(Button)findViewById(R.id.btn_3);
        Button num4 =(Button)findViewById(R.id.btn_4);
        Button num5 =(Button)findViewById(R.id.btn_5);
        Button num6 =(Button)findViewById(R.id.btn_6);
        Button num7 =(Button)findViewById(R.id.btn_7);
        Button num8 =(Button)findViewById(R.id.btn_8);
        Button num9 =(Button)findViewById(R.id.btn_9);
        Button sumar =(Button)findViewById(R.id.btn_sumar);
        final Button restar =(Button)findViewById(R.id.btn_restar);
        Button mutiplicar= (Button)findViewById(R.id.btn_multiplicar);
        Button dividir = (Button)findViewById(R.id.btn_dividir);
        final Button igual = (Button)findViewById(R.id.btn_igual);
        Button borrar = (Button)findViewById(R.id.btn_ce);
        Button memo = (Button)findViewById(R.id.btn_memo);

        igual.setEnabled(false);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"3");
            }
        });


        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"4");
            }
        });


        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"5");
            }
        });


        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"6");
            }
        });


        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"7");
            }
        });


        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"8");
            }
        });


        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=result.getText().toString();
                result.setText(n+"9");
            }
        });

        //Operaciones

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=result.getText().toString();
                igual.setEnabled(true);
                result.setText("");

                tipoOpera="suma";

            }
        });


        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=result.getText().toString();
                igual.setEnabled(true);
                result.setText("");

                tipoOpera="resta";

            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=result.getText().toString();
                igual.setEnabled(true);
                result.setText("");

                tipoOpera="divi";

            }
        });


        mutiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=result.getText().toString();
                igual.setEnabled(true);
                result.setText("");
                tipoOpera="multi";

            }
        });



        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().toString().isEmpty()){
                    result.setText("");

                }else {


                    n2 = result.getText().toString();

                    int num1 = Integer.parseInt(n1);
                    int num2 = Integer.parseInt(n2);

                    if (tipoOpera.equals("suma")) {
                        opera.sumar(num1, num2);
                        result.setText("");
                        result.setText(String.valueOf(opera.getSuma()));


                    }
                    if (tipoOpera.equals("resta")) {
                        opera.restar(num1, num2);
                        result.setText("");
                        result.setText(String.valueOf(opera.getResta()));

                    }

                    if (tipoOpera.equals("multi")) {
                        opera.multiplicar(num1, num2);
                        result.setText("");
                        result.setText(String.valueOf(opera.getMultiplicacion()));

                    }

                    if (tipoOpera.equals("divi")) {

                        if (num1 <= 0 || num2 <= 0) {
                            Toast.makeText(getApplicationContext(), "Error!!", Toast.LENGTH_SHORT).show();
                            result.setText("");
                        } else {
                            opera.dividir(num1, num2);
                            result.setText("");
                            result.setText(String.valueOf(opera.getDivision()));
                        }
                    }
                }


            }
        });



        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                igual.setEnabled(false);
            }
        });


        memo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                result.setText(opera.getMemo());
            }
        });




    }
}
