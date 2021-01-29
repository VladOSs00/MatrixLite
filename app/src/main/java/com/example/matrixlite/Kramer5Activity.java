package com.example.matrixlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kramer5Activity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30;
    private TextView textView87, textView84, textView115, textView198, textView199, textView200, textView102, textView152, textView201, textView116, textView202, textView203, textView204, textView107, textView153, textView86, textView117, textView205, textView206, textView207, textView111, textView154, textView181, textView121, textView122, textView123, textView124, textView125, textView155, textView126, textView127, textView128, textView129, textView130, textView131, textView156, textView132, textView133, textView134, textView135, textView136, textView140, textView157, textView141, textView142, textView143, textView144, textView145, textView213, textView214, textView215, textView216, textView217, textView146, textView147, textView148, textView149, textView150, textView151;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kramer5);

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

        textView87 = findViewById(R.id.textView87);
        textView84 = findViewById(R.id.textView84);
        textView115 = findViewById(R.id.textView115);
        textView198 = findViewById(R.id.textView198);
        textView199 = findViewById(R.id.textView199);
        textView200 = findViewById(R.id.textView200);
        textView102 = findViewById(R.id.textView102);
        textView152 = findViewById(R.id.textView152);
        textView201 = findViewById(R.id.textView201);
        textView116 = findViewById(R.id.textView116);
        textView202 = findViewById(R.id.textView202);
        textView203 = findViewById(R.id.textView203);
        textView204 = findViewById(R.id.textView204);
        textView107 = findViewById(R.id.textView107);
        textView153 = findViewById(R.id.textView153);
        textView86 = findViewById(R.id.textView86);
        textView117 = findViewById(R.id.textView117);
        textView205 = findViewById(R.id.textView205);
        textView206 = findViewById(R.id.textView206);
        textView207 = findViewById(R.id.textView207);
        textView111 = findViewById(R.id.textView111);
        textView154 = findViewById(R.id.textView154);
        textView181 = findViewById(R.id.textView181);
        textView121 = findViewById(R.id.textView121);
        textView122 = findViewById(R.id.textView122);
        textView123 = findViewById(R.id.textView123);
        textView124 = findViewById(R.id.textView124);
        textView125 = findViewById(R.id.textView125);
        textView155 = findViewById(R.id.textView155);
        textView181 = findViewById(R.id.textView181);
        textView126 = findViewById(R.id.textView126);
        textView127 = findViewById(R.id.textView127);
        textView128 = findViewById(R.id.textView128);
        textView129 = findViewById(R.id.textView129);
        textView130 = findViewById(R.id.textView130);
        textView131 = findViewById(R.id.textView131);
        textView156 = findViewById(R.id.textView156);
        textView132 = findViewById(R.id.textView132);
        textView133 = findViewById(R.id.textView133);
        textView134 = findViewById(R.id.textView134);
        textView135 = findViewById(R.id.textView135);
        textView136 = findViewById(R.id.textView136);
        textView140 = findViewById(R.id.textView140);
        textView157 = findViewById(R.id.textView157);
        textView141 = findViewById(R.id.textView141);
        textView142 = findViewById(R.id.textView142);
        textView143 = findViewById(R.id.textView143);
        textView144 = findViewById(R.id.textView144);
        textView145 = findViewById(R.id.textView145);
        textView213 = findViewById(R.id.textView213);
        textView214 = findViewById(R.id.textView214);
        textView215 = findViewById(R.id.textView215);
        textView216 = findViewById(R.id.textView216);
        textView217 = findViewById(R.id.textView217);
        textView146 = findViewById(R.id.textView146);
        textView147 = findViewById(R.id.textView147);
        textView148 = findViewById(R.id.textView148);
        textView149 = findViewById(R.id.textView149);
        textView150 = findViewById(R.id.textView150);
        textView151 = findViewById(R.id.textView151);
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
        Kramer kramer = new Kramer();
        kramer.Clear5(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30, textView84, textView115, textView198, textView199, textView200, textView201, textView116, textView202, textView203, textView204, textView152, textView86, textView117, textView205, textView206, textView207, textView153, textView154, textView181, textView121, textView122, textView123, textView124, textView155, textView126, textView127, textView128, textView129, textView130, textView156, textView132, textView133, textView134, textView135, textView136, textView157, textView141, textView142, textView143, textView144, textView145, textView213, textView214, textView215, textView216, textView217, textView147, textView148, textView149, textView150, textView151);
    }

    public void Rand(View view) {
        Kramer kramer = new Kramer();
        kramer.Rand5(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30);
        Rast();
    }


    public  void Rast()
    {
        Kramer kramer = new Kramer();
        kramer.Rast5(editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30, textView87, textView84, textView115, textView198, textView199, textView200, textView102, textView152, textView201, textView116, textView202,  textView203, textView204, textView107, textView153, textView86, textView117, textView205, textView206, textView207, textView111, textView154, textView181, textView121, textView122, textView123, textView124, textView125, textView155, textView126,  textView127, textView128, textView129, textView130, textView131, textView156, textView132, textView133, textView134, textView135, textView136, textView140, textView157, textView141, textView142, textView143, textView144, textView145, textView213, textView214, textView215, textView216, textView217, textView146, textView147, textView148, textView149, textView150, textView151);
    }
}