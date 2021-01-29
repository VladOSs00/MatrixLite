package com.example.matrixlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kramer2Activity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6;
    private TextView textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kramer2);

        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        editTextNumber3 = (EditText) findViewById(R.id.editTextNumber3);
        editTextNumber4 = (EditText) findViewById(R.id.editTextNumber4);
        editTextNumber5 = (EditText) findViewById(R.id.editTextNumber5);
        editTextNumber6 = (EditText) findViewById(R.id.editTextNumber6);

        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);
        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);
        textView26 = findViewById(R.id.textView26);
    }

    public void Click(View view) {
        // Приведение полей к строкому типу
        String text = editTextNumber1.getText().toString();
        String text2 = editTextNumber2.getText().toString();
        String text3 = editTextNumber3.getText().toString();
        String text4 = editTextNumber4.getText().toString();
        String text5 = editTextNumber5.getText().toString();
        String text6 = editTextNumber6.getText().toString();

        // Делаем проверку если пользователь не заполнил целиком всю матрицу
        if (text.isEmpty() || text2.isEmpty() || text3.isEmpty() || text4.isEmpty() || text5.isEmpty() || text6.isEmpty()) {
            Toast toast = Toast.makeText(this, "Заполните матрицу", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else {
            Rast();
        }
    }

    public void Clear(View view) {
        Kramer kramer = new Kramer();
        kramer.Clear2(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, textView8, textView9, textView11, textView12, textView13, textView15, textView16, textView17, textView19, textView20, textView21, textView22, textView23, textView25, textView26);
    }

    public void Rand(View view) {
        Kramer kramer = new Kramer();
        kramer.Rand2(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6);

        Rast();
    }

    public void Rast()
    {
        Kramer kramer = new Kramer();
        kramer.Rast2(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26);
    }
}