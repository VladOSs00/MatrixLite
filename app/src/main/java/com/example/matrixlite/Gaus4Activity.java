package com.example.matrixlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Gaus4Activity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20;
    private TextView textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50, textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60, textView61, textView62, textView63, textView64, textView65, textView66, textView67, textView68, textView69, textView70, textView71, textView72, textView73, textView74, textView75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaus4);

        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        editTextNumber3 = (EditText) findViewById(R.id.editTextNumber3);
        editTextNumber4 = (EditText) findViewById(R.id.editTextNumber4);
        editTextNumber5 = (EditText) findViewById(R.id.editTextNumber5);
        editTextNumber6 = (EditText) findViewById(R.id.editTextNumber6);
        editTextNumber7 = (EditText) findViewById(R.id.editTextNumber7);
        editTextNumber8 = (EditText) findViewById(R.id.editTextNumber8);
        editTextNumber9 = (EditText) findViewById(R.id.editTextNumber9);
        editTextNumber10 = (EditText) findViewById(R.id.editTextNumber10);
        editTextNumber11 = (EditText) findViewById(R.id.editTextNumber11);
        editTextNumber12 = (EditText) findViewById(R.id.editTextNumber12);
        editTextNumber13 = (EditText) findViewById(R.id.editTextNumber13);
        editTextNumber14 = (EditText) findViewById(R.id.editTextNumber14);
        editTextNumber15 = (EditText) findViewById(R.id.editTextNumber15);
        editTextNumber16 = (EditText) findViewById(R.id.editTextNumber16);
        editTextNumber17 = (EditText) findViewById(R.id.editTextNumber17);
        editTextNumber18 = (EditText) findViewById(R.id.editTextNumber18);
        editTextNumber19 = (EditText) findViewById(R.id.editTextNumber19);
        editTextNumber20 = (EditText) findViewById(R.id.editTextNumber20);

        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);
        textView26 = findViewById(R.id.textView26);
        textView27 = findViewById(R.id.textView27);
        textView28 = findViewById(R.id.textView28);
        textView29 = findViewById(R.id.textView29);
        textView30 = findViewById(R.id.textView30);
        textView31 = findViewById(R.id.textView31);
        textView32 = findViewById(R.id.textView32);
        textView33 = findViewById(R.id.textView33);
        textView34 = findViewById(R.id.textView34);
        textView35 = findViewById(R.id.textView35);
        textView36 = findViewById(R.id.textView36);
        textView37 = findViewById(R.id.textView37);
        textView38 = findViewById(R.id.textView38);
        textView39 = findViewById(R.id.textView39);
        textView40 = findViewById(R.id.textView40);
        textView41 = findViewById(R.id.textView41);
        textView42 = findViewById(R.id.textView42);
        textView43 = findViewById(R.id.textView43);
        textView44 = findViewById(R.id.textView44);
        textView45 = findViewById(R.id.textView45);
        textView46 = findViewById(R.id.textView46);
        textView47 = findViewById(R.id.textView47);
        textView48 = findViewById(R.id.textView48);
        textView49 = findViewById(R.id.textView49);
        textView50 = findViewById(R.id.textView50);
        textView51 = findViewById(R.id.textView51);
        textView52 = findViewById(R.id.textView52);
        textView53 = findViewById(R.id.textView53);
        textView54 = findViewById(R.id.textView54);
        textView55 = findViewById(R.id.textView55);
        textView56 = findViewById(R.id.textView56);
        textView57 = findViewById(R.id.textView57);
        textView58 = findViewById(R.id.textView58);
        textView59 = findViewById(R.id.textView59);
        textView60 = findViewById(R.id.textView60);
        textView61 = findViewById(R.id.textView61);
        textView62 = findViewById(R.id.textView62);
        textView63 = findViewById(R.id.textView63);
        textView64 = findViewById(R.id.textView64);
        textView65 = findViewById(R.id.textView65);
        textView66 = findViewById(R.id.textView66);
        textView67 = findViewById(R.id.textView67);
        textView68 = findViewById(R.id.textView68);
        textView69 = findViewById(R.id.textView69);
        textView70 = findViewById(R.id.textView70);
        textView71 = findViewById(R.id.textView71);
        textView72 = findViewById(R.id.textView72);
        textView73 = findViewById(R.id.textView73);
        textView74 = findViewById(R.id.textView74);
        textView75 = findViewById(R.id.textView75);
    }

    public void Click(View view) {
        // Приведение полей к строкому типу
        String text = editTextNumber1.getText().toString();
        String text2 = editTextNumber2.getText().toString();
        String text3 = editTextNumber3.getText().toString();
        String text4 = editTextNumber4.getText().toString();
        String text5 = editTextNumber5.getText().toString();
        String text6 = editTextNumber6.getText().toString();
        String text7 = editTextNumber7.getText().toString();
        String text8 = editTextNumber8.getText().toString();
        String text9 = editTextNumber9.getText().toString();
        String text10 = editTextNumber10.getText().toString();
        String text11 = editTextNumber11.getText().toString();
        String text12 = editTextNumber12.getText().toString();
        String text13 = editTextNumber13.getText().toString();
        String text14 = editTextNumber14.getText().toString();
        String text15 = editTextNumber15.getText().toString();
        String text16 = editTextNumber16.getText().toString();
        String text17 = editTextNumber17.getText().toString();
        String text18 = editTextNumber18.getText().toString();
        String text19 = editTextNumber19.getText().toString();
        String text20 = editTextNumber20.getText().toString();

        // Делаем проверку если пользователь не заполнил целиком всю матрицу
        if (text.isEmpty() || text2.isEmpty() || text3.isEmpty() || text4.isEmpty() || text5.isEmpty() || text6.isEmpty() || text7.isEmpty() || text8.isEmpty() || text9.isEmpty() || text10.isEmpty() || text11.isEmpty() || text12.isEmpty() || text13.isEmpty() || text14.isEmpty() || text15.isEmpty() || text16.isEmpty() || text17.isEmpty() || text18.isEmpty() || text19.isEmpty() || text20.isEmpty()) {
            Toast toast = Toast.makeText(this, "Заполните матрицу", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else {
            Rast();
        }
    }

    public void Clear(View view) {
        Gaus gaus = new Gaus();
        gaus.Clear4(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, textView22, textView23, textView24, textView25, textView27, textView28, textView29, textView30, textView32, textView33, textView34, textView35, textView37, textView38, textView39, textView40, textView42, textView43, textView44, textView45, textView47, textView48, textView49, textView50, textView52, textView53, textView54, textView55, textView57, textView58, textView59, textView60, textView62, textView63, textView64, textView65, textView67, textView68, textView69, textView70, textView72, textView73, textView74, textView75);
    }

    public void Rand(View view) {
        Gaus gaus = new Gaus();
        gaus.Rand4(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20);
        Rast();
    }

    public void Rast() {
        Gaus gaus = new Gaus();
        gaus.Rast4(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50, textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60, textView61, textView62, textView63, textView64, textView65, textView66, textView67, textView68, textView69, textView70, textView71, textView72, textView73, textView74, textView75);
    }
}