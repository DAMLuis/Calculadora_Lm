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
    Operacion opera;
    String n1 ,n2;
    Button igual;
    EditText result;
    Button mr, memo;
    boolean elec_suma, elec_resta, elec_divi, elec_multi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=(EditText)findViewById(R.id.edt_result);
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
        final Button sumar =(Button)findViewById(R.id.btn_sumar);
        final Button restar =(Button)findViewById(R.id.btn_restar);
        Button mutiplicar= (Button)findViewById(R.id.btn_multiplicar);
        Button dividir = (Button)findViewById(R.id.btn_dividir);
        igual = (Button)findViewById(R.id.btn_igual);
        memo = (Button)findViewById(R.id.btn_memo);
        mr= (Button)findViewById(R.id.btn_mr);
        igual.setEnabled(false);
        result.setEnabled(false);

        elec_suma=false; elec_resta=false; elec_divi=false; elec_multi=false;

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
                elec_suma=true;
                elec_resta=false; elec_divi=false; elec_multi=false;
            }
        });


        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=result.getText().toString();
                igual.setEnabled(true);
                result.setText("");

                elec_resta=true;
                elec_suma=false; elec_divi=false; elec_multi=false;
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=result.getText().toString();
                igual.setEnabled(true);
                result.setText("");

                elec_divi=true;
                elec_resta=false; elec_suma=false; elec_multi=false;
            }
        });


        mutiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=result.getText().toString();
                igual.setEnabled(true);
                result.setText("");
                elec_multi=true;
                elec_resta=false; elec_divi=false; elec_suma=false;
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

                    if (elec_suma) {
                       opera= new Operacion(num1,num2,"Suma");
                        result.setText("");
                        result.setText(String.valueOf(num1+num2));


                    }
                    if (elec_resta) {
                        opera=new Operacion(num1,num2,"Restar");
                        result.setText("");
                        result.setText(String.valueOf(num1-num2));

                    }

                    if (elec_multi) {
                        opera=new Operacion(num1,num2,"Multiplicacion");
                        result.setText("");
                        result.setText(String.valueOf(num1*num2));

                    }

                    if (elec_divi) {

                        if (num1 <= 0 || num2 <= 0) {
                            Toast.makeText(getApplicationContext(), "Error!!", Toast.LENGTH_SHORT).show();
                            result.setText("");
                        } else {
                            opera=new Operacion(num1,num2,"division");
                            result.setText("");
                            result.setText(String.valueOf(num1/num2));
                        }
                    }
                }


            }
        });


        mr.setEnabled(false);
        memo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String re=result.getText().toString();
                opera.setMemo(re);
                mr.setEnabled(true);

            }
        });

        mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(opera.getMemo());
            }
        });

    }

    public void borrar(View view){
        result.setText("");
        igual.setEnabled(false);
    }



}
