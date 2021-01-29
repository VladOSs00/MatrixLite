package com.example.matrixlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kramer4Activity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20;
    private TextView textView67, textView182, textView183, textView184, textView185, textView25, textView186, textView187, textView188, textView84, textView82, textView85, textView28, textView29, textView30, textView86, textView110, textView88, textView189, textView190, textView79, textView93, textView112, textView33, textView94, textView95, textView96, textView97, textView113, textView34, textView98, textView99, textView22, textView101, textView114, textView171, textView175, textView176, textView177, textView103, textView104, textView105, textView108, textView109;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kramer4);

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

        textView67 = findViewById(R.id.textView67);
        textView182 = findViewById(R.id.textView182);
        textView183 = findViewById(R.id.textView183);
        textView184 = findViewById(R.id.textView184);
        textView185 = findViewById(R.id.textView185);
        textView25 = findViewById(R.id.textView25);
        textView186 = findViewById(R.id.textView186);
        textView187 = findViewById(R.id.textView187);
        textView188 = findViewById(R.id.textView188);
        textView84 = findViewById(R.id.textView84);
        textView82 = findViewById(R.id.textView82);
        textView85 = findViewById(R.id.textView85);
        textView28 = findViewById(R.id.textView28);
        textView29 = findViewById(R.id.textView29);
        textView30 = findViewById(R.id.textView30);
        textView86 = findViewById(R.id.textView86);
        textView110 = findViewById(R.id.textView110);
        textView88 = findViewById(R.id.textView88);
        textView189 = findViewById(R.id.textView189);
        textView190 = findViewById(R.id.textView190);
        textView79 = findViewById(R.id.textView79);
        textView93 = findViewById(R.id.textView93);
        textView112 = findViewById(R.id.textView112);
        textView33 = findViewById(R.id.textView33);
        textView94 = findViewById(R.id.textView94);
        textView95 = findViewById(R.id.textView95);
        textView96 = findViewById(R.id.textView96);
        textView97 = findViewById(R.id.textView97);
        textView113 = findViewById(R.id.textView113);
        textView34 = findViewById(R.id.textView34);
        textView98 = findViewById(R.id.textView98);
        textView99 = findViewById(R.id.textView99);
        textView22 = findViewById(R.id.textView22);
        textView101 = findViewById(R.id.textView101);
        textView114 = findViewById(R.id.textView114);
        textView171 = findViewById(R.id.textView171);
        textView175 = findViewById(R.id.textView175);
        textView176 = findViewById(R.id.textView176);
        textView177 = findViewById(R.id.textView177);
        textView103 = findViewById(R.id.textView103);
        textView104 = findViewById(R.id.textView104);
        textView105 = findViewById(R.id.textView105);
        textView108 = findViewById(R.id.textView108);
        textView109 = findViewById(R.id.textView109);
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
        Kramer kramer = new Kramer();
        kramer.Clear4(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20);
    }

    public void Rand(View view) {
        Kramer kramer = new Kramer();
        kramer.Rand4(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20);
        Rast();
    }

    public  void Rast()
    {
        Kramer kramer = new Kramer();
        kramer.Rast4(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, textView67, textView182, textView183, textView184, textView185, textView25, textView186, textView187, textView188, textView84, textView82, textView85, textView28, textView29, textView30, textView86, textView110, textView88, textView189, textView190, textView79, textView93, textView112, textView33, textView94, textView95, textView96, textView97, textView113, textView34, textView98, textView99, textView22, textView101, textView114, textView171, textView175, textView176, textView177, textView103, textView104, textView105, textView108, textView109);
    }
}