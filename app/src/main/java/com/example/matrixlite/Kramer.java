package com.example.matrixlite;

import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Kramer extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30, editTextNumber31, editTextNumber32, editTextNumber33, editTextNumber34, editTextNumber35, editTextNumber36, editTextNumber37, editTextNumber38, editTextNumber39, editTextNumber40, editTextNumber41, editTextNumber42;
    private TextView textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50, textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60, textView61, textView62, textView63, textView64, textView65, textView66, textView67, textView68, textView69, textView70, textView71, textView72, textView73, textView74, textView75, textView182, textView115, textView198, textView199, textView200, textView183, textView201, textView116, textView202, textView203, textView204, textView152, textView86, textView117, textView205, textView206, textView207, textView153, textView154, textView181, textView121, textView122, textView123, textView124, textView155, textView126, textView127, textView128, textView129, textView130, textView156, textView132, textView133, textView134, textView135, textView136, textView157, textView141, textView142, textView143, textView144, textView145, textView213, textView214, textView215, textView216, textView217, textView147, textView148, textView149, textView150, textView151, textView211;


    public void Clear2(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, TextView textView8, TextView textView9, TextView textView11, TextView textView12, TextView textView13, TextView textView15, TextView textView16, TextView textView17, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView25, TextView textView26) {
        editTextNumber1.setText(null);
        editTextNumber2.setText(null);
        editTextNumber3.setText(null);
        editTextNumber4.setText(null);
        editTextNumber5.setText(null);
        editTextNumber6.setText(null);

        textView8.setText(null);
        textView9.setText(null);
        textView11.setText(null);
        textView12.setText(null);
        textView13.setText(null);
        textView15.setText(null);
        textView16.setText(null);
        textView17.setText(null);
        textView19.setText(null);
        textView20.setText(null);
        textView21.setText(null);
        textView22.setText(null);
        textView23.setText(null);
        textView25.setText(null);
        textView26.setText(null);
    }

    public void Rand2(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6) {
        int a = 1; // Начальное значение диапазона - "от"
        int b = 99; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        int random_number4 = a + (int) (Math.random() * b); // Генерация 4-го числа
        int random_number5 = a + (int) (Math.random() * b); // Генерация 5-го числа
        int random_number6 = a + (int) (Math.random() * b); // Генерация 6-го числа

        editTextNumber1.setText(Integer.toString(random_number1));
        editTextNumber2.setText(Integer.toString(random_number2));
        editTextNumber3.setText(Integer.toString(random_number3));
        editTextNumber4.setText(Integer.toString(random_number4));
        editTextNumber5.setText(Integer.toString(random_number5));
        editTextNumber6.setText(Integer.toString(random_number6));
    }

    public void Rast2(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26) {
        double a11 = Double.parseDouble((editTextNumber1.getText().toString()));
        double a12 = Double.parseDouble((editTextNumber2.getText().toString()));
        double b1 = Double.parseDouble((editTextNumber3.getText().toString()));
        double a21 = Double.parseDouble((editTextNumber4.getText().toString()));
        double a22 = Double.parseDouble((editTextNumber5.getText().toString()));
        double b2 = Double.parseDouble((editTextNumber6.getText().toString()));

        textView7.setText("Перепишем систему уравнений в матричном виде");
        // Вывод общей матрицы
        String S1 = a11 + " " + a12 + " " + b1;
        textView8.setText(S1);
        String S2 = a21 + " " + a22 + " " + b2;
        textView9.setText(S2);

        textView10.setText("Расчет общего определителя");
        //  Вывод определителя
        String S14 = a11 + " " + a12;
        textView11.setText(S14);
        String S15 = a21 + " " + a22;
        textView12.setText(S15);

        double zx = (double) a11 * a22;
        double v = (double) a12 * a21;
        double sd = (double) zx - v;

        // определяем определитель на равенство нулю
        if (sd == 0) {

            String S3 = " =  " + a11 + " * " + a22 + " - " + a12 + " * " + a21 + " = " + zx + " - " + v + " = " + sd;
            textView13.setText(S3);

            textView14.setVisibility(View.INVISIBLE);
            textView15.setVisibility(View.INVISIBLE);
            textView16.setVisibility(View.INVISIBLE);
            textView17.setVisibility(View.INVISIBLE);
            textView18.setVisibility(View.INVISIBLE);
            textView19.setVisibility(View.INVISIBLE);
            textView20.setVisibility(View.INVISIBLE);
            textView21.setVisibility(View.INVISIBLE);
            textView22.setVisibility(View.INVISIBLE);
            textView23.setVisibility(View.INVISIBLE);
            textView24.setVisibility(View.INVISIBLE);
            textView25.setVisibility(View.INVISIBLE);
            textView26.setVisibility(View.INVISIBLE);


        } else {
            String S3 = " =  " + a11 + " * " + a22 + " - " + a12 + " * " + a21 + " = " + zx + " - " + v + " = " + sd;
            textView13.setText(S3);

            textView14.setText("Расчет 1-го определителя");
            String S4 = b1 + " " + a12;
            textView15.setText(S4);
            String S5 = b2 + " " + a22;
            textView16.setText(S5);

            double zx1 = (double) b1 * a22;
            double v1 = (double) a12 * b2;
            double sd1 = (double) zx1 - v1;
            String S6 = " =  " + b1 + " * " + a22 + " - " + a12 + " * " + b2 + " = " + zx1 + " - " + v1 + " = " + sd1;
            textView17.setText(S6);

            textView18.setText("Расчет 2-го определителя");
            String S7 = a11 + " " + b1;
            textView19.setText(S7);
            String S8 = a21 + " " + b2;
            textView20.setText(S8);

            double zx2 = (double) a11 * b2;
            double v2 = (double) b1 * a21;
            double sd2 = (double) zx2 - v2;
            String S9 = " =  " + a11 + " * " + b2 + " - " + b1 + " * " + a21 + " = " + zx2 + " - " + v2 + " = " + sd2;
            textView21.setText(S9);

            double zx3 = sd1 / sd;
            String result1 = String.format("%.1f", zx3);
            String S10 = sd1 + " / " + sd + " = " + result1;
            textView22.setText("X1 =" + S10);

            double v3 = sd2 / sd;
            String result2 = String.format("%.1f", v3);
            String S11 = sd2 + " / " + sd + " = " + result2;
            textView23.setText("X2 =" + S11);

            textView24.setText("Ответ:");
            String S12 = "X1 = " + result1;
            textView25.setText(S12);
            String S13 = "X2 = " + result2;
            textView26.setText(S13);

            textView15.setVisibility(View.VISIBLE);
            textView15.setVisibility(View.VISIBLE);
            textView16.setVisibility(View.VISIBLE);
            textView17.setVisibility(View.VISIBLE);
            textView18.setVisibility(View.VISIBLE);
            textView19.setVisibility(View.VISIBLE);
            textView20.setVisibility(View.VISIBLE);
            textView21.setVisibility(View.VISIBLE);
            textView22.setVisibility(View.VISIBLE);
            textView23.setVisibility(View.VISIBLE);
            textView23.setVisibility(View.VISIBLE);
            textView24.setVisibility(View.VISIBLE);
            textView25.setVisibility(View.VISIBLE);
            textView26.setVisibility(View.VISIBLE);
        }

    }

    public void Clear3(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, TextView textView14, TextView textView15, TextView textView16, TextView textView19, TextView textView18, TextView textView20, TextView textView21, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView37, TextView textView38, TextView textView39, TextView textView41, TextView textView42, TextView textView43) {
        editTextNumber1.setText(null);
        editTextNumber2.setText(null);
        editTextNumber3.setText(null);
        editTextNumber4.setText(null);
        editTextNumber5.setText(null);
        editTextNumber6.setText(null);
        editTextNumber7.setText(null);
        editTextNumber8.setText(null);
        editTextNumber9.setText(null);
        editTextNumber10.setText(null);
        editTextNumber11.setText(null);
        editTextNumber12.setText(null);

        textView14.setText(null);
        textView15.setText(null);
        textView16.setText(null);
        textView19.setText(null);
        textView18.setText(null);
        textView20.setText(null);
        textView21.setText(null);
        textView23.setText(null);
        textView24.setText(null);
        textView25.setText(null);
        textView26.setText(null);
        textView28.setText(null);
        textView29.setText(null);
        textView30.setText(null);
        textView31.setText(null);
        textView33.setText(null);
        textView34.setText(null);
        textView35.setText(null);
        textView36.setText(null);
        textView37.setText(null);
        textView38.setText(null);
        textView39.setText(null);
        textView41.setText(null);
        textView42.setText(null);
        textView43.setText(null);
    }

    public void Rand3(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12) {
        int a = 1; // Начальное значение диапазона - "от"
        int b = 99; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        int random_number4 = a + (int) (Math.random() * b); // Генерация 4-го числа
        int random_number5 = a + (int) (Math.random() * b); // Генерация 5-го числа
        int random_number6 = a + (int) (Math.random() * b); // Генерация 6-го числа
        int random_number7 = a + (int) (Math.random() * b); // Генерация 7-го числа
        int random_number8 = a + (int) (Math.random() * b); // Генерация 8-го числа
        int random_number9 = a + (int) (Math.random() * b); // Генерация 9-го числа
        int random_number10 = a + (int) (Math.random() * b); // Генерация 10-го числа
        int random_number11 = a + (int) (Math.random() * b); // Генерация 11-го числа
        int random_number12 = a + (int) (Math.random() * b); // Генерация 12-го числа

        editTextNumber1.setText(Integer.toString(random_number1));
        editTextNumber2.setText(Integer.toString(random_number2));
        editTextNumber3.setText(Integer.toString(random_number3));
        editTextNumber4.setText(Integer.toString(random_number4));
        editTextNumber5.setText(Integer.toString(random_number5));
        editTextNumber6.setText(Integer.toString(random_number6));
        editTextNumber7.setText(Integer.toString(random_number7));
        editTextNumber8.setText(Integer.toString(random_number8));
        editTextNumber9.setText(Integer.toString(random_number9));
        editTextNumber10.setText(Integer.toString(random_number10));
        editTextNumber11.setText(Integer.toString(random_number11));
        editTextNumber12.setText(Integer.toString(random_number12));
    }

    public void Rast3(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView32, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView37, TextView textView38, TextView textView39, TextView textView40, TextView textView41, TextView textView42, TextView textView43) {
        double a11 = Double.parseDouble((editTextNumber1.getText().toString()));
        double a12 = Double.parseDouble((editTextNumber2.getText().toString()));
        double a13 = Double.parseDouble((editTextNumber3.getText().toString()));
        double b1 = Double.parseDouble((editTextNumber4.getText().toString()));
        double a21 = Double.parseDouble((editTextNumber5.getText().toString()));
        double a22 = Double.parseDouble((editTextNumber6.getText().toString()));
        double a23 = Double.parseDouble((editTextNumber7.getText().toString()));
        double b2 = Double.parseDouble((editTextNumber8.getText().toString()));
        double a31 = Double.parseDouble((editTextNumber9.getText().toString()));
        double a32 = Double.parseDouble((editTextNumber10.getText().toString()));
        double a33 = Double.parseDouble((editTextNumber11.getText().toString()));
        double b3 = Double.parseDouble((editTextNumber12.getText().toString()));

        textView13.setText("Перепишем систему уравнений в матричном виде");
        // Вывод общей матрицы
        String S1 = a11 + " " + a12 + " " + a13 + " " + b1;
        textView14.setText(S1);
        String S2 = a21 + " " + a22 + " " + a23 + " " + b2;
        textView15.setText(S2);
        String S3 = a31 + " " + a32 + " " + a33 + " " + b3;
        textView16.setText(S3);

        textView17.setText("Расчет общего определителя");
        // Вывод общей   матрицы
        String S4 = a11 + "   " + a12 + "   " + a13;
        textView18.setText(S4);
        String S5 = a21 + "   " + a22 + "   " + a23;
        textView19.setText(S5);
        String S6 = a31 + "   " + a32 + "   " + a33;
        textView20.setText(S6);

        // Расчет общего определителя
        double line1 = a11 * a22 * a33;
        double line2 = a12 * a23 * a31;
        double line3 = a13 * a21 * a32;
        double line4 = a13 * a22 * a31;
        double line5 = a11 * a23 * a32;
        double line6 = a12 * a21 * a33;

        double ansline1 = line1 + line2 + line3;
        double ansline2 = line4 + line5 + line6;
        double answer = ansline1 - ansline2;
        String S7 = " = " + a11 + " * " + a22 + " * " + a33 + " + " + a12 + " * " + a23 + " * " + a31 + " + " + a13 + " * " + a21 + " * " + a32 + " - " + a13 + " * " + a22 + " * " + a31 + " - " + a11 + " * " + a23 + " * " + a32 + " - " + a12 + " * " + a21 + " * " + a33 + " * " + line1 + " + " + +line2 + " + " + line3 + " + " + line4 + " + " + line5 + " + " + line6 + " = " + answer;
        textView21.setText(S7);

        // Если главный определитель ранен нулю, то скрываем лишнее решение
        if (answer == 0) {
/*
            Toast toast = Toast.makeText(this, "fdgd", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0,0);
            toast.show();

 */


            String S26 = " = " + a11 + " * " + a22 + " * " + a33 + " + " + a12 + " * " + a23 + " * " + a31 + " + " + a13 + " * " + a21 + " * " + a32 + " - " + a13 + " * " + a22 + " * " + a31 + " - " + a11 + " * " + a23 + " * " + a32 + " - " + a12 + " * " + a21 + " * " + a33 + " * " + line1 + " + " + +line2 + " + " + line3 + " + " + line4 + " + " + line5 + " + " + line6 + " = " + answer;
            textView21.setText(S26);

            // Скрываем не нужный вывод результата
            textView22.setVisibility(View.INVISIBLE);
            textView23.setVisibility(View.INVISIBLE);
            textView24.setVisibility(View.INVISIBLE);
            textView25.setVisibility(View.INVISIBLE);
            textView26.setVisibility(View.INVISIBLE);
            textView27.setVisibility(View.INVISIBLE);
            textView28.setVisibility(View.INVISIBLE);
            textView29.setVisibility(View.INVISIBLE);
            textView30.setVisibility(View.INVISIBLE);
            textView31.setVisibility(View.INVISIBLE);
            textView32.setVisibility(View.INVISIBLE);
            textView33.setVisibility(View.INVISIBLE);
            textView34.setVisibility(View.INVISIBLE);
            textView35.setVisibility(View.INVISIBLE);
            textView36.setVisibility(View.INVISIBLE);
            textView37.setVisibility(View.INVISIBLE);
            textView38.setVisibility(View.INVISIBLE);
            textView39.setVisibility(View.INVISIBLE);
            textView40.setVisibility(View.INVISIBLE);
            textView41.setVisibility(View.INVISIBLE);
            textView42.setVisibility(View.INVISIBLE);
            textView43.setVisibility(View.INVISIBLE);
        } else {
            textView22.setText("Расчет 1-го определителя");
            // Вывод 1-го определителя  матрицы
            String S8 = b1 + "   " + a12 + "   " + a13;
            textView23.setText(S8);
            String S9 = b2 + "   " + a22 + "   " + a23;
            textView24.setText(S9);
            String S10 = b3 + "   " + a32 + "   " + a33;
            textView25.setText(S10);

            // Расчет 1-го определителя матрицы
            double line7 = b1 * a22 * a33;
            double line8 = a12 * a23 * b3;
            double line9 = a13 * b2 * a32;
            double line10 = b3 * a22 * a13;
            double line11 = a32 * a23 * b1;
            double line12 = a33 * b2 * a12;

            double ansline3 = line7 + line8 + line9;
            double ansline4 = line10 + line11 + line12;
            double answer1 = ansline3 - ansline4;
            String S11 = " = " + b1 + " * " + a22 + " * " + a33 + " + " + a12 + " * " + a23 + " * " + b3 + " + " + a13 + " * " + b2 + " * " + a32 + " - " + b3 + " * " + a22 + " * " + a13 + " - " + a32 + " * " + a23 + " * " + b1 + " - " + a33 + " * " + b2 + " * " + a12 + " = " + line7 + " + " + +line8 + " + " + line9 + " + " + line10 + " + " + line11 + " + " + line12 + " = " + answer1;
            textView26.setText(S11);

            textView27.setText("Расчет 2-го определителя");
            // Вывод 2-го определителя матрицы
            String S12 = a11 + "   " + b1 + "   " + a13;
            textView28.setText(S12);
            String S13 = a21 + "   " + b2 + "   " + a23;
            textView29.setText(S13);
            String S14 = a31 + "   " + b3 + "   " + a33;
            textView30.setText(S14);

            // Расчет 2-го определителя матрицы
            double line13 = a11 * b2 * a33;
            double line14 = b1 * a23 * a31;
            double line15 = a13 * a21 * b3;
            double line16 = a31 * b2 * a13;
            double line17 = b3 * a11 * a23;
            double line18 = a33 * a21 * b1;

            double ansline5 = line13 + line14 + line15;
            double ansline6 = line16 + line17 + line18;
            double answer2 = ansline5 - ansline6;
            String S15 = " = " + a11 + " * " + b2 + " * " + a33 + " + " + b1 + " * " + a23 + " * " + a31 + " + " + a13 + " * " + a21 + " * " + b3 + " - " + a31 + " * " + b2 + " * " + a13 + " - " + b3 + " * " + a11 + " * " + a23 + " - " + a33 + " * " + a21 + " * " + b1 + " = " + line13 + " + " + +line14 + " + " + line15 + " + " + line16 + " + " + line17 + " + " + line18 + " = " + answer2;
            textView31.setText(S15);

            textView32.setText("Расчет 3-го определителя");
            // Вывод 3-го определителя матрицы
            String S16 = a11 + "   " + a12 + "   " + b1;
            textView33.setText(S16);
            String S17 = a21 + "   " + a22 + "   " + b2;
            textView34.setText(S17);
            String S18 = a31 + "   " + a32 + "   " + b3;
            textView35.setText(S18);

            // Расчет 3-го определителя матрицы
            double line19 = a11 * a22 * b3;
            double line20 = a12 * b2 * a31;
            double line21 = b1 * a21 * a32;
            double line22 = a31 * a22 * b1;
            double line23 = a32 * b2 * a11;
            double line24 = b3 * a21 * a12;

            double ansline7 = line19 + line20 + line21;
            double ansline8 = line22 + line23 + line24;
            double answer3 = ansline7 - ansline8;
            String S19 = " = " + a11 + " * " + a22 + " * " + b3 + " + " + a12 + " * " + b2 + " * " + a31 + " + " + b1 + " * " + a32 + " * " + a21 + " - " + a31 + " * " + a22 + " * " + b1 + " - " + a32 + " * " + b2 + " * " + a11 + " - " + b3 + " * " + a21 + " * " + a12 + " = " + line19 + " + " + +line20 + " + " + line21 + " + " + line22 + " + " + line23 + " + " + line24 + " = " + answer3;
            textView36.setText(S19);


            double line25 = answer1 / answer;
            String result1 = String.format("%.1f", line25);
            String S20 = answer1 + " / " + answer + " = " + line25;
            textView37.setText("X1 = " + result1);

            double line26 = answer2 / answer;
            String result2 = String.format("%.1f", line26);
            String S21 = answer2 + " / " + answer + " = " + line26;
            textView38.setText("X2 = " + result2);

            double line27 = answer3 / answer;
            String result3 = String.format("%.1f", line27);
            String S22 = answer3 + " / " + answer + " = " + line27;
            textView39.setText("X3 = " + result3);

            textView40.setText("Ответ:");
            String S23 = "X1 = " + result1;
            textView41.setText(S23);
            String S24 = "X2 = " + result2;
            textView42.setText(S24);
            String S25 = "X3 = " + result3;
            textView43.setText(S25);

            textView22.setVisibility(View.VISIBLE);
            textView23.setVisibility(View.VISIBLE);
            textView24.setVisibility(View.VISIBLE);
            textView25.setVisibility(View.VISIBLE);
            textView26.setVisibility(View.VISIBLE);
            textView27.setVisibility(View.VISIBLE);
            textView28.setVisibility(View.VISIBLE);
            textView29.setVisibility(View.VISIBLE);
            textView30.setVisibility(View.VISIBLE);
            textView31.setVisibility(View.VISIBLE);
            textView32.setVisibility(View.VISIBLE);
            textView33.setVisibility(View.VISIBLE);
            textView34.setVisibility(View.VISIBLE);
            textView35.setVisibility(View.VISIBLE);
            textView36.setVisibility(View.VISIBLE);
            textView37.setVisibility(View.VISIBLE);
            textView38.setVisibility(View.VISIBLE);
            textView39.setVisibility(View.VISIBLE);
            textView40.setVisibility(View.VISIBLE);
            textView41.setVisibility(View.VISIBLE);
            textView42.setVisibility(View.VISIBLE);
            textView43.setVisibility(View.VISIBLE);
        }
    }

    public void Clear4(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20) {
        editTextNumber1.setText(null);
        editTextNumber2.setText(null);
        editTextNumber3.setText(null);
        editTextNumber4.setText(null);
        editTextNumber5.setText(null);
        editTextNumber6.setText(null);
        editTextNumber7.setText(null);
        editTextNumber8.setText(null);
        editTextNumber9.setText(null);
        editTextNumber10.setText(null);
        editTextNumber11.setText(null);
        editTextNumber12.setText(null);
        editTextNumber13.setText(null);
        editTextNumber14.setText(null);
        editTextNumber15.setText(null);
        editTextNumber16.setText(null);
        editTextNumber17.setText(null);
        editTextNumber18.setText(null);
        editTextNumber19.setText(null);
        editTextNumber20.setText(null);

    }

    public void Rand4(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20) {
        int a = 1; // Начальное значение диапазона - "от"
        int b = 99; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        int random_number4 = a + (int) (Math.random() * b); // Генерация 4-го числа
        int random_number5 = a + (int) (Math.random() * b); // Генерация 5-го числа
        int random_number6 = a + (int) (Math.random() * b); // Генерация 6-го числа
        int random_number7 = a + (int) (Math.random() * b); // Генерация 7-го числа
        int random_number8 = a + (int) (Math.random() * b); // Генерация 8-го числа
        int random_number9 = a + (int) (Math.random() * b); // Генерация 9-го числа
        int random_number10 = a + (int) (Math.random() * b); // Генерация 10-го числа
        int random_number11 = a + (int) (Math.random() * b); // Генерация 11-го числа
        int random_number12 = a + (int) (Math.random() * b); // Генерация 12-го числа
        int random_number13 = a + (int) (Math.random() * b); // Генерация 13-го числа
        int random_number14 = a + (int) (Math.random() * b); // Генерация 14-го числа
        int random_number15 = a + (int) (Math.random() * b); // Генерация 15-го числа
        int random_number16 = a + (int) (Math.random() * b); // Генерация 16-го числа
        int random_number17 = a + (int) (Math.random() * b); // Генерация 17-го числа
        int random_number18 = a + (int) (Math.random() * b); // Генерация 18-го числа
        int random_number19 = a + (int) (Math.random() * b); // Генерация 19-го числа
        int random_number20 = a + (int) (Math.random() * b); // Генерация 20-го числа

        editTextNumber1.setText(Integer.toString(random_number1));
        editTextNumber2.setText(Integer.toString(random_number2));
        editTextNumber3.setText(Integer.toString(random_number3));
        editTextNumber4.setText(Integer.toString(random_number4));
        editTextNumber5.setText(Integer.toString(random_number5));
        editTextNumber6.setText(Integer.toString(random_number6));
        editTextNumber7.setText(Integer.toString(random_number7));
        editTextNumber8.setText(Integer.toString(random_number8));
        editTextNumber9.setText(Integer.toString(random_number9));
        editTextNumber10.setText(Integer.toString(random_number10));
        editTextNumber11.setText(Integer.toString(random_number11));
        editTextNumber12.setText(Integer.toString(random_number12));
        editTextNumber13.setText(Integer.toString(random_number13));
        editTextNumber14.setText(Integer.toString(random_number14));
        editTextNumber15.setText(Integer.toString(random_number15));
        editTextNumber16.setText(Integer.toString(random_number16));
        editTextNumber17.setText(Integer.toString(random_number17));
        editTextNumber18.setText(Integer.toString(random_number18));
        editTextNumber19.setText(Integer.toString(random_number19));
        editTextNumber20.setText(Integer.toString(random_number20));
    }


    public void Rast4(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, TextView textView67, TextView textView182, TextView textView183, TextView textView184, TextView textView185, TextView textView25, TextView textView186, TextView textView187, TextView textView188, TextView textView84, TextView textView82, TextView textView85, TextView textView28, TextView textView29, TextView textView30, TextView textView86, TextView textView110, TextView textView88, TextView textView189, TextView textView190, TextView textView79, TextView textView93, TextView textView112, TextView textView33, TextView textView94, TextView textView95, TextView textView96, TextView textView97, TextView textView113, TextView textView34, TextView textView98, TextView textView99, TextView textView22, TextView textView101, TextView textView114, TextView textView171, TextView textView175, TextView textView176, TextView textView177, TextView textView103, TextView textView104, TextView textView105, TextView textView108, TextView textView109) {
        double a11 = Double.parseDouble((editTextNumber1.getText().toString()));
        double a12 = Double.parseDouble((editTextNumber2.getText().toString()));
        double a13 = Double.parseDouble((editTextNumber3.getText().toString()));
        double a14 = Double.parseDouble((editTextNumber4.getText().toString()));
        double b1 = Double.parseDouble((editTextNumber5.getText().toString()));
        double a21 = Double.parseDouble((editTextNumber6.getText().toString()));
        double a22 = Double.parseDouble((editTextNumber7.getText().toString()));
        double a23 = Double.parseDouble((editTextNumber8.getText().toString()));
        double a24 = Double.parseDouble((editTextNumber9.getText().toString()));
        double b2 = Double.parseDouble((editTextNumber10.getText().toString()));
        double a31 = Double.parseDouble((editTextNumber11.getText().toString()));
        double a32 = Double.parseDouble((editTextNumber12.getText().toString()));
        double a33 = Double.parseDouble((editTextNumber13.getText().toString()));
        double a34 = Double.parseDouble((editTextNumber14.getText().toString()));
        double b3 = Double.parseDouble((editTextNumber15.getText().toString()));
        double a41 = Double.parseDouble((editTextNumber16.getText().toString()));
        double a42 = Double.parseDouble((editTextNumber17.getText().toString()));
        double a43 = Double.parseDouble((editTextNumber18.getText().toString()));
        double a44 = Double.parseDouble((editTextNumber19.getText().toString()));
        double b4 = Double.parseDouble((editTextNumber20.getText().toString()));

        textView67.setText("Перепишем систему уравнений в матричном виде");
        //Вывод общей матрицы
        String S1 = a11 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + b1;
        textView182.setText(S1);
        String S2 = a21 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + b2;
        textView183.setText(S2);
        String S3 = a31 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + b3;
        textView184.setText(S3);
        String S4 = a41 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + b4;
        textView185.setText(S4);

        textView25.setText("Определитель общего порядка");
        // Вывод общего порядка
        String S5 = a11 + " " + a12 + " " + a13 + " " + a14;
        textView186.setText(S5);
        String S6 = a21 + " " + a22 + " " + a23 + " " + a24;
        textView187.setText(S6);
        String S7 = a31 + " " + a32 + " " + a33 + " " + a34;
        textView188.setText(S7);
        String S8 = a41 + " " + a42 + " " + a43 + " " + a44;
        textView84.setText(S8);

        // Вывод расчет d1 матрицы
        double line1 = a22 * a33 * a44;
        double line2 = a23 * a34 * a42;
        double line3 = a24 * a32 * a43;
        double line4 = a24 * a33 * a42;
        double line5 = a23 * a32 * a44;
        double line6 = a22 * a34 * a43;

        double ansline1 = line1 + line2 + line3;
        double ansline2 = line4 + line5 + line6;
        double answer = ansline1 - ansline2;
        // String S9 = " = " + a11 + " * " + a22 + " * " + a33 + " + " + a12 + " * " + a23 + " * " + a31 + " + " + a13 + " * " + a21 + " * " + a32 + " - " + a13 + " * " + a22 + " * " + a31 + " - " + a11 + " * " + a23 + " * " + a32 + " - " + a12 + " * " + a21 + " * " + a33 + " = " + ansline1 + " - " + ansline2 + " = " + answer;
        // String S9 = "=" + answer;
        // textView82.setText(S9);

        // Вывод расчет d2 матрицы
        double line7 = a21 * a33 * a44;
        double line8 = a23 * a34 * a41;
        double line9 = a24 * a31 * a43;
        double line10 = a24 * a33 * a41;
        double line11 = a23 * a31 * a44;
        double line12 = a21 * a34 * a43;

        double ansline3 = line7 + line8 + line9;
        double ansline4 = line10 + line11 + line12;
        double answer1 = ansline3 - ansline4;
        // String S9 = "=" + answer1;
        //  textView82.setText(S9);

        // Вывод расчет d3 матрицы
        double line13 = a21 * a32 * a44;
        double line14 = a22 * a34 * a41;
        double line15 = a24 * a31 * a42;
        double line16 = a24 * a32 * a41;
        double line17 = a22 * a31 * a44;
        double line18 = a21 * a34 * a42;

        double ansline5 = line13 + line14 + line15;
        double ansline6 = line16 + line17 + line18;
        double answer2 = ansline5 - ansline6;
        // String S9 = "=" + answer2;
        // textView82.setText(S9);

        // Вывод расчет d4 матрицы
        double line19 = a21 * a32 * a43;
        double line20 = a22 * a33 * a41;
        double line21 = a23 * a31 * a42;
        double line22 = a23 * a32 * a41;
        double line23 = a21 * a33 * a42;
        double line24 = a22 * a31 * a43;

        double ansline7 = line19 + line20 + line21;
        double ansline8 = line22 + line23 + line24;
        double answer3 = ansline7 - ansline8;


        double M = a11 * answer;
        double M2 = a12 * answer1;
        double M3 = a13 * answer2;
        double M4 = a14 * answer3;
        double M5 = M - M2 + M3 - M4;

        String S9 = "= " + a11 + " * " + answer + " - " + a12 + " * " + answer1 + " + " + a13 + " * " + answer2 + " + " + a14 + " * " + answer3 + " = " + M + " + " + M2 + " + " + M3 + " + " + M4 + " = " + M5;
        //   String S9 = "= " + M + " " + " " + M2 + " " + M3 + " " + M4 + " " + M5;
        textView82.setText(S9);

        // Если главный определитель ранен нулю, то скрываем лишнее решение
        if (M5 == 0) {
            /*
            Toast toast = Toast.makeText(this, "Ответ: так как детерминант матрицы равен нулю, то система не не может быть решена этим методом (система не имеет решений или имеет множество решений)", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();

             */
            String S99 = "= " + a11 + " * " + answer + " - " + a12 + " * " + answer1 + " + " + a13 + " * " + answer2 + " + " + a14 + " * " + answer3 + " = " + M + " + " + M2 + " + " + M3 + " + " + M4 + " = " + M5;
            textView82.setText(S99);

            // Скрываем не нужный вывод результата
            textView85.setVisibility(View.INVISIBLE);
            textView28.setVisibility(View.INVISIBLE);
            textView29.setVisibility(View.INVISIBLE);
            textView30.setVisibility(View.INVISIBLE);
            textView86.setVisibility(View.INVISIBLE);
            textView110.setVisibility(View.INVISIBLE);
            textView88.setVisibility(View.INVISIBLE);
            textView189.setVisibility(View.INVISIBLE);
            textView190.setVisibility(View.INVISIBLE);
            textView79.setVisibility(View.INVISIBLE);
            textView93.setVisibility(View.INVISIBLE);
            textView112.setVisibility(View.INVISIBLE);
            textView33.setVisibility(View.INVISIBLE);
            textView94.setVisibility(View.INVISIBLE);
            textView95.setVisibility(View.INVISIBLE);
            textView96.setVisibility(View.INVISIBLE);
            textView97.setVisibility(View.INVISIBLE);
            textView113.setVisibility(View.INVISIBLE);
            textView34.setVisibility(View.INVISIBLE);
            textView98.setVisibility(View.INVISIBLE);
            textView99.setVisibility(View.INVISIBLE);
            textView22.setVisibility(View.INVISIBLE);
            textView101.setVisibility(View.INVISIBLE);
            textView114.setVisibility(View.INVISIBLE);
            textView171.setVisibility(View.INVISIBLE);
            textView175.setVisibility(View.INVISIBLE);
            textView176.setVisibility(View.INVISIBLE);
            textView177.setVisibility(View.INVISIBLE);
            textView103.setVisibility(View.INVISIBLE);
            textView104.setVisibility(View.INVISIBLE);
            textView105.setVisibility(View.INVISIBLE);
            textView108.setVisibility(View.INVISIBLE);
            textView109.setVisibility(View.INVISIBLE);
        } else {
            textView85.setText("Определитель 1-го порядка");
            // Вывод определителя 1-го порядка
            String S10 = b1 + " " + a12 + " " + a13 + " " + a14;
            textView28.setText(S10);
            String S11 = b2 + " " + a22 + " " + a23 + " " + a24;
            textView29.setText(S11);
            String S12 = b3 + " " + a32 + " " + a33 + " " + a34;
            textView30.setText(S12);
            String S13 = b4 + " " + a42 + " " + a43 + " " + a44;
            textView86.setText(S13);

            // Вывод расчет d1 матрицы
            double line25 = a22 * a33 * a44;
            double line26 = a23 * a34 * a42;
            double line27 = a24 * a32 * a43;
            double line28 = a24 * a33 * a42;
            double line29 = a23 * a32 * a44;
            double line30 = a22 * a34 * a43;

            double ansline9 = line25 + line26 + line27;
            double ansline10 = line28 + line29 + line30;
            double answer4 = ansline9 - ansline10;
            //  String S30 = " = " + a11 + " * " + a22 + " * " + a33 + " + " + a12 + " * " + a23 + " * " + a31 + " + " + a13 + " * " + a21 + " * " + a32 + " - " + a13 + " * " + a22 + " * " + a31 + " - " + a11 + " * " + a23 + " * " + a32 + " - " + a12 + " * " + a21 + " * " + a33 + " = " + ansline1 + " - " + ansline2 + " = " + answer;
            // String S9 = "=" + answer;
            // textView110.setText(S30);

            // Вывод расчет d2 матрицы
            double line31 = a21 * a33 * a44;
            double line32 = a23 * a34 * a41;
            double line33 = a24 * a31 * a43;
            double line34 = a24 * a33 * a41;
            double line35 = a23 * a31 * a44;
            double line36 = a21 * a34 * a43;

            double ansline11 = line31 + line32 + line33;
            double ansline12 = line34 + line35 + line36;
            double answer5 = ansline11 - ansline12;
            // String S9 = "=" + answer1;
            //  textView82.setText(S9);

            // Вывод расчет d3 матрицы
            double line37 = a21 * a32 * a44;
            double line38 = a22 * a34 * a41;
            double line39 = a24 * a31 * a42;
            double line40 = a24 * a32 * a41;
            double line41 = a22 * a31 * a44;
            double line42 = a21 * a34 * a42;

            double ansline13 = line37 + line38 + line39;
            double ansline14 = line40 + line41 + line42;
            double answer6 = ansline13 - ansline14;
            // String S9 = "=" + answer2;
            // textView82.setText(S9);

            // Вывод расчет d4 матрицы
            double line43 = a21 * a32 * a43;
            double line44 = a22 * a33 * a41;
            double line45 = a23 * a31 * a42;
            double line46 = a23 * a32 * a41;
            double line47 = a21 * a33 * a42;
            double line48 = a22 * a31 * a43;

            double ansline15 = line43 + line44 + line45;
            double ansline16 = line46 + line47 + line48;
            double answer7 = ansline15 - ansline16;

            double M6 = a11 * answer4;
            double M7 = a12 * answer5;
            double M8 = a13 * answer6;
            double M9 = a14 * answer7;
            double M10 = M6 - M7 + M8 - M9;

            String S14 = "= " + b1 + " * " + answer4 + " - " + b2 + " * " + answer5 + " + " + b3 + " * " + answer6 + " + " + b4 + " * " + answer7 + " = " + M6 + " + " + M7 + " + " + M8 + " + " + M9 + " = " + M10;
            //   String S9 = "= " + M + " " + " " + M2 + " " + M3 + " " + M4 + " " + M5;
            textView110.setText(S14);

            textView88.setText("Определитель 2-го порядка");
            // Вывод определителя 2-го порядка
            String S15 = a11 + " " + b1 + " " + a13 + " " + a14;
            textView189.setText(S15);
            String S16 = a21 + " " + b2 + " " + a23 + " " + a24;
            textView190.setText(S16);
            String S17 = a31 + " " + b3 + " " + a33 + " " + a34;
            textView79.setText(S17);
            String S18 = a41 + " " + b4 + " " + a43 + " " + a44;
            textView93.setText(S18);

            // Вывод расчет d1 матрицы
            double line49 = b2 * a33 * a44;
            double line50 = a23 * a34 * b4;
            double line51 = a24 * b3 * a43;
            double line52 = a24 * a33 * b4;
            double line53 = b2 * a34 * a43;
            double line54 = a23 * b3 * a44;

            double ansline17 = line49 + line50 + line51;
            double ansline18 = line52 + line53 + line54;
            double answer8 = ansline17 - ansline18;
            //String S30 = " = " + a11 + " * " + a22 + " * " + a33 + " + " + a12 + " * " + a23 + " * " + a31 + " + " + a13 + " * " + a21 + " * " + a32 + " - " + a13 + " * " + a22 + " * " + a31 + " - " + a11 + " * " + a23 + " * " + a32 + " - " + a12 + " * " + a21 + " * " + a33 + " = " + ansline1 + " - " + ansline2 + " = " + answer;
            //  String S31 = "=" + answer8;
            //  textView112.setText(S31);

            // Вывод расчет d2 матрицы
            double line67 = b1 * a33 * a44;
            double line68 = a13 * a34 * b4;
            double line69 = a14 * b3 * a43;
            double line70 = a14 * a33 * b4;
            double line71 = b1 * a34 * a43;
            double line72 = a13 * b3 * a44;

            double ansline23 = line67 + line68 + line69;
            double ansline24 = line70 + line71 + line72;
            double answer11 = ansline23 - ansline24;
            //String S30 = " = " + a11 + " * " + a22 + " * " + a33 + " + " + a12 + " * " + a23 + " * " + a31 + " + " + a13 + " * " + a21 + " * " + a32 + " - " + a13 + " * " + a22 + " * " + a31 + " - " + a11 + " * " + a23 + " * " + a32 + " - " + a12 + " * " + a21 + " * " + a33 + " = " + ansline1 + " - " + ansline2 + " = " + answer;
            // textView112.setText(S31);

            // Вывод расчет d3 матрицы
            double line55 = b1 * a23 * a44;
            double line56 = a13 * a24 * b4;
            double line57 = a14 * b2 * a43;
            double line58 = a14 * a23 * b4;
            double line59 = b1 * a24 * a43;
            double line60 = a13 * b2 * a44;

            double ansline19 = line55 + line56 + line57;
            double ansline20 = line58 + line59 + line60;
            double answer9 = ansline19 - ansline20;
            //String S30 = " = " + a11 + " * " + a22 + " * " + a33 + " + " + a12 + " * " + a23 + " * " + a31 + " + " + a13 + " * " + a21 + " * " + a32 + " - " + a13 + " * " + a22 + " * " + a31 + " - " + a11 + " * " + a23 + " * " + a32 + " - " + a12 + " * " + a21 + " * " + a33 + " = " + ansline1 + " - " + ansline2 + " = " + answer;
            // String S31 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
            //textView112.setText(S31);

            // Вывод расчет d4 матрицы
            double line61 = b1 * a23 * a34;
            double line62 = a13 * a24 * b3;
            double line63 = a14 * b2 * a33;
            double line64 = a14 * a23 * b3;
            double line65 = b1 * a24 * a33;
            double line66 = a13 * b2 * a34;

            double ansline21 = line61 + line62 + line63;
            double ansline22 = line64 + line65 + line66;
            double answer10 = ansline21 - ansline22;

            double M11 = a11 * answer8;
            double M12 = a12 * answer11;
            double M13 = a13 * answer9;
            double M14 = a14 * answer10;
            double M15 = M11 - M12 + M13 - M14;

            String S19 = "= " + a11 + " * " + answer8 + " - " + a12 + " * " + answer11 + " + " + a13 + " * " + answer9 + " + " + a14 + " * " + answer10 + " = " + M11 + " + " + M12 + " + " + M13 + " + " + M14 + " = " + M15;
            //String S30 = " = " + a11 + " * " + a22 + " * " + a33 + " + " + a12 + " * " + a23 + " * " + a31 + " + " + a13 + " * " + a21 + " * " + a32 + " - " + a13 + " * " + a22 + " * " + a31 + " - " + a11 + " * " + a23 + " * " + a32 + " - " + a12 + " * " + a21 + " * " + a33 + " = " + ansline1 + " - " + ansline2 + " = " + answer;
            // String S31 = "=" + answer10;
            // String S31 = "=" + line61  + line62 +  line63 + line64 + line65 + line66;
            textView112.setText(S19);


            textView33.setText("Определитель 3-го порядка");
            // Вывод определителя 3-го порядка
            String S20 = a11 + " " + a12 + " " + b1 + " " + a14;
            textView94.setText(S20);
            String S21 = a21 + " " + a22 + " " + b2 + " " + a24;
            textView95.setText(S21);
            String S22 = a31 + " " + a32 + " " + b3 + " " + a34;
            textView96.setText(S22);
            String S23 = a41 + " " + a42 + " " + b4 + " " + a44;
            textView97.setText(S23);

            // Вывод расчет d1 матрицы
            double line73 = a22 * b3 * a44;
            double line74 = b2 * a34 * a42;
            double line75 = a24 * a32 * b4;
            double line76 = a24 * b3 * a42;
            double line77 = a22 * a34 * b4;
            double line78 = b2 * a32 * a44;

            double ansline25 = line73 + line74 + line75;
            double ansline26 = line76 + line77 + line78;
            double answer12 = ansline25 - ansline26;

            // String S32 = "=" + line73 + " "  + line74 + " " +  line75 + " " + line76 + " " + line77 + " " + line78 + " " + answer12;
            //  textView113.setText(S32);

            // Вывод расчет d2 матрицы
            double line79 = a12 * b3 * a44;
            double line80 = b1 * a34 * a42;
            double line81 = a14 * a32 * b4;
            double line82 = a14 * b3 * a42;
            double line83 = a12 * a34 * b4;
            double line84 = b1 * a32 * a44;

            double ansline27 = line79 + line80 + line81;
            double ansline28 = line82 + line83 + line84;
            double answer13 = ansline27 - ansline28;

            // String S32 = "=" + line79 + " "  + line80 + " " +  line81 + " " + line82 + " " + line83 + " " + line84 + " " + answer13;
            //  textView113.setText(S32);

            // Вывод расчет d3 матрицы
            double line85 = a12 * b2 * a44;
            double line86 = b1 * a24 * a42;
            double line87 = a14 * a22 * b4;
            double line88 = a14 * b2 * a42;
            double line89 = a12 * a24 * b4;
            double line90 = b1 * a22 * a44;

            double ansline29 = line85 + line86 + line87;
            double ansline30 = line88 + line89 + line90;
            double answer14 = ansline29 - ansline30;

            //     String S32 = "=" + line85 + " "  + line86 + " " +  line87 + " " + line88 + " " + line89 + " " + line90 + " " + answer14;
            //     textView113.setText(S32);

            // Расчет минора d4
            double line91 = a12 * b2 * a44;
            double line92 = b1 * a24 * a32;
            double line93 = a14 * a22 * b3;
            double line94 = a14 * b2 * a32;
            double line95 = a12 * a24 * b3;
            double line96 = b1 * a22 * a34;

            double ansline31 = line91 + line92 + line93;
            double ansline32 = line94 + line95 + line96;
            double answer15 = ansline31 - ansline32;

            double M16 = a11 * answer12;
            double M17 = a21 * answer13;
            double M18 = a31 * answer14;
            double M19 = a41 * answer15;
            double M20 = M16 - M17 + M18 - M19;

            String S24 = "= " + a11 + " * " + answer12 + " - " + a21 + " * " + answer13 + " + " + a31 + " * " + answer14 + " + " + a41 + " * " + answer15 + " = " + M16 + " + " + M17 + " + " + M18 + " + " + M19 + " = " + M20;
            //  String S32 = "=" + line91 + " "  + line92 + " " +  line93 + " " + line94 + " " + line95 + " " + line96 + " " + answer15;
            textView113.setText(S24);


            // Вывод расчета d4

            textView34.setText("Определитель 4-го порядка");
            // Вывод определителя 4-го порядка
            String S25 = a11 + " " + a12 + " " + a13 + " " + b1;
            textView98.setText(S25);
            String S26 = a21 + " " + a22 + " " + a23 + " " + b2;
            textView99.setText(S26);
            String S27 = a31 + " " + a32 + " " + a33 + " " + b3;
            textView22.setText(S27);
            String S28 = a41 + " " + a42 + " " + a43 + " " + b4;
            textView101.setText(S28);


            // Вывод расчет d1 матрицы
            double line97 = a22 * a33 * b4;
            double line98 = a23 * b3 * a42;
            double line99 = b2 * a32 * a43;
            double line100 = b2 * a33 * a42;
            double line101 = a22 * b3 * a43;
            double line102 = a23 * a32 * b4;

            double ansline33 = line97 + line98 + line99;
            double ansline34 = line100 + line101 + line102;
            double answer16 = ansline33 - ansline34;

            //  String S33 = "=" + line97 + " "  + line98 + " " +  line99 + " " + line100 + " " + line101 + " " + line102 + " " + answer16;
            //  textView114.setText(S33);

            // Вывод расчет d2 матрицы
            double line103 = a12 * a33 * b4;
            double line104 = a13 * b3 * a42;
            double line105 = b1 * a32 * a43;
            double line106 = b1 * a33 * a42;
            double line107 = a12 * b3 * a43;
            double line108 = a13 * a32 * b4;

            double ansline35 = line103 + line104 + line105;
            double ansline36 = line106 + line107 + line108;
            double answer17 = ansline35 - ansline36;

            //   String S33 = "=" + line103 + " "  + line104 + " " +  line105 + " " + line106 + " " + line107 + " " + line108 + " " + answer17;
            //  textView114.setText(S33);

            // Вывод расчет d3 матрицы
            double line109 = a12 * a23 * b4;
            double line110 = a13 * b2 * a42;
            double line111 = b1 * a22 * a43;
            double line112 = b1 * a23 * a42;
            double line113 = a12 * b2 * a43;
            double line114 = a13 * a22 * b4;

            double ansline37 = line109 + line110 + line111;
            double ansline38 = line112 + line113 + line114;
            double answer18 = ansline37 - ansline38;

            //  String S33 = "=" + line109 + " "  + line110 + " " +  line111 + " " + line112 + " " + line113 + " " + line114 + " " + answer18;
            // textView114.setText(S33);

            // Вывод расчет d4 матрицы
            double line115 = a12 * a23 * b3;
            double line116 = a13 * b2 * a32;
            double line117 = b1 * a22 * a33;
            double line118 = b1 * a23 * a32;
            double line119 = a12 * b2 * a33;
            double line120 = a13 * a22 * b3;

            double ansline39 = line115 + line116 + line117;
            double ansline40 = line118 + line119 + line120;
            double answer19 = ansline39 - ansline40;

            double M21 = a11 * answer16;
            double M22 = a21 * answer17;
            double M23 = a31 * answer18;
            double M24 = a41 * answer19;
            double M25 = M21 - M22 + M23 - M24;

            String S29 = "= " + a11 + " * " + answer16 + " - " + a21 + " * " + answer17 + " + " + a31 + " * " + answer18 + " + " + a41 + " * " + answer19 + " = " + M21 + " + " + M22 + " + " + M23 + " + " + M24 + " = " + M25;
            textView114.setText(S29);

            double line121 = M10 / M5;
            String result1 = String.format("%.1f", line121);
            String S30 = M10 + " / " + M5 + " = " + result1;
            textView171.setText("X1 = " + S30);

            double line126 = M15 / M5;
            String result2 = String.format("%.1f", line126);
            String S31 = M15 + " / " + M5 + " = " + result2;
            textView175.setText("X2 = " + S31);

            double line127 = M20 / M5;
            String result3 = String.format("%.1f", line127);
            String S32 = M20 + " / " + M5 + " = " + result3;
            textView176.setText("X3 = " + S32);

            double line128 = M25 / M5;
            String result4 = String.format("%.1f", line128);
            String S33 = M25 + " / " + M5 + " = " + result4;
            textView177.setText("X4 = " + S33);

            textView103.setText("Ответ:");
            String S34 = "X1 = " + result1;
            textView104.setText(S34);
            String S35 = "X2 = " + result2;
            textView105.setText(S35);
            String S36 = "X3 = " + result3;
            textView108.setText(S36);
            String S37 = "X4 = " + result4;
            textView109.setText(S37);

            // Показываем нужный вывод результата
            textView85.setVisibility(View.VISIBLE);
            textView28.setVisibility(View.VISIBLE);
            textView29.setVisibility(View.VISIBLE);
            textView30.setVisibility(View.VISIBLE);
            textView86.setVisibility(View.VISIBLE);
            textView110.setVisibility(View.VISIBLE);
            textView88.setVisibility(View.VISIBLE);
            textView189.setVisibility(View.VISIBLE);
            textView190.setVisibility(View.VISIBLE);
            textView79.setVisibility(View.VISIBLE);
            textView93.setVisibility(View.VISIBLE);
            textView112.setVisibility(View.VISIBLE);
            textView33.setVisibility(View.VISIBLE);
            textView94.setVisibility(View.VISIBLE);
            textView95.setVisibility(View.VISIBLE);
            textView96.setVisibility(View.VISIBLE);
            textView97.setVisibility(View.VISIBLE);
            textView113.setVisibility(View.VISIBLE);
            textView34.setVisibility(View.VISIBLE);
            textView98.setVisibility(View.VISIBLE);
            textView99.setVisibility(View.VISIBLE);
            textView22.setVisibility(View.VISIBLE);
            textView101.setVisibility(View.VISIBLE);
            textView114.setVisibility(View.VISIBLE);
            textView171.setVisibility(View.VISIBLE);
            textView175.setVisibility(View.VISIBLE);
            textView176.setVisibility(View.VISIBLE);
            textView177.setVisibility(View.VISIBLE);
            textView103.setVisibility(View.VISIBLE);
            textView104.setVisibility(View.VISIBLE);
            textView105.setVisibility(View.VISIBLE);
            textView108.setVisibility(View.VISIBLE);
            textView109.setVisibility(View.VISIBLE);
        }
    }

    public void Clear5(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30, TextView textView84, TextView textView115, TextView textView198, TextView textView199, TextView textView200, TextView textView201, TextView textView116, TextView textView202, TextView textView203, TextView textView204, TextView textView152, TextView textView86, TextView textView117, TextView textView205, TextView textView206, TextView textView207, TextView textView153, TextView textView154, TextView textView181, TextView textView121, TextView textView122, TextView textView123, TextView textView124, TextView textView155, TextView textView126, TextView textView127, TextView textView128, TextView textView129, TextView textView130, TextView textView156, TextView textView132, TextView textView133, TextView textView134, TextView textView135, TextView textView136, TextView textView157, TextView textView141, TextView textView142, TextView textView143, TextView textView144, TextView textView145, TextView textView213, TextView textView214, TextView textView215, TextView textView216, TextView textView217, TextView textView147, TextView textView148, TextView textView149, TextView textView150, TextView textView151) {
        editTextNumber1.setText(null);
        editTextNumber2.setText(null);
        editTextNumber3.setText(null);
        editTextNumber4.setText(null);
        editTextNumber5.setText(null);
        editTextNumber6.setText(null);
        editTextNumber7.setText(null);
        editTextNumber8.setText(null);
        editTextNumber9.setText(null);
        editTextNumber10.setText(null);
        editTextNumber11.setText(null);
        editTextNumber12.setText(null);
        editTextNumber13.setText(null);
        editTextNumber14.setText(null);
        editTextNumber15.setText(null);
        editTextNumber16.setText(null);
        editTextNumber17.setText(null);
        editTextNumber18.setText(null);
        editTextNumber19.setText(null);
        editTextNumber20.setText(null);
        editTextNumber21.setText(null);
        editTextNumber22.setText(null);
        editTextNumber23.setText(null);
        editTextNumber24.setText(null);
        editTextNumber25.setText(null);
        editTextNumber26.setText(null);
        editTextNumber27.setText(null);
        editTextNumber28.setText(null);
        editTextNumber29.setText(null);
        editTextNumber30.setText(null);

        textView84.setText(null);
        textView115.setText(null);
        textView198.setText(null);
        textView199.setText(null);
        textView200.setText(null);
        textView201.setText(null);
        textView116.setText(null);
        textView202.setText(null);
        textView203.setText(null);
        textView204.setText(null);
        textView152.setText(null);
        textView153.setText(null);
        textView86.setText(null);
        textView117.setText(null);
        textView205.setText(null);
        textView206.setText(null);
        textView207.setText(null);
        textView154.setText(null);
        textView181.setText(null);
        textView121.setText(null);
        textView122.setText(null);
        textView123.setText(null);
        textView124.setText(null);
        textView155.setText(null);
        textView126.setText(null);
        textView127.setText(null);
        textView128.setText(null);
        textView129.setText(null);
        textView130.setText(null);
        textView156.setText(null);
        textView132.setText(null);
        textView133.setText(null);
        textView134.setText(null);
        textView135.setText(null);
        textView136.setText(null);
        textView157.setText(null);
        textView141.setText(null);
        textView142.setText(null);
        textView143.setText(null);
        textView144.setText(null);
        textView145.setText(null);
        textView213.setText(null);
        textView214.setText(null);
        textView215.setText(null);
        textView216.setText(null);
        textView217.setText(null);
        textView147.setText(null);
        textView148.setText(null);
        textView149.setText(null);
        textView150.setText(null);
        textView151.setText(null);
    }

    public void Rand5(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30) {
        int a = 1; // Начальное значение диапазона - "от"
        int b = 99; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        int random_number4 = a + (int) (Math.random() * b); // Генерация 4-го числа
        int random_number5 = a + (int) (Math.random() * b); // Генерация 5-го числа
        int random_number6 = a + (int) (Math.random() * b); // Генерация 6-го числа
        int random_number7 = a + (int) (Math.random() * b); // Генерация 7-го числа
        int random_number8 = a + (int) (Math.random() * b); // Генерация 8-го числа
        int random_number9 = a + (int) (Math.random() * b); // Генерация 9-го числа
        int random_number10 = a + (int) (Math.random() * b); // Генерация 10-го числа
        int random_number11 = a + (int) (Math.random() * b); // Генерация 11-го числа
        int random_number12 = a + (int) (Math.random() * b); // Генерация 12-го числа
        int random_number13 = a + (int) (Math.random() * b); // Генерация 13-го числа
        int random_number14 = a + (int) (Math.random() * b); // Генерация 14-го числа
        int random_number15 = a + (int) (Math.random() * b); // Генерация 15-го числа
        int random_number16 = a + (int) (Math.random() * b); // Генерация 16-го числа
        int random_number17 = a + (int) (Math.random() * b); // Генерация 17-го числа
        int random_number18 = a + (int) (Math.random() * b); // Генерация 18-го числа
        int random_number19 = a + (int) (Math.random() * b); // Генерация 19-го числа
        int random_number20 = a + (int) (Math.random() * b); // Генерация 20-го числа
        int random_number21 = a + (int) (Math.random() * b); // Генерация 21-го числа
        int random_number22 = a + (int) (Math.random() * b); // Генерация 22-го числа
        int random_number23 = a + (int) (Math.random() * b); // Генерация 23-го числа
        int random_number24 = a + (int) (Math.random() * b); // Генерация 24-го числа
        int random_number25 = a + (int) (Math.random() * b); // Генерация 25-го числа
        int random_number26 = a + (int) (Math.random() * b); // Генерация 26-го числа
        int random_number27 = a + (int) (Math.random() * b); // Генерация 27-го числа
        int random_number28 = a + (int) (Math.random() * b); // Генерация 28-го числа
        int random_number29 = a + (int) (Math.random() * b); // Генерация 29-го числа
        int random_number30 = a + (int) (Math.random() * b); // Генерация 30-го числа

        editTextNumber1.setText(Integer.toString(random_number1));
        editTextNumber2.setText(Integer.toString(random_number2));
        editTextNumber3.setText(Integer.toString(random_number3));
        editTextNumber4.setText(Integer.toString(random_number4));
        editTextNumber5.setText(Integer.toString(random_number5));
        editTextNumber6.setText(Integer.toString(random_number6));
        editTextNumber7.setText(Integer.toString(random_number7));
        editTextNumber8.setText(Integer.toString(random_number8));
        editTextNumber9.setText(Integer.toString(random_number9));
        editTextNumber10.setText(Integer.toString(random_number10));
        editTextNumber11.setText(Integer.toString(random_number11));
        editTextNumber12.setText(Integer.toString(random_number12));
        editTextNumber13.setText(Integer.toString(random_number13));
        editTextNumber14.setText(Integer.toString(random_number14));
        editTextNumber15.setText(Integer.toString(random_number15));
        editTextNumber16.setText(Integer.toString(random_number16));
        editTextNumber17.setText(Integer.toString(random_number17));
        editTextNumber18.setText(Integer.toString(random_number18));
        editTextNumber19.setText(Integer.toString(random_number19));
        editTextNumber20.setText(Integer.toString(random_number20));
        editTextNumber21.setText(Integer.toString(random_number21));
        editTextNumber22.setText(Integer.toString(random_number22));
        editTextNumber23.setText(Integer.toString(random_number23));
        editTextNumber24.setText(Integer.toString(random_number24));
        editTextNumber25.setText(Integer.toString(random_number25));
        editTextNumber26.setText(Integer.toString(random_number26));
        editTextNumber27.setText(Integer.toString(random_number27));
        editTextNumber28.setText(Integer.toString(random_number28));
        editTextNumber29.setText(Integer.toString(random_number29));
        editTextNumber30.setText(Integer.toString(random_number30));
    }

    public void Rast5(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30, TextView textView87, TextView textView84, TextView textView115, TextView textView198, TextView textView199, TextView textView200, TextView textView102, TextView textView152, TextView textView201, TextView textView116, TextView textView202, TextView textView203, TextView textView204, TextView textView107, TextView textView153, TextView textView86, TextView textView117, TextView textView205, TextView textView206, TextView textView207, TextView textView111, TextView textView154, TextView textView181, TextView textView121, TextView textView122, TextView textView123, TextView textView124, TextView textView125, TextView textView155, TextView textView126, TextView textView127, TextView textView128, TextView textView129, TextView textView130, TextView textView131, TextView textView156, TextView textView132, TextView textView133, TextView textView134, TextView textView135, TextView textView136, TextView textView140, TextView textView157, TextView textView141, TextView textView142, TextView textView143, TextView textView144, TextView textView145, TextView textView213, TextView textView214, TextView textView215, TextView textView216, TextView textView217, TextView textView146, TextView textView147, TextView textView148, TextView textView149, TextView textView150, TextView textView151) {
        double a11 = Double.parseDouble((editTextNumber1.getText().toString()));
        double a12 = Double.parseDouble((editTextNumber2.getText().toString()));
        double a13 = Double.parseDouble((editTextNumber3.getText().toString()));
        double a14 = Double.parseDouble((editTextNumber4.getText().toString()));
        double a15 = Double.parseDouble((editTextNumber5.getText().toString()));
        double b1 = Double.parseDouble((editTextNumber6.getText().toString()));
        double a21 = Double.parseDouble((editTextNumber7.getText().toString()));
        double a22 = Double.parseDouble((editTextNumber8.getText().toString()));
        double a23 = Double.parseDouble((editTextNumber9.getText().toString()));
        double a24 = Double.parseDouble((editTextNumber10.getText().toString()));
        double a25 = Double.parseDouble((editTextNumber11.getText().toString()));
        double b2 = Double.parseDouble((editTextNumber12.getText().toString()));
        double a31 = Double.parseDouble((editTextNumber13.getText().toString()));
        double a32 = Double.parseDouble((editTextNumber14.getText().toString()));
        double a33 = Double.parseDouble((editTextNumber15.getText().toString()));
        double a34 = Double.parseDouble((editTextNumber16.getText().toString()));
        double a35 = Double.parseDouble((editTextNumber17.getText().toString()));
        double b3 = Double.parseDouble((editTextNumber18.getText().toString()));
        double a41 = Double.parseDouble((editTextNumber19.getText().toString()));
        double a42 = Double.parseDouble((editTextNumber20.getText().toString()));
        double a43 = Double.parseDouble((editTextNumber21.getText().toString()));
        double a44 = Double.parseDouble((editTextNumber22.getText().toString()));
        double a45 = Double.parseDouble((editTextNumber23.getText().toString()));
        double b4 = Double.parseDouble((editTextNumber24.getText().toString()));
        double a51 = Double.parseDouble((editTextNumber25.getText().toString()));
        double a52 = Double.parseDouble((editTextNumber26.getText().toString()));
        double a53 = Double.parseDouble((editTextNumber27.getText().toString()));
        double a54 = Double.parseDouble((editTextNumber28.getText().toString()));
        double a55 = Double.parseDouble((editTextNumber29.getText().toString()));
        double b5 = Double.parseDouble((editTextNumber30.getText().toString()));


        textView87.setText("Перепишем систему уравнений в матричном виде");
        //Вывод общей матрицы
        String S1 = a11 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + a15 + "   " + b1;
        textView84.setText(S1);
        String S2 = a21 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + a25 + "   " + b2;
        textView115.setText(S2);
        String S3 = a31 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + a35 + "   " + b3;
        textView198.setText(S3);
        String S4 = a41 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + a45 + "   " + b4;
        textView199.setText(S4);
        String S5 = a51 + "   " + a52 + "   " + a53 + "   " + a54 + "   " + a55 + "   " + b5;
        textView200.setText(S5);

        textView102.setText("Определитель общего порядка");
        // Вывод общего порядка
        String S6 = a11 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + a15;
        textView201.setText(S6);
        String S7 = a21 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + a25;
        textView116.setText(S7);
        String S8 = a31 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + a35;
        textView202.setText(S8);
        String S9 = a41 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + a45;
        textView203.setText(S9);
        String S10 = a51 + "   " + a52 + "   " + a53 + "   " + a54 + "   " + a55;
        textView204.setText(S10);

        // Минор для (1,1)
        // Расчет минора для (1,1) матрицы
        double line1 = a33 * a44 * a55;
        double line2 = a34 * a45 * a53;
        double line3 = a35 * a43 * a54;
        double line4 = a35 * a44 * a53;
        double line5 = a33 * a45 * a54;
        double line6 = a34 * a43 * a55;

        double ansline1 = line1 + line2 + line3;
        double ansline2 = line4 + line5 + line6;
        double answer = ansline1 - ansline2;

        // Расчет минора для (2,1) матрицы
        double line7 = a23 * a44 * a55;
        double line8 = a24 * a45 * a53;
        double line9 = a25 * a43 * a54;
        double line10 = a25 * a44 * a53;
        double line11 = a23 * a45 * a54;
        double line12 = a24 * a43 * a55;

        double ansline3 = line7 + line8 + line9;
        double ansline4 = line10 + line11 + line12;
        double answer1 = ansline3 - ansline4;

        // Расчет минора для (3,1) матрицы
        double line13 = a23 * a34 * a55;
        double line14 = a24 * a35 * a53;
        double line15 = a25 * a33 * a54;
        double line16 = a25 * a34 * a53;
        double line17 = a23 * a35 * a54;
        double line18 = a24 * a33 * a55;

        double ansline5 = line13 + line14 + line15;
        double ansline6 = line16 + line17 + line18;
        double answer2 = ansline5 - ansline6;

        // Расчет минора для (4,1) матрицы
        double line19 = a23 * a34 * a45;
        double line20 = a24 * a35 * a43;
        double line21 = a25 * a33 * a44;
        double line22 = a25 * a34 * a43;
        double line23 = a23 * a35 * a44;
        double line24 = a24 * a33 * a45;

        double ansline7 = line19 + line20 + line21;
        double ansline8 = line22 + line23 + line24;
        double answer3 = ansline7 - ansline8;

        double M = a22 * answer;
        double M2 = a32 * answer1;
        double M3 = a42 * answer2;
        double M4 = a52 * answer3;
        double M5 = M - M2 + M3 - M4;

        // String S11 = "= " + a11 + " * " + answer + " - "  + a12 + " * " +  answer1 + " + " + a13 + " * " + answer2 + " + " + a14 + " * " +  answer3 + " = " + M + " + " + M2 + " + " + M3 + " + " + M4 + " = " + M5;
        // String S11 = "=" + answer12 + answer13 + answer14 + answer15 + "=" +  M20;
        // Минор для (2,1)
        // Расчет минора для (1,1) матрицы
        double line25 = a33 * a44 * a55;
        double line26 = a34 * a45 * a53;
        double line27 = a35 * a43 * a54;
        double line28 = a35 * a44 * a53;
        double line29 = a33 * a45 * a54;
        double line30 = a34 * a43 * a55;

        double ansline9 = line25 + line26 + line27;
        double ansline10 = line28 + line29 + line30;
        double answer4 = ansline9 - ansline10;

        // String S17 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
        //    String S11 = "=" + answer4;

        // Расчет минора для (2,1) матрицы
        double line31 = a13 * a44 * a55;
        double line32 = a14 * a45 * a53;
        double line33 = a15 * a43 * a54;
        double line34 = a15 * a44 * a53;
        double line35 = a13 * a45 * a54;
        double line36 = a14 * a43 * a55;

        double ansline11 = line31 + line32 + line33;
        double ansline12 = line34 + line35 + line36;
        double answer5 = ansline11 - ansline12;

        // Расчет минора для (3,1) матрицы
        double line37 = a13 * a34 * a55;
        double line38 = a14 * a35 * a53;
        double line39 = a15 * a33 * a54;
        double line40 = a15 * a34 * a53;
        double line41 = a13 * a35 * a54;
        double line42 = a14 * a33 * a55;

        double ansline13 = line37 + line38 + line39;
        double ansline14 = line40 + line41 + line42;
        double answer6 = ansline13 - ansline14;

        // Расчет минора для (4,1) матрицы
        double line43 = a13 * a34 * a45;
        double line44 = a14 * a35 * a43;
        double line45 = a15 * a33 * a44;
        double line46 = a15 * a34 * a43;
        double line47 = a13 * a35 * a44;
        double line48 = a14 * a33 * a45;

        double ansline15 = line43 + line44 + line45;
        double ansline16 = line46 + line47 + line48;
        double answer7 = ansline15 - ansline16;


        double M6 = a12 * answer4;
        double M7 = a32 * answer5;
        double M8 = a42 * answer6;
        double M9 = a52 * answer7;
        double M10 = M6 - M7 + M8 - M9;

        // String S11 = "= " + a11 + " * " + answer + " - "  + a12 + " * " +  answer1 + " + " + a13 + " * " + answer2 + " + " + a14 + " * " +  answer3 + " = " + M6 + " + " + M7 + " + " + M8 + " + " + M9 + " = " + M10;

        // Минор для (3,1)
        // Расчет минора для (1,1) матрицы
        double line49 = a23 * a44 * a55;
        double line50 = a24 * a45 * a53;
        double line51 = a25 * a43 * a54;
        double line52 = a25 * a44 * a53;
        double line53 = a23 * a45 * a54;
        double line54 = a24 * a43 * a55;

        double ansline17 = line49 + line50 + line51;
        double ansline18 = line52 + line53 + line54;
        double answer8 = ansline17 - ansline18;


        // Расчет минора для (2,1) матрицы
        double line55 = a13 * a44 * a55;
        double line56 = a14 * a45 * a53;
        double line57 = a15 * a43 * a54;
        double line58 = a15 * a44 * a53;
        double line59 = a13 * a45 * a54;
        double line60 = a14 * a43 * a55;

        double ansline19 = line55 + line56 + line57;
        double ansline20 = line58 + line59 + line60;
        double answer9 = ansline19 - ansline20;

        // Расчет минора для (3,1) матрицы
        double line61 = a13 * a24 * a55;
        double line62 = a14 * a25 * a53;
        double line63 = a15 * a23 * a54;
        double line64 = a15 * a24 * a53;
        double line65 = a13 * a25 * a54;
        double line66 = a14 * a23 * a55;

        double ansline21 = line61 + line62 + line63;
        double ansline22 = line64 + line65 + line66;
        double answer10 = ansline21 - ansline22;

        // Расчет минора для (4,1) матрицы
        double line67 = a13 * a24 * a45;
        double line68 = a14 * a25 * a43;
        double line69 = a15 * a23 * a44;
        double line70 = a15 * a24 * a43;
        double line71 = a13 * a25 * a44;
        double line72 = a14 * a23 * a45;

        double ansline23 = line67 + line68 + line69;
        double ansline24 = line70 + line71 + line72;
        double answer11 = ansline23 - ansline24;


        double M11 = a12 * answer8;
        double M12 = a22 * answer9;
        double M13 = a42 * answer10;
        double M14 = a52 * answer11;
        double M15 = M11 - M12 + M13 - M14;

        // String S11 = "=" + answer8 + answer9 + answer10 + answer11 + "=" +  M15;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line73 = a23 * a34 * a55;
        double line74 = a24 * a35 * a53;
        double line75 = a25 * a33 * a54;
        double line76 = a25 * a34 * a53;
        double line77 = a23 * a35 * a54;
        double line78 = a24 * a33 * a55;

        double ansline25 = line73 + line74 + line75;
        double ansline26 = line76 + line77 + line78;
        double answer12 = ansline25 - ansline26;

        // Расчет минора для (2,1) матрицы
        double line79 = a13 * a34 * a55;
        double line80 = a14 * a35 * a53;
        double line81 = a15 * a33 * a54;
        double line82 = a15 * a34 * a53;
        double line83 = a13 * a35 * a54;
        double line84 = a14 * a33 * a55;

        double ansline27 = line79 + line80 + line81;
        double ansline28 = line82 + line83 + line84;
        double answer13 = ansline27 - ansline28;

        // Расчет минора для (3,1) матрицы
        double line85 = a13 * a24 * a55;
        double line86 = a14 * a25 * a53;
        double line87 = a15 * a23 * a54;
        double line88 = a15 * a24 * a53;
        double line89 = a13 * a25 * a54;
        double line90 = a14 * a23 * a55;

        double ansline29 = line85 + line86 + line87;
        double ansline30 = line88 + line89 + line90;
        double answer14 = ansline29 - ansline30;

        // Расчет минора для (4,1) матрицы
        double line91 = a13 * a24 * a35;
        double line92 = a14 * a25 * a33;
        double line93 = a15 * a23 * a34;
        double line94 = a15 * a24 * a33;
        double line95 = a13 * a25 * a34;
        double line96 = a14 * a23 * a35;

        double ansline31 = line91 + line92 + line93;
        double ansline32 = line94 + line95 + line96;
        double answer15 = ansline31 - ansline32;

        double M16 = a12 * answer12;
        double M17 = a22 * answer13;
        double M18 = a32 * answer14;
        double M19 = a52 * answer15;

        double M20 = M16 - M17 + M18 - M19;
        //  String S11 = "=" + answer12 + answer13 + answer14 + answer15 + "=" +  M20;
        //String S11 = "=" + answer12;

        // Минор для (5,1)
        // Расчет минора для (1,1) матрицы
        double line97 = a23 * a34 * a45;
        double line98 = a24 * a35 * a43;
        double line99 = a25 * a33 * a44;
        double line100 = a25 * a34 * a43;
        double line101 = a23 * a35 * a44;
        double line102 = a24 * a33 * a45;

        double ansline33 = line97 + line98 + line99;
        double ansline34 = line100 + line101 + line102;
        double answer16 = ansline33 - ansline34;

        // Расчет минора для (2,1) матрицы
        double line103 = a13 * a34 * a45;
        double line104 = a14 * a35 * a43;
        double line105 = a15 * a33 * a44;
        double line106 = a15 * a34 * a43;
        double line107 = a13 * a35 * a44;
        double line108 = a14 * a33 * a45;

        double ansline35 = line103 + line104 + line105;
        double ansline36 = line106 + line107 + line108;
        double answer17 = ansline35 - ansline36;

        // Расчет минора для (3,1) матрицы
        double line109 = a13 * a24 * a45;
        double line110 = a14 * a25 * a43;
        double line111 = a15 * a23 * a44;
        double line112 = a15 * a24 * a43;
        double line113 = a13 * a25 * a44;
        double line114 = a14 * a23 * a45;

        double ansline37 = line109 + line110 + line111;
        double ansline38 = line112 + line113 + line114;
        double answer18 = ansline37 - ansline38;

        // Расчет минора для (4,1) матрицы
        double line116 = a13 * a24 * a35;
        double line117 = a14 * a25 * a33;
        double line118 = a15 * a23 * a34;
        double line119 = a15 * a24 * a33;
        double line120 = a13 * a25 * a34;
        double line121 = a14 * a23 * a35;

        double ansline39 = line116 + line117 + line118;
        double ansline40 = line119 + line120 + line121;
        double answer19 = ansline39 - ansline40;

        double M21 = a12 * answer16;
        double M22 = a22 * answer17;
        double M23 = a32 * answer18;
        double M24 = a42 * answer19;
        double M25 = M21 - M22 + M23 - M24;

        double M26 = a11 * M5;
        double M27 = a21 * M10;
        double M28 = a31 * M15;
        double M29 = a41 * M20;
        double M30 = a51 * M25;
        double M31 = M26 - M27 + M28 - M29 + M30;

        //  String S11 = "=" + answer16 + answer17 + answer18 + answer19 + "=" +  M25;
        String S11 = "= " + a11 + " * " + M5 + " - " + a21 + " * " + M10 + " + " + a31 + " * " + M15 + " - " + a41 + " * " + M20 + " + " + a51 + " * " + M25 + " = " + M26 + " + " + M27 + " + " + M28 + " + " + M29 + " + " + M30 + " = " + M31;
        textView152.setText(S11);

        // Если главный определитель ранен нулю, то скрываем лишнее решение
        if (M31 == 0) {
            /*
            Toast toast = Toast.makeText(this, "Ответ: так как детерминант матрицы равен нулю, то система не не может быть решена этим методом (система не имеет решений или имеет множество решений) ", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();

             */
            String S50 = "= " + a11 + " * " + M5 + " - " + a21 + " * " + M10 + " + " + a31 + " * " + M15 + " - " + a41 + " * " + M20 + " + " + a51 + " * " + M25 + " = " + M26 + " + " + M27 + " + " + M28 + " + " + M29 + " + " + M30 + " = " + M31;
            textView152.setText(S50);

            // Скрываем не нужный вывод результата
            textView107.setVisibility(View.INVISIBLE);
            textView153.setVisibility(View.INVISIBLE);
            textView86.setVisibility(View.INVISIBLE);
            textView117.setVisibility(View.INVISIBLE);
            textView205.setVisibility(View.INVISIBLE);
            textView206.setVisibility(View.INVISIBLE);
            textView207.setVisibility(View.INVISIBLE);
            textView111.setVisibility(View.INVISIBLE);
            textView154.setVisibility(View.INVISIBLE);
            textView181.setVisibility(View.INVISIBLE);
            textView121.setVisibility(View.INVISIBLE);
            textView122.setVisibility(View.INVISIBLE);
            textView123.setVisibility(View.INVISIBLE);
            textView124.setVisibility(View.INVISIBLE);
            textView125.setVisibility(View.INVISIBLE);
            textView155.setVisibility(View.INVISIBLE);
            textView126.setVisibility(View.INVISIBLE);
            textView127.setVisibility(View.INVISIBLE);
            textView128.setVisibility(View.INVISIBLE);
            textView129.setVisibility(View.INVISIBLE);
            textView130.setVisibility(View.INVISIBLE);
            textView131.setVisibility(View.INVISIBLE);
            textView156.setVisibility(View.INVISIBLE);
            textView132.setVisibility(View.INVISIBLE);
            textView133.setVisibility(View.INVISIBLE);
            textView134.setVisibility(View.INVISIBLE);
            textView135.setVisibility(View.INVISIBLE);
            textView136.setVisibility(View.INVISIBLE);
            textView140.setVisibility(View.INVISIBLE);
            textView157.setVisibility(View.INVISIBLE);
            textView141.setVisibility(View.INVISIBLE);
            textView142.setVisibility(View.INVISIBLE);
            textView143.setVisibility(View.INVISIBLE);
            textView144.setVisibility(View.INVISIBLE);
            textView145.setVisibility(View.INVISIBLE);
            textView213.setVisibility(View.INVISIBLE);
            textView214.setVisibility(View.INVISIBLE);
            textView215.setVisibility(View.INVISIBLE);
            textView216.setVisibility(View.INVISIBLE);
            textView217.setVisibility(View.INVISIBLE);
            textView146.setVisibility(View.INVISIBLE);
            textView147.setVisibility(View.INVISIBLE);
            textView148.setVisibility(View.INVISIBLE);
            textView149.setVisibility(View.INVISIBLE);
            textView150.setVisibility(View.INVISIBLE);
            textView151.setVisibility(View.INVISIBLE);
        } else {
            textView107.setText("Определитель 1-го порядка");
            // Вывод общего порядка
            String S12 = b1 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + a15;
            textView86.setText(S12);
            String S13 = b2 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + a25;
            textView117.setText(S13);
            String S14 = b3 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + a35;
            textView205.setText(S14);
            String S15 = b4 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + a45;
            textView206.setText(S15);
            String S16 = b5 + "   " + a52 + "   " + a53 + "   " + a54 + "   " + a55;
            textView207.setText(S16);

            // Минор для (1,1)
            // Расчет минора для (1,1) матрицы
            double line122 = a33 * a44 * a55;
            double line123 = a34 * a45 * a53;
            double line124 = a35 * a43 * a54;
            double line125 = a35 * a44 * a53;
            double line126 = a33 * a45 * a54;
            double line127 = a34 * a43 * a55;

            double ansline41 = line122 + line123 + line124;
            double ansline42 = line125 + line126 + line127;
            double answer20 = ansline41 - ansline42;


            // Расчет минора для (2,1) матрицы
            double line128 = a23 * a44 * a55;
            double line129 = a24 * a45 * a53;
            double line130 = a25 * a43 * a54;
            double line131 = a25 * a44 * a53;
            double line132 = a23 * a45 * a54;
            double line133 = a24 * a43 * a55;

            double ansline43 = line128 + line129 + line130;
            double ansline44 = line131 + line132 + line133;
            double answer21 = ansline43 - ansline44;

            // Расчет минора для (3,1) матрицы
            double line134 = a23 * a34 * a55;
            double line135 = a24 * a35 * a53;
            double line136 = a25 * a33 * a54;
            double line137 = a25 * a34 * a53;
            double line138 = a23 * a35 * a54;
            double line139 = a24 * a33 * a55;

            double ansline45 = line134 + line135 + line136;
            double ansline46 = line137 + line138 + line139;
            double answer22 = ansline45 - ansline46;


            // Расчет минора для (4,1) матрицы
            double line140 = a23 * a34 * a45;
            double line141 = a24 * a35 * a43;
            double line142 = a25 * a33 * a44;
            double line143 = a25 * a34 * a43;
            double line144 = a23 * a35 * a44;
            double line145 = a24 * a33 * a45;

            double ansline47 = line140 + line141 + line142;
            double ansline48 = line143 + line144 + line145;
            double answer23 = ansline47 - ansline48;


            double M32 = a22 * answer20;
            double M33 = a32 * answer21;
            double M34 = a42 * answer22;
            double M35 = a52 * answer23;
            double M36 = M32 - M33 + M34 - M35;

            //   String S17 = "=" + answer20 + answer21 + answer22 + answer23  + " = " +  M32 + M33 + M34 + M35 + "=" +  M36;
            // String S17 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;

            // Минор для (2,1)
            // Расчет минора для (1,1) матрицы
            double line146 = a33 * a44 * a55;
            double line147 = a34 * a45 * a53;
            double line148 = a35 * a43 * a54;
            double line149 = a35 * a44 * a53;
            double line150 = a33 * a45 * a54;
            double line151 = a34 * a43 * a55;

            double ansline49 = line146 + line147 + line148;
            double ansline50 = line149 + line150 + line151;
            double answer24 = ansline49 - ansline50;

            // String S17 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
            //    String S11 = "=" + answer4;

            // Расчет минора для (2,1) матрицы
            double line152 = a13 * a44 * a55;
            double line153 = a14 * a45 * a53;
            double line154 = a15 * a43 * a54;
            double line155 = a15 * a44 * a53;
            double line156 = a13 * a45 * a54;
            double line157 = a14 * a43 * a55;

            double ansline51 = line152 + line153 + line154;
            double ansline52 = line155 + line156 + line157;
            double answer25 = ansline51 - ansline52;

            // Расчет минора для (3,1) матрицы
            double line158 = a13 * a34 * a55;
            double line159 = a14 * a35 * a53;
            double line160 = a15 * a33 * a54;
            double line161 = a15 * a34 * a53;
            double line162 = a13 * a35 * a54;
            double line163 = a14 * a33 * a55;

            double ansline53 = line158 + line159 + line160;
            double ansline54 = line161 + line162 + line163;
            double answer26 = ansline53 - ansline54;

            // Расчет минора для (4,1) матрицы
            double line164 = a13 * a34 * a45;
            double line165 = a14 * a35 * a43;
            double line166 = a15 * a33 * a44;
            double line167 = a15 * a34 * a43;
            double line168 = a13 * a35 * a44;
            double line169 = a14 * a33 * a45;

            double ansline55 = line164 + line165 + line166;
            double ansline56 = line167 + line168 + line169;
            double answer27 = ansline55 - ansline56;


            double M37 = a12 * answer24;
            double M38 = a32 * answer25;
            double M39 = a42 * answer26;
            double M40 = a52 * answer27;
            double M41 = M37 - M38 + M39 - M40;

            //  String S17 = "=" + answer24 + answer25 + answer26 + answer27;
            //  String S17 = "=" + M37 + M38 + M39 + M40 + M41;

            // Минор для (3,1)
            // Расчет минора для (1,1) матрицы
            double line170 = a23 * a44 * a55;
            double line171 = a24 * a45 * a53;
            double line172 = a25 * a43 * a54;
            double line173 = a25 * a44 * a53;
            double line174 = a23 * a45 * a54;
            double line175 = a24 * a43 * a55;

            double ansline57 = line170 + line171 + line172;
            double ansline58 = line173 + line174 + line175;
            double answer28 = ansline57 - ansline58;

            // Расчет минора для (2,1) матрицы
            double line176 = a13 * a44 * a55;
            double line177 = a14 * a45 * a53;
            double line178 = a15 * a43 * a54;
            double line179 = a15 * a44 * a53;
            double line180 = a13 * a45 * a54;
            double line181 = a14 * a43 * a55;

            double ansline59 = line176 + line177 + line178;
            double ansline60 = line179 + line180 + line181;
            double answer29 = ansline59 - ansline60;

            // Расчет минора для (3,1) матрицы
            double line182 = a13 * a24 * a55;
            double line183 = a14 * a25 * a53;
            double line184 = a15 * a23 * a54;
            double line185 = a15 * a24 * a53;
            double line186 = a13 * a25 * a54;
            double line187 = a14 * a23 * a55;

            double ansline61 = line182 + line183 + line184;
            double ansline62 = line185 + line186 + line187;
            double answer30 = ansline61 - ansline62;

            // Расчет минора для (4,1) матрицы
            double line189 = a13 * a24 * a45;
            double line190 = a14 * a25 * a43;
            double line191 = a15 * a23 * a44;
            double line192 = a15 * a24 * a43;
            double line193 = a13 * a25 * a44;
            double line194 = a14 * a23 * a45;

            double ansline63 = line189 + line190 + line191;
            double ansline64 = line192 + line193 + line194;
            double answer31 = ansline63 - ansline64;


            double M42 = a12 * answer28;
            double M43 = a22 * answer29;
            double M44 = a42 * answer30;
            double M45 = a52 * answer31;
            double M46 = M42 - M43 + M44 - M45;

            //  String S17 = "=" + answer28 + answer29 + answer30 + answer31;
            //   String S17 = "=" + M42 + M43 + M44 + M45 + M46;

            // Минор для (4,1)
            // Расчет минора для (1,1) матрицы
            double line195 = a23 * a34 * a55;
            double line196 = a24 * a35 * a53;
            double line197 = a25 * a33 * a54;
            double line198 = a25 * a34 * a53;
            double line199 = a23 * a35 * a54;
            double line200 = a24 * a33 * a55;

            double ansline65 = line195 + line196 + line197;
            double ansline66 = line198 + line199 + line200;
            double answer32 = ansline65 - ansline66;

            // Расчет минора для (2,1) матрицы
            double line201 = a13 * a34 * a55;
            double line202 = a14 * a35 * a53;
            double line203 = a15 * a33 * a54;
            double line204 = a15 * a34 * a53;
            double line205 = a13 * a35 * a54;
            double line206 = a14 * a33 * a55;

            double ansline67 = line201 + line202 + line203;
            double ansline68 = line204 + line205 + line206;
            double answer33 = ansline67 - ansline68;

            // Расчет минора для (3,1) матрицы
            double line207 = a13 * a24 * a55;
            double line208 = a14 * a25 * a53;
            double line209 = a15 * a23 * a54;
            double line210 = a15 * a24 * a53;
            double line211 = a13 * a25 * a54;
            double line212 = a14 * a23 * a55;

            double ansline69 = line207 + line208 + line209;
            double ansline70 = line210 + line211 + line212;
            double answer34 = ansline69 - ansline70;

            // Расчет минора для (4,1) матрицы
            double line213 = a13 * a24 * a35;
            double line214 = a14 * a25 * a33;
            double line215 = a15 * a23 * a34;
            double line216 = a15 * a24 * a33;
            double line217 = a13 * a25 * a34;
            double line218 = a14 * a23 * a35;

            double ansline71 = line213 + line214 + line215;
            double ansline72 = line216 + line217 + line218;
            double answer35 = ansline71 - ansline72;

            double M47 = a12 * answer32;
            double M48 = a22 * answer33;
            double M49 = a32 * answer34;
            double M50 = a52 * answer35;
            double M51 = M47 - M48 + M49 - M50;

            //  String S17 = "=" + line213 + line214 + line215 + line216 + line217 + line218;
            //  String S17 = "=" + answer32 + answer33 + answer34 + answer35;
            //   String S17 = "=" + M47 + M48 + M49 + M50 + " = " +  M51;

            // Минор для (5,1)
            // Расчет минора для (1,1) матрицы
            double line219 = a23 * a34 * a45;
            double line220 = a24 * a35 * a43;
            double line221 = a25 * a33 * a44;
            double line222 = a25 * a34 * a43;
            double line223 = a23 * a35 * a44;
            double line224 = a24 * a33 * a45;

            double ansline73 = line219 + line220 + line221;
            double ansline74 = line222 + line223 + line224;
            double answer36 = ansline73 - ansline74;

            // Расчет минора для (2,1) матрицы
            double line225 = a13 * a34 * a45;
            double line226 = a14 * a35 * a43;
            double line227 = a15 * a33 * a44;
            double line228 = a15 * a34 * a43;
            double line229 = a13 * a35 * a44;
            double line230 = a14 * a33 * a45;

            double ansline75 = line225 + line226 + line227;
            double ansline76 = line228 + line229 + line230;
            double answer37 = ansline75 - ansline76;

            // Расчет минора для (3,1) матрицы
            double line231 = a13 * a24 * a45;
            double line232 = a14 * a25 * a43;
            double line233 = a15 * a23 * a44;
            double line234 = a15 * a24 * a43;
            double line235 = a13 * a25 * a44;
            double line236 = a14 * a23 * a45;

            double ansline77 = line231 + line232 + line233;
            double ansline78 = line234 + line235 + line236;
            double answer38 = ansline77 - ansline78;

            // Расчет минора для (4,1) матрицы
            double line237 = a13 * a24 * a35;
            double line238 = a14 * a25 * a33;
            double line239 = a15 * a23 * a34;
            double line240 = a15 * a24 * a33;
            double line241 = a13 * a25 * a34;
            double line242 = a14 * a23 * a35;

            double ansline79 = line237 + line238 + line239;
            double ansline80 = line240 + line241 + line242;
            double answer39 = ansline79 - ansline80;

            double M52 = a12 * answer36;
            double M53 = a22 * answer37;
            double M54 = a32 * answer38;
            double M55 = a42 * answer39;
            double M56 = M52 - M53 + M54 - M55;

            double M57 = b1 * M36;
            double M58 = b2 * M41;
            double M59 = b3 * M46;
            double M60 = b4 * M51;
            double M61 = b5 * M56;
            double M62 = M57 - M58 + M59 - M60 + M61;

            //  String S17 = "=" + answer36 + answer37 + answer38 + answer39;
            //   String S17 = "=" + answer36 + answer37 + answer38 + answer39 + M56 +  " = " +  M57 + M58 + M59 + M60 + M61 + "=" +  M62;
            String S17 = "= " + b1 + " * " + M36 + " - " + b2 + " * " + M41 + " + " + b3 + " * " + M46 + " - " + b4 + " * " + M51 + " + " + b5 + " * " + M56 + " = " + M57 + " + " + M58 + " + " + M59 + " + " + M60 + " + " + M61 + " = " + M62;
            textView153.setText(S17);

            textView111.setText("Определитель 2-го порядка");
            // Вывод общего порядка
            String S18 = a11 + "   " + b1 + "   " + a13 + "   " + a14 + "   " + a15;
            textView181.setText(S18);
            String S19 = a21 + "   " + b2 + "   " + a23 + "   " + a24 + "   " + a25;
            textView121.setText(S19);
            String S20 = a13 + "   " + b3 + "   " + a33 + "   " + a34 + "   " + a35;
            textView122.setText(S20);
            String S21 = a14 + "   " + b4 + "   " + a43 + "   " + a44 + "   " + a45;
            textView123.setText(S21);
            String S22 = a15 + "   " + b5 + "   " + a53 + "   " + a54 + "   " + a55;
            textView124.setText(S22);

            // Минор для (1,1)
            // Расчет минора для (1,1) матрицы
            double line243 = a33 * a44 * a55;
            double line244 = a34 * a45 * a53;
            double line245 = a35 * a43 * a54;
            double line246 = a35 * a44 * a53;
            double line247 = a33 * a45 * a54;
            double line248 = a34 * a43 * a55;

            double ansline81 = line243 + line244 + line245;
            double ansline82 = line246 + line247 + line248;
            double answer40 = ansline81 - ansline82;

            // Расчет минора для (2,1) матрицы
            double line249 = a23 * a44 * a55;
            double line250 = a24 * a45 * a53;
            double line251 = a25 * a43 * a54;
            double line252 = a25 * a44 * a53;
            double line253 = a23 * a45 * a54;
            double line254 = a24 * a43 * a55;

            double ansline83 = line249 + line250 + line251;
            double ansline84 = line252 + line253 + line254;
            double answer41 = ansline83 - ansline84;

            // Расчет минора для (3,1) матрицы
            double line255 = a23 * a34 * a55;
            double line256 = a24 * a35 * a53;
            double line257 = a25 * a33 * a54;
            double line258 = a25 * a34 * a53;
            double line259 = a23 * a35 * a54;
            double line260 = a24 * a33 * a55;

            double ansline85 = line255 + line256 + line257;
            double ansline86 = line258 + line259 + line260;
            double answer42 = ansline85 - ansline86;

            // Расчет минора для (4,1) матрицы
            double line261 = a23 * a34 * a45;
            double line262 = a24 * a35 * a43;
            double line263 = a25 * a33 * a44;
            double line264 = a25 * a34 * a43;
            double line265 = a23 * a35 * a44;
            double line266 = a24 * a33 * a45;

            double ansline87 = line261 + line262 + line263;
            double ansline88 = line264 + line265 + line266;
            double answer43 = ansline87 - ansline88;

            double M63 = b2 * answer40;
            double M64 = b3 * answer41;
            double M65 = b4 * answer42;
            double M66 = b5 * answer43;
            double M67 = M63 - M64 + M65 - M66;

            //   String S23 = "=" + answer40 + answer41 + answer42 + answer43 + " = " +  M63 + M64 + M65 + M66 + "=" +  M67;

            // Минор для (2,1)
            // Расчет минора для (1,1) матрицы
            double line267 = a33 * a44 * a55;
            double line268 = a34 * a45 * a53;
            double line269 = a35 * a43 * a54;
            double line270 = a35 * a44 * a53;
            double line271 = a33 * a45 * a54;
            double line272 = a34 * a43 * a55;

            double ansline89 = line267 + line268 + line269;
            double ansline90 = line270 + line271 + line272;
            double answer44 = ansline89 - ansline90;

            // Расчет минора для (2,1) матрицы
            double line273 = a13 * a44 * a55;
            double line274 = a14 * a45 * a53;
            double line275 = a15 * a43 * a54;
            double line276 = a15 * a44 * a53;
            double line277 = a13 * a45 * a54;
            double line278 = a14 * a43 * a55;

            double ansline91 = line273 + line274 + line275;
            double ansline92 = line276 + line277 + line278;
            double answer45 = ansline91 - ansline92;

            // Расчет минора для (3,1) матрицы
            double line279 = a13 * a34 * a55;
            double line280 = a14 * a35 * a53;
            double line281 = a15 * a33 * a54;
            double line282 = a15 * a34 * a53;
            double line283 = a13 * a35 * a54;
            double line284 = a14 * a33 * a55;

            double ansline93 = line279 + line280 + line281;
            double ansline94 = line282 + line283 + line284;
            double answer46 = ansline93 - ansline94;

            // Расчет минора для (4,1) матрицы
            double line285 = a13 * a34 * a45;
            double line286 = a14 * a35 * a43;
            double line287 = a15 * a33 * a44;
            double line288 = a15 * a34 * a43;
            double line289 = a13 * a35 * a44;
            double line290 = a14 * a33 * a45;

            double ansline95 = line285 + line286 + line287;
            double ansline96 = line288 + line289 + line290;
            double answer47 = ansline95 - ansline96;

            double M68 = b1 * answer44;
            double M69 = b3 * answer45;
            double M70 = b4 * answer46;
            double M71 = b5 * answer47;
            double M72 = M68 - M69 + M70 - M71;

            // String S23 = "=" + answer44 + answer45 + answer46 + answer47 + " = " +  M68 + M69 + M70 + M71 + "=" +  M72;

            // Минор для (3,1)
            // Расчет минора для (1,1) матрицы
            double line291 = a23 * a44 * a55;
            double line292 = a24 * a45 * a53;
            double line293 = a25 * a43 * a54;
            double line294 = a25 * a44 * a53;
            double line295 = a23 * a45 * a54;
            double line296 = a24 * a43 * a55;

            double ansline97 = line291 + line292 + line293;
            double ansline98 = line294 + line295 + line296;
            double answer48 = ansline97 - ansline98;

            // Расчет минора для (2,1) матрицы
            double line297 = a13 * a44 * a55;
            double line298 = a14 * a45 * a53;
            double line299 = a15 * a43 * a54;
            double line300 = a15 * a44 * a53;
            double line301 = a13 * a45 * a54;
            double line302 = a14 * a43 * a55;

            double ansline99 = line297 + line298 + line299;
            double ansline100 = line300 + line301 + line302;
            double answer49 = ansline99 - ansline100;

            // Расчет минора для (3,1) матрицы
            double line303 = a13 * a24 * a55;
            double line304 = a14 * a25 * a53;
            double line305 = a15 * a23 * a54;
            double line306 = a15 * a24 * a53;
            double line307 = a13 * a25 * a54;
            double line308 = a14 * a23 * a55;

            double ansline101 = line303 + line304 + line305;
            double ansline102 = line306 + line307 + line308;
            double answer50 = ansline101 - ansline102;

            // Расчет минора для (4,1) матрицы
            double line309 = a13 * a24 * a45;
            double line310 = a14 * a25 * a43;
            double line311 = a15 * a23 * a44;
            double line312 = a15 * a24 * a43;
            double line313 = a13 * a25 * a44;
            double line314 = a14 * a23 * a45;

            double ansline103 = line309 + line310 + line311;
            double ansline104 = line312 + line313 + line314;
            double answer51 = ansline103 - ansline104;

            double M73 = b1 * answer48;
            double M74 = b2 * answer49;
            double M75 = b4 * answer50;
            double M76 = b5 * answer51;
            double M77 = M73 - M74 + M75 - M76;

            //   String S23 = "=" + answer48 + answer49 + answer50 + answer51 + " = " +  M73 + M74 + M75 + M76 + "=" +  M77;

            // Минор для (4,1)
            // Расчет минора для (1,1) матрицы
            double line315 = a23 * a34 * a55;
            double line316 = a24 * a35 * a53;
            double line317 = a25 * a33 * a54;
            double line318 = a25 * a34 * a53;
            double line319 = a23 * a35 * a54;
            double line320 = a24 * a33 * a55;

            double ansline105 = line315 + line316 + line317;
            double ansline106 = line318 + line319 + line320;
            double answer52 = ansline105 - ansline106;

            // Расчет минора для (2,1) матрицы
            double line321 = a13 * a34 * a55;
            double line322 = a14 * a35 * a53;
            double line323 = a15 * a33 * a54;
            double line324 = a15 * a34 * a53;
            double line325 = a13 * a35 * a54;
            double line326 = a14 * a33 * a55;

            double ansline107 = line321 + line322 + line323;
            double ansline108 = line324 + line325 + line326;
            double answer53 = ansline107 - ansline108;

            // Расчет минора для (3,1) матрицы
            double line327 = a13 * a24 * a55;
            double line328 = a14 * a25 * a53;
            double line329 = a15 * a23 * a54;
            double line330 = a15 * a24 * a53;
            double line331 = a13 * a25 * a54;
            double line332 = a14 * a23 * a55;

            double ansline109 = line327 + line328 + line329;
            double ansline110 = line330 + line331 + line332;
            double answer54 = ansline109 - ansline110;

            // Расчет минора для (4,1) матрицы
            double line333 = a13 * a24 * a35;
            double line334 = a14 * a25 * a33;
            double line335 = a15 * a23 * a34;
            double line336 = a15 * a24 * a33;
            double line337 = a13 * a25 * a34;
            double line338 = a14 * a23 * a35;

            double ansline111 = line333 + line334 + line335;
            double ansline112 = line336 + line337 + line338;
            double answer55 = ansline111 - ansline112;

            double M78 = b1 * answer52;
            double M79 = b2 * answer53;
            double M80 = b3 * answer54;
            double M81 = b5 * answer55;
            double M82 = M78 - M79 + M80 - M81;

            //  String S23 = "=" + answer52 + answer53 + answer54 + answer55 + " = " +  M78 + M79 + M80 + M81 + "=" +  M82;

            // Минор для (5,1)
            // Расчет минора для (1,1) матрицы
            double line339 = a23 * a34 * a45;
            double line340 = a24 * a35 * a43;
            double line341 = a25 * a33 * a44;
            double line342 = a25 * a34 * a43;
            double line343 = a23 * a35 * a44;
            double line344 = a24 * a33 * a45;

            double ansline113 = line339 + line340 + line341;
            double ansline114 = line342 + line343 + line344;
            double answer56 = ansline113 - ansline114;

            // Расчет минора для (2,1) матрицы
            double line345 = a13 * a34 * a45;
            double line346 = a14 * a35 * a43;
            double line347 = a15 * a33 * a44;
            double line348 = a15 * a34 * a43;
            double line359 = a13 * a35 * a44;
            double line360 = a14 * a33 * a45;

            double ansline115 = line345 + line346 + line347;
            double ansline116 = line348 + line359 + line360;
            double answer57 = ansline115 - ansline116;

            // Расчет минора для (3,1) матрицы
            double line361 = a13 * a24 * a45;
            double line362 = a14 * a25 * a43;
            double line363 = a15 * a23 * a44;
            double line364 = a15 * a24 * a43;
            double line365 = a13 * a25 * a44;
            double line366 = a14 * a23 * a45;

            double ansline117 = line361 + line362 + line363;
            double ansline118 = line364 + line365 + line366;
            double answer58 = ansline117 - ansline118;

            // Расчет минора для (4,1) матрицы
            double line367 = a13 * a24 * a35;
            double line368 = a14 * a25 * a33;
            double line369 = a15 * a23 * a34;
            double line370 = a15 * a24 * a33;
            double line371 = a13 * a25 * a34;
            double line372 = a14 * a23 * a35;

            double ansline119 = line367 + line368 + line369;
            double ansline120 = line370 + line371 + line372;
            double answer59 = ansline119 - ansline120;

            double M83 = b1 * answer56;
            double M84 = b2 * answer57;
            double M85 = b3 * answer58;
            double M86 = b4 * answer59;
            double M87 = M83 - M84 + M85 - M86;

            double M88 = a11 * M67;
            double M89 = a21 * M72;
            double M90 = a31 * M77;
            double M91 = a41 * M82;
            double M92 = a51 * M87;
            double M93 = M88 - M89 + M90 - M91 + M92;

            // String S23 = "=" + answer59 + answer58 + answer57 + answer56 + " = " +  M83 + M84 + M85 + M86 + "=" +  M87;
            String S23 = "= " + a11 + " * " + M67 + " - " + a21 + " * " + M72 + " + " + a31 + " * " + M77 + " - " + a41 + " * " + M82 + " + " + a51 + " * " + M87 + " = " + M88 + " + " + M89 + " + " + M90 + " + " + M91 + " + " + M92 + " = " + M93;
            textView154.setText(S23);

            textView125.setText("Определитель 3-го порядка");
            // Вывод общего порядка
            String S24 = a11 + "   " + a12 + "   " + b1 + "   " + a14 + "   " + a15;
            textView126.setText(S24);
            String S25 = a21 + "   " + a22 + "   " + b2 + "   " + a24 + "   " + a25;
            textView127.setText(S25);
            String S26 = a31 + "   " + a32 + "   " + b3 + "   " + a34 + "   " + a35;
            textView128.setText(S26);
            String S27 = a41 + "   " + a42 + "   " + b4 + "   " + a44 + "   " + a45;
            textView129.setText(S27);
            String S28 = a51 + "   " + a52 + "   " + b5 + "   " + a54 + "   " + a55;
            textView130.setText(S28);


            // Минор для (1,1)
            // Расчет минора для (1,1) матрицы
            double line373 = b3 * a44 * a55;
            double line374 = a34 * a45 * b5;
            double line375 = a35 * b4 * a54;
            double line376 = a35 * a44 * b5;
            double line377 = b3 * a45 * a54;
            double line378 = a34 * b4 * a55;

            double ansline121 = line373 + line374 + line375;
            double ansline122 = line376 + line377 + line378;
            double answer60 = ansline121 - ansline122;

            //  String S29 = "=" + line373 + " + "  + line374 + " + " +  line375 + " - " + line376 + " - " + line377 + " - " + line378 + " = " + answer60;

            // Расчет минора для (2,1) матрицы
            double line379 = b2 * a44 * a55;
            double line380 = a24 * a45 * b5;
            double line381 = a25 * b4 * a54;
            double line382 = a25 * a44 * b5;
            double line383 = b2 * a45 * a54;
            double line384 = a24 * b4 * a55;

            double ansline123 = line379 + line380 + line381;
            double ansline124 = line382 + line383 + line384;
            double answer61 = ansline123 - ansline124;

            //  String S29 = "=" + line379 + " + "  + line380 + " + " +  line381 + " - " + line382 + " - " + line383 + " - " + line384 + " = " + answer61;

            // Расчет минора для (3,1) матрицы
            double line385 = b2 * a34 * a55;
            double line386 = a24 * a35 * b5;
            double line387 = a25 * b3 * a54;
            double line388 = a25 * a34 * b5;
            double line389 = b2 * a35 * a54;
            double line390 = a24 * b3 * a55;

            double ansline125 = line385 + line386 + line387;
            double ansline126 = line388 + line389 + line390;
            double answer62 = ansline125 - ansline126;

            //  String S29 = "=" + line385 + " + "  + line386 + " + " +  line387 + " - " + line388 + " - " + line389 + " - " + line390 + " = " + answer62;

            // Расчет минора для (4,1) матрицы
            double line391 = b2 * a34 * a45;
            double line392 = a24 * a35 * b4;
            double line393 = a25 * b3 * a44;
            double line394 = a25 * a34 * b4;
            double line395 = b2 * a35 * a44;
            double line396 = a24 * b3 * a45;

            double ansline127 = line391 + line392 + line393;
            double ansline128 = line394 + line395 + line396;
            double answer63 = ansline127 - ansline128;

            //  String S29 = "=" + line391 + " + "  + line392 + " + " +  line393 + " - " + line394 + " - " + line395 + " - " + line396 + " = " + answer63;

            double M94 = a22 * answer60;
            double M95 = a32 * answer61;
            double M96 = a42 * answer62;
            double M97 = a52 * answer63;
            double M98 = M94 - M95 + M96 - M97;

            // Минор для (2,1)
            // Расчет минора для (1,1) матрицы
            double line397 = b3 * a44 * a55;
            double line398 = a34 * a45 * b5;
            double line399 = a35 * b4 * a54;
            double line400 = a35 * a44 * b5;
            double line401 = b3 * a45 * a54;
            double line402 = a34 * b4 * a55;

            double ansline129 = line397 + line398 + line399;
            double ansline130 = line400 + line401 + line402;
            double answer64 = ansline129 - ansline130;

            // Расчет минора для (2,1) матрицы
            double line403 = b1 * a44 * a55;
            double line404 = a14 * a45 * b5;
            double line405 = a15 * b4 * a54;
            double line406 = a15 * a44 * b5;
            double line407 = b1 * a45 * a54;
            double line408 = a14 * b4 * a55;

            double ansline131 = line403 + line404 + line405;
            double ansline132 = line406 + line407 + line408;
            double answer65 = ansline131 - ansline132;

            //   String S29 = "=" + line403 + " + "  + line404 + " + " +  line405 + " - " + line406 + " - " + line407 + " - " + line408 + " = " + answer66;

            // Расчет минора для (3,1) матрицы
            double line409 = b1 * a34 * a55;
            double line410 = a14 * a35 * b5;
            double line411 = a15 * b3 * a54;
            double line412 = a15 * a34 * b5;
            double line413 = b1 * a35 * a54;
            double line414 = a14 * b3 * a55;

            double ansline133 = line409 + line410 + line411;
            double ansline134 = line412 + line413 + line414;
            double answer66 = ansline133 - ansline134;

            //   String S29 = "=" + line409 + " + "  + line410 + " + " +  line411 + " - " + line412 + " - " + line413 + " - " + line414 + " = " + answer67;

            // Расчет минора для (4,1) матрицы
            double line415 = b1 * a34 * a45;
            double line416 = a14 * a35 * b4;
            double line417 = a15 * b3 * a44;
            double line418 = a15 * a34 * b4;
            double line419 = b1 * a35 * a44;
            double line420 = a14 * b3 * a45;

            double ansline135 = line415 + line416 + line417;
            double ansline136 = line418 + line419 + line420;
            double answer67 = ansline135 - ansline136;
            // String S29 = "=" + line415 + " + "  + line416 + " + " +  line417 + " - " + line418 + " - " + line419 + " - " + line420 + " = " + answer67

            double M99 = a12 * answer64;
            double M100 = a32 * answer65;
            double M101 = a42 * answer66;
            double M102 = a52 * answer67;
            double M103 = M99 - M100 + M101 - M102;

            //   String S29 = "= " + a12 + " * " + answer64 + " - "  + a32 + " * " +  answer65 + " + " + a42 + " * " + answer66 + " - " + a52 + " * " +  answer67 + " = " + M88 + " + " + M99 + " + " + M100 + " + " + M101 + " + " +  M102 + " = " + M103;


            // Минор для (3,1)
            // Расчет минора для (1,1) матрицы
            double line421 = b2 * a44 * a55;
            double line422 = a24 * a45 * b5;
            double line423 = a25 * b4 * a54;
            double line424 = a25 * a44 * b5;
            double line425 = b2 * a45 * a54;
            double line426 = a24 * b4 * a55;

            double ansline137 = line421 + line422 + line423;
            double ansline138 = line424 + line425 + line426;
            double answer68 = ansline137 - ansline138;

            // Расчет минора для (2,1) матрицы
            double line427 = b1 * a44 * a55;
            double line428 = a14 * a45 * b5;
            double line429 = a15 * b4 * a54;
            double line430 = a15 * a44 * b5;
            double line431 = b1 * a45 * a54;
            double line432 = a14 * b4 * a55;

            double ansline139 = line427 + line428 + line429;
            double ansline140 = line430 + line431 + line432;
            double answer69 = ansline139 - ansline140;
            //String S29 = "=" + line427 + " + "  + line428 + " + " +  line429 + " - " + line430 + " - " + line431 + " - " + line432 + " = " + answer69;

            // Расчет минора для (3,1) матрицы
            double line433 = b1 * a24 * a55;
            double line434 = a14 * a25 * b5;
            double line435 = a15 * b2 * a54;
            double line436 = a15 * a24 * b5;
            double line437 = b1 * a25 * a54;
            double line438 = a14 * b2 * a55;

            double ansline141 = line433 + line434 + line435;
            double ansline142 = line436 + line437 + line438;
            double answer70 = ansline141 - ansline142;

            // Расчет минора для (4,1) матрицы
            double line439 = b1 * a24 * a45;
            double line440 = a14 * a25 * b4;
            double line441 = a15 * b2 * a44;
            double line442 = a15 * a24 * b4;
            double line443 = b1 * a25 * a44;
            double line444 = a14 * b2 * a45;

            double ansline143 = line439 + line440 + line441;
            double ansline144 = line442 + line443 + line444;
            double answer71 = ansline143 - ansline144;

            double M104 = a12 * answer68;
            double M105 = a22 * answer69;
            double M106 = a42 * answer70;
            double M107 = a52 * answer71;
            double M108 = M104 - M105 + M106 - M107;

            //  String S29 = "=" + line439 + " + "  + line440 + " + " +  line441 + " - " + line442 + " - " + line444 + " - " + line420 + " = " + answer68 + answer69 + answer70 + answer71;
            //  String S29 = "= " + a12 + " * " + answer68 + " - "  + a22 + " * " +  answer69 + " + " + a42 + " * " + answer70 + " - " + a52 + " * " +  answer71 +  " = " + M104 + " + " + M105 + " + " + M106 + " + " + M107 + " = " + M108;
            //  String S29 = "=" + answer68 + answer69 + answer70 + answer71;
            //    String S29 = "=" + answer68 + answer60 + answer70 + answer71;

            // Минор для (4,1)
            // Расчет минора для (1,1) матрицы
            double line445 = b2 * a34 * a55;
            double line446 = a24 * a35 * b5;
            double line447 = a25 * b3 * a54;
            double line448 = a25 * a34 * b5;
            double line449 = b2 * a35 * a54;
            double line450 = a24 * b3 * a55;

            double ansline145 = line445 + line446 + line447;
            double ansline146 = line448 + line449 + line450;
            double answer72 = ansline145 - ansline146;

            // Расчет минора для (2,1) матрицы
            double line451 = b1 * a34 * a55;
            double line452 = a14 * a35 * b5;
            double line453 = a15 * b3 * a54;
            double line454 = a15 * a34 * b5;
            double line455 = b1 * a35 * a54;
            double line456 = a14 * b3 * a55;

            double ansline147 = line451 + line452 + line453;
            double ansline148 = line454 + line455 + line456;
            double answer73 = ansline147 - ansline148;

            // Расчет минора для (3,1) матрицы
            double line457 = b1 * a24 * a55;
            double line458 = a14 * a25 * b5;
            double line459 = a15 * b2 * a54;
            double line460 = a15 * a24 * b5;
            double line461 = b1 * a25 * a54;
            double line462 = a14 * b2 * a55;

            double ansline149 = line457 + line458 + line459;
            double ansline150 = line460 + line461 + line462;
            double answer74 = ansline149 - ansline150;

            // Расчет минора для (4,1) матрицы
            double line463 = b1 * a24 * a35;
            double line464 = a14 * a25 * b3;
            double line465 = a15 * b2 * a34;
            double line466 = a15 * a24 * b3;
            double line467 = b1 * a25 * a34;
            double line468 = a14 * b2 * a35;

            double ansline151 = line463 + line464 + line465;
            double ansline152 = line466 + line467 + line468;
            double answer75 = ansline151 - ansline152;

            double M109 = a12 * answer72;
            double M110 = a22 * answer73;
            double M111 = a32 * answer74;
            double M112 = a52 * answer75;
            double M113 = M109 - M110 + M111 - M112;

            // String S29 = "=" + line463 + " + "  + line464 + " + " +  line465 + " - " + line466 + " - " + line467 + " - " + line468 + " = " + answer72 + answer73 + answer74 + answer75;
            //  String S29 = "= " + a12 + " * " + answer72 + " - "  + a22 + " * " +  answer73 + " + " + a32 + " * " + answer74 + " - " + a52 + " * " +  answer75 +  " = " + M109 + " + " + M110 + " + " + M111 + " + " + M112 + " = " + M113;

            // Минор для (5,1)
            // Расчет минора для (1,1) матрицы
            double line469 = b2 * a34 * a45;
            double line470 = a24 * a35 * b4;
            double line471 = a25 * b3 * a44;
            double line472 = a25 * a34 * b4;
            double line473 = b2 * a35 * a44;
            double line474 = a24 * b3 * a45;

            double ansline153 = line469 + line470 + line471;
            double ansline154 = line472 + line473 + line474;
            double answer76 = ansline153 - ansline154;

            // Расчет минора для (2,1) матрицы
            double line475 = b1 * a34 * a45;
            double line476 = a14 * a35 * b4;
            double line477 = a15 * b3 * a44;
            double line478 = a15 * a34 * b4;
            double line479 = b1 * a35 * a44;
            double line480 = a14 * b3 * a45;

            double ansline155 = line475 + line476 + line477;
            double ansline156 = line478 + line479 + line480;
            double answer77 = ansline155 - ansline156;

            // Расчет минора для (3,1) матрицы
            double line481 = b1 * a24 * a45;
            double line482 = a14 * a25 * b4;
            double line483 = a15 * b2 * a44;
            double line484 = a15 * a24 * b4;
            double line485 = b1 * a25 * a44;
            double line486 = a14 * b2 * a45;

            double ansline157 = line481 + line482 + line483;
            double ansline158 = line484 + line485 + line486;
            double answer78 = ansline157 - ansline158;

            // Расчет минора для (4,1) матрицы
            double line487 = b1 * a24 * a35;
            double line488 = a14 * a25 * b3;
            double line489 = a15 * b2 * a34;
            double line490 = a15 * a24 * b3;
            double line491 = b1 * a25 * a34;
            double line492 = a14 * b2 * a35;

            double ansline159 = line487 + line488 + line489;
            double ansline160 = line490 + line491 + line492;
            double answer79 = ansline159 - ansline160;

            double M114 = a12 * answer76;
            double M115 = a22 * answer77;
            double M116 = a32 * answer78;
            double M117 = a42 * answer79;
            double M118 = M114 - M115 + M116 - M117;

            //  String S29 = "=" + line469 + " + "  + line470 + " + " +  line471 + " - " + line472 + " - " + line473 + " - " + line474 + " = " + answer76 + answer77 + answer78 + answer79;
            //  String S29 = "= " + a12 + " * " + answer76 + " - "  + a22 + " * " +  answer77 + " + " + a32 + " * " + answer78 + " - " + a42 + " * " +  answer79 +  " = " + M114 + " + " + M115 + " + " + M116 + " + " + M117 + " = " + M118;
            // String S29 = "=" + answer76 + answer77 + answer78 + answer79;
            double M119 = a11 * M98;
            double M120 = a21 * M103;
            double M121 = a31 * M108;
            double M122 = a41 * M113;
            double M123 = a51 * M118;
            double M124 = M119 - M120 + M121 - M122 + M123;

            String S29 = "= " + a11 + " * " + M98 + " - " + a21 + " * " + M103 + " + " + a31 + " * " + M108 + " - " + a41 + " * " + M113 + " + " + a51 + " * " + M118 + " = " + M120 + " + " + M121 + " + " + M122 + " + " + M123 + " = " + M124;
            textView155.setText(S29);


            textView131.setText("Определитель 4-го порядка");
            // Вывод общего порядка
            String S30 = a11 + "   " + a12 + "   " + a13 + "   " + b1 + "   " + a15;
            textView132.setText(S30);
            String S31 = a21 + "   " + a22 + "   " + a23 + "   " + b2 + "   " + a25;
            textView133.setText(S31);
            String S32 = a31 + "   " + a32 + "   " + a33 + "   " + b3 + "   " + a35;
            textView134.setText(S32);
            String S33 = a41 + "   " + a42 + "   " + a43 + "   " + b4 + "   " + a45;
            textView135.setText(S33);
            String S34 = a51 + "   " + a52 + "   " + a53 + "   " + b5 + "   " + a55;
            textView136.setText(S34);

            // Минор для (1,1)
            // Расчет минора для (1,1) матрицы
            double line493 = a33 * b4 * a55;
            double line494 = b3 * a45 * a53;
            double line495 = a35 * a43 * b5;
            double line496 = a35 * b4 * a53;
            double line497 = a33 * a45 * b5;
            double line498 = b3 * a43 * a55;

            double ansline161 = line493 + line494 + line495;
            double ansline162 = line496 + line497 + line498;
            double answer80 = ansline161 - ansline162;

            //  String S35 = "=" + line493 + " "  + line494 + " " +  line495 + " " + line496 + " " + line497 + " " + line498 + " " + answer80;

            // Расчет минора для (2,1) матрицы
            double line499 = a23 * b4 * a55;
            double line500 = b2 * a45 * a53;
            double line501 = a25 * a43 * b5;
            double line502 = a25 * b4 * a53;
            double line503 = a23 * a45 * b5;
            double line504 = b2 * a43 * a55;

            double ansline163 = line499 + line500 + line501;
            double ansline164 = line502 + line503 + line504;
            double answer81 = ansline163 - ansline164;

            // String S35 = "=" + line499 + " "  + line500 + " " +  line501 + " " + line502 + " " + line503 + " " + line504 + " " + answer81;

            // Расчет минора для (3,1) матрицы
            double line505 = a23 * b3 * a55;
            double line506 = b2 * a35 * a53;
            double line507 = a25 * a33 * b5;
            double line508 = a25 * b3 * a53;
            double line509 = a23 * a35 * b5;
            double line510 = b2 * a33 * a55;

            double ansline165 = line505 + line506 + line507;
            double ansline166 = line508 + line509 + line510;
            double answer82 = ansline165 - ansline166;

            //  String S35 = "=" + line505 + " "  + line506 + " " +  line507 + " " + line508 + " " + line509 + " " + line510 + " " + answer82;

            // Расчет минора для (4,1) матрицы
            double line511 = a23 * b3 * a45;
            double line512 = b2 * a35 * a43;
            double line513 = a25 * a33 * b4;
            double line514 = a25 * b3 * a43;
            double line515 = a23 * a35 * b4;
            double line516 = b2 * a33 * a45;

            double ansline167 = line511 + line512 + line513;
            double ansline168 = line514 + line515 + line516;
            double answer83 = ansline167 - ansline168;

            //  String S35 = "=" + line511 + " "  + line512 + " " +  line513 + " " + line514 + " " + line515 + " " + line516 + " " + answer83;

            double M125 = a22 * answer80;
            double M126 = a32 * answer81;
            double M127 = a42 * answer82;
            double M128 = a52 * answer83;
            double M129 = M125 - M126 + M127 - M128;

            //  String S35 = "= " + a22 + " * " + answer80 + " - "  + a32 + " * " +  answer81 + " + " + a42 + " * " + answer82 + " - " + a52 + " * " +  answer83 + " = " + M125 + " + " + M126 + " + " + M127 + " + " + M128 + " = " + M129;


            // Минор для (2,1)
            // Расчет минора для (1,1) матрицы
            double line517 = a33 * b4 * a55;
            double line518 = b3 * a45 * a53;
            double line519 = a35 * a43 * b5;
            double line520 = a35 * b4 * a53;
            double line521 = a33 * a45 * b5;
            double line522 = b3 * a43 * a55;

            double ansline169 = line517 + line518 + line519;
            double ansline170 = line520 + line521 + line522;
            double answer84 = ansline169 - ansline170;

            // String S35 = "=" + line517 + " "  + line518 + " " +  line519 + " " + line520 + " " + line521 + " " + line522 + " " + answer84;

            // Расчет минора для (2,1) матрицы
            double line523 = a13 * b4 * a55;
            double line524 = b1 * a45 * a53;
            double line525 = a15 * a43 * b5;
            double line526 = a15 * b4 * a53;
            double line527 = a13 * a45 * b5;
            double line528 = b1 * a43 * a55;

            double ansline171 = line523 + line524 + line525;
            double ansline172 = line526 + line527 + line528;
            double answer85 = ansline171 - ansline172;

            //  String S35 = "=" + line523 + " "  + line524 + " " +  line525 + " " + line526 + " " + line527 + " " + line528 + " " + answer85;

            // Расчет минора для (3,1) матрицы
            double line529 = a13 * b3 * a55;
            double line530 = b1 * a35 * a53;
            double line531 = a15 * a33 * b5;
            double line532 = a15 * b3 * a53;
            double line533 = a13 * a35 * b5;
            double line534 = b1 * a33 * a55;

            double ansline173 = line529 + line530 + line531;
            double ansline174 = line532 + line533 + line534;
            double answer86 = ansline173 - ansline174;

            // String S35 = "=" + line529 + " "  + line530 + " " +  line531 + " " + line532 + " " + line533 + " " + line534 + " " + answer86;


            // Расчет минора для (4,1) матрицы
            double line535 = a13 * b3 * a45;
            double line536 = b1 * a35 * a43;
            double line537 = a15 * a33 * b4;
            double line538 = a15 * b3 * a43;
            double line539 = a13 * a35 * b4;
            double line540 = b1 * a33 * a45;

            double ansline175 = line535 + line536 + line537;
            double ansline176 = line538 + line539 + line540;
            double answer87 = ansline175 - ansline176;

            //  String S35 = "=" + line535 + " "  + line536 + " " +  line537 + " " + line538 + " " + line539 + " " + line540 + " " + answer87;


            double M130 = a12 * answer84;
            double M131 = a32 * answer85;
            double M132 = a42 * answer86;
            double M133 = a52 * answer87;
            double M134 = M130 - M131 + M132 - M133;
            //    String S35 = "= " + a12 + " * " + answer84 + " - "  + a32 + " * " +  answer85 + " + " + a42 + " * " + answer86 + " - " + a52 + " * " +  answer87 +  " = " + M130 + " + " + M131 + " + " + M132 + " + " + M133 + " = " + M134;

            // Минор для (3,1)
            // Расчет минора для (1,1) матрицы
            double line541 = a23 * b4 * a55;
            double line542 = b2 * a45 * a53;
            double line543 = a25 * a43 * b5;
            double line544 = a25 * b4 * a53;
            double line545 = a23 * a45 * b5;
            double line546 = b2 * a43 * a55;

            double ansline177 = line541 + line542 + line543;
            double ansline178 = line544 + line545 + line546;
            double answer88 = ansline177 - ansline178;

            //   String S35 = "=" + line541 + " "  + line542 + " " +  line543 + " " + line544 + " " + line545 + " " + line546 + " " + answer88;

            // Расчет минора для (2,1) матрицы
            double line547 = a13 * b4 * a55;
            double line548 = b1 * a45 * a53;
            double line549 = a15 * a43 * b5;
            double line550 = a15 * b4 * a53;
            double line551 = a13 * a45 * b5;
            double line552 = b1 * a43 * a55;

            double ansline179 = line547 + line548 + line549;
            double ansline180 = line550 + line551 + line552;
            double answer89 = ansline179 - ansline180;

            //   String S35 = "=" + line547 + " "  + line548 + " " +  line549 + " " + line550 + " " + line551 + " " + line552 + " " + answer89;

            // Расчет минора для (3,1) матрицы
            double line553 = a13 * b2 * a55;
            double line554 = b1 * a25 * a53;
            double line555 = a15 * a23 * b5;
            double line556 = a15 * b2 * a53;
            double line557 = a13 * a25 * b5;
            double line558 = b1 * a23 * a55;

            double ansline181 = line553 + line554 + line555;
            double ansline182 = line556 + line557 + line558;
            double answer90 = ansline181 - ansline182;

            //   String S35 = "=" + line553 + " "  + line554 + " " +  line555 + " " + line556 + " " + line557 + " " + line558 + " " + answer90;

            // Расчет минора для (4,1) матрицы
            double line559 = a13 * b2 * a45;
            double line560 = b1 * a25 * a43;
            double line561 = a15 * a23 * b4;
            double line562 = a15 * b2 * a43;
            double line563 = a13 * a25 * b4;
            double line564 = b1 * a23 * a45;

            double ansline183 = line559 + line560 + line561;
            double ansline184 = line562 + line563 + line564;
            double answer91 = ansline183 - ansline184;

            //   String S35 = "=" + line559 + " "  + line560 + " " +  line561 + " " + line562 + " " + line563 + " " + line564 + " " + answer91;

            double M135 = a12 * answer88;
            double M136 = a22 * answer89;
            double M137 = a42 * answer90;
            double M138 = a52 * answer91;
            double M139 = M135 - M136 + M137 - M138;

            //  String S35 = "= " + a12 + " * " + answer88 + " - "  + a22 + " * " +  answer89 + " + " + a42 + " * " + answer90 + " - " + a52 + " * " +  answer91 +  " = " + M135 + " + " + M136 + " + " + M137 + " + " + M138 + " = " + M139;

            // Минор для (4,1)
            // Расчет минора для (1,1) матрицы
            double line565 = a23 * b3 * a55;
            double line566 = b2 * a35 * a53;
            double line567 = a25 * a33 * b5;
            double line568 = a25 * b3 * a53;
            double line569 = a23 * a35 * b5;
            double line570 = b2 * a33 * a55;

            double ansline185 = line565 + line566 + line567;
            double ansline186 = line568 + line569 + line570;
            double answer92 = ansline185 - ansline186;

            //   String S35 = "=" + line565 + " "  + line566 + " " +  line567 + " " + line568 + " " + line569 + " " + line570 + " " + answer92;

            // Расчет минора для (2,1) матрицы
            double line571 = a13 * b3 * a55;
            double line572 = b1 * a35 * a53;
            double line573 = a15 * a33 * b5;
            double line574 = a15 * b3 * a53;
            double line575 = a13 * a35 * b5;
            double line576 = b1 * a33 * a55;

            double ansline187 = line571 + line572 + line573;
            double ansline188 = line574 + line575 + line576;
            double answer93 = ansline187 - ansline188;

            //  String S35 = "=" + line571 + " "  + line572 + " " +  line573 + " " + line574 + " " + line575 + " " + line576 + " " + answer93;


            // Расчет минора для (3,1) матрицы
            double line577 = a13 * b2 * a55;
            double line578 = b1 * a25 * a53;
            double line579 = a15 * a23 * b5;
            double line580 = a15 * b2 * a53;
            double line581 = a13 * a25 * b5;
            double line582 = b1 * a23 * a55;

            double ansline189 = line577 + line578 + line579;
            double ansline190 = line580 + line581 + line582;
            double answer94 = ansline181 - ansline182;

            //   String S35 = "=" + line577 + " "  + line578 + " " +  line579 + " " + line580 + " " + line581 + " " + line582 + " " + answer94;

            // Расчет минора для (4,1) матрицы
            double line583 = a13 * b2 * a35;
            double line584 = b1 * a25 * a33;
            double line585 = a15 * a23 * b3;
            double line586 = a15 * b2 * a33;
            double line587 = a13 * a25 * b3;
            double line588 = b1 * a23 * a35;

            double ansline191 = line583 + line584 + line585;
            double ansline192 = line586 + line587 + line588;
            double answer95 = ansline191 - ansline192;

            //   String S35 = "=" + line583 + " "  + line584 + " " +  line585 + " " + line586 + " " + line587 + " " + line588 + " " + answer95;
            //  String S35 = "=" + answer92 + answer93 + answer94 + answer95;

            double M140 = a12 * answer92;
            double M141 = a22 * answer93;
            double M142 = a32 * answer94;
            double M143 = a52 * answer95;
            double M144 = M140 - M141 + M142 - M143;

            //  String S35 = "= " + a12 + " * " + answer92 + " - "  + a22 + " * " +  answer93 + " + " + a32 + " * " + answer94 + " - " + a52 + " * " +  answer95 +  " = " + M140 + " + " + M141 + " + " + M142 + " + " + M143 + " = " + M144;

            // Минор для (5,1)
            // Расчет минора для (1,1) матрицы
            double line589 = a23 * b3 * a45;
            double line590 = b2 * a35 * a43;
            double line591 = a25 * a33 * b4;
            double line592 = a25 * b3 * a43;
            double line593 = a23 * a35 * b4;
            double line594 = b2 * a33 * a45;

            double ansline193 = line589 + line590 + line591;
            double ansline194 = line592 + line593 + line594;
            double answer96 = ansline193 - ansline194;

            //  String S35 = "=" + line589 + " "  + line590 + " " +  line591 + " " + line592 + " " + line593 + " " + line594 + " " + answer96;

            // Расчет минора для (2,1) матрицы
            double line595 = a13 * b3 * a45;
            double line596 = b1 * a35 * a43;
            double line597 = a15 * a33 * b4;
            double line598 = a15 * b3 * a43;
            double line599 = a13 * a35 * b4;
            double line600 = b1 * a33 * a45;

            double ansline195 = line595 + line596 + line597;
            double ansline196 = line598 + line599 + line600;
            double answer97 = ansline195 - ansline196;


            // String S35 = "=" + line595 + " "  + line596 + " " +  line597 + " " + line598 + " " + line599 + " " + line600 + " " + answer97;

            // Расчет минора для (3,1) матрицы
            double line601 = a13 * b2 * a45;
            double line602 = b1 * a25 * a43;
            double line603 = a15 * a23 * b4;
            double line604 = a15 * b2 * a43;
            double line605 = a13 * a25 * b4;
            double line606 = b1 * a23 * a45;

            double ansline197 = line601 + line602 + line603;
            double ansline198 = line604 + line605 + line606;
            double answer98 = ansline197 - ansline198;

            //  String S35 = "=" + line601 + " "  + line602 + " " +  line603 + " " + line604 + " " + line605 + " " + line606 + " " + answer98;

            // Расчет минора для (4,1) матрицы
            double line607 = a13 * b2 * a35;
            double line608 = b1 * a25 * a33;
            double line609 = a15 * a23 * b3;
            double line610 = a15 * b2 * a33;
            double line611 = a13 * a25 * b3;
            double line612 = b1 * a23 * a35;

            double ansline199 = line607 + line608 + line609;
            double ansline200 = line610 + line611 + line612;
            double answer99 = ansline199 - ansline200;

            //  String S35 = "=" + line607 + " "  + line608 + " " +  line609 + " " + line610 + " " + line611 + " " + line612 + " " + answer99;
            //  String S35 = "=" + answer96 + answer97 + answer98 + answer99;

            double M145 = a12 * answer96;
            double M146 = a22 * answer97;
            double M147 = a32 * answer98;
            double M148 = a42 * answer99;
            double M149 = M145 - M146 + M147 - M148;

            // String S35 = "= " + a12 + " * " + answer96 + " - "  + a22 + " * " +  answer97 + " + " + a32 + " * " + answer98 + " - " + a42 + " * " +  answer99 +  " = " + M145 + " + " + M146 + " + " + M147 + " + " + M148 + " = " + M149;
            // String S35 = "= " + a12 + " * " + answer96 + " - "  + a22 + " * " +  answer97 + " + " + a32 + " * " + answer98 + " - " + a42 + " * " +  answer99 +  " = " + M145 + " + " + M146 + " + " + M147 + " + " + M148 + " = " + M149;

            double M150 = a11 * M129;
            double M151 = a21 * M134;
            double M152 = a31 * M139;
            double M153 = a41 * M144;
            double M154 = a51 * M149;
            double M155 = M150 - M151 + M152 - M153 + M154;

            String S35 = "= " + a11 + " * " + M129 + " - " + a21 + " * " + M134 + " + " + a31 + " * " + M139 + " - " + a41 + " * " + M144 + " + " + a51 + " + " + M149 + " = " + M150 + " + " + M51 + " + " + M152 + " + " + M153 + +M154 + " = " + M155;
            textView156.setText(S35);


            textView140.setText("Определитель 5-го порядка");
            // Вывод общего порядка
            String S36 = a11 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + b1;
            textView141.setText(S36);
            String S37 = a21 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + b2;
            textView142.setText(S37);
            String S38 = a31 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + b3;
            textView143.setText(S38);
            String S39 = a41 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + b4;
            textView144.setText(S39);
            String S40 = a51 + "   " + a52 + "   " + a53 + "   " + a54 + "   " + b5;
            textView145.setText(S40);

            // Минор для (1,1)
            // Расчет минора для (1,1) матрицы
            double line613 = a33 * a44 * b5;
            double line614 = a34 * b4 * a53;
            double line615 = b3 * a43 * a54;
            double line616 = b3 * a44 * a53;
            double line617 = a33 * b4 * a54;
            double line618 = a34 * a43 * b5;

            double ansline201 = line613 + line614 + line615;
            double ansline202 = line616 + line617 + line618;
            double answer100 = ansline201 - ansline202;

            // String S41 = "=" + line613 + " "  + line614 + " " +  line615 + " " + line616 + " " + line617 + " " + line618 + " = " + answer100;

            // Расчет минора для (2,1) матрицы
            double line619 = a23 * a44 * b5;
            double line620 = a24 * b4 * a53;
            double line621 = b2 * a43 * a54;
            double line622 = b2 * a44 * a53;
            double line623 = a23 * b4 * a54;
            double line624 = a24 * a43 * b5;

            double ansline203 = line619 + line620 + line621;
            double ansline204 = line622 + line623 + line624;
            double answer101 = ansline203 - ansline204;

            // String S41 = "=" + line619 + " "  + line620 + " " +  line621 + " " + line622 + " " + line623 + " " + line624 + " = " + answer101;

            // Расчет минора для (3,1) матрицы
            double line625 = a23 * a34 * b5;
            double line626 = a24 * b3 * a53;
            double line627 = b2 * a33 * a54;
            double line628 = b2 * a34 * a53;
            double line629 = a23 * b3 * a54;
            double line630 = a24 * a33 * b5;

            double ansline205 = line625 + line626 + line627;
            double ansline206 = line628 + line629 + line630;
            double answer102 = ansline205 - ansline206;

            //  String S41 = "=" + line625 + " "  + line626 + " " +  line627 + " " + line628 + " " + line629 + " " + line630 + " = " + answer102;

            // Расчет минора для (4,1) матрицы
            double line631 = a23 * a34 * b4;
            double line632 = a24 * b3 * a43;
            double line633 = b2 * a33 * a44;
            double line634 = b2 * a34 * a43;
            double line635 = a23 * b3 * a44;
            double line636 = a24 * a33 * b4;

            double ansline207 = line631 + line632 + line633;
            double ansline208 = line634 + line635 + line636;
            double answer103 = ansline207 - ansline208;

            //   String S41 = "=" + line631 + " "  + line632 + " " +  line633 + " " + line634 + " " + line635 + " " + line636 + " = " + answer103;


            double M156 = a22 * answer100;
            double M157 = a32 * answer101;
            double M158 = a42 * answer102;
            double M159 = a52 * answer103;
            double M160 = M156 - M157 + M158 - M159;

            //   String S41 = "= " + a22 + " * " + answer100 + " - "  + a32 + " * " +  answer101 + " + " + a42 + " * " + answer102 + " - " + a52 + " * " +  answer103 +  " = " + M156 + " + " + M157 + " + " + M158 + " + " + M159 + " = " + M160;

            //   String S41 = "=" + answer100 + answer101 + answer102 + answer103;
            // Минор для (2,1)
            // Расчет минора для (1,1) матрицы
            double line637 = a33 * a44 * b5;
            double line638 = a34 * b4 * a53;
            double line639 = b3 * a43 * a54;
            double line640 = b3 * a44 * a53;
            double line641 = a33 * b4 * a54;
            double line642 = a34 * a43 * b5;

            double ansline209 = line637 + line638 + line639;
            double ansline210 = line640 + line641 + line642;
            double answer104 = ansline209 - ansline210;

            // String S41 = "=" + line637 + " "  + line638 + " " +  line639 + " " + line640 + " " + line641 + " " + line642 + " = " + answer104;

            // Расчет минора для (2,1) матрицы
            double line643 = a13 * a44 * b5;
            double line644 = a14 * b4 * a53;
            double line645 = b1 * a43 * a54;
            double line646 = b1 * a44 * a53;
            double line647 = a13 * b4 * a54;
            double line648 = a14 * a43 * b5;

            double ansline211 = line643 + line644 + line645;
            double ansline212 = line646 + line647 + line648;
            double answer105 = ansline211 - ansline212;

            // String S41 = "=" + line643 + " "  + line644 + " " +  line645 + " " + line646 + " " + line647 + " " + line648 + " = " + answer105;

            // Расчет минора для (3,1) матрицы
            double line649 = a13 * a34 * b5;
            double line650 = a14 * b3 * a53;
            double line651 = b1 * a33 * a54;
            double line652 = b1 * a34 * a53;
            double line653 = a13 * b3 * a54;
            double line654 = a14 * a33 * b5;

            double ansline213 = line649 + line650 + line651;
            double ansline214 = line652 + line653 + line654;
            double answer106 = ansline213 - ansline214;

            //  String S41 = "=" + line649 + " "  + line650 + " " +  line651 + " " + line652 + " " + line653 + " " + line654 + " = " + answer106;

            // Расчет минора для (4,1) матрицы
            double line655 = a13 * a34 * b4;
            double line656 = a14 * b3 * a43;
            double line657 = b1 * a33 * a44;
            double line658 = b1 * a34 * a43;
            double line659 = a13 * b3 * a44;
            double line660 = a14 * a33 * b4;

            double ansline215 = line655 + line656 + line657;
            double ansline216 = line658 + line659 + line660;
            double answer107 = ansline215 - ansline216;

            //  String S41 = "=" + line655 + " "  + line656 + " " +  line657 + " " + line658 + " " + line659 + " " + line660 + " = " + answer107;

            double M161 = a12 * answer104;
            double M162 = a32 * answer105;
            double M163 = a42 * answer106;
            double M164 = a52 * answer107;
            double M165 = M161 - M162 + M163 - M164;

            //   String S41 = "= " + a12 + " * " + answer104 + " - "  + a32 + " * " +  answer105 + " + " + a42 + " * " + answer106 + " - " + a52 + " * " +  answer107 +  " = " + M161 + " + " + M162 + " + " + M163 + " + " + M164 + " = " + M165;
            //String S41 = "=" + answer104 + answer105 + answer106 + answer107;

            // Минор для (3,1)
            // Расчет минора для (1,1) матрицы
            double line661 = a23 * a44 * b5;
            double line662 = a24 * b4 * a53;
            double line663 = b2 * a43 * a54;
            double line664 = b2 * a44 * a53;
            double line665 = a23 * b4 * a54;
            double line666 = a24 * a43 * b5;

            double ansline217 = line661 + line662 + line663;
            double ansline218 = line664 + line665 + line666;
            double answer108 = ansline217 - ansline218;

            //  String S41 = "=" + line661 + " "  + line662 + " " +  line663 + " " + line664 + " " + line665 + " " + line666 + " = " + answer108;

            // Расчет минора для (2,1) матрицы
            double line667 = a13 * a44 * b5;
            double line668 = a14 * b4 * a53;
            double line669 = b1 * a43 * a54;
            double line670 = b1 * a44 * a53;
            double line671 = a13 * b4 * a54;
            double line672 = a14 * a43 * b5;

            double ansline219 = line667 + line668 + line669;
            double ansline220 = line670 + line671 + line672;
            double answer109 = ansline219 - ansline220;

            //  String S41 = "=" + line667 + " "  + line668 + " " +  line669 + " " + line670 + " " + line671 + " " + line672 + " = " + answer109;


            // Расчет минора для (3,1) матрицы
            double line673 = a13 * a24 * b5;
            double line674 = a14 * b2 * a53;
            double line675 = b1 * a23 * a54;
            double line676 = b1 * a24 * a53;
            double line677 = a13 * b2 * a54;
            double line678 = a14 * a23 * b5;

            double ansline221 = line673 + line674 + line675;
            double ansline222 = line676 + line677 + line678;
            double answer110 = ansline221 - ansline222;

            //  String S41 = "=" + line673 + " "  + line674 + " " +  line675 + " " + line676 + " " + line677 + " " + line678 + " = " + answer110;

            // Расчет минора для (4,1) матрицы
            double line679 = a13 * a24 * b4;
            double line680 = a14 * b2 * a43;
            double line681 = b1 * a23 * a44;
            double line682 = b1 * a24 * a43;
            double line683 = a13 * b2 * a44;
            double line684 = a14 * a23 * b4;

            double ansline223 = line679 + line680 + line681;
            double ansline224 = line682 + line683 + line684;
            double answer111 = ansline223 - ansline224;

            //  String S41 = "=" + line679 + " "  + line680 + " " +  line681 + " " + line682 + " " + line683 + " " + line684 + " = " + answer111;
            //  String S41 = "=" + answer108 + answer109 + answer110 + answer111;

            double M166 = a12 * answer108;
            double M167 = a22 * answer109;
            double M168 = a42 * answer110;
            double M169 = a52 * answer111;
            double M170 = M166 - M167 + M168 - M169;

            //  String S41 = "= " + a12 + " * " + answer108 + " - "  + a22 + " * " +  answer109 + " + " + a42 + " * " + answer110 + " - " + a52 + " * " +  answer111 +  " = " + M166 + " + " + M167 + " + " + M168 + " + " + M169 + " = " + M170;


            // Минор для (4,1)
            // Расчет минора для (1,1) матрицы
            double line685 = a23 * a34 * b5;
            double line686 = a24 * b3 * a53;
            double line687 = b2 * a33 * a54;
            double line688 = b2 * a34 * a53;
            double line689 = a23 * b3 * a54;
            double line690 = a24 * a33 * b5;

            double ansline225 = line685 + line686 + line687;
            double ansline226 = line688 + line689 + line690;
            double answer112 = ansline225 - ansline226;

            //  String S41 = "=" + line685 + " "  + line686 + " " +  line687 + " " + line688 + " " + line689 + " " + line690 + " = " + answer112;


            // Расчет минора для (2,1) матрицы
            double line691 = a13 * a34 * b5;
            double line692 = a14 * b3 * a53;
            double line693 = b1 * a33 * a54;
            double line694 = b1 * a34 * a53;
            double line695 = a13 * b3 * a54;
            double line696 = a14 * a33 * b5;

            double ansline227 = line691 + line692 + line693;
            double ansline228 = line694 + line695 + line696;
            double answer113 = ansline227 - ansline228;

            //  String S41 = "=" + line691 + " "  + line692 + " " +  line693 + " " + line694 + " " + line695 + " " + line696 + " = " + answer113;

            // Расчет минора для (3,1) матрицы
            double line697 = a13 * a24 * b5;
            double line698 = a14 * b2 * a53;
            double line699 = b1 * a23 * a54;
            double line700 = b1 * a24 * a53;
            double line701 = a13 * b2 * a54;
            double line702 = a14 * a23 * b5;

            double ansline229 = line697 + line698 + line699;
            double ansline230 = line700 + line701 + line702;
            double answer114 = ansline229 - ansline230;

            //    String S41 = "=" + line697 + " "  + line698 + " " +  line699 + " " + line700 + " " + line701 + " " + line702 + " = " + answer114;
            // Расчет минора для (4,1) матрицы
            double line703 = a13 * a24 * b3;
            double line704 = a14 * b2 * a33;
            double line705 = b1 * a23 * a34;
            double line706 = b1 * a24 * a33;
            double line707 = a13 * b2 * a34;
            double line708 = a14 * a23 * b3;

            double ansline231 = line703 + line704 + line705;
            double ansline232 = line706 + line707 + line708;
            double answer115 = ansline231 - ansline232;

            //    String S41 = "=" + line703 + " "  + line704 + " " +  line705 + " " + line706 + " " + line707 + " " + line708 + " = " + answer115;

            double M171 = a12 * answer112;
            double M172 = a22 * answer113;
            double M173 = a32 * answer114;
            double M174 = a52 * answer115;
            double M175 = M171 - M172 + M173 - M174;

            // String S41 = "= " + a12 + " * " + answer112 + " - "  + a22 + " * " +  answer113 + " + " + a32 + " * " + answer114 + " - " + a52 + " * " +  answer115 +  " = " + M171 + " + " + M172 + " + " + M173 + " + " + M174 + " = " + M175;
            //String S41 = "=" + answer104 + answer105 + answer106 + answer107;

            // Минор для (5,1)
            // Расчет минора для (1,1) матрицы
            double line709 = a23 * a34 * b4;
            double line710 = a24 * b3 * a43;
            double line711 = b2 * a33 * a44;
            double line712 = b2 * a34 * a43;
            double line713 = a23 * b3 * a44;
            double line714 = a24 * a33 * b4;

            double ansline233 = line709 + line710 + line711;
            double ansline234 = line712 + line713 + line714;
            double answer116 = ansline233 - ansline234;

            //   String S41 = "=" + line709 + " "  + line710 + " " +  line711 + " " + line712 + " " + line713 + " " + line714 + " = " + answer116;

            // Расчет минора для (2,1) матрицы
            double line715 = a13 * a34 * b4;
            double line716 = a14 * b3 * a43;
            double line717 = b1 * a33 * a44;
            double line718 = b1 * a34 * a43;
            double line719 = a13 * b3 * a44;
            double line720 = a14 * a33 * b4;

            double ansline235 = line715 + line716 + line717;
            double ansline236 = line718 + line719 + line720;
            double answer117 = ansline235 - ansline236;

            //  String S41 = "=" + line715 + " "  + line716 + " " +  line717 + " " + line718 + " " + line719 + " " + line720 + " = " + answer117;

            // Расчет минора для (3,1) матрицы
            double line721 = a13 * a24 * b4;
            double line722 = a14 * b2 * a43;
            double line723 = b1 * a23 * a44;
            double line724 = b1 * a24 * a43;
            double line725 = a13 * b2 * a44;
            double line726 = a14 * a23 * b4;

            double ansline237 = line721 + line722 + line723;
            double ansline238 = line724 + line725 + line726;
            double answer118 = ansline237 - ansline238;

            // String S41 = "=" + line721 + " "  + line722 + " " +  line723 + " " + line724 + " " + line725 + " " + line726 + " = " + answer118;

            // Расчет минора для (4,1) матрицы
            double line727 = a13 * a24 * b3;
            double line728 = a14 * b2 * a33;
            double line729 = b1 * a23 * a34;
            double line730 = b1 * a24 * a33;
            double line731 = a13 * b2 * a34;
            double line732 = a14 * a23 * b3;

            double ansline239 = line727 + line728 + line729;
            double ansline240 = line730 + line731 + line732;
            double answer119 = ansline239 - ansline240;

            // String S41 = "=" + line727 + " "  + line728 + " " +  line729 + " " + line730 + " " + line731 + " " + line732 + " = " + answer119;
            // String S41 = "=" + answer116 + answer117 + answer118 + answer119;

            double M176 = a12 * answer116;
            double M177 = a22 * answer117;
            double M178 = a32 * answer118;
            double M179 = a42 * answer119;
            double M180 = M176 - M177 + M178 - M179;

            //  String S41 = "= " + a12 + " * " + answer116 + " - "  + a22 + " * " +  answer117 + " + " + a32 + " * " + answer118 + " - " + a22 + " * " +  answer119 +  " = " + M176 + " + " + M177 + " + " + M178 + " + " + M179 + " = " + M180;
            //String S41 = "=" + answer104 + answer105 + answer106 + answer107;

            double M181 = a11 * M160;
            double M182 = a21 * M165;
            double M183 = a31 * M170;
            double M184 = a41 * M175;
            double M185 = a51 * M180;
            double M186 = M181 - M182 + M183 - M184 + M185;

            String S41 = "= " + a11 + " * " + M160 + " - " + a21 + " * " + M165 + " + " + a31 + " * " + M170 + " - " + a41 + " * " + M175 + " + " + a51 + " + " + M180 + " = " + M181 + " + " + M182 + " + " + M183 + " + " + M184 + +M185 + " = " + M186;

            textView157.setText(S41);


            double line1000 = M62 / M31;
            String result1 = String.format("%.1f", line1000);
            String S80 = M62 + " / " + M31 + " = " + result1;
            textView213.setText("X1 = " + S80);

            double line1001 = M93 / M31;
            String result2 = String.format("%.1f", line1001);
            String S81 = M93 + " / " + M31 + " = " + result2;
            textView214.setText("X2 = " + S81);

            double line1002 = M124 / M31;
            String result3 = String.format("%.1f", line1002);
            String S82 = M124 + " / " + M31 + " = " + result3;
            textView215.setText("X3 = " + S82);

            double lin1003 = M155 / M31;
            String result4 = String.format("%.1f", lin1003);
            String S83 = M155 + " / " + M31 + " = " + result4;
            textView216.setText("X4 = " + S83);

            double line1004 = M186 / M31;
            String result5 = String.format("%.1f", line1004);
            String S84 = M186 + " / " + M31 + " = " + result5;
            textView217.setText("X4 = " + S84);

            textView146.setText("Ответ:");
            String S43 = "X1 = " + result1;
            textView147.setText(S43);
            String S44 = "X2 = " + result2;
            textView148.setText(S44);
            String S45 = "X3 = " + result3;
            textView149.setText(S45);
            String S46 = "X4 = " + result4;
            textView150.setText(S46);
            String S47 = "X5 = " + result5;
            textView151.setText(S47);

            // Показываем нужный вывод результата
            textView107.setVisibility(View.VISIBLE);
            textView153.setVisibility(View.VISIBLE);
            textView86.setVisibility(View.VISIBLE);
            textView117.setVisibility(View.VISIBLE);
            textView205.setVisibility(View.VISIBLE);
            textView206.setVisibility(View.VISIBLE);
            textView207.setVisibility(View.VISIBLE);
            textView111.setVisibility(View.VISIBLE);
            textView154.setVisibility(View.VISIBLE);
            textView181.setVisibility(View.VISIBLE);
            textView121.setVisibility(View.VISIBLE);
            textView122.setVisibility(View.VISIBLE);
            textView123.setVisibility(View.VISIBLE);
            textView124.setVisibility(View.VISIBLE);
            textView125.setVisibility(View.VISIBLE);
            textView155.setVisibility(View.VISIBLE);
            textView126.setVisibility(View.VISIBLE);
            textView127.setVisibility(View.VISIBLE);
            textView128.setVisibility(View.VISIBLE);
            textView129.setVisibility(View.VISIBLE);
            textView130.setVisibility(View.VISIBLE);
            textView131.setVisibility(View.VISIBLE);
            textView156.setVisibility(View.VISIBLE);
            textView132.setVisibility(View.VISIBLE);
            textView133.setVisibility(View.VISIBLE);
            textView134.setVisibility(View.VISIBLE);
            textView135.setVisibility(View.VISIBLE);
            textView136.setVisibility(View.VISIBLE);
            textView140.setVisibility(View.VISIBLE);
            textView157.setVisibility(View.VISIBLE);
            textView141.setVisibility(View.VISIBLE);
            textView142.setVisibility(View.VISIBLE);
            textView143.setVisibility(View.VISIBLE);
            textView144.setVisibility(View.VISIBLE);
            textView145.setVisibility(View.VISIBLE);
            textView213.setVisibility(View.VISIBLE);
            textView214.setVisibility(View.VISIBLE);
            textView215.setVisibility(View.VISIBLE);
            textView216.setVisibility(View.VISIBLE);
            textView217.setVisibility(View.VISIBLE);
            textView146.setVisibility(View.VISIBLE);
            textView147.setVisibility(View.VISIBLE);
            textView148.setVisibility(View.VISIBLE);
            textView149.setVisibility(View.VISIBLE);
            textView150.setVisibility(View.VISIBLE);
            textView151.setVisibility(View.VISIBLE);
        }
    }


    public void Clear6(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30, EditText editTextNumber31, EditText editTextNumber32, EditText editTextNumber33, EditText editTextNumber34, EditText editTextNumber35, EditText editTextNumber36, EditText editTextNumber37, EditText editTextNumber38, EditText editTextNumber39, EditText editTextNumber40, EditText editTextNumber41, EditText editTextNumber42, TextView textView118) {
        editTextNumber1.setText(null);
        editTextNumber2.setText(null);
        editTextNumber3.setText(null);
        editTextNumber4.setText(null);
        editTextNumber5.setText(null);
        editTextNumber6.setText(null);
        editTextNumber7.setText(null);
        editTextNumber8.setText(null);
        editTextNumber9.setText(null);
        editTextNumber10.setText(null);
        editTextNumber11.setText(null);
        editTextNumber12.setText(null);
        editTextNumber13.setText(null);
        editTextNumber14.setText(null);
        editTextNumber15.setText(null);
        editTextNumber16.setText(null);
        editTextNumber17.setText(null);
        editTextNumber18.setText(null);
        editTextNumber19.setText(null);
        editTextNumber20.setText(null);
        editTextNumber21.setText(null);
        editTextNumber22.setText(null);
        editTextNumber23.setText(null);
        editTextNumber24.setText(null);
        editTextNumber25.setText(null);
        editTextNumber26.setText(null);
        editTextNumber27.setText(null);
        editTextNumber28.setText(null);
        editTextNumber29.setText(null);
        editTextNumber30.setText(null);
        editTextNumber31.setText(null);
        editTextNumber32.setText(null);
        editTextNumber33.setText(null);
        editTextNumber34.setText(null);
        editTextNumber35.setText(null);
        editTextNumber36.setText(null);
        editTextNumber37.setText(null);
        editTextNumber38.setText(null);
        editTextNumber39.setText(null);
        editTextNumber40.setText(null);
        editTextNumber41.setText(null);
        editTextNumber42.setText(null);
        textView118.setText(null);
    }

    public void Rand6(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30, EditText editTextNumber31, EditText editTextNumber32, EditText editTextNumber33, EditText editTextNumber34, EditText editTextNumber35, EditText editTextNumber36, EditText editTextNumber37, EditText editTextNumber38, EditText editTextNumber39, EditText editTextNumber40, EditText editTextNumber41, EditText editTextNumber42) {
        int a = 1; // Начальное значение диапазона - "от"
        int b = 99; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
        int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
        int random_number4 = a + (int) (Math.random() * b); // Генерация 4-го числа
        int random_number5 = a + (int) (Math.random() * b); // Генерация 5-го числа
        int random_number6 = a + (int) (Math.random() * b); // Генерация 6-го числа
        int random_number7 = a + (int) (Math.random() * b); // Генерация 7-го числа
        int random_number8 = a + (int) (Math.random() * b); // Генерация 8-го числа
        int random_number9 = a + (int) (Math.random() * b); // Генерация 9-го числа
        int random_number10 = a + (int) (Math.random() * b); // Генерация 10-го числа
        int random_number11 = a + (int) (Math.random() * b); // Генерация 11-го числа
        int random_number12 = a + (int) (Math.random() * b); // Генерация 12-го числа
        int random_number13 = a + (int) (Math.random() * b); // Генерация 13-го числа
        int random_number14 = a + (int) (Math.random() * b); // Генерация 14-го числа
        int random_number15 = a + (int) (Math.random() * b); // Генерация 15-го числа
        int random_number16 = a + (int) (Math.random() * b); // Генерация 16-го числа
        int random_number17 = a + (int) (Math.random() * b); // Генерация 17-го числа
        int random_number18 = a + (int) (Math.random() * b); // Генерация 18-го числа
        int random_number19 = a + (int) (Math.random() * b); // Генерация 19-го числа
        int random_number20 = a + (int) (Math.random() * b); // Генерация 20-го числа
        int random_number21 = a + (int) (Math.random() * b); // Генерация 21-го числа
        int random_number22 = a + (int) (Math.random() * b); // Генерация 22-го числа
        int random_number23 = a + (int) (Math.random() * b); // Генерация 23-го числа
        int random_number24 = a + (int) (Math.random() * b); // Генерация 24-го числа
        int random_number25 = a + (int) (Math.random() * b); // Генерация 25-го числа
        int random_number26 = a + (int) (Math.random() * b); // Генерация 26-го числа
        int random_number27 = a + (int) (Math.random() * b); // Генерация 27-го числа
        int random_number28 = a + (int) (Math.random() * b); // Генерация 28-го числа
        int random_number29 = a + (int) (Math.random() * b); // Генерация 29-го числа
        int random_number30 = a + (int) (Math.random() * b); // Генерация 30-го числа
        int random_number31 = a + (int) (Math.random() * b); // Генерация 31-го числа
        int random_number32 = a + (int) (Math.random() * b); // Генерация 32-го числа
        int random_number33 = a + (int) (Math.random() * b); // Генерация 33-го числа
        int random_number34 = a + (int) (Math.random() * b); // Генерация 34-го числа
        int random_number35 = a + (int) (Math.random() * b); // Генерация 35-го числа
        int random_number36 = a + (int) (Math.random() * b); // Генерация 36-го числа
        int random_number37 = a + (int) (Math.random() * b); // Генерация 37-го числа
        int random_number38 = a + (int) (Math.random() * b); // Генерация 38-го числа
        int random_number39 = a + (int) (Math.random() * b); // Генерация 39-го числа
        int random_number40 = a + (int) (Math.random() * b); // Генерация 40-го числа
        int random_number41 = a + (int) (Math.random() * b); // Генерация 41-го числа
        int random_number42 = a + (int) (Math.random() * b); // Генерация 42-го числа

        editTextNumber1.setText(Integer.toString(random_number1));
        editTextNumber2.setText(Integer.toString(random_number2));
        editTextNumber3.setText(Integer.toString(random_number3));
        editTextNumber4.setText(Integer.toString(random_number4));
        editTextNumber5.setText(Integer.toString(random_number5));
        editTextNumber6.setText(Integer.toString(random_number6));
        editTextNumber7.setText(Integer.toString(random_number7));
        editTextNumber8.setText(Integer.toString(random_number8));
        editTextNumber9.setText(Integer.toString(random_number9));
        editTextNumber10.setText(Integer.toString(random_number10));
        editTextNumber11.setText(Integer.toString(random_number11));
        editTextNumber12.setText(Integer.toString(random_number12));
        editTextNumber13.setText(Integer.toString(random_number13));
        editTextNumber14.setText(Integer.toString(random_number14));
        editTextNumber15.setText(Integer.toString(random_number15));
        editTextNumber16.setText(Integer.toString(random_number16));
        editTextNumber17.setText(Integer.toString(random_number17));
        editTextNumber18.setText(Integer.toString(random_number18));
        editTextNumber19.setText(Integer.toString(random_number19));
        editTextNumber20.setText(Integer.toString(random_number20));
        editTextNumber21.setText(Integer.toString(random_number21));
        editTextNumber22.setText(Integer.toString(random_number22));
        editTextNumber23.setText(Integer.toString(random_number23));
        editTextNumber24.setText(Integer.toString(random_number24));
        editTextNumber25.setText(Integer.toString(random_number25));
        editTextNumber26.setText(Integer.toString(random_number26));
        editTextNumber27.setText(Integer.toString(random_number27));
        editTextNumber28.setText(Integer.toString(random_number28));
        editTextNumber29.setText(Integer.toString(random_number29));
        editTextNumber30.setText(Integer.toString(random_number30));
        editTextNumber31.setText(Integer.toString(random_number31));
        editTextNumber32.setText(Integer.toString(random_number32));
        editTextNumber33.setText(Integer.toString(random_number33));
        editTextNumber34.setText(Integer.toString(random_number34));
        editTextNumber35.setText(Integer.toString(random_number35));
        editTextNumber36.setText(Integer.toString(random_number36));
        editTextNumber37.setText(Integer.toString(random_number37));
        editTextNumber38.setText(Integer.toString(random_number38));
        editTextNumber39.setText(Integer.toString(random_number39));
        editTextNumber40.setText(Integer.toString(random_number40));
        editTextNumber41.setText(Integer.toString(random_number41));
        editTextNumber42.setText(Integer.toString(random_number42));
    }

    public void Rast6(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30, EditText editTextNumber31, EditText editTextNumber32, EditText editTextNumber33, EditText editTextNumber34, EditText editTextNumber35, EditText editTextNumber36, EditText editTextNumber37, EditText editTextNumber38, EditText editTextNumber39, EditText editTextNumber40, EditText editTextNumber41, EditText editTextNumber42, TextView textView89, TextView textView118, TextView textView119, TextView textView223, TextView textView222, TextView textView224, TextView textView225, TextView textView106, TextView textView84, TextView textView116, TextView textView120, TextView textView219, TextView textView220, TextView textView221, TextView textView169, TextView textView139, TextView textView86, TextView textView117, TextView textView158, TextView textView212, TextView textView211, TextView textView218, TextView textView170, TextView textView159, TextView textView121, TextView textView122, TextView textView123, TextView textView124, TextView textView160, TextView textView208, TextView textView210, TextView textView161, TextView textView126, TextView textView127, TextView textView128, TextView textView129, TextView textView130, TextView textView166, TextView textView172, TextView textView162, TextView textView132, TextView textView133, TextView textView134, TextView textView135, TextView textView136, TextView textView163, TextView textView173, TextView textView164, TextView textView141, TextView textView142, TextView textView143, TextView textView144, TextView textView145, TextView textView168, TextView textView174, TextView textView165, TextView textView147, TextView textView148, TextView textView149, TextView textView150, TextView textView151, TextView textView167, TextView textView227, TextView textView228, TextView textView229, TextView textView230, TextView textView231, TextView textView232, TextView textView233, TextView textView241, TextView textView235, TextView textView236, TextView textView237, TextView textView238, TextView textView239, TextView textView240) {
        double a11 = Double.parseDouble((editTextNumber1.getText().toString()));
        double a12 = Double.parseDouble((editTextNumber2.getText().toString()));
        double a13 = Double.parseDouble((editTextNumber3.getText().toString()));
        double a14 = Double.parseDouble((editTextNumber4.getText().toString()));
        double a15 = Double.parseDouble((editTextNumber5.getText().toString()));
        double a16 = Double.parseDouble((editTextNumber6.getText().toString()));
        double b1 = Double.parseDouble((editTextNumber7.getText().toString()));
        double a21 = Double.parseDouble((editTextNumber8.getText().toString()));
        double a22 = Double.parseDouble((editTextNumber9.getText().toString()));
        double a23 = Double.parseDouble((editTextNumber10.getText().toString()));
        double a24 = Double.parseDouble((editTextNumber11.getText().toString()));
        double a25 = Double.parseDouble((editTextNumber12.getText().toString()));
        double a26 = Double.parseDouble((editTextNumber13.getText().toString()));
        double b2 = Double.parseDouble((editTextNumber14.getText().toString()));
        double a31 = Double.parseDouble((editTextNumber15.getText().toString()));
        double a32 = Double.parseDouble((editTextNumber16.getText().toString()));
        double a33 = Double.parseDouble((editTextNumber17.getText().toString()));
        double a34 = Double.parseDouble((editTextNumber18.getText().toString()));
        double a35 = Double.parseDouble((editTextNumber19.getText().toString()));
        double a36 = Double.parseDouble((editTextNumber20.getText().toString()));
        double b3 = Double.parseDouble((editTextNumber21.getText().toString()));
        double a41 = Double.parseDouble((editTextNumber22.getText().toString()));
        double a42 = Double.parseDouble((editTextNumber23.getText().toString()));
        double a43 = Double.parseDouble((editTextNumber24.getText().toString()));
        double a44 = Double.parseDouble((editTextNumber25.getText().toString()));
        double a45 = Double.parseDouble((editTextNumber26.getText().toString()));
        double a46 = Double.parseDouble((editTextNumber27.getText().toString()));
        double b4 = Double.parseDouble((editTextNumber28.getText().toString()));
        double a51 = Double.parseDouble((editTextNumber29.getText().toString()));
        double a52 = Double.parseDouble((editTextNumber30.getText().toString()));
        double a53 = Double.parseDouble((editTextNumber31.getText().toString()));
        double a54 = Double.parseDouble((editTextNumber32.getText().toString()));
        double a55 = Double.parseDouble((editTextNumber33.getText().toString()));
        double a56 = Double.parseDouble((editTextNumber34.getText().toString()));
        double b5 = Double.parseDouble((editTextNumber35.getText().toString()));
        double a61 = Double.parseDouble((editTextNumber36.getText().toString()));
        double a62 = Double.parseDouble((editTextNumber37.getText().toString()));
        double a63 = Double.parseDouble((editTextNumber38.getText().toString()));
        double a64 = Double.parseDouble((editTextNumber39.getText().toString()));
        double a65 = Double.parseDouble((editTextNumber40.getText().toString()));
        double a66 = Double.parseDouble((editTextNumber41.getText().toString()));
        double b6 = Double.parseDouble((editTextNumber42.getText().toString()));

        textView89.setText("Перепишем систему уравнений в матричном виде");
        //Вывод общей матрицы
        String S1 = a11 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + a15 + "   " + a16 + "   " + b1;
        textView118.setText(S1);
        String S2 = a21 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + a25 + "   " + a26 + "   " + b2;
        textView119.setText(S2);
        String S3 = a31 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + a35 + "   " + a36 + "   " + b3;
        textView223.setText(S3);
        String S4 = a41 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + a45 + "   " + a46 + "   " + b4;
        textView222.setText(S4);
        String S5 = a51 + "   " + a52 + "   " + a53 + "   " + a54 + "   " + a55 + "   " + a56 + "   " + b5;
        textView224.setText(S5);
        String S6 = a61 + "   " + a62 + "   " + a63 + "   " + a64 + "   " + a65 + "   " + a66 + "   " + b6;
        textView225.setText(S6);

        // String S7 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
        //textView152.setText(S7);

        textView106.setText("Определитель общего порядка");
        // Вывод общего порядка
        String S8 = a11 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + a15 + "   " + a16;
        textView84.setText(S8);
        String S9 = a21 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + a25 + "   " + a26;
        textView116.setText(S9);
        String S10 = a31 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + a35 + "   " + a36;
        textView120.setText(S10);
        String S11 = a41 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + a45 + "   " + a46;
        textView219.setText(S11);
        String S12 = a51 + "   " + a52 + "   " + a53 + "   " + a54 + "   " + a55 + "   " + a56;
        textView220.setText(S12);
        String S13 = a61 + "   " + a62 + "   " + a63 + "   " + a64 + "   " + a65 + "   " + a66;
        textView221.setText(S13);

        // Минор для (1,1)
        // Расчет минора для (1,1) матрицы
        double line1 = a44 * a55 * a66;
        double line2 = a45 * a56 * a64;
        double line3 = a46 * a54 * a65;
        double line4 = a46 * a55 * a64;
        double line5 = a44 * a56 * a65;
        double line6 = a45 * a54 * a66;

        double ansline1 = line1 + line2 + line3;
        double ansline2 = line4 + line5 + line6;
        double answer = ansline1 - ansline2;

        // String S14 = "=" + line1 + " "  + line2 + " " +  line3 + " " + line4 + " " + line5 + " " + line6 + " " + answer;

        // Расчет минора для (2,1) матрицы
        double line7 = a34 * a55 * a66;
        double line8 = a35 * a56 * a64;
        double line9 = a36 * a54 * a65;
        double line10 = a36 * a55 * a64;
        double line11 = a34 * a56 * a65;
        double line12 = a35 * a54 * a66;

        double ansline3 = line7 + line8 + line9;
        double ansline4 = line10 + line11 + line12;
        double answer1 = ansline3 - ansline4;

        //   String S14 = "=" + line7 + " "  + line8 + " " +  line9 + " " + line10 + " " + line11 + " " + line12 + " " + answer1;

        // Расчет минора для (3,1) матрицы
        double line13 = a34 * a45 * a66;
        double line14 = a35 * a46 * a64;
        double line15 = a36 * a44 * a65;
        double line16 = a36 * a45 * a64;
        double line17 = a34 * a46 * a65;
        double line18 = a35 * a44 * a66;

        double ansline5 = line13 + line14 + line15;
        double ansline6 = line16 + line17 + line18;
        double answer2 = ansline5 - ansline6;

        //  String S14 = "=" + line13 + " "  + line14 + " " +  line15 + " " + line16 + " " + line17 + " " + line18 + " " + answer2;

        // Расчет минора для (4,1) матрицы
        double line19 = a34 * a45 * a56;
        double line20 = a35 * a46 * a54;
        double line21 = a36 * a44 * a55;
        double line22 = a36 * a45 * a54;
        double line23 = a34 * a46 * a55;
        double line24 = a35 * a44 * a56;

        double ansline7 = line19 + line20 + line21;
        double ansline8 = line22 + line23 + line24;
        double answer3 = ansline7 - ansline8;

        // String S14 = "=" + line19 + " "  + line20 + " " +  line21 + " " + line22 + " " + line23 + " " + line24 + " " + answer3;

        double M = a33 * answer;
        double M2 = a43 * answer1;
        double M3 = a53 * answer2;
        double M4 = a63 * answer3;
        double M5 = M - M2 + M3 - M4;

        //  String S14 = "=" + M + M2 + M3 + M4 + "=" +  M5;

        // Минор для (2,1)
        // Расчет минора для (1,1) матрицы
        double line25 = a44 * a55 * a66;
        double line26 = a45 * a56 * a64;
        double line27 = a46 * a54 * a65;
        double line28 = a46 * a55 * a64;
        double line29 = a44 * a56 * a65;
        double line30 = a45 * a54 * a66;

        double ansline9 = line25 + line26 + line27;
        double ansline10 = line28 + line29 + line30;
        double answer4 = ansline9 - ansline10;

        // String S14 = "=" + line25 + " "  + line26 + " " +  line27 + " " + line28 + " " + line29 + " " + line30 + " " + answer4;

        // Расчет минора для (2,1) матрицы
        double line31 = a24 * a55 * a66;
        double line32 = a25 * a56 * a64;
        double line33 = a26 * a54 * a65;
        double line34 = a26 * a55 * a64;
        double line35 = a24 * a56 * a65;
        double line36 = a25 * a54 * a66;

        double ansline11 = line31 + line32 + line33;
        double ansline12 = line34 + line35 + line36;
        double answer5 = ansline11 - ansline12;

        //  String S14 = "=" + line31 + " "  + line32 + " " +  line33 + " " + line34 + " " + line35 + " " + line36 + " " + answer5;

        // Расчет минора для (3,1) матрицы
        double line37 = a24 * a45 * a66;
        double line38 = a25 * a46 * a64;
        double line39 = a26 * a44 * a65;
        double line40 = a26 * a45 * a64;
        double line41 = a24 * a46 * a65;
        double line42 = a25 * a44 * a66;

        double ansline13 = line37 + line38 + line39;
        double ansline14 = line40 + line41 + line42;
        double answer6 = ansline13 - ansline14;

        // String S14 = "=" + line37 + " "  + line38 + " " +  line39 + " " + line40 + " " + line41 + " " + line42 + " " + answer6;

        // Расчет минора для (4,1) матрицы
        double line43 = a24 * a45 * a56;
        double line44 = a25 * a46 * a54;
        double line45 = a26 * a44 * a55;
        double line46 = a26 * a45 * a54;
        double line47 = a24 * a46 * a55;
        double line48 = a25 * a44 * a56;

        double ansline15 = line43 + line44 + line45;
        double ansline16 = line46 + line47 + line48;
        double answer7 = ansline15 - ansline16;

        //     String S14 = "=" + line43 + " "  + line44 + " " +  line45 + " " + line46 + " " + line47 + " " + line48 + " " + answer7;

        double M6 = a23 * answer4;
        double M7 = a43 * answer5;
        double M8 = a53 * answer6;
        double M9 = a63 * answer7;
        double M10 = M6 - M7 + M8 - M9;

        //  String S14 = "=" + M6 + M7 + M8 + M9 + "=" +  M10;


        // Минор для (3,1)
        // Расчет минора для (1,1) матрицы
        double line49 = a34 * a55 * a66;
        double line50 = a35 * a56 * a64;
        double line51 = a36 * a54 * a65;
        double line52 = a36 * a55 * a64;
        double line53 = a34 * a56 * a65;
        double line54 = a35 * a54 * a66;

        double ansline17 = line49 + line50 + line51;
        double ansline18 = line52 + line53 + line54;
        double answer8 = ansline17 - ansline18;

        // Расчет минора для (2,1) матрицы
        double line55 = a24 * a55 * a66;
        double line56 = a25 * a56 * a64;
        double line57 = a26 * a54 * a65;
        double line58 = a26 * a55 * a64;
        double line59 = a24 * a56 * a65;
        double line60 = a25 * a54 * a66;

        double ansline19 = line55 + line56 + line57;
        double ansline20 = line58 + line59 + line60;
        double answer9 = ansline19 - ansline20;

        // Расчет минора для (3,1) матрицы
        double line61 = a24 * a35 * a66;
        double line62 = a25 * a36 * a64;
        double line63 = a26 * a34 * a65;
        double line64 = a26 * a35 * a64;
        double line65 = a24 * a36 * a65;
        double line66 = a25 * a34 * a66;

        double ansline21 = line61 + line62 + line63;
        double ansline22 = line64 + line65 + line66;
        double answer10 = ansline21 - ansline22;

        // String S14 = "=" + line61 + " "  + line62 + " " +  line63 + " " + line64 + " " + line65 + " " + line66 + " " + answer10;

        // Расчет минора для (4,1) матрицы
        double line67 = a24 * a35 * a56;
        double line68 = a25 * a36 * a54;
        double line69 = a26 * a34 * a55;
        double line70 = a26 * a35 * a54;
        double line71 = a24 * a36 * a55;
        double line72 = a25 * a34 * a56;

        double ansline23 = line67 + line68 + line69;
        double ansline24 = line70 + line71 + line72;
        double answer11 = ansline23 - ansline24;

        //  String S14 = "=" + line67 + " "  + line68 + " " +  line69 + " " + line70 + " " + line71 + " " + line72 + " " + answer11;

        double M11 = a23 * answer8;
        double M12 = a33 * answer9;
        double M13 = a53 * answer10;
        double M14 = a63 * answer11;
        double M15 = M11 - M12 + M13 - M14;

        // String S14 = "=" + M11 + M12 + M13 + M14 + "=" +  M15;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line73 = a34 * a45 * a66;
        double line74 = a35 * a46 * a64;
        double line75 = a36 * a44 * a65;
        double line76 = a36 * a45 * a64;
        double line77 = a34 * a46 * a65;
        double line78 = a35 * a44 * a66;

        double ansline25 = line73 + line74 + line75;
        double ansline26 = line76 + line77 + line78;
        double answer12 = ansline25 - ansline26;

        // String S14 = "=" + line73 + " "  + line74 + " " +  line75 + " " + line76 + " " + line77 + " " + line78 + " " + answer12;

        // Расчет минора для (2,1) матрицы
        double line79 = a24 * a45 * a66;
        double line80 = a25 * a46 * a64;
        double line81 = a26 * a44 * a65;
        double line82 = a26 * a45 * a64;
        double line83 = a24 * a46 * a65;
        double line84 = a25 * a44 * a66;

        double ansline27 = line79 + line80 + line81;
        double ansline28 = line82 + line83 + line84;
        double answer13 = ansline27 - ansline28;

        // Расчет минора для (3,1) матрицы
        double line85 = a24 * a35 * a66;
        double line86 = a25 * a36 * a64;
        double line87 = a26 * a34 * a65;
        double line88 = a26 * a35 * a64;
        double line89 = a24 * a36 * a65;
        double line90 = a25 * a34 * a66;

        double ansline29 = line85 + line86 + line87;
        double ansline30 = line88 + line89 + line90;
        double answer14 = ansline29 - ansline30;

        // Расчет минора для (4,1) матрицы
        double line91 = a24 * a35 * a46;
        double line92 = a25 * a36 * a44;
        double line93 = a26 * a34 * a45;
        double line94 = a26 * a35 * a44;
        double line95 = a24 * a36 * a45;
        double line96 = a25 * a34 * a46;

        double ansline31 = line91 + line92 + line93;
        double ansline32 = line94 + line95 + line96;
        double answer15 = ansline31 - ansline32;

        // String S14 = "=" + line91 + " "  + line92 + " " +  line93 + " " + line94 + " " + line95 + " " + line96 + " " + answer15;

        double M16 = a23 * answer12;
        double M17 = a33 * answer13;
        double M18 = a43 * answer14;
        double M19 = a63 * answer15;
        double M20 = M16 - M17 + M18 - M19;

        // String S14 = "=" + M16 + M17 + M18 + M19 + "=" +  M20;

        // Минор для (5,1)
        // Расчет минора для (1,1) матрицы
        double line97 = a34 * a45 * a56;
        double line98 = a35 * a46 * a54;
        double line99 = a36 * a44 * a55;
        double line100 = a36 * a45 * a54;
        double line101 = a34 * a46 * a55;
        double line102 = a35 * a44 * a56;

        double ansline33 = line97 + line98 + line99;
        double ansline34 = line100 + line101 + line102;
        double answer16 = ansline33 - ansline34;

        // Расчет минора для (2,1) матрицы
        double line103 = a24 * a45 * a56;
        double line104 = a25 * a46 * a54;
        double line105 = a26 * a44 * a55;
        double line106 = a26 * a45 * a54;
        double line107 = a24 * a46 * a55;
        double line108 = a25 * a44 * a56;

        double ansline35 = line103 + line104 + line105;
        double ansline36 = line106 + line107 + line108;
        double answer17 = ansline35 - ansline36;

        // Расчет минора для (3,1) матрицы
        double line109 = a24 * a35 * a56;
        double line110 = a25 * a36 * a54;
        double line111 = a26 * a34 * a55;
        double line112 = a26 * a35 * a54;
        double line113 = a24 * a36 * a55;
        double line114 = a25 * a34 * a56;

        double ansline37 = line109 + line110 + line111;
        double ansline38 = line112 + line113 + line114;
        double answer18 = ansline37 - ansline38;

        // Расчет минора для (4,1) матрицы
        double line115 = a24 * a35 * a46;
        double line116 = a25 * a36 * a44;
        double line117 = a26 * a34 * a45;
        double line118 = a26 * a35 * a44;
        double line119 = a24 * a36 * a45;
        double line120 = a25 * a34 * a46;

        double ansline39 = line115 + line116 + line117;
        double ansline40 = line118 + line119 + line120;
        double answer19 = ansline39 - ansline40;

        double M21 = a23 * answer16;
        double M22 = a33 * answer17;
        double M23 = a43 * answer18;
        double M24 = a53 * answer19;
        double M25 = M21 - M22 + M23 - M24;

        //String S14 = "=" + M21 + M22 + M23 + M24 + "=" +  M25;

        double M26 = a22 * M5;
        double M27 = a32 * M10;
        double M28 = a42 * M15;
        double M29 = a52 * M20;
        double M30 = a62 * M25;
        double M31 = M26 - M27 + M28 - M29 + M30;

        // String S14 = "=" + M26 + M27 + M28 + M29 + M30 + "=" +  M31;

        // Минор для (2,1)
        // Расчет минора для (1,1) матрицы
        double line121 = a44 * a55 * a66;
        double line122 = a45 * a56 * a64;
        double line123 = a46 * a54 * a65;
        double line124 = a46 * a55 * a64;
        double line125 = a44 * a56 * a65;
        double line126 = a45 * a54 * a66;

        double ansline41 = line121 + line122 + line123;
        double ansline42 = line124 + line125 + line126;
        double answer21 = ansline41 - ansline42;

        //  String S14 = "=" + line121 + " "  + line122 + " " +  line123 + " " + line124 + " " + line125 + " " + line126 + " " + answer21;

        // Расчет минора для (2,1) матрицы
        double line127 = a34 * a55 * a66;
        double line128 = a35 * a56 * a64;
        double line129 = a36 * a54 * a65;
        double line130 = a36 * a55 * a64;
        double line131 = a34 * a56 * a65;
        double line132 = a35 * a54 * a66;

        double ansline43 = line127 + line128 + line129;
        double ansline44 = line130 + line131 + line132;
        double answer22 = ansline43 - ansline44;

        // String S14 = "=" + line127 + " "  + line128 + " " +  line129 + " " + line130 + " " + line131 + " " + line132 + " " + answer22;

        // Расчет минора для (3,1) матрицы
        double line133 = a34 * a45 * a66;
        double line134 = a35 * a46 * a64;
        double line135 = a36 * a44 * a65;
        double line136 = a36 * a45 * a64;
        double line137 = a34 * a46 * a65;
        double line138 = a35 * a44 * a66;

        double ansline45 = line133 + line134 + line135;
        double ansline46 = line136 + line137 + line138;
        double answer23 = ansline45 - ansline46;

        //   String S14 = "=" + line133 + " "  + line134 + " " +  line135 + " " + line136 + " " + line137 + " " + line138 + " " + answer23;

        // Расчет минора для (4,1) матрицы
        double line139 = a34 * a45 * a56;
        double line140 = a35 * a46 * a54;
        double line141 = a36 * a44 * a55;
        double line142 = a36 * a45 * a54;
        double line143 = a34 * a46 * a55;
        double line144 = a35 * a44 * a56;

        double ansline47 = line139 + line140 + line141;
        double ansline48 = line142 + line143 + line144;
        double answer24 = ansline47 - ansline48;

        // String S14 = "=" + line139 + " "  + line140 + " " +  line141 + " " + line142 + " " + line143 + " " + line144 + " " + answer24;

        double M32 = a33 * answer21;
        double M33 = a43 * answer22;
        double M34 = a53 * answer23;
        double M35 = a63 * answer24;
        double M36 = M32 - M33 + M34 - M35;

        // String S14 = "=" + M32 + M33 + M34 + M35 + "=" +  M36;

        // Минор для (2,1)
        // Расчет минора для (1,1) матрицы
        double line145 = a44 * a55 * a66;
        double line146 = a45 * a56 * a64;
        double line147 = a46 * a54 * a65;
        double line148 = a46 * a55 * a64;
        double line149 = a44 * a56 * a65;
        double line150 = a45 * a54 * a66;

        double ansline49 = line145 + line146 + line147;
        double ansline50 = line148 + line149 + line150;
        double answer25 = ansline49 - ansline50;

        // Расчет минора для (2,1) матрицы
        double line151 = a14 * a55 * a66;
        double line152 = a15 * a56 * a64;
        double line153 = a16 * a54 * a65;
        double line154 = a16 * a55 * a64;
        double line155 = a14 * a56 * a65;
        double line156 = a15 * a54 * a66;

        double ansline51 = line151 + line152 + line153;
        double ansline52 = line154 + line155 + line156;
        double answer26 = ansline51 - ansline52;

        // Расчет минора для (3,1) матрицы
        double line157 = a14 * a45 * a66;
        double line158 = a15 * a46 * a64;
        double line159 = a16 * a44 * a65;
        double line160 = a16 * a45 * a64;
        double line161 = a14 * a46 * a65;
        double line162 = a15 * a44 * a66;

        double ansline53 = line157 + line158 + line159;
        double ansline54 = line160 + line161 + line162;
        double answer27 = ansline53 - ansline54;

        // Расчет минора для (4,1) матрицы
        double line163 = a14 * a45 * a56;
        double line164 = a15 * a46 * a54;
        double line165 = a16 * a44 * a55;
        double line166 = a16 * a45 * a54;
        double line167 = a14 * a46 * a55;
        double line168 = a15 * a44 * a56;

        double ansline55 = line163 + line164 + line165;
        double ansline56 = line166 + line167 + line168;
        double answer28 = ansline55 - ansline56;

        double M37 = a13 * answer25;
        double M38 = a43 * answer26;
        double M39 = a53 * answer27;
        double M40 = a63 * answer28;
        double M41 = M37 - M38 + M39 - M40;

        //   String S14 = "=" + M37 + M38 + M39 + M40 + "=" +  M41;

        //  Минор для (3,1)
        // Расчет минора для (1,1) матрицы
        double line169 = a34 * a55 * a66;
        double line170 = a35 * a56 * a64;
        double line171 = a36 * a54 * a65;
        double line172 = a36 * a55 * a64;
        double line173 = a34 * a56 * a65;
        double line174 = a35 * a54 * a66;

        double ansline57 = line169 + line170 + line171;
        double ansline58 = line172 + line173 + line174;
        double answer29 = ansline57 - ansline58;

        // Расчет минора для (2,1) матрицы
        double line175 = a14 * a55 * a66;
        double line176 = a15 * a56 * a64;
        double line177 = a16 * a54 * a65;
        double line178 = a16 * a55 * a64;
        double line179 = a14 * a56 * a65;
        double line180 = a15 * a54 * a66;

        double ansline59 = line175 + line176 + line177;
        double ansline60 = line178 + line179 + line180;
        double answer30 = ansline59 - ansline60;

        // Расчет минора для (3,1) матрицы
        double line181 = a14 * a35 * a66;
        double line182 = a15 * a36 * a64;
        double line183 = a16 * a34 * a65;
        double line184 = a16 * a35 * a64;
        double line185 = a14 * a36 * a65;
        double line186 = a15 * a34 * a66;

        double ansline61 = line181 + line182 + line183;
        double ansline62 = line184 + line185 + line186;
        double answer31 = ansline61 - ansline62;

        // Расчет минора для (4,1) матрицы
        double line187 = a14 * a35 * a56;
        double line188 = a15 * a36 * a54;
        double line189 = a16 * a34 * a55;
        double line190 = a16 * a35 * a54;
        double line191 = a14 * a36 * a55;
        double line192 = a15 * a34 * a56;

        double ansline63 = line187 + line188 + line189;
        double ansline64 = line190 + line191 + line192;
        double answer32 = ansline63 - ansline64;

        double M42 = a13 * answer29;
        double M43 = a33 * answer30;
        double M44 = a53 * answer31;
        double M45 = a63 * answer32;
        double M46 = M42 - M43 + M44 - M45;

        //String S14 = "=" + M42 + M43 + M44 + M45 + "=" +  M46;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line193 = a34 * a45 * a66;
        double line194 = a35 * a46 * a64;
        double line195 = a36 * a44 * a65;
        double line196 = a36 * a45 * a64;
        double line197 = a34 * a46 * a65;
        double line198 = a35 * a44 * a66;

        double ansline65 = line193 + line194 + line195;
        double ansline66 = line196 + line197 + line198;
        double answer33 = ansline65 - ansline66;

        // Расчет минора для (2,1) матрицы
        double line199 = a14 * a45 * a66;
        double line200 = a15 * a46 * a64;
        double line201 = a16 * a44 * a65;
        double line202 = a16 * a45 * a64;
        double line203 = a14 * a46 * a65;
        double line204 = a15 * a44 * a66;

        double ansline67 = line199 + line200 + line201;
        double ansline68 = line202 + line203 + line204;
        double answer34 = ansline67 - ansline68;

        // Расчет минора для (3,1) матрицы
        double line205 = a14 * a35 * a66;
        double line206 = a15 * a36 * a64;
        double line207 = a16 * a34 * a65;
        double line208 = a16 * a35 * a64;
        double line209 = a14 * a36 * a65;
        double line210 = a15 * a34 * a66;

        double ansline69 = line205 + line206 + line207;
        double ansline70 = line208 + line209 + line210;
        double answer35 = ansline69 - ansline70;

        // Расчет минора для (4,1) матрицы
        double line211 = a14 * a35 * a46;
        double line212 = a15 * a36 * a44;
        double line213 = a16 * a34 * a45;
        double line214 = a16 * a35 * a44;
        double line215 = a14 * a36 * a45;
        double line216 = a15 * a34 * a46;

        double ansline71 = line211 + line212 + line213;
        double ansline72 = line214 + line215 + line216;
        double answer36 = ansline71 - ansline72;

        double M47 = a13 * answer33;
        double M48 = a33 * answer34;
        double M49 = a43 * answer35;
        double M50 = a63 * answer36;
        double M51 = M47 - M48 + M49 - M50;

        //  String S14 = "=" + M47 + M48 + M49 + M50 + "=" +  M51;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line217 = a34 * a45 * a56;
        double line218 = a35 * a46 * a54;
        double line219 = a36 * a44 * a55;
        double line220 = a36 * a45 * a54;
        double line221 = a34 * a46 * a55;
        double line222 = a35 * a44 * a56;

        double ansline73 = line217 + line218 + line219;
        double ansline74 = line220 + line221 + line222;
        double answer37 = ansline73 - ansline74;

        // Расчет минора для (2,1) матрицы
        double line223 = a14 * a45 * a56;
        double line224 = a15 * a46 * a54;
        double line225 = a16 * a44 * a55;
        double line226 = a16 * a45 * a54;
        double line227 = a14 * a46 * a55;
        double line228 = a15 * a44 * a56;

        double ansline75 = line223 + line224 + line225;
        double ansline76 = line226 + line227 + line228;
        double answer38 = ansline75 - ansline76;

        // Расчет минора для (3,1) матрицы
        double line229 = a14 * a35 * a56;
        double line230 = a15 * a36 * a54;
        double line231 = a16 * a34 * a55;
        double line232 = a16 * a35 * a54;
        double line233 = a14 * a36 * a55;
        double line234 = a15 * a34 * a56;

        double ansline77 = line229 + line230 + line231;
        double ansline78 = line232 + line233 + line234;
        double answer39 = ansline77 - ansline78;

        // Расчет минора для (4,1) матрицы
        double line235 = a14 * a35 * a46;
        double line236 = a15 * a36 * a44;
        double line237 = a16 * a34 * a45;
        double line238 = a16 * a35 * a44;
        double line239 = a14 * a36 * a45;
        double line240 = a15 * a34 * a46;

        double ansline79 = line235 + line236 + line237;
        double ansline80 = line238 + line239 + line240;
        double answer40 = ansline79 - ansline80;

        double M52 = a13 * answer37;
        double M53 = a33 * answer38;
        double M54 = a43 * answer39;
        double M55 = a53 * answer40;
        double M56 = M52 - M53 + M54 - M55;

        //  String S14 = "=" + M52 + M53 + M54 + M55 + "=" +  M56;

        double M57 = a12 * M36;
        double M58 = a32 * M41;
        double M59 = a42 * M46;
        double M60 = a52 * M51;
        double M61 = a62 * M56;
        double M62 = M57 - M58 + M59 - M60 + M61;

        // String S14 = "=" + M57 + M58 + M59 + M60 + M61 + "=" +  M62;

        // Минор для (3,1)
        // Расчет минора для (1,1) матрицы
        double line241 = a44 * a55 * a66;
        double line242 = a45 * a56 * a64;
        double line243 = a46 * a54 * a65;
        double line244 = a46 * a55 * a64;
        double line245 = a44 * a56 * a65;
        double line246 = a45 * a54 * a66;

        double ansline81 = line241 + line242 + line243;
        double ansline82 = line244 + line245 + line246;
        double answer41 = ansline81 - ansline82;

        // Расчет минора для (2,1) матрицы
        double line247 = a24 * a55 * a66;
        double line248 = a25 * a56 * a64;
        double line249 = a26 * a54 * a65;
        double line250 = a26 * a55 * a64;
        double line251 = a24 * a56 * a65;
        double line252 = a25 * a54 * a66;

        double ansline83 = line247 + line248 + line249;
        double ansline84 = line250 + line251 + line252;
        double answer42 = ansline83 - ansline84;

        // Расчет минора для (3,1) матрицы
        double line253 = a24 * a45 * a66;
        double line254 = a25 * a46 * a64;
        double line256 = a26 * a44 * a65;
        double line257 = a26 * a45 * a64;
        double line258 = a24 * a46 * a65;
        double line259 = a25 * a44 * a66;

        double ansline85 = line253 + line254 + line256;
        double ansline86 = line257 + line258 + line259;
        double answer43 = ansline85 - ansline86;

        // Расчет минора для (4,1) матрицы
        double line260 = a24 * a45 * a56;
        double line261 = a25 * a46 * a54;
        double line262 = a26 * a44 * a55;
        double line263 = a26 * a45 * a54;
        double line264 = a24 * a46 * a55;
        double line265 = a25 * a44 * a56;

        double ansline87 = line260 + line261 + line262;
        double ansline88 = line263 + line264 + line265;
        double answer44 = ansline87 - ansline88;

        double M63 = a23 * answer41;
        double M64 = a43 * answer42;
        double M65 = a53 * answer43;
        double M66 = a63 * answer44;
        double M67 = M63 - M64 + M65 - M66;

        //   String S14 = "=" + M63 + M64 + M65 + M66 + "=" +  M67;

        // Минор для (2,1)
        // Расчет минора для (1,1) матрицы
        double line266 = a44 * a55 * a66;
        double line267 = a45 * a56 * a64;
        double line268 = a46 * a54 * a65;
        double line269 = a46 * a55 * a64;
        double line270 = a44 * a56 * a65;
        double line271 = a45 * a54 * a66;

        double ansline89 = line266 + line267 + line268;
        double ansline90 = line269 + line270 + line271;
        double answer45 = ansline89 - ansline90;

        // Расчет минора для (2,1) матрицы
        double line272 = a14 * a55 * a66;
        double line273 = a15 * a56 * a64;
        double line274 = a16 * a54 * a65;
        double line275 = a16 * a55 * a64;
        double line276 = a14 * a56 * a65;
        double line277 = a15 * a54 * a66;

        double ansline91 = line272 + line273 + line274;
        double ansline92 = line275 + line276 + line277;
        double answer46 = ansline91 - ansline92;

        // Расчет минора для (3,1) матрицы
        double line278 = a14 * a45 * a66;
        double line279 = a15 * a46 * a64;
        double line280 = a16 * a44 * a65;
        double line281 = a16 * a45 * a64;
        double line282 = a14 * a46 * a65;
        double line283 = a15 * a44 * a66;

        double ansline93 = line278 + line279 + line280;
        double ansline94 = line281 + line282 + line283;
        double answer47 = ansline93 - ansline94;

        // Расчет минора для (4,1) матрицы
        double line284 = a14 * a45 * a56;
        double line285 = a15 * a46 * a54;
        double line286 = a16 * a44 * a55;
        double line287 = a16 * a45 * a54;
        double line288 = a14 * a46 * a55;
        double line289 = a15 * a44 * a56;

        double ansline95 = line284 + line285 + line286;
        double ansline96 = line287 + line288 + line289;
        double answer48 = ansline95 - ansline96;

        double M68 = a13 * answer45;
        double M69 = a43 * answer46;
        double M70 = a53 * answer47;
        double M71 = a63 * answer48;
        double M72 = M68 - M69 + M70 - M71;

        // String S14 = "=" + M68 + M69 + M70 + M71 + "=" +  M72;

        // Минор для (3,1)
        // Расчет минора для (1,1) матрицы
        double line290 = a24 * a55 * a66;
        double line291 = a25 * a56 * a64;
        double line292 = a26 * a54 * a65;
        double line293 = a26 * a55 * a64;
        double line294 = a24 * a56 * a65;
        double line295 = a25 * a54 * a66;

        double ansline97 = line290 + line291 + line292;
        double ansline98 = line293 + line294 + line295;
        double answer49 = ansline97 - ansline98;

        // Расчет минора для (2,1) матрицы
        double line296 = a14 * a55 * a66;
        double line297 = a15 * a56 * a64;
        double line298 = a16 * a54 * a65;
        double line299 = a16 * a55 * a64;
        double line300 = a14 * a56 * a65;
        double line301 = a15 * a54 * a66;

        double ansline99 = line296 + line297 + line298;
        double ansline100 = line299 + line300 + line301;
        double answer50 = ansline99 - ansline100;

        // Расчет минора для (3,1) матрицы
        double line302 = a14 * a25 * a66;
        double line303 = a15 * a26 * a64;
        double line304 = a16 * a24 * a65;
        double line305 = a16 * a25 * a64;
        double line306 = a14 * a26 * a65;
        double line307 = a15 * a24 * a66;

        double ansline101 = line302 + line303 + line304;
        double ansline102 = line305 + line306 + line307;
        double answer51 = ansline101 - ansline102;

        // Расчет минора для (4,1) матрицы
        double line308 = a14 * a25 * a56;
        double line309 = a15 * a26 * a54;
        double line310 = a16 * a24 * a55;
        double line311 = a16 * a25 * a54;
        double line312 = a14 * a26 * a55;
        double line313 = a15 * a24 * a56;

        double ansline103 = line308 + line309 + line310;
        double ansline104 = line311 + line312 + line313;
        double answer52 = ansline103 - ansline104;

        double M73 = a13 * answer49;
        double M74 = a23 * answer50;
        double M75 = a53 * answer51;
        double M76 = a63 * answer52;
        double M77 = M73 - M74 + M75 - M76;

        // String S14 = "=" + M73 + M74 + M75 + M76 + "=" +  M77;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line314 = a24 * a45 * a66;
        double line315 = a25 * a46 * a64;
        double line316 = a26 * a44 * a65;
        double line317 = a26 * a45 * a64;
        double line318 = a24 * a46 * a65;
        double line319 = a25 * a44 * a66;

        double ansline105 = line314 + line315 + line316;
        double ansline106 = line317 + line318 + line319;
        double answer53 = ansline105 - ansline106;

        // Расчет минора для (2,1) матрицы
        double line320 = a14 * a45 * a66;
        double line321 = a15 * a46 * a64;
        double line322 = a16 * a44 * a65;
        double line323 = a16 * a45 * a64;
        double line324 = a14 * a46 * a65;
        double line325 = a15 * a44 * a66;

        double ansline107 = line320 + line321 + line322;
        double ansline108 = line323 + line324 + line325;
        double answer54 = ansline107 - ansline108;

        // Расчет минора для (3,1) матрицы
        double line326 = a14 * a25 * a66;
        double line327 = a15 * a26 * a64;
        double line328 = a16 * a24 * a65;
        double line329 = a16 * a25 * a64;
        double line330 = a14 * a26 * a65;
        double line331 = a15 * a24 * a66;

        double ansline109 = line326 + line327 + line328;
        double ansline110 = line329 + line330 + line331;
        double answer55 = ansline109 - ansline110;

        // Расчет минора для (4,1) матрицы
        double line332 = a14 * a25 * a46;
        double line333 = a15 * a26 * a44;
        double line334 = a16 * a24 * a45;
        double line335 = a16 * a25 * a44;
        double line336 = a14 * a26 * a45;
        double line337 = a15 * a24 * a46;

        double ansline111 = line332 + line333 + line334;
        double ansline112 = line335 + line336 + line337;
        double answer56 = ansline111 - ansline112;

        double M78 = a13 * answer53;
        double M79 = a23 * answer54;
        double M80 = a43 * answer55;
        double M81 = a63 * answer56;
        double M82 = M78 - M79 + M80 - M81;

        //    String S14 = "=" + M78 + M79 + M80 + M81 + "=" +  M82;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line338 = a24 * a45 * a56;
        double line339 = a25 * a46 * a54;
        double line340 = a26 * a44 * a55;
        double line341 = a26 * a45 * a54;
        double line342 = a24 * a46 * a55;
        double line343 = a25 * a44 * a56;

        double ansline113 = line338 + line339 + line340;
        double ansline114 = line341 + line342 + line343;
        double answer57 = ansline113 - ansline114;

        // Расчет минора для (2,1) матрицы
        double line344 = a14 * a45 * a56;
        double line345 = a15 * a46 * a54;
        double line346 = a16 * a44 * a55;
        double line347 = a16 * a45 * a54;
        double line348 = a14 * a46 * a55;
        double line349 = a15 * a44 * a56;

        double ansline115 = line344 + line345 + line346;
        double ansline116 = line347 + line348 + line349;
        double answer58 = ansline115 - ansline116;

        // Расчет минора для (3,1) матрицы
        double line350 = a14 * a25 * a56;
        double line351 = a15 * a26 * a54;
        double line352 = a16 * a24 * a55;
        double line353 = a16 * a25 * a54;
        double line354 = a14 * a26 * a55;
        double line355 = a15 * a24 * a56;

        double ansline117 = line350 + line351 + line352;
        double ansline118 = line353 + line354 + line355;
        double answer59 = ansline117 - ansline118;

        // Расчет минора для (4,1) матрицы
        double line356 = a14 * a25 * a46;
        double line357 = a15 * a26 * a44;
        double line358 = a16 * a24 * a45;
        double line359 = a16 * a25 * a44;
        double line360 = a14 * a26 * a45;
        double line361 = a15 * a24 * a46;

        double ansline119 = line356 + line357 + line358;
        double ansline120 = line359 + line360 + line361;
        double answer60 = ansline119 - ansline120;

        double M83 = a13 * answer57;
        double M84 = a23 * answer58;
        double M85 = a43 * answer59;
        double M86 = a53 * answer60;
        double M87 = M83 - M84 + M85 - M86;

        //   String S14 = "=" + M83 + M84 + M85 + M86 + "=" +  M87;

        double M88 = a12 * M67;
        double M89 = a22 * M72;
        double M90 = a42 * M77;
        double M91 = a52 * M82;
        double M92 = a62 * M87;
        double M93 = M88 - M89 + M90 - M91 + M92;

        //   String S14 = "=" + M88 + M89 + M90 + M91 + M92 + "=" +  M93;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line362 = a34 * a55 * a66;
        double line363 = a35 * a56 * a64;
        double line364 = a36 * a54 * a65;
        double line365 = a36 * a55 * a64;
        double line366 = a34 * a56 * a65;
        double line367 = a35 * a54 * a66;

        double ansline121 = line362 + line363 + line364;
        double ansline122 = line365 + line366 + line367;
        double answer61 = ansline121 - ansline122;

        // Расчет минора для (2,1) матрицы
        double line368 = a24 * a55 * a66;
        double line369 = a25 * a56 * a64;
        double line370 = a26 * a54 * a65;
        double line371 = a26 * a55 * a64;
        double line372 = a24 * a56 * a65;
        double line373 = a25 * a54 * a66;

        double ansline123 = line368 + line369 + line370;
        double ansline124 = line371 + line372 + line373;
        double answer62 = ansline123 - ansline124;

        // Расчет минора для (3,1) матрицы
        double line374 = a24 * a35 * a66;
        double line375 = a25 * a36 * a64;
        double line376 = a26 * a34 * a65;
        double line377 = a26 * a35 * a64;
        double line378 = a24 * a36 * a65;
        double line379 = a25 * a34 * a66;

        double ansline125 = line374 + line375 + line376;
        double ansline126 = line377 + line378 + line379;
        double answer63 = ansline125 - ansline126;

        // Расчет минора для (4,1) матрицы
        double line380 = a24 * a35 * a56;
        double line381 = a25 * a36 * a54;
        double line382 = a26 * a34 * a55;
        double line383 = a26 * a35 * a54;
        double line384 = a24 * a36 * a55;
        double line385 = a25 * a34 * a56;

        double ansline127 = line380 + line381 + line382;
        double ansline128 = line383 + line384 + line385;
        double answer64 = ansline127 - ansline128;

        double M94 = a23 * answer61;
        double M95 = a33 * answer62;
        double M96 = a53 * answer63;
        double M97 = a63 * answer64;
        double M98 = M94 - M95 + M96 - M97;

        //String S14 = "=" + M94 + M95 + M96 + M97 + "=" +  M98;

        // Минор для (2,1)
        // Расчет минора для (1,1) матрицы
        double line386 = a34 * a55 * a66;
        double line387 = a35 * a56 * a64;
        double line388 = a36 * a54 * a65;
        double line389 = a36 * a55 * a64;
        double line390 = a34 * a56 * a65;
        double line391 = a35 * a54 * a66;

        double ansline129 = line386 + line387 + line388;
        double ansline130 = line389 + line390 + line391;
        double answer65 = ansline129 - ansline130;

        // Расчет минора для (2,1) матрицы
        double line392 = a14 * a55 * a66;
        double line393 = a15 * a56 * a64;
        double line394 = a16 * a54 * a65;
        double line395 = a16 * a55 * a64;
        double line396 = a14 * a56 * a65;
        double line397 = a15 * a54 * a66;

        double ansline131 = line392 + line393 + line394;
        double ansline132 = line395 + line396 + line397;
        double answer66 = ansline131 - ansline132;

        // Расчет минора для (3,1) матрицы
        double line398 = a14 * a35 * a66;
        double line399 = a15 * a36 * a64;
        double line400 = a16 * a34 * a65;
        double line401 = a16 * a35 * a64;
        double line402 = a14 * a36 * a65;
        double line403 = a15 * a34 * a66;

        double ansline133 = line398 + line399 + line400;
        double ansline134 = line401 + line402 + line403;
        double answer67 = ansline133 - ansline134;

        // Расчет минора для (4,1) матрицы
        double line404 = a14 * a35 * a56;
        double line405 = a15 * a36 * a54;
        double line406 = a16 * a34 * a55;
        double line407 = a16 * a35 * a54;
        double line408 = a14 * a36 * a55;
        double line409 = a15 * a34 * a56;

        double ansline135 = line404 + line405 + line406;
        double ansline136 = line407 + line408 + line409;
        double answer68 = ansline135 - ansline136;

        double M99 = a13 * answer65;
        double M100 = a33 * answer66;
        double M101 = a53 * answer67;
        double M102 = a63 * answer68;
        double M103 = M99 - M100 + M101 - M102;

        // String S14 = "=" + M99 + M100 + M101 + M102 + "=" +  M103;

        // Минор для (3,1)
        // Расчет минора для (1,1) матрицы
        double line410 = a24 * a55 * a66;
        double line411 = a25 * a56 * a64;
        double line412 = a26 * a54 * a65;
        double line413 = a26 * a55 * a64;
        double line414 = a24 * a56 * a65;
        double line415 = a25 * a54 * a66;

        double ansline137 = line410 + line411 + line412;
        double ansline138 = line413 + line414 + line415;
        double answer69 = ansline137 - ansline138;

        // Расчет минора для (2,1) матрицы
        double line416 = a14 * a55 * a66;
        double line417 = a15 * a56 * a64;
        double line418 = a16 * a54 * a65;
        double line419 = a16 * a55 * a64;
        double line420 = a14 * a56 * a65;
        double line421 = a15 * a54 * a66;

        double ansline139 = line416 + line417 + line418;
        double ansline140 = line419 + line420 + line421;
        double answer70 = ansline139 - ansline140;

        // Расчет минора для (3,1) матрицы
        double line422 = a14 * a25 * a66;
        double line423 = a15 * a26 * a64;
        double line424 = a16 * a24 * a65;
        double line425 = a16 * a25 * a64;
        double line426 = a14 * a26 * a65;
        double line427 = a15 * a24 * a66;

        double ansline141 = line422 + line423 + line424;
        double ansline142 = line425 + line426 + line427;
        double answer71 = ansline141 - ansline142;

        // Расчет минора для (4,1) матрицы
        double line428 = a14 * a25 * a56;
        double line429 = a15 * a26 * a54;
        double line430 = a16 * a24 * a55;
        double line431 = a16 * a25 * a54;
        double line432 = a14 * a26 * a55;
        double line433 = a15 * a24 * a56;

        double ansline143 = line428 + line429 + line430;
        double ansline144 = line431 + line432 + line433;
        double answer72 = ansline143 - ansline144;

        double M104 = a13 * answer69;
        double M105 = a23 * answer70;
        double M106 = a53 * answer71;
        double M107 = a63 * answer72;
        double M108 = M104 - M105 + M106 - M107;

        //  String S14 = "=" + M104 + M105 + M106 + M107 + "=" +  M108 ;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line434 = a24 * a35 * a66;
        double line435 = a25 * a36 * a64;
        double line436 = a26 * a34 * a65;
        double line437 = a26 * a35 * a64;
        double line438 = a24 * a36 * a65;
        double line439 = a25 * a34 * a66;

        double ansline145 = line434 + line435 + line436;
        double ansline146 = line437 + line438 + line439;
        double answer73 = ansline145 - ansline146;

        // Расчет минора для (2,1) матрицы
        double line440 = a14 * a35 * a66;
        double line441 = a15 * a36 * a64;
        double line442 = a16 * a34 * a65;
        double line443 = a16 * a35 * a64;
        double line445 = a14 * a36 * a65;
        double line446 = a15 * a34 * a66;

        double ansline147 = line440 + line441 + line442;
        double ansline148 = line443 + line445 + line446;
        double answer74 = ansline147 - ansline148;

        // Расчет минора для (3,1) матрицы
        double line447 = a14 * a25 * a66;
        double line448 = a15 * a26 * a64;
        double line449 = a16 * a24 * a65;
        double line450 = a16 * a25 * a64;
        double line451 = a14 * a26 * a65;
        double line452 = a15 * a24 * a66;

        double ansline149 = line447 + line448 + line449;
        double ansline150 = line450 + line451 + line452;
        double answer75 = ansline149 - ansline150;

        // Расчет минора для (4,1) матрицы
        double line453 = a14 * a25 * a36;
        double line454 = a15 * a26 * a34;
        double line456 = a16 * a24 * a35;
        double line457 = a16 * a25 * a34;
        double line458 = a14 * a26 * a35;
        double line459 = a15 * a24 * a36;

        double ansline151 = line453 + line454 + line456;
        double ansline152 = line457 + line458 + line459;
        double answer76 = ansline151 - ansline152;

        double M109 = a13 * answer73;
        double M110 = a23 * answer74;
        double M111 = a33 * answer75;
        double M112 = a63 * answer76;
        double M113 = M109 - M110 + M111 - M112;

        //String S14 = "=" + M109 + M110 + M111 + M112 + "=" +  M113;

        // Минор для (5,1)
        // Расчет минора для (1,1) матрицы
        double line460 = a24 * a35 * a56;
        double line461 = a25 * a36 * a54;
        double line462 = a26 * a34 * a55;
        double line463 = a26 * a35 * a54;
        double line464 = a24 * a36 * a55;
        double line465 = a25 * a34 * a56;

        double ansline153 = line460 + line461 + line462;
        double ansline154 = line463 + line464 + line465;
        double answer77 = ansline153 - ansline154;

        // Расчет минора для (2,1) матрицы
        double line466 = a14 * a35 * a56;
        double line467 = a15 * a36 * a54;
        double line468 = a16 * a34 * a55;
        double line469 = a16 * a35 * a54;
        double line470 = a14 * a36 * a55;
        double line471 = a15 * a34 * a56;

        double ansline155 = line466 + line467 + line468;
        double ansline156 = line469 + line470 + line471;
        double answer78 = ansline155 - ansline156;

        // Расчет минора для (3,1) матрицы
        double line472 = a14 * a25 * a56;
        double line473 = a15 * a26 * a54;
        double line474 = a16 * a24 * a55;
        double line475 = a16 * a25 * a54;
        double line476 = a14 * a26 * a55;
        double line477 = a15 * a24 * a56;

        double ansline157 = line472 + line473 + line474;
        double ansline158 = line475 + line476 + line477;
        double answer79 = ansline157 - ansline158;

        // Расчет минора для (4,1) матрицы
        double line478 = a14 * a25 * a36;
        double line479 = a15 * a26 * a34;
        double line480 = a16 * a24 * a35;
        double line481 = a16 * a25 * a34;
        double line482 = a14 * a26 * a35;
        double line483 = a15 * a24 * a36;

        double ansline159 = line478 + line479 + line480;
        double ansline160 = line481 + line482 + line483;
        double answer80 = ansline159 - ansline160;

        double M114 = a13 * answer77;
        double M115 = a23 * answer78;
        double M116 = a33 * answer79;
        double M117 = a53 * answer80;
        double M118 = M114 - M115 + M116 - M117;

        //  String S14 = "=" + M114 + M115 + M116 + M117 + "=" +  M118;

        double M119 = a12 * M98;
        double M120 = a22 * M103;
        double M121 = a32 * M108;
        double M122 = a52 * M113;
        double M123 = a62 * M118;
        double M124 = M119 - M120 + M121 - M122 + M123;

        //   String S14 = "=" + M119 + M120 + M121 + M122 + M123 + "=" +  M124;

        // Минор для (5,1)
        // Расчет минора для (1,1) матрицы
        double line484 = a34 * a45 * a66;
        double line485 = a35 * a46 * a64;
        double line486 = a36 * a44 * a65;
        double line487 = a36 * a45 * a64;
        double line488 = a34 * a46 * a65;
        double line489 = a35 * a44 * a66;

        double ansline161 = line484 + line485 + line486;
        double ansline162 = line487 + line488 + line489;
        double answer81 = ansline161 - ansline162;

        // String S14 = "=" + line73 + " "  + line74 + " " +  line75 + " " + line76 + " " + line77 + " " + line78 + " " + answer12;

        // Расчет минора для (2,1) матрицы
        double line490 = a24 * a45 * a66;
        double line491 = a25 * a46 * a64;
        double line492 = a26 * a44 * a65;
        double line493 = a26 * a45 * a64;
        double line494 = a24 * a46 * a65;
        double line495 = a25 * a44 * a66;

        double ansline163 = line490 + line491 + line492;
        double ansline164 = line493 + line494 + line495;
        double answer82 = ansline163 - ansline164;

        // Расчет минора для (3,1) матрицы
        double line496 = a24 * a35 * a66;
        double line497 = a25 * a36 * a64;
        double line498 = a26 * a34 * a65;
        double line499 = a26 * a35 * a64;
        double line500 = a24 * a36 * a65;
        double line501 = a25 * a34 * a66;

        double ansline165 = line496 + line497 + line498;
        double ansline166 = line499 + line500 + line501;
        double answer83 = ansline165 - ansline166;

        // Расчет минора для (4,1) матрицы
        double line502 = a24 * a35 * a46;
        double line503 = a25 * a36 * a44;
        double line504 = a26 * a34 * a45;
        double line505 = a26 * a35 * a44;
        double line506 = a24 * a36 * a45;
        double line507 = a25 * a34 * a46;

        double ansline167 = line502 + line503 + line504;
        double ansline168 = line505 + line506 + line507;
        double answer84 = ansline167 - ansline168;

        // String S14 = "=" + line91 + " "  + line92 + " " +  line93 + " " + line94 + " " + line95 + " " + line96 + " " + answer15;

        double M125 = a23 * answer81;
        double M126 = a33 * answer82;
        double M127 = a43 * answer83;
        double M128 = a63 * answer84;
        double M129 = M125 - M126 + M127 - M128;

        // String S14 = "=" + M125 + M126 + M127 + M128 + "=" +  M129;

        // Минор для (2,1)
        // Расчет минора для (1,1) матрицы
        double line508 = a34 * a45 * a66;
        double line509 = a35 * a46 * a64;
        double line510 = a36 * a44 * a65;
        double line511 = a36 * a45 * a64;
        double line512 = a34 * a46 * a65;
        double line513 = a35 * a44 * a66;

        double ansline169 = line508 + line509 + line510;
        double ansline170 = line511 + line512 + line513;
        double answer85 = ansline169 - ansline170;

        // Расчет минора для (2,1) матрицы
        double line514 = a14 * a45 * a66;
        double line515 = a15 * a46 * a64;
        double line516 = a16 * a44 * a65;
        double line517 = a16 * a45 * a64;
        double line518 = a14 * a46 * a65;
        double line519 = a15 * a44 * a66;

        double ansline171 = line514 + line515 + line516;
        double ansline172 = line517 + line518 + line519;
        double answer86 = ansline171 - ansline172;

        // Расчет минора для (3,1) матрицы
        double line520 = a14 * a35 * a66;
        double line521 = a15 * a36 * a64;
        double line522 = a16 * a34 * a65;
        double line523 = a16 * a35 * a64;
        double line524 = a14 * a36 * a65;
        double line525 = a15 * a34 * a66;

        double ansline173 = line520 + line521 + line522;
        double ansline174 = line523 + line524 + line525;
        double answer87 = ansline173 - ansline174;

        // Расчет минора для (4,1) матрицы
        double line526 = a14 * a35 * a46;
        double line527 = a15 * a36 * a44;
        double line528 = a16 * a34 * a45;
        double line529 = a16 * a35 * a44;
        double line530 = a14 * a36 * a45;
        double line531 = a15 * a34 * a46;

        double ansline175 = line526 + line527 + line528;
        double ansline176 = line529 + line530 + line531;
        double answer88 = ansline175 - ansline176;

        double M130 = a13 * answer85;
        double M131 = a33 * answer86;
        double M132 = a43 * answer87;
        double M133 = a63 * answer88;
        double M134 = M130 - M131 + M132 - M133;

        // String S14 = "=" + M130 + M131 + M132 + M133 + "=" +  M134;

        // Минор для (3,1)
        // Расчет минора для (1,1) матрицы
        double line532 = a24 * a45 * a66;
        double line533 = a25 * a46 * a64;
        double line534 = a26 * a44 * a65;
        double line535 = a26 * a45 * a64;
        double line536 = a24 * a46 * a65;
        double line537 = a25 * a44 * a66;

        double ansline177 = line532 + line533 + line534;
        double ansline178 = line535 + line536 + line537;
        double answer89 = ansline177 - ansline178;

        // Расчет минора для (2,1) матрицы
        double line538 = a14 * a45 * a66;
        double line539 = a15 * a46 * a64;
        double line540 = a16 * a44 * a65;
        double line541 = a16 * a45 * a64;
        double line542 = a14 * a46 * a65;
        double line543 = a15 * a44 * a66;

        double ansline179 = line538 + line539 + line540;
        double ansline180 = line541 + line542 + line543;
        double answer90 = ansline179 - ansline180;

        // Расчет минора для (3,1) матрицы
        double line544 = a14 * a25 * a66;
        double line545 = a15 * a26 * a64;
        double line546 = a16 * a24 * a65;
        double line547 = a16 * a25 * a64;
        double line548 = a14 * a26 * a65;
        double line549 = a15 * a24 * a66;

        double ansline181 = line544 + line545 + line546;
        double ansline182 = line547 + line548 + line549;
        double answer91 = ansline181 - ansline182;

        // Расчет минора для (4,1) матрицы
        double line550 = a14 * a25 * a46;
        double line551 = a15 * a26 * a44;
        double line552 = a16 * a24 * a45;
        double line553 = a16 * a25 * a44;
        double line554 = a14 * a26 * a45;
        double line555 = a15 * a24 * a46;

        double ansline183 = line550 + line551 + line552;
        double ansline184 = line553 + line554 + line555;
        double answer92 = ansline183 - ansline184;

        double M135 = a13 * answer89;
        double M136 = a23 * answer90;
        double M137 = a43 * answer91;
        double M138 = a63 * answer92;
        double M139 = M135 - M136 + M137 - M138;

        // String S14 = "=" + M135 + M136 + M137 + M138 + "=" +  M139;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line556 = a24 * a35 * a66;
        double line557 = a25 * a36 * a64;
        double line558 = a26 * a34 * a65;
        double line559 = a26 * a35 * a64;
        double line560 = a24 * a36 * a65;
        double line561 = a25 * a34 * a66;

        double ansline185 = line556 + line557 + line558;
        double ansline186 = line559 + line560 + line561;
        double answer93 = ansline185 - ansline186;

        // Расчет минора для (2,1) матрицы
        double line562 = a14 * a35 * a66;
        double line563 = a15 * a36 * a64;
        double line564 = a16 * a34 * a65;
        double line565 = a16 * a35 * a64;
        double line566 = a14 * a36 * a65;
        double line567 = a15 * a34 * a66;

        double ansline187 = line562 + line563 + line564;
        double ansline188 = line565 + line566 + line567;
        double answer94 = ansline187 - ansline188;

        // Расчет минора для (3,1) матрицы
        double line568 = a14 * a25 * a66;
        double line569 = a15 * a26 * a64;
        double line570 = a16 * a24 * a65;
        double line571 = a16 * a25 * a64;
        double line572 = a14 * a26 * a65;
        double line573 = a15 * a24 * a66;

        double ansline189 = line568 + line569 + line570;
        double ansline190 = line571 + line572 + line573;
        double answer95 = ansline189 - ansline190;

        // Расчет минора для (4,1) матрицы
        double line574 = a14 * a25 * a36;
        double line575 = a15 * a26 * a34;
        double line576 = a16 * a24 * a35;
        double line577 = a16 * a25 * a34;
        double line578 = a14 * a26 * a35;
        double line579 = a15 * a24 * a36;

        double ansline191 = line574 + line575 + line576;
        double ansline192 = line577 + line578 + line579;
        double answer96 = ansline191 - ansline192;

        double M140 = a13 * answer93;
        double M141 = a23 * answer94;
        double M142 = a33 * answer95;
        double M143 = a63 * answer96;
        double M144 = M140 - M141 + M142 - M143;

        //  String S14 = "=" + M140 + M141 + M142 + M143 + "=" +  M144;

        // Минор для (5,1)
        // Расчет минора для (1,1) матрицы
        double line580 = a24 * a35 * a46;
        double line581 = a25 * a36 * a44;
        double line582 = a26 * a34 * a45;
        double line583 = a26 * a35 * a44;
        double line584 = a24 * a36 * a45;
        double line585 = a25 * a34 * a46;

        double ansline193 = line580 + line581 + line582;
        double ansline194 = line583 + line584 + line585;
        double answer97 = ansline193 - ansline194;

        // Расчет минора для (2,1) матрицы
        double line586 = a14 * a35 * a46;
        double line587 = a15 * a36 * a44;
        double line588 = a16 * a34 * a45;
        double line589 = a16 * a35 * a44;
        double line590 = a14 * a36 * a45;
        double line591 = a15 * a34 * a46;

        double ansline195 = line586 + line587 + line588;
        double ansline196 = line589 + line590 + line591;
        double answer98 = ansline195 - ansline196;

        // Расчет минора для (3,1) матрицы
        double line592 = a14 * a25 * a46;
        double line593 = a15 * a26 * a44;
        double line594 = a16 * a24 * a45;
        double line595 = a16 * a25 * a44;
        double line596 = a14 * a26 * a45;
        double line597 = a15 * a24 * a46;

        double ansline197 = line592 + line593 + line594;
        double ansline198 = line595 + line596 + line597;
        double answer99 = ansline197 - ansline198;

        // Расчет минора для (4,1) матрицы
        double line598 = a14 * a25 * a36;
        double line599 = a15 * a26 * a34;
        double line600 = a16 * a24 * a35;
        double line601 = a16 * a25 * a34;
        double line602 = a14 * a26 * a35;
        double line603 = a15 * a24 * a36;

        double ansline199 = line598 + line599 + line600;
        double ansline200 = line601 + line602 + line603;
        double answer100 = ansline199 - ansline200;

        double M145 = a13 * answer97;
        double M146 = a23 * answer98;
        double M147 = a33 * answer99;
        double M148 = a43 * answer100;
        double M149 = M145 - M146 + M147 - M148;

        //  String S14 = "=" + M145 + M146 + M147 + M148 + "=" +  M149;

        double M150 = a12 * M129;
        double M151 = a22 * M134;
        double M152 = a32 * M139;
        double M153 = a42 * M144;
        double M154 = a62 * M149;
        double M155 = M150 - M151 + M152 - M153 + M154;

        // String S14 = "=" + M150 + M151 + M152 + M153 + M154 + "=" +  M155;

        // Минор для (6,1)
        // Расчет минора для (1,1) матрицы
        double line604 = a34 * a45 * a56;
        double line605 = a35 * a46 * a54;
        double line606 = a36 * a44 * a55;
        double line607 = a36 * a45 * a54;
        double line608 = a34 * a46 * a55;
        double line609 = a35 * a44 * a56;

        double ansline201 = line604 + line605 + line606;
        double ansline202 = line607 + line608 + line609;
        double answer101 = ansline201 - ansline202;

        // Расчет минора для (2,1) матрицы
        double line610 = a24 * a45 * a56;
        double line611 = a25 * a46 * a54;
        double line612 = a26 * a44 * a55;
        double line613 = a26 * a45 * a54;
        double line614 = a24 * a46 * a55;
        double line615 = a25 * a44 * a56;

        double ansline203 = line610 + line611 + line612;
        double ansline204 = line613 + line614 + line615;
        double answer102 = ansline203 - ansline204;

        // Расчет минора для (3,1) матрицы
        double line616 = a24 * a35 * a56;
        double line617 = a25 * a36 * a54;
        double line618 = a26 * a34 * a55;
        double line619 = a26 * a35 * a54;
        double line620 = a24 * a36 * a55;
        double line621 = a25 * a34 * a56;

        double ansline205 = line616 + line617 + line618;
        double ansline206 = line619 + line620 + line621;
        double answer103 = ansline205 - ansline206;

        // Расчет минора для (4,1) матрицы
        double line622 = a24 * a35 * a46;
        double line623 = a25 * a36 * a44;
        double line624 = a26 * a34 * a45;
        double line625 = a26 * a35 * a44;
        double line626 = a24 * a36 * a45;
        double line627 = a25 * a34 * a46;

        double ansline207 = line622 + line623 + line624;
        double ansline208 = line625 + line626 + line627;
        double answer104 = ansline207 - ansline208;

        double M156 = a23 * answer101;
        double M157 = a33 * answer102;
        double M158 = a43 * answer103;
        double M159 = a53 * answer104;
        double M160 = M156 - M157 + M158 - M159;

        //String S14 = "=" + M156 + M157 + M158 + M159 + "=" +  M160;

        // Минор для (2,1)
        // Расчет минора для (1,1) матрицы
        double line628 = a34 * a45 * a56;
        double line629 = a35 * a46 * a54;
        double line630 = a36 * a44 * a55;
        double line631 = a36 * a45 * a54;
        double line632 = a34 * a46 * a55;
        double line633 = a35 * a44 * a56;

        double ansline209 = line628 + line629 + line630;
        double ansline210 = line631 + line632 + line633;
        double answer105 = ansline209 - ansline210;

        // Расчет минора для (2,1) матрицы
        double line634 = a14 * a45 * a56;
        double line635 = a15 * a46 * a54;
        double line636 = a16 * a44 * a55;
        double line637 = a16 * a45 * a54;
        double line638 = a14 * a46 * a55;
        double line639 = a15 * a44 * a56;

        double ansline211 = line634 + line635 + line636;
        double ansline212 = line637 + line638 + line639;
        double answer106 = ansline211 - ansline212;

        // Расчет минора для (3,1) матрицы
        double line640 = a14 * a35 * a56;
        double line641 = a15 * a36 * a54;
        double line642 = a16 * a34 * a55;
        double line643 = a16 * a35 * a54;
        double line644 = a14 * a36 * a55;
        double line645 = a15 * a34 * a56;

        double ansline213 = line640 + line641 + line642;
        double ansline214 = line643 + line644 + line645;
        double answer107 = ansline213 - ansline214;

        // Расчет минора для (4,1) матрицы
        double line646 = a14 * a35 * a46;
        double line647 = a15 * a36 * a44;
        double line648 = a16 * a34 * a45;
        double line649 = a16 * a35 * a44;
        double line650 = a14 * a36 * a45;
        double line651 = a15 * a34 * a46;

        double ansline215 = line646 + line647 + line648;
        double ansline216 = line649 + line650 + line651;
        double answer108 = ansline215 - ansline216;

        double M161 = a13 * answer105;
        double M162 = a33 * answer106;
        double M163 = a43 * answer107;
        double M164 = a53 * answer108;
        double M165 = M161 - M162 + M163 - M164;

        //  String S14 = "=" + M161 + M162 + M163 + M164 + "=" +  M165;

        // Минор для (3,1)
        // Расчет минора для (1,1) матрицы
        double line652 = a24 * a45 * a56;
        double line653 = a25 * a46 * a54;
        double line654 = a26 * a44 * a55;
        double line655 = a26 * a45 * a54;
        double line656 = a24 * a46 * a55;
        double line657 = a25 * a44 * a56;

        double ansline217 = line652 + line653 + line654;
        double ansline218 = line655 + line656 + line657;
        double answer109 = ansline217 - ansline218;

        // Расчет минора для (2,1) матрицы
        double line658 = a14 * a45 * a56;
        double line659 = a15 * a46 * a54;
        double line660 = a16 * a44 * a55;
        double line661 = a16 * a45 * a54;
        double line662 = a14 * a46 * a55;
        double line663 = a15 * a44 * a56;

        double ansline219 = line658 + line659 + line660;
        double ansline220 = line661 + line662 + line663;
        double answer110 = ansline219 - ansline220;

        // Расчет минора для (3,1) матрицы
        double line664 = a14 * a25 * a56;
        double line665 = a15 * a26 * a54;
        double line666 = a16 * a24 * a55;
        double line667 = a16 * a25 * a54;
        double line668 = a14 * a26 * a55;
        double line669 = a15 * a24 * a56;

        double ansline221 = line664 + line665 + line666;
        double ansline222 = line667 + line668 + line669;
        double answer111 = ansline221 - ansline222;

        // Расчет минора для (4,1) матрицы
        double line670 = a14 * a25 * a46;
        double line671 = a15 * a26 * a44;
        double line672 = a16 * a24 * a45;
        double line673 = a16 * a25 * a44;
        double line674 = a14 * a26 * a45;
        double line675 = a15 * a24 * a46;

        double ansline223 = line670 + line671 + line672;
        double ansline224 = line673 + line674 + line675;
        double answer112 = ansline223 - ansline224;

        double M166 = a13 * answer109;
        double M167 = a23 * answer110;
        double M168 = a43 * answer111;
        double M169 = a53 * answer112;
        double M170 = M166 - M167 + M168 - M169;

        // String S14 = "=" + M166 + M167 + M168 + M169 + "=" +  M170;

        // Минор для (4,1)
        // Расчет минора для (1,1) матрицы
        double line676 = a24 * a35 * a56;
        double line677 = a25 * a36 * a54;
        double line679 = a26 * a34 * a55;
        double line680 = a26 * a35 * a54;
        double line681 = a24 * a36 * a55;
        double line682 = a25 * a34 * a56;

        double ansline225 = line676 + line677 + line679;
        double ansline226 = line680 + line681 + line682;
        double answer113 = ansline225 - ansline226;

        // Расчет минора для (2,1) матрицы
        double line683 = a14 * a35 * a56;
        double line684 = a15 * a36 * a54;
        double line685 = a16 * a34 * a55;
        double line686 = a16 * a35 * a54;
        double line687 = a14 * a36 * a55;
        double line688 = a15 * a34 * a56;

        double ansline227 = line683 + line684 + line685;
        double ansline228 = line686 + line687 + line688;
        double answer114 = ansline227 - ansline228;

        // Расчет минора для (3,1) матрицы
        double line689 = a14 * a25 * a56;
        double line690 = a15 * a26 * a54;
        double line691 = a16 * a24 * a55;
        double line692 = a16 * a25 * a54;
        double line693 = a14 * a26 * a55;
        double line694 = a15 * a24 * a56;

        double ansline229 = line689 + line690 + line691;
        double ansline230 = line692 + line693 + line694;
        double answer115 = ansline229 - ansline230;

        // Расчет минора для (4,1) матрицы
        double line695 = a14 * a25 * a36;
        double line696 = a15 * a26 * a34;
        double line697 = a16 * a24 * a35;
        double line698 = a16 * a25 * a34;
        double line699 = a14 * a26 * a35;
        double line700 = a15 * a24 * a36;

        double ansline231 = line695 + line696 + line697;
        double ansline232 = line698 + line699 + line700;
        double answer116 = ansline231 - ansline232;

        double M171 = a13 * answer113;
        double M172 = a23 * answer114;
        double M173 = a33 * answer115;
        double M174 = a53 * answer116;
        double M175 = M171 - M172 + M173 - M174;

        // String S14 = "=" + M171 + M172 + M173 + M174 + "=" +  M175;

        // Минор для (5,1)
        // Расчет минора для (1,1) матрицы
        double line701 = a24 * a35 * a46;
        double line702 = a25 * a36 * a44;
        double line703 = a26 * a34 * a45;
        double line704 = a26 * a35 * a44;
        double line705 = a24 * a36 * a45;
        double line706 = a25 * a34 * a46;

        double ansline233 = line701 + line702 + line703;
        double ansline234 = line704 + line705 + line706;
        double answer117 = ansline233 - ansline234;

        // Расчет минора для (2,1) матрицы
        double line708 = a14 * a35 * a46;
        double line709 = a15 * a36 * a44;
        double line710 = a16 * a34 * a45;
        double line711 = a16 * a35 * a44;
        double line712 = a14 * a36 * a45;
        double line713 = a15 * a34 * a46;

        double ansline235 = line708 + line709 + line710;
        double ansline236 = line711 + line712 + line713;
        double answer118 = ansline235 - ansline236;

        // Расчет минора для (3,1) матрицы
        double line714 = a14 * a25 * a46;
        double line715 = a15 * a26 * a44;
        double line716 = a16 * a24 * a45;
        double line717 = a16 * a25 * a44;
        double line718 = a14 * a26 * a45;
        double line719 = a15 * a24 * a46;

        double ansline237 = line714 + line715 + line716;
        double ansline238 = line717 + line718 + line719;
        double answer119 = ansline237 - ansline238;

        // Расчет минора для (4,1) матрицы
        double line720 = a14 * a25 * a36;
        double line721 = a15 * a26 * a34;
        double line722 = a16 * a24 * a35;
        double line723 = a16 * a25 * a34;
        double line724 = a14 * a26 * a35;
        double line725 = a15 * a24 * a36;

        double ansline239 = line720 + line721 + line722;
        double ansline240 = line723 + line724 + line725;
        double answer120 = ansline239 - ansline240;

        double M176 = a13 * answer117;
        double M177 = a23 * answer118;
        double M178 = a33 * answer119;
        double M179 = a43 * answer120;
        double M180 = M176 - M177 + M178 - M179;

        //   String S14 = "=" + M176 + M177 + M178 + M179 + "=" +  M180;

        double M181 = a12 * M160;
        double M182 = a22 * M165;
        double M183 = a32 * M170;
        double M184 = a42 * M175;
        double M185 = a52 * M180;
        double M186 = M181 - M182 + M183 - M184 + M185;

        //  String S14 = "=" + M181 + M182 + M183 + M184 + M185 + "=" +  M186;

        double M187 = a11 * M31;
        double M188 = a21 * M62;
        double M189 = a31 * M93;
        double M190 = a41 * M124;
        double M191 = a51 * M155;
        double M192 = a61 * M186;
        double M193 = M187 - M188 + M189 - M190 + M191 - M192;

        String S14 = "=" + M187 + M188 + M189 + M190 + M191 + M192 + "=" + M193;
        textView169.setText(S14);


        if (M193 == 0) {
            /*
            Toast toast = Toast.makeText(this, "Ответ: так как  детерминант матрицы равен нулю, то система не может решена эти методом ", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();

             */
        }

        textView139.setText("Определитель 1-го порядка");
        // Вывод общего порядка
        String S15 = b1 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + a15 + "   " + a16;
        textView86.setText(S15);
        String S16 = b2 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + a25 + "   " + a26;
        textView117.setText(S16);
        String S17 = b3 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + a35 + "   " + a36;
        textView158.setText(S17);
        String S18 = b4 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + a45 + "   " + a46;
        textView212.setText(S18);
        String S19 = b5 + "   " + a52 + "   " + a53 + "   " + a54 + "   " + a55 + "   " + a56;
        textView211.setText(S19);
        String S20 = b6 + "   " + a62 + "   " + a63 + "   " + a64 + "   " + a65 + "   " + a66;
        textView218.setText(S20);

        // String S21 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
        //textView170.setText(S21);

        textView159.setText("Определитель 2-го порядка");
        // Вывод общего порядка
        String S22 = a11 + "   " + b1 + "   " + a13 + "   " + a14 + "   " + a15 + "   " + a16;
        textView121.setText(S22);
        String S23 = a21 + "   " + b2 + "   " + a23 + "   " + a24 + "   " + a25 + "   " + a26;
        textView122.setText(S23);
        String S24 = a31 + "   " + b3 + "   " + a33 + "   " + a34 + "   " + a35 + "   " + a36;
        textView123.setText(S24);
        String S25 = a41 + "   " + b4 + "   " + a43 + "   " + a44 + "   " + a45 + "   " + a46;
        textView124.setText(S25);
        String S26 = a51 + "   " + b5 + "   " + a53 + "   " + a54 + "   " + a55 + "   " + a56;
        textView160.setText(S26);
        String S27 = a61 + "   " + b6 + "   " + a63 + "   " + a64 + "   " + a65 + "   " + a66;
        textView208.setText(S27);

        // String S28 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
        //textView170.setText(S28);

        textView161.setText("Определитель 3-го порядка");
        // Вывод общего порядка
        String S29 = a11 + "   " + a12 + "   " + b1 + "   " + a14 + "   " + a15 + "   " + a16;
        textView126.setText(S29);
        String S30 = a21 + "   " + a22 + "   " + b2 + "   " + a24 + "   " + a25 + "   " + a26;
        textView127.setText(S30);
        String S31 = a31 + "   " + a32 + "   " + b3 + "   " + a34 + "   " + a35 + "   " + a36;
        textView128.setText(S31);
        String S32 = a41 + "   " + a42 + "   " + b4 + "   " + a44 + "   " + a45 + "   " + a46;
        textView129.setText(S32);
        String S33 = a51 + "   " + a52 + "   " + b5 + "   " + a54 + "   " + a55 + "   " + a56;
        textView130.setText(S33);
        String S34 = a61 + "   " + a62 + "   " + b6 + "   " + a64 + "   " + a65 + "   " + a66;
        textView166.setText(S34);

        // String S35 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
        //textView170.setText(S35);

        textView162.setText("Определитель 4-го порядка");
        // Вывод общего порядка
        String S36 = a11 + "   " + a12 + "   " + a13 + "   " + b1 + "   " + a15 + "   " + a16;
        textView132.setText(S36);
        String S37 = a21 + "   " + a22 + "   " + a23 + "   " + b2 + "   " + a25 + "   " + a26;
        textView133.setText(S37);
        String S38 = a31 + "   " + a32 + "   " + a33 + "   " + b3 + "   " + a35 + "   " + a36;
        textView134.setText(S38);
        String S39 = a41 + "   " + a42 + "   " + a43 + "   " + b4 + "   " + a45 + "   " + a46;
        textView135.setText(S39);
        String S40 = a51 + "   " + a52 + "   " + a53 + "   " + b5 + "   " + a55 + "   " + a56;
        textView136.setText(S40);
        String S41 = a61 + "   " + a62 + "   " + a63 + "   " + b6 + "   " + a65 + "   " + a66;
        textView163.setText(S41);

        // String S42 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
        //textView173.setText(S42);

        textView164.setText("Определитель 5-го порядка");
        // Вывод общего порядка
        String S43 = a11 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + b1 + "   " + a16;
        textView141.setText(S43);
        String S44 = a21 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + b2 + "   " + a26;
        textView142.setText(S44);
        String S45 = a31 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + b3 + "   " + a36;
        textView143.setText(S45);
        String S46 = a41 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + b4 + "   " + a46;
        textView144.setText(S46);
        String S47 = a51 + "   " + a52 + "   " + a53 + "   " + a54 + "   " + b5 + "   " + a56;
        textView145.setText(S47);
        String S48 = a61 + "   " + a62 + "   " + a63 + "   " + a64 + "   " + b6 + "   " + a66;
        textView168.setText(S48);

        // String S49 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
        //textView174.setText(S49);

        textView165.setText("Определитель 6-го порядка");
        // Вывод общего порядка
        String S50 = a11 + "   " + a12 + "   " + a13 + "   " + a14 + "   " + a15 + "   " + b1;
        textView147.setText(S50);
        String S51 = a21 + "   " + a22 + "   " + a23 + "   " + a24 + "   " + a25 + "   " + b2;
        textView148.setText(S51);
        String S52 = a31 + "   " + a32 + "   " + a33 + "   " + a34 + "   " + a35 + "   " + b3;
        textView149.setText(S52);
        String S53 = a41 + "   " + a42 + "   " + a43 + "   " + a44 + "   " + a45 + "   " + b4;
        textView150.setText(S53);
        String S54 = a51 + "   " + a52 + "   " + a53 + "   " + a54 + "   " + a55 + "   " + b5;
        textView151.setText(S54);
        String S55 = a61 + "   " + a62 + "   " + a63 + "   " + a64 + "   " + a65 + "   " + b6;
        textView167.setText(S55);

        // String S56 = "=" + line55 + " "  + line56 + " " +  line57 + " " + line58 + " " + line59 + " " + line60 + " " + answer9;
        //textView227.setText(S56);
    }
}
