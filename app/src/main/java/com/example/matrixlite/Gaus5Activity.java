package com.example.matrixlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Gaus5Activity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30;
    private TextView textView31, textView32, textView33, textView34, textView35, textView36, textView37,  textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50, textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60, textView61, textView62, textView63, textView64, textView65, textView66, textView67, textView68, textView69, textView70, textView71, textView72,  textView73, textView74, textView75,  textView76,  textView77,  textView78,  textView79,  textView80,textView81, textView82, textView83, textView84, textView85, textView86,textView87, textView88, textView89, textView90, textView91, textView92, textView93, textView94, textView95, textView96, textView97, textView98, textView99, textView100, textView101, textView102, textView103, textView104, textView105, textView106, textView107, textView108, textView109, textView110, textView111, textView112, textView113, textView114;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaus5);

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
        editTextNumber21 = (EditText) findViewById(R.id.editTextNumber21);
        editTextNumber22 = (EditText) findViewById(R.id.editTextNumber22);
        editTextNumber23 = (EditText) findViewById(R.id.editTextNumber23);
        editTextNumber24 = (EditText) findViewById(R.id.editTextNumber24);
        editTextNumber25 = (EditText) findViewById(R.id.editTextNumber25);
        editTextNumber26 = (EditText) findViewById(R.id.editTextNumber26);
        editTextNumber27 = (EditText) findViewById(R.id.editTextNumber27);
        editTextNumber28 = (EditText) findViewById(R.id.editTextNumber28);
        editTextNumber29 = (EditText) findViewById(R.id.editTextNumber29);
        editTextNumber30 = (EditText) findViewById(R.id.editTextNumber30);

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
        textView76 = findViewById(R.id.textView76);
        textView77 = findViewById(R.id.textView77);
        textView78 = findViewById(R.id.textView78);
        textView79 = findViewById(R.id.textView79);
        textView80 = findViewById(R.id.textView80);
        textView81 = findViewById(R.id.textView81);
        textView82 = findViewById(R.id.textView82);
        textView83 = findViewById(R.id.textView83);
        textView84 = findViewById(R.id.textView84);
        textView85 = findViewById(R.id.textView85);
        textView86 = findViewById(R.id.textView86);
        textView87 = findViewById(R.id.textView87);
        textView88 = findViewById(R.id.textView88);
        textView89 = findViewById(R.id.textView89);
        textView90 = findViewById(R.id.textView90);
        textView91 = findViewById(R.id.textView91);
        textView92 = findViewById(R.id.textView92);
        textView93 = findViewById(R.id.textView93);
        textView94 = findViewById(R.id.textView94);
        textView95 = findViewById(R.id.textView95);
        textView96 = findViewById(R.id.textView96);
        textView97 = findViewById(R.id.textView97);
        textView98 = findViewById(R.id.textView98);
        textView99 = findViewById(R.id.textView99);
        textView100 = findViewById(R.id.textView100);
        textView101 = findViewById(R.id.textView101);
        textView102 = findViewById(R.id.textView102);
        textView103 = findViewById(R.id.textView103);
        textView104 = findViewById(R.id.textView104);
        textView105 = findViewById(R.id.textView105);
        textView106 = findViewById(R.id.textView106);
        textView107 = findViewById(R.id.textView107);
        textView108 = findViewById(R.id.textView108);
        textView109 = findViewById(R.id.textView109);
        textView110 = findViewById(R.id.textView110);
        textView111 = findViewById(R.id.textView111);
        textView112 = findViewById(R.id.textView112);
        textView113 = findViewById(R.id.textView113);
        textView114 = findViewById(R.id.textView114);
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
        String text21 = editTextNumber10.getText().toString();
        String text22 = editTextNumber11.getText().toString();
        String text23 = editTextNumber12.getText().toString();
        String text24 = editTextNumber13.getText().toString();
        String text25 = editTextNumber14.getText().toString();
        String text26 = editTextNumber15.getText().toString();
        String text27 = editTextNumber16.getText().toString();
        String text28 = editTextNumber17.getText().toString();
        String text29 = editTextNumber18.getText().toString();
        String text30 = editTextNumber19.getText().toString();

        // Делаем проверку если пользователь не заполнил целиком всю матрицу
        if (text.isEmpty() || text2.isEmpty() || text3.isEmpty() || text4.isEmpty() || text5.isEmpty() || text6.isEmpty() || text7.isEmpty() || text8.isEmpty() || text9.isEmpty() || text10.isEmpty() || text11.isEmpty() || text12.isEmpty() || text13.isEmpty() || text14.isEmpty() || text15.isEmpty() || text16.isEmpty() || text17.isEmpty() || text18.isEmpty() || text19.isEmpty() || text20.isEmpty() || text21.isEmpty() || text22.isEmpty() || text23.isEmpty() || text24.isEmpty() || text25.isEmpty() || text26.isEmpty() || text27.isEmpty() || text28.isEmpty() || text29.isEmpty() || text30.isEmpty()) {
            Toast toast = Toast.makeText(this, "Заполните матрицу", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else {
            Rast();
        }
    }

    public void Clear(View view) {
        Gaus gaus = new Gaus();
        gaus.Clear5(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30, textView32, textView33, textView34, textView35, textView36, textView38, textView39, textView40, textView41, textView42, textView44, textView45, textView46, textView47, textView48, textView50, textView51, textView52, textView53, textView54, textView56, textView57, textView58, textView59, textView60, textView62, textView63, textView64, textView65, textView66, textView68, textView69, textView70, textView71, textView72, textView74, textView75, textView76, textView77, textView78,  textView80, textView81, textView82, textView83,  textView84, textView86, textView87, textView88, textView89, textView90, textView92, textView93, textView94, textView95, textView96, textView98, textView99, textView100, textView101, textView102, textView104, textView105, textView106, textView107, textView108, textView110, textView111, textView112, textView113, textView114);
    }

    public void Rand(View view) {
        Gaus gaus = new Gaus();
        gaus.Rand5(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30);
        Rast();
    }

    public void Rast()
    {
        Gaus gaus = new Gaus();
        gaus.Rast5(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50, textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60, textView61, textView62, textView63, textView64, textView65, textView66, textView67, textView68, textView69, textView70, textView71, textView72, textView73, textView74, textView75, textView76, textView77, textView78, textView79, textView80, textView81, textView82, textView83, textView84, textView85, textView86, textView87, textView88, textView89, textView90, textView91, textView92, textView93, textView94, textView95, textView96, textView97, textView98, textView99, textView100, textView101, textView102, textView103, textView104, textView105, textView106, textView107, textView108, textView109, textView110, textView111, textView112, textView113, textView114);
    }
}