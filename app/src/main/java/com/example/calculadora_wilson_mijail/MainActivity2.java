package com.example.calculadora_wilson_mijail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
        }

        public void entrar(View view) {startActivity(new Intent(this, MainActivity.class));
        }

        public void salir(View view) {finish();
        }
    }