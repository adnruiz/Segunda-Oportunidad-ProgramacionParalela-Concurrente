package com.example.androidmatrices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int [][] numeros = new int[3][3];
    int [][] numeros2 = new int[3][3];
    int [][] resultado = new int[3][3];

    private EditText a11,a12,a13,a21,a22,a23,a31,a32,a33, b11, b12, b13, b21, b22, b23, b31, b32, b33;
    private TextView c11, c12, c13, c21, c22, c23, c31, c32, c33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Matriz 1
        a11=findViewById(R.id.a11);
        a12=findViewById(R.id.a12);
        a13 = findViewById(R.id.a13);
        a21 = findViewById(R.id.a21);
        a22 = findViewById(R.id.a22);
        a23 = findViewById(R.id.a23);
        a31 = findViewById(R.id.a31);
        a32 = findViewById(R.id.a32);
        a33 = findViewById(R.id.a33);
        //Matriz 2
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b31 = findViewById(R.id.b31);
        b32 = findViewById(R.id.b32);
        b33 = findViewById(R.id.b33);
        //Matriz de
        c11=findViewById(R.id.c11);
        c12=findViewById(R.id.c12);
        c13 = findViewById(R.id.c13);
        c21 = findViewById(R.id.c21);
        c22 = findViewById(R.id.c22);
        c23 = findViewById(R.id.c23);
        c31 = findViewById(R.id.c31);
        c32 = findViewById(R.id.c32);
        c33 = findViewById(R.id.c33);



    }

    class  Task1 extends AsyncTask<String, Void, String>{
        public void multiplicar(){
            for(int i  = 0; i <numeros2.length; i++){
                for(int j = 0; j <numeros2.length; j++){
                    resultado[i][j] = numeros[i][j] * numeros2[i][j];

                    c11.setText(""+resultado[0][0]);
                    c12.setText(""+resultado[0][1]);
                    c13.setText(""+resultado[0][2]);
                    c21.setText(""+resultado[1][0]);
                    c22.setText(""+resultado[1][1]);
                    c23.setText(""+resultado[1][2]);
                    c31.setText(""+resultado[2][0]);
                    c32.setText(""+resultado[2][1]);
                    c33.setText(""+resultado[2][2]);
                }
            }
        }

        @Override
        protected void onPreExecute() {
            numeros[0][0] = Integer.parseInt(a11.getText().toString());
            numeros[0][1] = Integer.parseInt(a12.getText().toString());
            numeros[0][2] = Integer.parseInt(a13.getText().toString());
            numeros[1][0] = Integer.parseInt(b12.getText().toString());
            numeros[1][1] = Integer.parseInt(b12.getText().toString());
            numeros[1][2] = Integer.parseInt(b12.getText().toString());

            numeros[2][0] = Integer.parseInt(a21.getText().toString());
            numeros[2][1] = Integer.parseInt(a22.getText().toString());
            numeros[2][2] = Integer.parseInt(a23.getText().toString());
            numeros[0][0] = Integer.parseInt(b21.getText().toString());
            numeros[0][1] = Integer.parseInt(b22.getText().toString());
            numeros[0][2] = Integer.parseInt(b23.getText().toString());

            numeros[1][0] = Integer.parseInt(a31.getText().toString());
            numeros[1][1] = Integer.parseInt(a32.getText().toString());
            numeros[1][2] = Integer.parseInt(a33.getText().toString());
            numeros[2][0] = Integer.parseInt(b31.getText().toString());
            numeros[2][1] = Integer.parseInt(b32.getText().toString());
            numeros[2][2] = Integer.parseInt(b33.getText().toString());
        }

        @Override
        protected String doInBackground(String... strings) {
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            multiplicar();
        }
    }
}