package com.example.matrixlite;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Gaus extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4, editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8, editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12, editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16, editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20, editTextNumber21, editTextNumber22, editTextNumber23, editTextNumber24, editTextNumber25, editTextNumber26, editTextNumber27, editTextNumber28, editTextNumber29, editTextNumber30, editTextNumber31, editTextNumber32, editTextNumber33, editTextNumber34, editTextNumber35, editTextNumber36, editTextNumber37, editTextNumber38, editTextNumber39, editTextNumber40, editTextNumber41, editTextNumber42;
    private TextView textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50, textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60, textView61, textView62, textView63, textView64, textView65, textView66, textView67, textView68, textView69, textView70, textView71, textView72, textView73, textView74, textView75;


    public void Clear2(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, TextView textView8, TextView textView9, TextView textView11, TextView textView12, TextView textView14, TextView textView15, TextView textView17, TextView textView18, TextView textView20, TextView textView21, TextView textView23, TextView textView24) {
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
        textView14.setText(null);
        textView15.setText(null);
        textView17.setText(null);
        textView18.setText(null);
        textView20.setText(null);
        textView21.setText(null);
        textView23.setText(null);
        textView24.setText(null);
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

    public void Rast2(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24) {
        double a11 = Double.parseDouble((editTextNumber1.getText().toString()));
        double a12 = Double.parseDouble((editTextNumber2.getText().toString()));
        double b1 = Double.parseDouble((editTextNumber3.getText().toString()));
        double a21 = Double.parseDouble((editTextNumber4.getText().toString()));
        double a22 = Double.parseDouble((editTextNumber5.getText().toString()));
        double b2 = Double.parseDouble((editTextNumber6.getText().toString()));

        textView7.setText("Перепишем систему уравнений в матричном виде");

        // Вывод общей матрицы
        String S1 = a11 + "     " + a12 + "       " + b1;
        textView8.setText(S1);
        String S2 = a21 + "      " + a22 + "       " + b2;
        textView9.setText(S2);

        String str = "1-ую строку делим на " + a11;
        textView10.setText(str);

        // расчет деления 1 строки в матрице на а11
        double line1 = (double) a11 / a11;
        double line2 = (double) a12 / a11;
        double line3 = (double) b1 / a11;

        String result1 = String.format("%.1f", line1);
        String result2 = String.format("%.1f", line2);
        String result3 = String.format("%.1f", line3);

        // вывод деления 1 строки в матрице на а11
        String S4 = result1 + "           " + result2 + "        " + result3;
        textView11.setText(S4);
        String S5 = a21 + "       " + a22 + "     " + b2;
        textView12.setText(S5);

        String str1 = "от 2 строки отнимаем 1 строку, умноженную на " + a21;
        textView13.setText(str1);

        double line4 = (double) a21 - line1 * a21;
        double line5 = (double) a22 - line2 * a21;
        double line6 = (double) b2 - line3 * a21;

        String result4 = String.format("%.1f", line4);
        String result5 = String.format("%.1f", line5);
        String result6 = String.format("%.1f", line6);

        String S6 = result1 + "       " + result2 + "           " + result3;
        textView14.setText(S6);
        String S7 = result4 + "     " + result5 + "      " + result6;
        textView15.setText(S7);

        String str2 = "2-ую строку делим на " + result5;
        textView16.setText(str2);

        double line7 = (double) line4 / line5;
        double line8 = (double) line5 / line5;
        double line9 = (double) line6 / line5;

        String result7 = String.format("%.1f", line7);
        String result8 = String.format("%.1f", line8);
        String result9 = String.format("%.1f", line9);

        String S8 = result1 + "    " + result2 + "        " + result3;
        textView17.setText(S8);
        String S9 = result7 + "   " + result8 + "        " + result9;
        textView18.setText(S9);

        String str3 = "от 1 строки отнимаем 2 строку, умноженную на " + result2;
        textView19.setText(str3);

        double line10 = (double) line1 - line7 * line2;
        double line11 = (double) line2 - line8 * line2;
        double line12 = (double) line3 - line9 * line2;

        String result10 = String.format("%.1f", line10);
        String result11 = String.format("%.1f", line11);
        String result12 = String.format("%.1f", line12);

        String S10 = result10 + "    " + result11 + "        " + result12;
        textView20.setText(S10);
        String S11 = result7 + "   " + result8 + "        " + result9;
        textView21.setText(S11);

        textView22.setText("Ответ: ");
        String S12 = "X1 = " + result12;
        textView23.setText(S12);
        String S13 = "X2 = " + result9;
        textView24.setText(S13);


        // Делаем проверку если пользователь заполнил матрицу нулями
        if (a11 == 0 && a12 == 0 && b1 == 0 && a21 == 0 && a22 == 0 && b2 == 0) {
            textView7.setText("Перепишем систему уравнений в матричном виде");
            // Вывод общей матрицы
            String S25 = a11 + "     " + a12 + "       " + b1;
            textView8.setText(S25);
            String S23 = a21 + "      " + a12 + "       " + b2;
            textView9.setText(S23);

            String str6 = " Ответ: ";
            textView10.setText(str6);
            String str7 = " Система имеет множество решений: ";
            textView11.setText(str7);
            textView12.setText(a12 + " = " + b1 + "  " + a12 + " = " + b2);

            // Показываем и скрываем нужные и не нужные вывод результата
            textView7.setVisibility(View.VISIBLE);
            textView8.setVisibility(View.VISIBLE);
            textView9.setVisibility(View.VISIBLE);
            textView10.setVisibility(View.VISIBLE);
            textView11.setVisibility(View.VISIBLE);
            textView12.setVisibility(View.VISIBLE);
            textView13.setVisibility(View.INVISIBLE);
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
        } else {   // Проверяем если пользователь заполнил 1 строку нулями
            if (a11 == 0 && a12 == 0 && b1 == 0) {

                //   LayoutParams param = new LayoutParams;
                //   param.setMargins(0,0,15,0);

                textView7.setText("Перепишем систему уравнений в матричном виде");

                //  LL1.measure(0, 0);
                // Вывод общей матрицы
                String S20 = a11 + "     " + a12 + "       " + b1;
                textView8.setText(S20);
                String S21 = a21 + "      " + a22 + "      " + b2;
                textView9.setText(S21);

                String str4 = "поменяем 1-ую строку и 2-ую строку местами ";
                //  textView10.setPadding(40,70,0,0);
                ViewGroup.MarginLayoutParams mip = (ViewGroup.MarginLayoutParams) textView10.getLayoutParams();
                mip.setMargins(20, 1180, 0, 0);
                // textView10.set
                textView10.setText(str4);
                String S14 = a21 + "      " + a22 + "       " + b2;
                textView11.setText(S14);
                String S15 = a11 + "     " + a12 + "       " + b1;
                textView12.setText(S15);

                String str5 = "1-ую строку делим на " + a21;
                textView13.setPadding(240, 20, 0, 0);
                textView13.setText(str5);
                double line13 = (double) a21 / a21;
                double line14 = (double) a22 / a21;
                double line15 = (double) b2 / a21;

                String result13 = String.format("%.1f", line13);
                String result14 = String.format("%.1f", line14);
                String result15 = String.format("%.1f", line15);

                String S16 = result13 + "    " + result14 + "        " + result15;
                textView14.setText(S16);
                String S17 = a11 + "     " + a12 + "       " + b1;
                textView15.setText(S17);

                String str6 = " Ответ: ";
                textView16.setText(str6);

                String str7 = " Система имеет множество решений: ";
                textView17.setText(str7);
                textView17.setPadding(-5, 20, 0, 0);
                textView18.setText(" x1+ " + result14 + " x2 " + "=" + result15);

                // Показываем и скрываем нужные и не нужные вывод результата
                textView7.setVisibility(View.VISIBLE);
                textView8.setVisibility(View.VISIBLE);
                textView9.setVisibility(View.VISIBLE);
                textView10.setVisibility(View.VISIBLE);
                textView11.setVisibility(View.VISIBLE);
                textView12.setVisibility(View.VISIBLE);
                textView13.setVisibility(View.VISIBLE);
                textView14.setVisibility(View.VISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView16.setVisibility(View.VISIBLE);
                textView17.setVisibility(View.VISIBLE);
                textView18.setVisibility(View.VISIBLE);
                textView19.setVisibility(View.INVISIBLE);
                textView20.setVisibility(View.INVISIBLE);
                textView21.setVisibility(View.INVISIBLE);
                textView22.setVisibility(View.INVISIBLE);
                textView23.setVisibility(View.INVISIBLE);
                textView24.setVisibility(View.INVISIBLE);
            } else {   // Проверяем если пользователь заполнил 2 строку нулями
                if (a21 == 0 && a22 == 0 && b2 == 0) {

                    textView7.setText("Перепишем систему уравнений в матричном виде");

                    // Вывод общей матрицы
                    String S18 = a11 + "     " + a12 + "     " + b1;
                    textView8.setText(S18);
                    String S19 = a21 + "      " + a22 + "       " + b2;
                    textView9.setText(S19);

                    String str8 = " 1-ую строку делим на " + a11;
                    textView10.setText(str8);

                    double line16 = (double) a11 / a11;
                    double line17 = (double) a12 / a11;
                    double line18 = (double) b1 / a11;

                    String result16 = String.format("%.1f", line16);
                    String result17 = String.format("%.1f", line17);
                    String result18 = String.format("%.1f", line18);

                    String S20 = result16 + "    " + result17 + "        " + result18;
                    textView11.setText(S20);
                    String S21 = a21 + "     " + a22 + "       " + b2;
                    textView12.setText(S21);

                    String str6 = " Ответ: ";
                    textView13.setText(str6);
                    String str7 = " Система имеет множество решений: ";
                    textView14.setText(str7);
                    textView15.setText(" x1+" + result17 + "x2" + "=" + result18);

                    // Показываем и скрываем нужные и не нужные вывод результата
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.VISIBLE);
                    textView9.setVisibility(View.VISIBLE);
                    textView10.setVisibility(View.VISIBLE);
                    textView11.setVisibility(View.VISIBLE);
                    textView12.setVisibility(View.VISIBLE);
                    textView13.setVisibility(View.VISIBLE);
                    textView14.setVisibility(View.VISIBLE);
                    textView15.setVisibility(View.VISIBLE);
                    textView16.setVisibility(View.INVISIBLE);
                    textView17.setVisibility(View.INVISIBLE);
                    textView18.setVisibility(View.INVISIBLE);
                    textView19.setVisibility(View.INVISIBLE);
                    textView20.setVisibility(View.INVISIBLE);
                    textView21.setVisibility(View.INVISIBLE);
                    textView22.setVisibility(View.INVISIBLE);
                    textView23.setVisibility(View.INVISIBLE);
                    textView24.setVisibility(View.INVISIBLE);
                } else {    // Проверяем если пользователь заполнил матрицу положительными значениями
                    if (a11 > 0 && a12 > 0 && b1 > 0 && a21 > 0 && a22 > 0 && b2 > 0) {
                        // Показываем нужный вывод результата
                        textView7.setVisibility(View.VISIBLE);
                        textView8.setVisibility(View.VISIBLE);
                        textView9.setVisibility(View.VISIBLE);
                        textView10.setVisibility(View.VISIBLE);
                        textView11.setVisibility(View.VISIBLE);
                        textView12.setVisibility(View.VISIBLE);
                        textView13.setVisibility(View.VISIBLE);
                        textView14.setVisibility(View.VISIBLE);
                        textView15.setVisibility(View.VISIBLE);
                        textView16.setVisibility(View.VISIBLE);
                        textView17.setVisibility(View.VISIBLE);
                        textView18.setVisibility(View.VISIBLE);
                        textView19.setVisibility(View.VISIBLE);
                        textView20.setVisibility(View.VISIBLE);
                        textView21.setVisibility(View.VISIBLE);
                        textView22.setVisibility(View.VISIBLE);
                        textView23.setVisibility(View.VISIBLE);
                        textView24.setVisibility(View.VISIBLE);
                    }
                }
            }
        }
    }

    public void Clear3(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, TextView textView14, TextView textView15, TextView textView16, TextView textView18, TextView textView19, TextView textView20, TextView textView22, TextView textView23, TextView textView24, TextView textView26, TextView textView27, TextView textView28, TextView textView30, TextView textView31, TextView textView32, TextView textView34, TextView textView35, TextView textView36, TextView textView38, TextView textView39, TextView textView40, TextView textView42, TextView textView43, TextView textView44) {
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
        textView18.setText(null);
        textView19.setText(null);
        textView20.setText(null);
        textView22.setText(null);
        textView23.setText(null);
        textView24.setText(null);
        textView26.setText(null);
        textView27.setText(null);
        textView28.setText(null);
        textView30.setText(null);
        textView31.setText(null);
        textView32.setText(null);
        textView34.setText(null);
        textView35.setText(null);
        textView36.setText(null);
        textView38.setText(null);
        textView39.setText(null);
        textView40.setText(null);
        textView42.setText(null);
        textView43.setText(null);
        textView44.setText(null);
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


    public void Rast3(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView32, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView37, TextView textView38, TextView textView39, TextView textView40, TextView textView41, TextView textView42, TextView textView43, TextView textView44) {
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
        String S1 = a11 + "   " + a12 + "   " + a13 + "   " + b1;
        textView14.setText(S1);
        String S2 = a21 + "   " + a22 + "   " + a23 + "   " + b2;
        textView15.setText(S2);
        String S3 = a31 + "   " + a32 + "   " + a33 + "   " + b3;
        textView16.setText(S3);

        String str = "1-ую строку делим на " + a11;
        textView17.setText(str);

        // расчет деления 1 строки в матрице на а11
        double line1 = (double) a11 / a11;
        double line2 = (double) a12 / a11;
        double line3 = (double) a13 / a11;
        double line4 = (double) b1 / a11;

        String result1 = String.format("%.1f", line1);
        String result2 = String.format("%.1f", line2);
        String result3 = String.format("%.1f", line3);
        String result4 = String.format("%.1f", line4);

        // Вывод в матрицу деления 1 строки
        String S4 = result1 + "      " + result2 + "        " + result3 + "      " + result4;
        textView18.setText(S4);
        String S5 = a21 + "     " + a22 + "     " + a23 + "     " + b2;
        textView19.setText(S5);
        String S6 = a31 + "     " + a32 + "     " + a33 + "     " + b3;
        textView20.setText(S6);

        String str1 = "от 2 строки отнимаем 1 строку, умноженную на " + a21 + " от 3 строки отнимаем 1 строку, умноженную на " + a31;
        textView21.setText(str1);

        // расчет от 2 строки отнимаем 1 строку, умноженную на a21
        double line5 = (double) a21 - line1 * a21;
        double line6 = (double) a22 - line2 * a21;
        double line7 = (double) a23 - line3 * a21;
        double line8 = (double) b2 - line4 * a21;

        String result5 = String.format("%.1f", line5);
        String result6 = String.format("%.1f", line6);
        String result7 = String.format("%.1f", line7);
        String result8 = String.format("%.1f", line8);

        // расчет от 3 строки отнимаем 1 строку, умноженную на a31
        double line9 = (double) a31 - line1 * a31;
        double line10 = (float) a32 - line2 * a31;
        double line11 = (double) a33 - line3 * a31;
        double line12 = (double) b3 - line4 * a31;

        String result9 = String.format("%.1f", line9);
        String result10 = String.format("%.1f", line10);
        String result11 = String.format("%.1f", line11);
        String result12 = String.format("%.1f", line12);

        // Вывод результата вычисления в матрицу
        String S7 = result1 + "     " + result2 + "         " + result3 + "        " + result4;
        textView22.setText(S7);
        String S8 = result5 + "   " + result6 + "    " + result7 + "      " + result8;
        textView23.setText(S8);
        String S9 = result9 + "   " + result10 + "     " + result11 + "    " + result12;
        textView24.setText(S9);

        String str2 = "2-ую строку делим на " + result6;
        textView25.setText(str2);
        // расчет деления 2 строки в матрице на result6
        double line13 = (double) line5 / line6;
        double line14 = (double) line6 / line6;
        double line15 = (double) line7 / line6;
        double line16 = (double) line8 / line6;

        String result13 = String.format("%.1f", line13);
        String result14 = String.format("%.1f", line14);
        String result15 = String.format("%.1f", line15);
        String result16 = String.format("%.1f", line16);

        // Вывод в матрицу деления 2 строки
        String S10 = result1 + "     " + result2 + "       " + result3 + "       " + result4;
        textView26.setText(S10);
        String S11 = result13 + "   " + result14 + "       " + result15 + "       " + result16;
        textView27.setText(S11);
        String S12 = result9 + "   " + result10 + "   " + result11 + "   " + result12;
        textView28.setText(S12);

        String str3 = "от 1 строки отнимаем 2 строку, умноженную на " + result2 + " к 3 строке добавляем 2 строку, умноженную на " + result10;
        textView29.setText(str3);
        // расчет от 1 строки отнимаем 2 строку, умноженную на result2
        double line17 = (double) line1 - line13 * line2;
        double line18 = (double) line2 - line14 * line2;
        double line19 = (double) line3 - line15 * line2;
        double line20 = (double) line4 - line16 * line2;

        String result17 = String.format("%.1f", line17);
        String result18 = String.format("%.1f", line18);
        String result19 = String.format("%.1f", line19);
        String result20 = String.format("%.1f", line20);

        // расчет к 3 строке добавляем 2 строку, умноженную на result10
        double line21 = (double) line9 - line13 * line10;
        double line22 = (double) line10 - line14 * line10;
        double line23 = (double) line11 - line15 * line10;
        double line24 = (double) line12 - line16 * line10;

        String result21 = String.format("%.1f", line21);
        String result22 = String.format("%.1f", line22);
        String result23 = String.format("%.1f", line23);
        String result24 = String.format("%.1f", line24);

        // Вывод результата вычисления в матрицу
        String S13 = result17 + "   " + result18 + "    " + result19 + "     " + result20;
        textView30.setText(S13);
        String S14 = result13 + "   " + result14 + "   " + result15 + "     " + result16;
        textView31.setText(S14);
        String S15 = result21 + "   " + result22 + "   " + result23 + "   " + result24;
        textView32.setText(S15);


        String str4 = "3-ую строку делим на " + result23;
        textView33.setText(str4);
        // расчет деления 3 строки в матрице на result23
        double line25 = (double) line21 / line23;
        double line26 = (double) line22 / line23;
        double line27 = (double) line23 / line23;
        double line28 = (double) line24 / line23;

        String result25 = String.format("%.1f", line25);
        String result26 = String.format("%.1f", line26);
        String result27 = String.format("%.1f", line27);
        String result28 = String.format("%.1f", line28);

        // Вывод в матрицу деления 3 строки
        String S16 = result17 + "    " + result18 + "    " + result19 + "    " + result20;
        textView34.setText(S16);
        String S17 = result13 + "   " + result14 + "   " + result15 + "     " + result16;
        textView35.setText(S17);
        String S18 = result25 + "    " + result26 + "    " + result27 + "   " + result28;
        textView36.setText(S18);

        String str5 = "от 1 строки отнимаем 3 строку, умноженную на " + result19 + " к 3 строке добавляем 2 строку, умноженную на " + result15;
        textView37.setText(str5);
        // расчет от 1 строки отнимаем 3 строку, умноженную на result19
        double line29 = (double) line17 - line25 * line19;
        double line30 = (double) line18 - line26 * line19;
        double line31 = (double) line19 - line27 * line19;
        double line32 = (double) line20 - line28 * line19;

        String result29 = String.format("%.1f", line29);
        String result30 = String.format("%.1f", line30);
        String result31 = String.format("%.1f", line31);
        String result32 = String.format("%.1f", line32);

        // расчет к 3 строке добавляем 2 строку, умноженную на result15
        double line33 = (double) line13 - line25 * line15;
        double line34 = (double) line14 - line26 * line15;
        double line35 = (double) line15 - line27 * line15;
        double line36 = (double) line16 - line28 * line15;

        String result33 = String.format("%.1f", line33);
        String result34 = String.format("%.1f", line34);
        String result35 = String.format("%.1f", line35);
        String result36 = String.format("%.1f", line36);

        // Вывод результата вычисления в матрицу
        String S19 = result29 + "      " + result30 + "     " + result31 + "     " + result32;
        textView38.setText(S19);
        String S20 = result33 + "     " + result34 + "     " + result35 + "      " + result36;
        textView39.setText(S20);
        String S21 = result25 + "    " + result26 + "   " + result27 + "   " + result28;
        textView40.setText(S21);

        String str6 = " Ответ: ";
        textView41.setText(str6);
        String str7 = " X1 =  " + result32;
        textView42.setText(str7);
        String str8 = " X2 =   " + result36;
        textView43.setText(str8);
        String str9 = " X3 =   " + result28;
        textView44.setText(str9);

        // Делаем проверку если пользователь заполнил матрицу нулями
        if (a11 == 0 && a12 == 0 && a13 == 0 && b1 == 0 && a21 == 0 && a22 == 0 && a23 == 0 && b2 == 0 && a31 == 0 && a32 == 0 && a33 == 0 && b3 == 0) {
            textView13.setText("Перепишем систему уравнений в матричном виде");
            // Вывод общей матрицы
            String S67 = a11 + "   " + a12 + "   " + a13 + "   " + b1;
            textView14.setText(S67);
            String S68 = a21 + "   " + a22 + "   " + a23 + "   " + b2;
            textView15.setText(S68);
            String S69 = a31 + "   " + a32 + "   " + a33 + "   " + b3;
            textView16.setText(S69);

            String str26 = " Ответ: ";
            textView17.setText(str26);
            String str27 = " Система имеет множество решений: ";
            textView18.setText(str27);
            textView19.setText(a13 + " = " + b1 + "  " + a23 + " = " + b2 + "  " + a33 + " = " + b3);

            // Скрываем не нужный вывод результата
            textView20.setVisibility(View.INVISIBLE);
            textView21.setVisibility(View.INVISIBLE);
            textView22.setVisibility(View.INVISIBLE);
            textView23.setVisibility(View.INVISIBLE);
            textView24.setVisibility(View.INVISIBLE);
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
            textView44.setVisibility(View.INVISIBLE);
        } else {
            // Проверяем если пользователь заполнил 1 строку нулями
            if (a11 == 0 && a12 == 0 && a13 == 0 && b1 == 0) {
                String str10 = "поменяем 1-ую строку и 2-ую строку местами ";
                textView17.setText(str10);
                String S22 = a21 + "      " + a22 + "       " + a23 + "       " + b2;
                textView18.setText(S22);
                String S23 = a11 + "     " + a12 + "       " + a13 + "       " + b1;
                textView19.setText(S23);
                String S24 = a31 + "     " + a32 + "       " + a33 + "       " + b3;
                textView20.setText(S24);

                String str11 = "1-ую строку делим на " + a11;
                textView21.setText(str11);
                // расчет деления 1 строки в матрице на a31
                double line37 = (double) a21 / a21;
                double line38 = (double) a22 / a21;
                double line39 = (double) a23 / a21;
                double line40 = (double) b2 / a21;

                String result37 = String.format("%.1f", line37);
                String result38 = String.format("%.1f", line38);
                String result39 = String.format("%.1f", line39);
                String result40 = String.format("%.1f", line40);

                // Вывод в матрицу деления 1 строки
                String S25 = result37 + "    " + result38 + "         " + result39 + "          " + result40;
                textView22.setText(S25);
                String S26 = a11 + "     " + a12 + "         " + a13 + "        " + b1;
                textView23.setText(S26);
                String S27 = a31 + "     " + a32 + "       " + a33 + "       " + b3;
                textView24.setText(S27);

                String str12 = "от 3 строки отнимаем 1 строку, умноженную на " + a31;
                textView25.setText(str12);
                // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                double line41 = (double) a31 - line37 * a31;
                double line42 = (double) a32 - line38 * a31;
                double line43 = (double) a33 - line39 * a31;
                double line44 = (double) b3 - line40 * a31;

                String result41 = String.format("%.1f", line41);
                String result42 = String.format("%.1f", line42);
                String result43 = String.format("%.1f", line43);
                String result44 = String.format("%.1f", line44);

                // Вывод результата вычисления в матрицу
                String S28 = result37 + "    " + result38 + "        " + result39 + "           " + result40;
                textView26.setText(S28);
                String S29 = a11 + "     " + a12 + "       " + a13 + "         " + b1;
                textView27.setText(S29);
                String S30 = result41 + "     " + result42 + "      " + result43 + "       " + result44;
                textView28.setText(S30);

                String str13 = "поменяем 2-ую строку и 3-ую строку местами ";
                textView29.setText(str13);
                // Вывод результата перемещения 2 и 3 строки в матрице
                String S31 = result37 + "    " + result38 + "        " + result39 + "        " + result40;
                textView30.setText(S31);
                String S32 = result41 + "     " + result42 + "      " + result43 + "     " + result44;
                textView31.setText(S32);
                String S33 = a11 + "     " + a12 + "       " + a13 + "       " + b1;
                textView32.setText(S33);

                String str14 = "2-ую строку делим на " + result42;
                textView33.setText(str14);
                // расчет деления 2 строки в матрице на result42
                double line45 = (double) line41 / line42;
                double line46 = (double) line42 / line42;
                double line47 = (double) line43 / line42;
                double line48 = (double) line44 / line42;

                String result45 = String.format("%.1f", line45);
                String result46 = String.format("%.1f", line46);
                String result47 = String.format("%.1f", line47);
                String result48 = String.format("%.1f", line48);

                // Вывод в матрицу деления 2 строки
                String S34 = result37 + "     " + result38 + "        " + result39 + "       " + result40;
                textView34.setText(S34);
                String S35 = result45 + "      " + result46 + "       " + result47 + "       " + result48;
                textView35.setText(S35);
                String S36 = a11 + "     " + a12 + "       " + a13 + "       " + b1;
                textView36.setText(S36);

                String str15 = "от 1 строки отнимаем 2 строку, умноженную на " + result38;
                textView37.setText(str15);
                // расчет от 1 строки отнимаем 2 строку, умноженную на result38
                double line49 = (double) line37 - line45 * line38;
                double line50 = (double) line38 - line46 * line38;
                double line51 = (double) line39 - line47 * line38;
                double line52 = (double) line40 - line48 * line38;

                String result49 = String.format("%.1f", line49);
                String result50 = String.format("%.1f", line50);
                String result51 = String.format("%.1f", line51);
                String result52 = String.format("%.1f", line52);

                // Вывод результата вычисления в матрицу
                String S37 = result49 + "     " + result50 + "         " + result51 + "      " + result52;
                textView38.setText(S37);
                String S38 = result45 + "      " + result46 + "        " + result47 + "      " + result48;
                textView39.setText(S38);
                String S39 = a11 + "     " + a12 + "       " + a13 + "       " + b1;
                textView40.setText(S39);


                String str16 = " Ответ: ";
                textView41.setText(str16);
                String str17 = " Система имеет множество решений: ";
                textView42.setText(str17);
                textView43.setText(" x1 -  " + result51 + "x3" + " = " + result52);
                textView44.setText(" x2 +  " + result47 + "x3" + " = " + result48);

                textView13.setVisibility(View.VISIBLE);
                textView14.setVisibility(View.VISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView16.setVisibility(View.VISIBLE);
                textView17.setVisibility(View.VISIBLE);
                textView18.setVisibility(View.VISIBLE);
                textView19.setVisibility(View.VISIBLE);
                textView20.setVisibility(View.VISIBLE);
                textView21.setVisibility(View.VISIBLE);
                textView22.setVisibility(View.VISIBLE);
                textView23.setVisibility(View.VISIBLE);
                textView24.setVisibility(View.VISIBLE);
                textView24.setVisibility(View.VISIBLE);
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
                textView44.setVisibility(View.VISIBLE);
            } else {
                // Проверяем если пользователь заполнил 2 строку нулями
                if (a21 == 0 && a22 == 0 && a23 == 0 && b2 == 0) {

                    String str18 = "1-ую строку делим на " + a11;
                    textView17.setText(str18);
                    // расчет деления 1 строки в матрице на a11
                    double line53 = (double) a11 / a11;
                    double line54 = (double) a12 / a11;
                    double line55 = (double) a13 / a11;
                    double line56 = (double) b1 / a11;

                    String result53 = String.format("%.1f", line53);
                    String result54 = String.format("%.1f", line54);
                    String result55 = String.format("%.1f", line55);
                    String result56 = String.format("%.1f", line56);

                    // Вывод в матрицу деления 1 строки
                    String S40 = result53 + "    " + result54 + "        " + result55 + "        " + result56;
                    textView18.setText(S40);
                    String S41 = a21 + "     " + a22 + "       " + a23 + "       " + b2;
                    textView19.setText(S41);
                    String S42 = a31 + "     " + a32 + "       " + a33 + "       " + b3;
                    textView20.setText(S42);

                    String str19 = "от 3 строки отнимаем 1 строку, умноженную на " + a31;
                    textView21.setText(str19);
                    // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                    double line57 = (double) a31 - line53 * a31;
                    double line58 = (double) a32 - line54 * a31;
                    double line59 = (double) a33 - line55 * a31;
                    double line60 = (double) b3 - line56 * a31;

                    String result57 = String.format("%.1f", line57);
                    String result58 = String.format("%.1f", line58);
                    String result59 = String.format("%.1f", line59);
                    String result60 = String.format("%.1f", line60);

                    // Вывод результата вычисления в матрицу
                    String S43 = result53 + "    " + result54 + "        " + result55 + "        " + result56;
                    textView22.setText(S43);
                    String S44 = a21 + "     " + a22 + "       " + a23 + "       " + b2;
                    textView23.setText(S44);
                    String S45 = result57 + "     " + result58 + "       " + result59 + "       " + result60;
                    textView24.setText(S45);

                    String str20 = "поменяем 2-ую строку и 3-ую строку местами ";
                    textView25.setText(str20);
                    // Вывод результата перемещения 2 и 3 строки в матрице
                    String S46 = result53 + "    " + result54 + "        " + result55 + "        " + result56;
                    textView26.setText(S46);
                    String S47 = result57 + "     " + result58 + "       " + result59 + "       " + result60;
                    textView27.setText(S47);
                    String S48 = a21 + "     " + a22 + "       " + a23 + "       " + b2;
                    textView28.setText(S48);

                    String str21 = "2-ую строку делим на " + result58;
                    textView29.setText(str21);
                    // расчет деления 2 строки в матрице на result58
                    double line61 = (double) line57 / line58;
                    double line62 = (double) line58 / line58;
                    double line63 = (double) line59 / line58;
                    double line64 = (double) line60 / line58;

                    String result61 = String.format("%.1f", line61);
                    String result62 = String.format("%.1f", line62);
                    String result63 = String.format("%.1f", line63);
                    String result64 = String.format("%.1f", line64);

                    // Вывод в матрицу деления 2 строки
                    String S49 = result53 + "    " + result54 + "        " + result55 + "        " + result56;
                    textView30.setText(S49);
                    String S50 = result61 + "     " + result62 + "       " + result63 + "       " + result64;
                    textView31.setText(S50);
                    String S51 = a21 + "     " + a22 + "       " + a23 + "       " + b2;
                    textView32.setText(S51);

                    String str22 = "от 1 строки отнимаем 2 строку, умноженную на " + result54;
                    textView33.setText(str22);
                    // расчет от 1 строки отнимаем 2 строку, умноженную на result54
                    double line65 = (double) line53 - line61 * line54;
                    double line66 = (double) line54 - line62 * line54;
                    double line67 = (double) line55 - line63 * line54;
                    double line68 = (double) line56 - line64 * line54;

                    String result65 = String.format("%.1f", line65);
                    String result66 = String.format("%.1f", line66);
                    String result67 = String.format("%.1f", line67);
                    String result68 = String.format("%.1f", line68);

                    // Вывод результата вычисления в матрицу
                    String S52 = result65 + "    " + result66 + "        " + result67 + "        " + result68;
                    textView34.setText(S52);
                    String S53 = result61 + "     " + result62 + "       " + result63 + "       " + result64;
                    textView35.setText(S53);
                    String S54 = a21 + "     " + a22 + "       " + a23 + "       " + b2;
                    textView36.setText(S54);

                    String str23 = " Ответ: ";
                    textView37.setText(str23);
                    String str24 = " Система имеет множество решений: ";
                    textView38.setText(str24);
                    textView39.setText(" x1 -  " + result67 + "x3" + " = " + result68);
                    textView40.setText(" x2 +  " + result63 + "x3" + " = " + result64);

                    // Скрываем не нужный вывод результата
                    textView41.setVisibility(View.INVISIBLE);
                    textView42.setVisibility(View.INVISIBLE);
                    textView43.setVisibility(View.INVISIBLE);
                    textView44.setVisibility(View.INVISIBLE);
                } else {
                    // Проверяем если пользователь заполнил 3 строку нулями
                    if (a31 == 0 && a32 == 0 && a33 == 0 && b3 == 0) {

                        String str25 = "1-ую строку делим на " + a11;
                        textView17.setText(str25);
                        // расчет деления 1 строки в матрице на a11
                        double line69 = (double) a11 / a11;
                        double line70 = (double) a12 / a11;
                        double line71 = (double) a13 / a11;
                        double line72 = (double) b1 / a11;

                        String result69 = String.format("%.1f", line69);
                        String result70 = String.format("%.1f", line70);
                        String result71 = String.format("%.1f", line71);
                        String result72 = String.format("%.1f", line72);

                        // Вывод в матрицу деления 1 строки
                        String S55 = result69 + "    " + result70 + "        " + result71 + "        " + result72;
                        textView18.setText(S55);
                        String S56 = a21 + "     " + a22 + "       " + a23 + "       " + b2;
                        textView19.setText(S56);
                        String S57 = a31 + "     " + a32 + "       " + a33 + "       " + b3;
                        textView20.setText(S57);

                        String str26 = "от 2 строки отнимаем 1 строку, умноженную на " + a21;
                        textView21.setText(str26);
                        // расчет от 2 строки отнимаем 1 строку, умноженную на a21
                        double line73 = (double) a21 - line69 * a21;
                        double line74 = (double) a22 - line70 * a21;
                        double line75 = (double) a23 - line71 * a21;
                        double line76 = (double) b2 - line72 * a21;

                        String result73 = String.format("%.1f", line73);
                        String result74 = String.format("%.1f", line74);
                        String result75 = String.format("%.1f", line75);
                        String result76 = String.format("%.1f", line76);

                        // Вывод результата вычисления в матрицу
                        String S58 = result69 + "    " + result70 + "        " + result71 + "        " + result72;
                        textView22.setText(S58);
                        String S59 = result73 + "     " + result74 + "       " + result75 + "       " + result76;
                        textView23.setText(S59);
                        String S60 = a31 + "     " + a32 + "       " + a33 + "       " + b3;
                        textView24.setText(S60);

                        String str27 = "2-ую строку делим на " + result74;
                        textView25.setText(str27);
                        // расчет деления 2 строки в матрице на result74
                        double line77 = (double) line73 / line74;
                        double line78 = (double) line74 / line74;
                        double line79 = (double) line75 / line74;
                        double line80 = (double) line76 / line74;

                        String result77 = String.format("%.1f", line77);
                        String result78 = String.format("%.1f", line78);
                        String result79 = String.format("%.1f", line79);
                        String result90 = String.format("%.1f", line80);

                        // Вывод в матрицу деления 2 строки
                        String S61 = result69 + "    " + result70 + "        " + result71 + "        " + result72;
                        textView26.setText(S61);
                        String S62 = result77 + "     " + result78 + "       " + result79 + "       " + result90;
                        textView27.setText(S62);
                        String S63 = a31 + "     " + a32 + "       " + a33 + "       " + b3;
                        textView28.setText(S63);

                        String str28 = "от 1 строки отнимаем 2 строку, умноженную на " + result70;
                        textView29.setText(str28);
                        // расчет от 1 строки отнимаем 2 строку, умноженную на result70
                        double line81 = (double) line69 - line77 * line70;
                        double line82 = (double) line70 - line78 * line70;
                        double line83 = (double) line71 - line79 * line70;
                        double line84 = (double) line72 - line80 * line70;

                        String result81 = String.format("%.1f", line81);
                        String result82 = String.format("%.1f", line82);
                        String result83 = String.format("%.1f", line83);
                        String result84 = String.format("%.1f", line84);

                        // Вывод результата вычисления в матрицу
                        String S64 = result81 + "    " + result82 + "        " + result83 + "        " + result84;
                        textView30.setText(S64);
                        String S65 = result77 + "     " + result78 + "       " + result79 + "       " + result90;
                        textView31.setText(S65);
                        String S66 = a31 + "     " + a32 + "       " + a33 + "       " + b3;
                        textView32.setText(S66);

                        String str23 = " Ответ: ";
                        textView33.setText(str23);
                        String str24 = " Система имеет множество решений: ";
                        textView34.setText(str24);
                        textView35.setText(" x1 +  " + result83 + "x3" + " = " + result84);
                        textView36.setText(" x2 +  " + result79 + "x3" + " = " + result90);

                        // Скрываем не нужный вывод результата
                        textView37.setVisibility(View.INVISIBLE);
                        textView38.setVisibility(View.INVISIBLE);
                        textView39.setVisibility(View.INVISIBLE);
                        textView40.setVisibility(View.INVISIBLE);
                        textView41.setVisibility(View.INVISIBLE);
                        textView42.setVisibility(View.INVISIBLE);
                        textView43.setVisibility(View.INVISIBLE);
                        textView44.setVisibility(View.INVISIBLE);
                    } else {
                        // Проверяем если пользователь заполнил матрицу положительными значениями
                        if (a11 > 0 && a12 > 0 && a13 > 0 && b1 > 0 && a21 > 0 && a22 > 0 && a23 > 0 && b2 > 0 && a31 > 0 && a32 > 0 && a33 > 0 && b3 > 0) {
                            // Показываем нужныей вывод результата
                            textView13.setVisibility(View.VISIBLE);
                            textView14.setVisibility(View.VISIBLE);
                            textView15.setVisibility(View.VISIBLE);
                            textView16.setVisibility(View.VISIBLE);
                            textView17.setVisibility(View.VISIBLE);
                            textView18.setVisibility(View.VISIBLE);
                            textView19.setVisibility(View.VISIBLE);
                            textView20.setVisibility(View.VISIBLE);
                            textView21.setVisibility(View.VISIBLE);
                            textView22.setVisibility(View.VISIBLE);
                            textView23.setVisibility(View.VISIBLE);
                            textView24.setVisibility(View.VISIBLE);
                            textView24.setVisibility(View.VISIBLE);
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
                            textView44.setVisibility(View.VISIBLE);
                        }
                    }
                }
            }
        }
    }


    public void Clear4(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView32, TextView textView33, TextView textView34, TextView textView35, TextView textView37, TextView textView38, TextView textView39, TextView textView40, TextView textView42, TextView textView43, TextView textView44, TextView textView45, TextView textView47, TextView textView48, TextView textView49, TextView textView50, TextView textView52, TextView textView53, TextView textView54, TextView textView55, TextView textView57, TextView textView58, TextView textView59, TextView textView60, TextView textView62, TextView textView63, TextView textView64, TextView textView65, TextView textView67, TextView textView68, TextView textView69, TextView textView70, TextView textView72, TextView textView73, TextView textView74, TextView textView75) {
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

        textView22.setText(null);
        textView23.setText(null);
        textView24.setText(null);
        textView25.setText(null);
        textView27.setText(null);
        textView28.setText(null);
        textView29.setText(null);
        textView30.setText(null);
        textView32.setText(null);
        textView33.setText(null);
        textView34.setText(null);
        textView35.setText(null);
        textView37.setText(null);
        textView38.setText(null);
        textView39.setText(null);
        textView40.setText(null);
        textView42.setText(null);
        textView43.setText(null);
        textView44.setText(null);
        textView45.setText(null);
        textView47.setText(null);
        textView48.setText(null);
        textView49.setText(null);
        textView50.setText(null);
        textView52.setText(null);
        textView53.setText(null);
        textView54.setText(null);
        textView55.setText(null);
        textView57.setText(null);
        textView58.setText(null);
        textView59.setText(null);
        textView60.setText(null);
        textView62.setText(null);
        textView63.setText(null);
        textView64.setText(null);
        textView65.setText(null);
        textView67.setText(null);
        textView68.setText(null);
        textView69.setText(null);
        textView70.setText(null);
        textView72.setText(null);
        textView73.setText(null);
        textView74.setText(null);
        textView75.setText(null);
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


    public void Rast4(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView32, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView37, TextView textView38, TextView textView39, TextView textView40, TextView textView41, TextView textView42, TextView textView43, TextView textView44, TextView textView45, TextView textView46, TextView textView47, TextView textView48, TextView textView49, TextView textView50, TextView textView51, TextView textView52, TextView textView53, TextView textView54, TextView textView55, TextView textView56, TextView textView57, TextView textView58, TextView textView59, TextView textView60, TextView textView61, TextView textView62, TextView textView63, TextView textView64, TextView textView65, TextView textView66, TextView textView67, TextView textView68, TextView textView69, TextView textView70, TextView textView71, TextView textView72, TextView textView73, TextView textView74, TextView textView75) {
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

        textView21.setText("Перепишем систему уравнений в матричном виде");

        // Вывод общей матрицы
        String S1 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
        textView22.setText(S1);
        String S2 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
        textView23.setText(S2);
        String S3 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
        textView24.setText(S3);
        String S4 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + b4;
        textView25.setText(S4);

        String str = "1-ую строку делим на " + a11;
        textView26.setText(str);

        // расчет деления 1 строки в матрице на а11
        double line1 = (double) a11 / a11;
        double line2 = (double) a12 / a11;
        double line3 = (double) a13 / a11;
        double line4 = (double) a14 / a11;
        double line5 = (double) b1 / a11;

        String result1 = String.format("%.1f", line1);
        String result2 = String.format("%.1f", line2);
        String result3 = String.format("%.1f", line3);
        String result4 = String.format("%.1f", line4);
        String result5 = String.format("%.1f", line5);

        // вывод деления 1 строки в матрице на а11
        String S5 = result1 + "    " + result2 + "      " + result3 + "    " + result4 + "      " + result5;
        textView27.setText(S5);
        String S6 = a21 + "   " + a22 + "    " + a23 + "   " + a24 + "     " + b2;
        textView28.setText(S6);
        String S7 = a31 + "   " + a32 + "    " + a33 + "   " + a34 + "     " + b3;
        textView29.setText(S7);
        String S8 = a41 + "   " + a42 + "    " + a43 + "   " + a44 + "     " + b4;
        textView30.setText(S8);

        String str1 = "от 2 строки отнимаем 1 строку, умноженную на " + a21 + " от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 4 строки отнимаем 1 строку, умноженную на " + a41;
        textView31.setText(str1);

        // расчет от 2 строки отнимаем 1 строку, умноженную на a21
        double line6 = (double) a21 - line1 * a21;
        double line7 = (double) a22 - line2 * a21;
        double line8 = (double) a23 - line3 * a21;
        double line9 = (double) a24 - line4 * a21;
        double line10 = (double) b2 - line5 * a21;

        String result6 = String.format("%.1f", line6);
        String result7 = String.format("%.1f", line7);
        String result8 = String.format("%.1f", line8);
        String result9 = String.format("%.1f", line9);
        String result10 = String.format("%.1f", line10);

        // расчет от 3 строки отнимаем 1 строку, умноженную на a31
        double line11 = (double) a31 - line1 * a31;
        double line12 = (double) a32 - line2 * a31;
        double line13 = (double) a33 - line3 * a31;
        double line14 = (double) a34 - line4 * a31;
        double line15 = (double) b3 - line5 * a31;

        String result11 = String.format("%.1f", line11);
        String result12 = String.format("%.1f", line12);
        String result13 = String.format("%.1f", line13);
        String result14 = String.format("%.1f", line14);
        String result15 = String.format("%.1f", line15);

        // расчет от 4 строки отнимаем 1 строку, умноженную на a41
        double line16 = (double) a41 - line1 * a41;
        double line17 = (double) a42 - line2 * a41;
        double line18 = (double) a43 - line3 * a41;
        double line19 = (double) a44 - line4 * a41;
        double line20 = (double) b4 - line5 * a41;

        String result16 = String.format("%.1f", line16);
        String result17 = String.format("%.1f", line17);
        String result18 = String.format("%.1f", line18);
        String result19 = String.format("%.1f", line19);
        String result20 = String.format("%.1f", line20);

        // Вывод результата вычисления в матрицу
        String S9 = result1 + "    " + result2 + "    " + result3 + "   " + result4 + "  " + result5;
        textView32.setText(S9);
        String S10 = result6 + "   " + result7 + "    " + result8 + "   " + result9 + "   " + result10;
        textView33.setText(S10);
        String S11 = result11 + "   " + result12 + "  " + result13 + "   " + result14 + "  " + result15;
        textView34.setText(S11);
        String S12 = result16 + "   " + result17 + "  " + result18 + "   " + result19 + "  " + result20;
        textView35.setText(S12);

        String str2 = "2-ую строку делим на " + result7;
        textView36.setText(str2);

        // расчет деления 2 строки в матрице на result7
        double line21 = (double) line6 / line7;
        double line22 = (double) line7 / line7;
        double line23 = (double) line8 / line7;
        double line24 = (double) line9 / line7;
        double line25 = (double) line10 / line7;

        String result21 = String.format("%.1f", line21);
        String result22 = String.format("%.1f", line22);
        String result23 = String.format("%.1f", line23);
        String result24 = String.format("%.1f", line24);
        String result25 = String.format("%.1f", line25);

        // Вывод в матрицу деления 2 строки
        String S13 = result1 + "   " + result2 + "    " + result3 + "   " + result4 + "    " + result5;
        textView37.setText(S13);
        String S14 = result21 + "   " + result22 + "    " + result23 + "   " + result24 + "    " + result25;
        textView38.setText(S14);
        String S15 = result11 + "   " + result12 + "    " + result13 + "   " + result14 + "    " + result15;
        textView39.setText(S15);
        String S16 = result16 + "   " + result17 + "    " + result18 + "   " + result19 + "    " + result20;
        textView40.setText(S16);

        String str3 = "от 1 строки отнимаем 2 строку, умноженную на " + result2 + " от 3 строки отнимаем 2 строку, умноженную на " + result12 + " от 4 строки отнимаем 2 строку, умноженную на " + result17;
        textView41.setText(str3);

        // расчет от 1 строки отнимаем 2 строку, умноженную на result2
        double line26 = (double) line1 - line21 * line2;
        double line27 = (double) line2 - line22 * line2;
        double line28 = (double) line3 - line23 * line2;
        double line29 = (double) line4 - line24 * line2;
        double line30 = (double) line5 - line25 * line2;

        String result26 = String.format("%.1f", line26);
        String result27 = String.format("%.1f", line27);
        String result28 = String.format("%.1f", line28);
        String result29 = String.format("%.1f", line29);
        String result30 = String.format("%.1f", line30);

        // расчет от 3 строки отнимаем 2 строку, умноженную на result12
        double line31 = (double) line11 - line21 * line12;
        double line32 = (double) line12 - line22 * line12;
        double line33 = (double) line13 - line23 * line12;
        double line34 = (double) line14 - line24 * line12;
        double line35 = (double) line15 - line25 * line12;

        String result31 = String.format("%.1f", line31);
        String result32 = String.format("%.1f", line32);
        String result33 = String.format("%.1f", line33);
        String result34 = String.format("%.1f", line34);
        String result35 = String.format("%.1f", line35);

        // расчет от 4 строки отнимаем 2 строку, умноженную на result17
        double line36 = (double) line16 - line21 * line17;
        double line37 = (double) line17 - line22 * line17;
        double line38 = (double) line18 - line23 * line17;
        double line39 = (double) line19 - line24 * line17;
        double line40 = (double) line20 - line25 * line17;

        String result36 = String.format("%.1f", line36);
        String result37 = String.format("%.1f", line37);
        String result38 = String.format("%.1f", line38);
        String result39 = String.format("%.1f", line39);
        String result40 = String.format("%.1f", line40);

        // Вывод результата вычисления в матрицу
        String S17 = result26 + "   " + result27 + "    " + result28 + "   " + result29 + "    " + result30;
        textView42.setText(S17);
        String S18 = result21 + "   " + result22 + "    " + result23 + "   " + result24 + "    " + result25;
        textView43.setText(S18);
        String S19 = result31 + "   " + result32 + "    " + result33 + "   " + result34 + "    " + result35;
        textView44.setText(S19);
        String S20 = result36 + "   " + result37 + "    " + result38 + "   " + result39 + "    " + result40;
        textView45.setText(S20);


        String str4 = "3-ую строку делим на " + result33;
        textView46.setText(str4);

        // расчет деления 3 строки в матрице на result33
        double line41 = (double) line31 / line33;
        double line42 = (double) line32 / line33;
        double line43 = (double) line33 / line33;
        double line44 = (double) line34 / line33;
        double line45 = (double) line35 / line33;

        String result41 = String.format("%.1f", line41);
        String result42 = String.format("%.1f", line42);
        String result43 = String.format("%.1f", line43);
        String result44 = String.format("%.1f", line44);
        String result45 = String.format("%.1f", line45);

        // Вывод в матрицу деления 3 строки
        String S21 = result26 + "   " + result27 + "    " + result28 + "   " + result29 + "    " + result30;
        textView47.setText(S21);
        String S22 = result21 + "   " + result22 + "    " + result23 + "   " + result24 + "    " + result25;
        textView48.setText(S22);
        String S23 = result41 + "   " + result42 + "    " + result43 + "   " + result44 + "    " + result45;
        textView49.setText(S23);
        String S24 = result36 + "   " + result37 + "    " + result38 + "   " + result39 + "    " + result40;
        textView50.setText(S24);

        String str5 = "от 2 строки отнимаем 3 строку, умноженную на " + result23 + " к 4 строки добавляем 3 строку, умноженную на " + result38;
        textView51.setText(str5);

        // расчет от 1 строки отнимаем 3 строку, умноженную на result23
        double line46 = (double) line26 + line41 * line33;
        double line47 = (double) line27 + line42 * line33;
        double line48 = (double) line28 + line43 * line33;
        double line49 = (double) line29 + line44 * line33;
        double line50 = (double) line30 + line45 * line33;

        String result46 = String.format("%.1f", line46);
        String result47 = String.format("%.1f", line47);
        String result48 = String.format("%.1f", line48);
        String result49 = String.format("%.1f", line49);
        String result50 = String.format("%.1f", line50);

        // расчет к 4 строки добавляем 3 строку, умноженную на result38
        double line51 = (double) line21 - line41 * line23;
        double line52 = (double) line22 - line42 * line23;
        double line53 = (double) line23 - line43 * line23;
        double line54 = (double) line24 - line44 * line23;
        double line55 = (double) line25 - line45 * line23;

        String result51 = String.format("%.1f", line51);
        String result52 = String.format("%.1f", line52);
        String result53 = String.format("%.1f", line53);
        String result54 = String.format("%.1f", line54);
        String result55 = String.format("%.1f", line55);

        double line56 = (double) line36 - line41 * line38;
        double line57 = (double) line37 - line42 * line38;
        double line58 = (double) line38 - line43 * line38;
        double line59 = (double) line39 - line44 * line38;
        double line60 = (double) line40 - line45 * line38;

        String result56 = String.format("%.1f", line56);
        String result57 = String.format("%.1f", line57);
        String result58 = String.format("%.1f", line58);
        String result59 = String.format("%.1f", line59);
        String result60 = String.format("%.1f", line60);

        // Вывод результата вычисления в матрицу
        String S25 = result26 + "   " + result27 + "    " + result28 + "   " + result29 + "    " + result30;
        textView52.setText(S25);
        String S26 = result51 + "   " + result52 + "    " + result53 + "   " + result54 + "    " + result55;
        textView53.setText(S26);
        String S27 = result41 + "   " + result42 + "    " + result43 + "   " + result44 + "    " + result45;
        textView54.setText(S27);
        String S28 = result56 + "   " + result57 + "    " + result58 + "   " + result59 + "    " + result60;
        textView55.setText(S28);

        String str6 = "4-ую строку делим на " + result59;
        textView56.setText(str6);

        // расчет деления 4 строки в матрице на result59
        double line61 = (double) line56 / line59;
        double line62 = (double) line57 / line59;
        double line63 = (double) line58 / line59;
        double line64 = (double) line59 / line59;
        double line65 = (double) line60 / line59;

        String result61 = String.format("%.1f", line61);
        String result62 = String.format("%.1f", line62);
        String result63 = String.format("%.1f", line63);
        String result64 = String.format("%.1f", line64);
        String result65 = String.format("%.1f", line65);

        // Вывод в матрицу деления 4 строки
        String S29 = result26 + "   " + result27 + "    " + result28 + "   " + result29 + "    " + result30;
        textView57.setText(S29);
        String S30 = result51 + "   " + result52 + "    " + result53 + "   " + result54 + "    " + result55;
        textView58.setText(S30);
        String S31 = result41 + "   " + result42 + "    " + result43 + "   " + result44 + "    " + result45;
        textView59.setText(S31);
        String S32 = result61 + "   " + result62 + "    " + result63 + "   " + result64 + "    " + result65;
        textView60.setText(S32);

        String str7 = "от 1 строки отнимаем 4 строку, умноженную на " + result29 + " от 2 строки отнимаем 4 строку, умноженную на " + result54 + " к 3 строки добавляем 4 строку, умноженную на " + result44;
        textView61.setText(str7);

        // расчет от 1 строки отнимаем 4 строку, умноженную на result29
        double line66 = (double) line26 - line61 * line29;
        double line67 = (double) line27 - line62 * line29;
        double line68 = (double) line28 - line63 * line29;
        double line69 = (double) line29 - line64 * line29;
        double line70 = (double) line30 - line65 * line29;

        String result66 = String.format("%.1f", line66);
        String result67 = String.format("%.1f", line67);
        String result68 = String.format("%.1f", line68);
        String result69 = String.format("%.1f", line69);
        String result70 = String.format("%.1f", line70);

        // расчет от 2 строки отнимаем 4 строку, умноженную на result54
        double line71 = (double) line51 - line61 * line54;
        double line72 = (double) line52 - line62 * line54;
        double line73 = (double) line53 - line63 * line54;
        double line74 = (double) line54 - line64 * line54;
        double line75 = (double) line55 - line65 * line54;

        String result71 = String.format("%.1f", line71);
        String result72 = String.format("%.1f", line72);
        String result73 = String.format("%.1f", line73);
        String result74 = String.format("%.1f", line74);
        String result75 = String.format("%.1f", line75);

        // расчет к 3 строки добавляем 4 строку, умноженную на result44;
        double line76 = (double) line41 - line61 * line44;
        double line77 = (double) line42 - line62 * line44;
        double line78 = (double) line43 - line63 * line44;
        double line79 = (double) line44 - line64 * line44;
        double line80 = (double) line45 - line65 * line44;

        String result76 = String.format("%.1f", line76);
        String result77 = String.format("%.1f", line77);
        String result78 = String.format("%.1f", line78);
        String result79 = String.format("%.1f", line79);
        String result80 = String.format("%.1f", line80);

        // Вывод результата вычисления в матрицу
        String S33 = result66 + "   " + result67 + "    " + result68 + "   " + result69 + "    " + result70;
        textView62.setText(S33);
        String S34 = result71 + "   " + result72 + "    " + result73 + "   " + result74 + "    " + result75;
        textView63.setText(S34);
        String S35 = result76 + "   " + result77 + "    " + result78 + "   " + result79 + "    " + result80;
        textView64.setText(S35);
        String S36 = result61 + "   " + result62 + "    " + result63 + "   " + result64 + "    " + result65;
        textView65.setText(S36);

        String str8 = " Ответ: ";
        textView66.setText(str8);
        String str9 = " X1 = " + result70;
        textView67.setText(str9);
        String str10 = " X2 = " + result75;
        textView68.setText(str10);
        String str11 = " X3 = " + result80;
        textView69.setText(str11);
        String str12 = " X4 = " + result65;
        textView70.setText(str12);

        // Скрываем не нужный вывод результата
        textView71.setVisibility(View.INVISIBLE);
        textView72.setVisibility(View.INVISIBLE);
        textView73.setVisibility(View.INVISIBLE);
        textView74.setVisibility(View.INVISIBLE);
        textView75.setVisibility(View.INVISIBLE);

        // Делаем проверку если пользователь заполнил матрицу нулями
        if (a11 == 0 && a12 == 0 && a13 == 0 && a14 == 0 && b1 == 0 && a21 == 0 && a22 == 0 && a23 == 0 && a24 == 0 && b2 == 0 && a31 == 0 && a32 == 0 && a33 == 0 && a34 == 0 && b3 == 0 && a41 == 0 && a42 == 0 && a43 == 0 && a44 == 0 && b4 == 0) {

            // Вывод общей матрицы
            String S161 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
            textView22.setText(S161);
            String S162 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
            textView23.setText(S162);
            String S163 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
            textView24.setText(S163);
            String S164 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + b4;
            textView25.setText(S164);

            String str50 = " Ответ: ";
            textView26.setText(str50);
            String str51 = " Система имеет множество решений: ";
            textView27.setText(str51);
            textView28.setText(a14 + " = " + b1 + "  " + a24 + " = " + b2 + "  " + a34 + " = " + b3 + "  " + a44 + " = " + b4);

            // Скрываем не нужный вывод результата
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
            textView44.setVisibility(View.INVISIBLE);
            textView45.setVisibility(View.INVISIBLE);
            textView46.setVisibility(View.INVISIBLE);
            textView47.setVisibility(View.INVISIBLE);
            textView48.setVisibility(View.INVISIBLE);
            textView49.setVisibility(View.INVISIBLE);
            textView50.setVisibility(View.INVISIBLE);
            textView51.setVisibility(View.INVISIBLE);
            textView52.setVisibility(View.INVISIBLE);
            textView53.setVisibility(View.INVISIBLE);
            textView54.setVisibility(View.INVISIBLE);
            textView55.setVisibility(View.INVISIBLE);
            textView56.setVisibility(View.INVISIBLE);
            textView57.setVisibility(View.INVISIBLE);
            textView58.setVisibility(View.INVISIBLE);
            textView59.setVisibility(View.INVISIBLE);
            textView60.setVisibility(View.INVISIBLE);
            textView61.setVisibility(View.INVISIBLE);
            textView62.setVisibility(View.INVISIBLE);
            textView63.setVisibility(View.INVISIBLE);
            textView64.setVisibility(View.INVISIBLE);
            textView65.setVisibility(View.INVISIBLE);
            textView66.setVisibility(View.INVISIBLE);
            textView67.setVisibility(View.INVISIBLE);
            textView68.setVisibility(View.INVISIBLE);
            textView69.setVisibility(View.INVISIBLE);
            textView70.setVisibility(View.INVISIBLE);
        } else
            // Проверяем если пользователь заполнил 1 строку нулями
            if (a11 == 0 && a12 == 0 && a13 == 0 && a14 == 0 && b1 == 0) {
                String str13 = "поменяем 1-ую строку и 2-ую строку местами ";
                textView26.setText(str13);
                // Вывод результата перемещения 1 и 2 строки в матрице
                String S37 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
                textView27.setText(S37);
                String S38 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                textView28.setText(S38);
                String S39 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                textView29.setText(S39);
                String S40 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + b4;
                textView30.setText(S40);

                String str14 = "1-ую строку делим на " + a21;
                textView31.setText(str14);
                // расчет деления 1 строки в матрице на a21
                double line81 = (double) a21 / a21;
                double line82 = (double) a22 / a21;
                double line83 = (double) a23 / a21;
                double line84 = (double) a24 / a21;
                double line85 = (double) b2 / a21;

                String result81 = String.format("%.1f", line81);
                String result82 = String.format("%.1f", line82);
                String result83 = String.format("%.1f", line83);
                String result84 = String.format("%.1f", line84);
                String result85 = String.format("%.1f", line85);

                // Вывод в матрицу деления 1 строки
                String S41 = result81 + "   " + result82 + "    " + result83 + "  " + result84 + "  " + result85;
                textView32.setText(S41);
                String S42 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                textView33.setText(S42);
                String S43 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                textView34.setText(S43);
                String S44 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + b4;
                textView35.setText(S44);

                String str15 = "от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 4 строки отнимаем 1 строку, умноженную на " + a41;
                textView36.setText(str15);
                // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                double line86 = (double) a31 - line81 * a31;
                double line87 = (double) a32 - line82 * a31;
                double line88 = (double) a33 - line83 * a31;
                double line89 = (double) a34 - line84 * a31;
                double line90 = (double) b3 - line85 * a31;

                String result86 = String.format("%.1f", line86);
                String result87 = String.format("%.1f", line87);
                String result88 = String.format("%.1f", line88);
                String result89 = String.format("%.1f", line89);
                String result90 = String.format("%.1f", line90);

                // расчет от 4 строки отнимаем 1 строку, умноженную на a41
                double line91 = (double) a41 - line81 * a41;
                double line92 = (double) a42 - line82 * a41;
                double line93 = (double) a43 - line83 * a41;
                double line94 = (double) a44 - line84 * a41;
                double line95 = (double) b4 - line85 * a41;

                String result91 = String.format("%.1f", line91);
                String result92 = String.format("%.1f", line92);
                String result93 = String.format("%.1f", line93);
                String result94 = String.format("%.1f", line94);
                String result95 = String.format("%.1f", line95);

                // Вывод результата вычисления в матрицу
                String S45 = result81 + "   " + result82 + "    " + result83 + "  " + result84 + "  " + result85;
                textView37.setText(S45);
                String S46 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                textView38.setText(S46);
                String S47 = result86 + "   " + result87 + "    " + result88 + "  " + result89 + "  " + result90;
                textView39.setText(S47);
                String S48 = result91 + "   " + result92 + "    " + result93 + "  " + result94 + "  " + result95;
                textView40.setText(S48);

                String str16 = "поменяем 2-ую строку и 3-ую строку местами ";
                textView41.setText(str16);
                // Вывод результата перемещения 2 и 3 строки в матрице
                String S49 = result81 + "   " + result82 + "    " + result83 + "  " + result84 + "  " + result85;
                textView42.setText(S49);
                String S50 = result86 + "   " + result87 + "    " + result88 + "  " + result89 + "  " + result90;
                textView43.setText(S50);
                String S51 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                textView44.setText(S51);
                String S52 = result91 + "   " + result92 + "    " + result93 + "  " + result94 + "  " + result95;
                textView45.setText(S52);

                String str17 = "2-ую строку делим на " + result87;
                textView46.setText(str17);
                // расчет деления 2 строки в матрице на result87
                double line96 = (double) line86 / line87;
                double line97 = (double) line87 / line87;
                double line98 = (double) line88 / line87;
                double line99 = (double) line89 / line87;
                double line100 = (double) line90 / line87;

                String result96 = String.format("%.1f", line96);
                String result97 = String.format("%.1f", line97);
                String result98 = String.format("%.1f", line98);
                String result99 = String.format("%.1f", line99);
                String result100 = String.format("%.1f", line100);

                // Вывод в матрицу деления 2 строки
                String S53 = result81 + "   " + result82 + "    " + result83 + "  " + result84 + "  " + result85;
                textView47.setText(S53);
                String S54 = result96 + "   " + result97 + "    " + result98 + "  " + result99 + "  " + result100;
                textView48.setText(S54);
                String S55 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                textView49.setText(S55);
                String S56 = result91 + "   " + result92 + "    " + result93 + "  " + result94 + "  " + result95;
                textView50.setText(S56);

                String str18 = "от 1 строки отнимаем 2 строку, умноженную на " + result82 + " к 4 строке добавляем 2 строку, умноженную на " + result92;
                textView51.setText(str18);
                // расчет "от 1 строки отнимаем 2 строку, умноженную на result82
                double line101 = (double) line81 - line96 * line82;
                double line102 = (double) line82 - line97 * line82;
                double line103 = (double) line83 - line98 * line82;
                double line104 = (double) line84 - line99 * line82;
                double line105 = (double) line85 - line100 * line82;

                String result101 = String.format("%.1f", line101);
                String result102 = String.format("%.1f", line102);
                String result103 = String.format("%.1f", line103);
                String result104 = String.format("%.1f", line104);
                String result105 = String.format("%.1f", line105);

                // расчет к 4 строке добавляем 2 строку, умноженную на result92
                double line106 = (double) line91 - line96 * line92;
                double line107 = (double) line92 - line97 * line92;
                double line108 = (double) line93 - line98 * line92;
                double line109 = (double) line94 - line99 * line92;
                double line110 = (double) line95 - line100 * line92;

                String result106 = String.format("%.1f", line106);
                String result107 = String.format("%.1f", line107);
                String result108 = String.format("%.1f", line108);
                String result109 = String.format("%.1f", line109);
                String result110 = String.format("%.1f", line110);

                // Вывод результата вычисления в матрицу
                String S57 = result101 + "   " + result102 + "    " + result103 + "  " + result104 + "  " + result105;
                textView52.setText(S57);
                String S58 = result96 + "   " + result97 + "    " + result98 + "  " + result99 + "  " + result100;
                textView53.setText(S58);
                String S59 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                textView54.setText(S59);
                String S60 = result106 + "   " + result107 + "    " + result108 + "  " + result109 + "  " + result110;
                textView55.setText(S60);

                String str19 = "поменяем 3-ую строку и 4-ую строку местами ";
                textView56.setText(str19);
                // Вывод результата перемещения 3 и 4 строки в матрице
                String S61 = result101 + "   " + result102 + "    " + result103 + "  " + result104 + "  " + result105;
                textView57.setText(S61);
                String S62 = result96 + "   " + result97 + "    " + result98 + "  " + result99 + "  " + result100;
                textView58.setText(S62);
                String S63 = result106 + "   " + result107 + "    " + result108 + "  " + result109 + "  " + result110;
                textView59.setText(S63);
                String S64 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                textView60.setText(S64);

                String str20 = "3-ую строку делим на " + result108;
                textView61.setText(str20);
                // расчет деления 3 строки в матрице на result108
                double line111 = (double) line106 / line108;
                double line112 = (double) line107 / line108;
                double line113 = (double) line108 / line108;
                double line114 = (double) line109 / line108;
                double line115 = (double) line110 / line108;

                String result111 = String.format("%.1f", line111);
                String result112 = String.format("%.1f", line112);
                String result113 = String.format("%.1f", line113);
                String result114 = String.format("%.1f", line114);
                String result115 = String.format("%.1f", line115);

                // Вывод в матрицу деления 3 строки
                String S65 = result101 + "   " + result102 + "    " + result103 + "  " + result104 + "  " + result105;
                textView62.setText(S65);
                String S66 = result96 + "   " + result97 + "    " + result98 + "  " + result99 + "  " + result100;
                textView63.setText(S66);
                String S67 = result111 + "   " + result112 + "    " + result113 + "  " + result114 + "  " + result115;
                textView64.setText(S67);
                String S68 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                textView65.setText(S68);

                String str21 = " к 1 строке добавляем 3 строку, умноженную на " + result103 + "от 2 строки отнимаем 3 строку, умноженную на " + result98;
                textView66.setText(str21);
                // расчет к 1 строке добавляем 3 строку, умноженную на result103
                double line116 = (double) line101 - line111 * line103;
                double line117 = (double) line102 - line112 * line103;
                double line118 = (double) line103 - line113 * line103;
                double line119 = (double) line104 - line114 * line103;
                double line120 = (double) line105 - line115 * line103;

                String result116 = String.format("%.1f", line116);
                String result117 = String.format("%.1f", line117);
                String result118 = String.format("%.1f", line118);
                String result119 = String.format("%.1f", line119);
                String result120 = String.format("%.1f", line120);

                // расчет от 2 строки отнимаем 3 строку, умноженную на result98;
                double line121 = (double) line96 - line111 * line98;
                double line122 = (double) line97 - line112 * line98;
                double line123 = (double) line98 - line113 * line98;
                double line124 = (double) line99 - line114 * line98;
                double line125 = (double) line100 - line115 * line98;

                String result121 = String.format("%.1f", line121);
                String result122 = String.format("%.1f", line122);
                String result123 = String.format("%.1f", line123);
                String result124 = String.format("%.1f", line124);
                String result125 = String.format("%.1f", line125);

                // Вывод результата вычисления в матрицу
                String S69 = result116 + "   " + result117 + "    " + result118 + "  " + result119 + "  " + result120;
                textView67.setText(S69);
                String S70 = result121 + "   " + result122 + "    " + result123 + "  " + result124 + "  " + result125;
                textView68.setText(S70);
                String S71 = result111 + "   " + result112 + "    " + result113 + "  " + result114 + "  " + result115;
                textView69.setText(S71);
                String S72 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                textView70.setText(S72);

                String str22 = " Ответ: ";
                textView71.setText(str22);
                String str23 = " Система имеет множество решений: ";
                textView72.setText(str23);
                textView73.setText(" x1 + " + result119 + "x4" + " =" + result120);
                textView74.setText(" x2 + " + result124 + "x4" + " =" + result125);
                textView75.setText(" x3 + " + result114 + "x4" + " =" + result115);
            } else {
                // Проверяем если пользователь заполнил 2 строку нулями
                if (a21 == 0 && a22 == 0 && a23 == 0 && a24 == 0 && b2 == 0) {

                    String str24 = "от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 4 строки отнимаем 1 строку, умноженную на " + a41;
                    textView31.setText(str24);
                    // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                    double line126 = (double) a31 - line1 * a31;
                    double line127 = (double) a32 - line2 * a31;
                    double line128 = (double) a33 - line3 * a31;
                    double line129 = (double) a34 - line4 * a31;
                    double line130 = (double) b3 - line5 * a31;

                    String result126 = String.format("%.1f", line126);
                    String result127 = String.format("%.1f", line127);
                    String result128 = String.format("%.1f", line128);
                    String result129 = String.format("%.1f", line129);
                    String result130 = String.format("%.1f", line130);

                    // расчет от 4 строки отнимаем 1 строку, умноженную на a41;
                    double line131 = (double) a41 - line1 * a41;
                    double line132 = (double) a42 - line2 * a41;
                    double line133 = (double) a43 - line3 * a41;
                    double line134 = (double) a44 - line4 * a41;
                    double line135 = (double) b4 - line5 * a41;

                    String result131 = String.format("%.1f", line131);
                    String result132 = String.format("%.1f", line132);
                    String result133 = String.format("%.1f", line133);
                    String result134 = String.format("%.1f", line134);
                    String result135 = String.format("%.1f", line135);

                    // Вывод результата вычисления в матрицу
                    String S73 = result1 + "   " + result2 + "    " + result3 + "  " + result4 + "  " + result5;
                    textView32.setText(S73);
                    String S74 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
                    textView33.setText(S74);
                    String S75 = result126 + "   " + result127 + "    " + result128 + "  " + result129 + "  " + result130;
                    textView34.setText(S75);
                    String S76 = result131 + "   " + result132 + "    " + result133 + "  " + result134 + "  " + result135;
                    textView35.setText(S76);

                    String str25 = "поменяем 2-ую строку и 3-ую строку местами ";
                    textView36.setText(str25);
                    // Вывод результата перемещения 2 и 3 строки в матрице
                    String S77 = result1 + "   " + result2 + "    " + result3 + "  " + result4 + "  " + result5;
                    textView37.setText(S77);
                    String S78 = result126 + "   " + result127 + "    " + result128 + "  " + result129 + "  " + result130;
                    textView38.setText(S78);
                    String S79 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
                    textView39.setText(S79);
                    String S80 = result131 + "   " + result132 + "    " + result133 + "  " + result134 + "  " + result135;
                    textView40.setText(S80);


                    String str26 = "2-ую строку делим на " + result127;
                    textView41.setText(str26);
                    // расчет деления 2 строки в матрице на result127
                    double line136 = (double) line126 / line127;
                    double line137 = (double) line127 / line127;
                    double line138 = (double) line128 / line127;
                    double line139 = (double) line129 / line127;
                    double line140 = (double) line130 / line127;

                    String result136 = String.format("%.1f", line136);
                    String result137 = String.format("%.1f", line137);
                    String result138 = String.format("%.1f", line138);
                    String result139 = String.format("%.1f", line139);
                    String result140 = String.format("%.1f", line140);

                    // Вывод в матрицу деления 2 строки
                    String S81 = result1 + "   " + result2 + "    " + result3 + "  " + result4 + "  " + result5;
                    textView42.setText(S81);
                    String S82 = result136 + "   " + result137 + "    " + result138 + "  " + result139 + "  " + result140;
                    textView43.setText(S82);
                    String S83 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
                    textView44.setText(S83);
                    String S84 = result131 + "   " + result132 + "    " + result133 + "  " + result134 + "  " + result135;
                    textView45.setText(S84);

                    String str27 = "от 1 строки отнимаем 2 строку, умноженную на " + result2 + " от 4 строки отнимаем 2 строку, умноженную на " + result132;
                    textView46.setText(str27);
                    // расчет от 1 строки отнимаем 2 строку, умноженную на result2
                    double line141 = (double) line1 - line136 * line2;
                    double line142 = (double) line2 - line137 * line2;
                    double line143 = (double) line3 - line138 * line2;
                    double line144 = (double) line4 - line139 * line2;
                    double line145 = (double) line5 - line140 * line2;

                    String result141 = String.format("%.1f", line141);
                    String result142 = String.format("%.1f", line142);
                    String result143 = String.format("%.1f", line143);
                    String result144 = String.format("%.1f", line144);
                    String result145 = String.format("%.1f", line145);

                    // расчет от 4 строки отнимаем 2 строку, умноженную на result132
                    double line146 = (double) line131 - line136 * line132;
                    double line147 = (double) line132 - line137 * line132;
                    double line148 = (double) line133 - line138 * line132;
                    double line149 = (double) line134 - line139 * line132;
                    double line150 = (double) line135 - line140 * line132;

                    String result146 = String.format("%.1f", line146);
                    String result147 = String.format("%.1f", line147);
                    String result148 = String.format("%.1f", line148);
                    String result149 = String.format("%.1f", line149);
                    String result150 = String.format("%.1f", line150);

                    // Вывод результата вычисления в матрицу
                    String S85 = result141 + "   " + result142 + "    " + result143 + "  " + result144 + "  " + result145;
                    textView47.setText(S85);
                    String S86 = result136 + "   " + result137 + "    " + result138 + "  " + result139 + "  " + result140;
                    textView48.setText(S86);
                    String S87 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
                    textView49.setText(S87);
                    String S88 = result146 + "   " + result147 + "    " + result148 + "  " + result149 + "  " + result150;
                    textView50.setText(S88);

                    String str28 = "поменяем 3-ую строку и 4-ую строку местами ";
                    textView51.setText(str28);
                    // Вывод результата перемещения 3 и 4 строки в матрице
                    String S89 = result141 + "   " + result142 + "    " + result143 + "  " + result144 + "  " + result145;
                    textView52.setText(S89);
                    String S90 = result136 + "   " + result137 + "    " + result138 + "  " + result139 + "  " + result140;
                    textView53.setText(S90);
                    String S91 = result146 + "   " + result147 + "    " + result148 + "  " + result149 + "  " + result150;
                    textView54.setText(S91);
                    String S92 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
                    textView55.setText(S92);


                    String str29 = "3-ую строку делим на " + result148;
                    textView56.setText(str29);
                    // расчет деления 3 строки в матрице на result148
                    double line151 = (double) line146 / line148;
                    double line152 = (double) line147 / line148;
                    double line153 = (double) line148 / line148;
                    double line154 = (double) line149 / line148;
                    double line155 = (double) line150 / line148;

                    String result151 = String.format("%.1f", line151);
                    String result152 = String.format("%.1f", line152);
                    String result153 = String.format("%.1f", line153);
                    String result154 = String.format("%.1f", line154);
                    String result155 = String.format("%.1f", line155);

                    // Вывод в матрицу деления 2 строки
                    String S93 = result141 + "   " + result142 + "    " + result143 + "  " + result144 + "  " + result145;
                    textView57.setText(S93);
                    String S94 = result136 + "   " + result137 + "    " + result138 + "  " + result139 + "  " + result140;
                    textView58.setText(S94);
                    String S95 = result151 + "   " + result152 + "    " + result153 + "  " + result154 + "  " + result155;
                    textView59.setText(S95);
                    String S96 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
                    textView60.setText(S96);

                    String str30 = "к 1 строке добавляем 3 строку, умноженную на " + result143 + " от 2 строки отнимаем 3 строку, умноженную на " + result138;
                    textView61.setText(str30);
                    // расчет к 1 строке добавляем 3 строку, умноженную на result143
                    double line156 = (double) line141 - line151 * line143;
                    double line157 = (double) line142 - line152 * line143;
                    double line158 = (double) line143 - line153 * line143;
                    double line159 = (double) line144 - line154 * line143;
                    double line160 = (double) line145 - line155 * line143;

                    String result156 = String.format("%.1f", line156);
                    String result157 = String.format("%.1f", line157);
                    String result158 = String.format("%.1f", line158);
                    String result159 = String.format("%.1f", line159);
                    String result160 = String.format("%.1f", line160);
                    // расчет от 2 строки отнимаем 3 строку, умноженную на result138
                    double line161 = (double) line136 - line151 * line138;
                    double line162 = (double) line137 - line152 * line138;
                    double line163 = (double) line138 - line153 * line138;
                    double line164 = (double) line139 - line154 * line138;
                    double line165 = (double) line140 - line155 * line138;

                    String result161 = String.format("%.1f", line161);
                    String result162 = String.format("%.1f", line162);
                    String result163 = String.format("%.1f", line163);
                    String result164 = String.format("%.1f", line164);
                    String result165 = String.format("%.1f", line165);

                    // Вывод результата вычисления в матрицу
                    String S97 = result156 + "   " + result157 + "    " + result158 + "  " + result159 + "  " + result160;
                    textView62.setText(S97);
                    String S98 = result161 + "   " + result162 + "    " + result163 + "  " + result164 + "  " + result165;
                    textView63.setText(S98);
                    String S99 = result151 + "   " + result152 + "    " + result153 + "  " + result154 + "  " + result155;
                    textView64.setText(S99);
                    String S100 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + b2;
                    textView65.setText(S100);

                    String str31 = " Ответ: ";
                    textView66.setText(str31);
                    String str32 = " Система имеет множество решений: ";
                    textView67.setText(str32);
                    textView68.setText(" x1 -  " + result159 + "x4" + " =" + result160);
                    textView69.setText(" x2 +  " + result164 + "x4" + " =" + result165);
                    textView70.setText(" x3 +  " + result154 + "x4" + " =" + result155);

                } else {
                    // Проверяем если пользователь заполнил 3 строку нулями
                    if (a31 == 0 && a32 == 0 && a33 == 0 && a34 == 0 && b3 == 0) {

                        String str31 = "1-ую строку делим на " + a11;
                        textView26.setText(str31);
                        // расчет деления 1 строки в матрице на a11
                        double line166 = (double) a11 / a11;
                        double line167 = (double) a12 / a11;
                        double line168 = (double) a13 / a11;
                        double line169 = (double) a14 / a11;
                        double line170 = (double) b1 / a11;

                        String result166 = String.format("%.1f", line166);
                        String result167 = String.format("%.1f", line167);
                        String result168 = String.format("%.1f", line168);
                        String result169 = String.format("%.1f", line169);
                        String result170 = String.format("%.1f", line170);

                        // Вывод в матрицу деления 1 строки
                        String S101 = result166 + "   " + result167 + "    " + result168 + "  " + result169 + "  " + result170;
                        textView27.setText(S101);
                        String S102 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + b1;
                        textView28.setText(S102);
                        String S103 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                        textView29.setText(S103);
                        String S104 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + b4;
                        textView30.setText(S104);

                        String str32 = "от 2 строки отнимаем 1 строку, умноженную на " + a21 + " от 4 строки отнимаем 1 строку, умноженную на " + a41;
                        textView31.setText(str32);

                        // расчет от 2 строки отнимаем 1 строку, умноженную на a21
                        double line171 = (double) a21 - line1 * a21;
                        double line172 = (double) a22 - line2 * a21;
                        double line173 = (double) a23 - line3 * a21;
                        double line174 = (double) a24 - line4 * a21;
                        double line175 = (double) b2 - line5 * a21;

                        String result171 = String.format("%.1f", line171);
                        String result172 = String.format("%.1f", line172);
                        String result173 = String.format("%.1f", line173);
                        String result174 = String.format("%.1f", line174);
                        String result175 = String.format("%.1f", line175);

                        // расчет от 4 строки отнимаем 1 строку, умноженную на a41
                        double line176 = (double) a41 - line1 * a41;
                        double line177 = (double) a42 - line2 * a41;
                        double line178 = (double) a43 - line3 * a41;
                        double line179 = (double) a44 - line4 * a41;
                        double line180 = (double) b4 - line5 * a41;

                        String result176 = String.format("%.1f", line176);
                        String result177 = String.format("%.1f", line177);
                        String result178 = String.format("%.1f", line178);
                        String result179 = String.format("%.1f", line179);
                        String result180 = String.format("%.1f", line180);

                        // Вывод в матрицу деления 1 строки
                        String S105 = result166 + "   " + result167 + "    " + result168 + "  " + result169 + "  " + result170;
                        textView32.setText(S105);
                        String S106 = result171 + "   " + result172 + "    " + result173 + "  " + result174 + "  " + result175;
                        textView33.setText(S106);
                        String S107 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                        textView34.setText(S107);
                        String S108 = result176 + "   " + result177 + "    " + result178 + "  " + result179 + "  " + result180;
                        textView35.setText(S108);

                        String str33 = "поменяем 2-ую строку и 4-ую строку местами ";
                        textView36.setText(str33);
                        // Вывод результата перемещения 2 и 4 строки местами
                        String S109 = result166 + "   " + result167 + "    " + result168 + "  " + result169 + "  " + result170;
                        textView37.setText(S109);
                        String S110 = result176 + "   " + result177 + "    " + result178 + "  " + result179 + "  " + result180;
                        textView38.setText(S110);
                        String S111 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                        textView39.setText(S111);
                        String S112 = result171 + "   " + result172 + "    " + result173 + "  " + result174 + "  " + result175;
                        textView40.setText(S112);

                        String str34 = "2-ую строку делим на " + result177;
                        textView41.setText(str34);

                        // расчет деления 2 строки в матрице на result177
                        double line181 = (double) line176 / line177;
                        double line182 = (double) line177 / line177;
                        double line183 = (double) line178 / line177;
                        double line184 = (double) line179 / line177;
                        double line185 = (double) line180 / line177;

                        String result181 = String.format("%.1f", line181);
                        String result182 = String.format("%.1f", line182);
                        String result183 = String.format("%.1f", line183);
                        String result184 = String.format("%.1f", line184);
                        String result185 = String.format("%.1f", line185);

                        // Вывод в матрицу деления 2 строки
                        String S113 = result166 + "   " + result167 + "    " + result168 + "  " + result169 + "  " + result170;
                        textView42.setText(S113);
                        String S114 = result181 + "   " + result182 + "    " + result183 + "  " + result184 + "  " + result185;
                        textView43.setText(S114);
                        String S115 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                        textView44.setText(S115);
                        String S116 = result171 + "   " + result172 + "    " + result173 + "  " + result174 + "  " + result175;
                        textView45.setText(S116);

                        String str35 = "от 1 строки отнимаем 2 строку, умноженную на " + result167;
                        textView46.setText(str35);
                        // расчет "от 1 строки отнимаем 2 строку, умноженную на result82
                        double line186 = (double) line166 - line181 * line167;
                        double line187 = (double) line167 - line182 * line167;
                        double line188 = (double) line168 - line183 * line167;
                        double line189 = (double) line169 - line184 * line167;
                        double line190 = (double) line170 - line185 * line167;

                        String result186 = String.format("%.1f", line186);
                        String result187 = String.format("%.1f", line187);
                        String result188 = String.format("%.1f", line188);
                        String result189 = String.format("%.1f", line189);
                        String result190 = String.format("%.1f", line190);

                        // Вывод результата вычисления в матрицу
                        String S117 = result186 + "   " + result187 + "    " + result188 + "  " + result189 + "  " + result190;
                        textView47.setText(S117);
                        String S118 = result181 + "   " + result182 + "    " + result183 + "  " + result184 + "  " + result185;
                        textView48.setText(S118);
                        String S119 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                        textView49.setText(S119);
                        String S120 = result171 + "   " + result172 + "    " + result173 + "  " + result174 + "  " + result175;
                        textView50.setText(S120);

                        String str36 = "поменяем 3-ую строку и 4-ую строку местами ";
                        textView51.setText(str36);
                        // Вывод результата перемещения 3 и 4 строки местами
                        String S121 = result186 + "   " + result187 + "    " + result188 + "  " + result189 + "  " + result190;
                        textView52.setText(S121);
                        String S122 = result181 + "   " + result182 + "    " + result183 + "  " + result184 + "  " + result185;
                        textView53.setText(S122);
                        String S123 = result171 + "   " + result172 + "    " + result173 + "  " + result174 + "  " + result175;
                        textView54.setText(S123);
                        String S124 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                        textView55.setText(S124);

                        String str37 = "3-ую строку делим на " + result173;
                        textView56.setText(str37);

                        // расчет деления 3 строки в матрице на result173
                        double line191 = (double) line171 / line173;
                        double line192 = (double) line172 / line173;
                        double line193 = (double) line173 / line173;
                        double line194 = (double) line174 / line173;
                        double line195 = (double) line175 / line173;

                        String result191 = String.format("%.1f", line191);
                        String result192 = String.format("%.1f", line192);
                        String result193 = String.format("%.1f", line193);
                        String result194 = String.format("%.1f", line194);
                        String result195 = String.format("%.1f", line195);

                        // Вывод результата вычисления в матрицу
                        String S125 = result186 + "   " + result187 + "    " + result188 + "  " + result189 + "  " + result190;
                        textView57.setText(S125);
                        String S126 = result181 + "   " + result182 + "    " + result183 + "  " + result184 + "  " + result185;
                        textView58.setText(S126);
                        String S127 = result191 + "   " + result192 + "    " + result193 + "  " + result194 + "  " + result195;
                        textView59.setText(S127);
                        String S128 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                        textView60.setText(S128);

                        String str38 = "от 1 строки отнимаем 3 строку, умноженную на " + result188 + " к 2 строке добавляем 3 строку, умноженную на " + result193;
                        textView61.setText(str38);

                        // расчет "от 1 строки отнимаем 3 строку, умноженную на result188
                        double line196 = (double) line186 - line191 * line188;
                        double line197 = (double) line187 - line192 * line188;
                        double line198 = (double) line188 - line193 * line188;
                        double line199 = (double) line189 - line194 * line188;
                        double line200 = (double) line190 - line195 * line188;

                        String result196 = String.format("%.1f", line196);
                        String result197 = String.format("%.1f", line197);
                        String result198 = String.format("%.1f", line198);
                        String result199 = String.format("%.1f", line199);
                        String result200 = String.format("%.1f", line200);

                        // расчет к 2 строке добавляем 3 строку, умноженную на result193
                        double line201 = (double) line181 - line191 * line193;
                        double line202 = (double) line182 - line192 * line193;
                        double line203 = (double) line183 - line193 * line193;
                        double line204 = (double) line184 - line194 * line193;
                        double line205 = (double) line185 - line195 * line193;

                        String result201 = String.format("%.1f", line201);
                        String result202 = String.format("%.1f", line202);
                        String result203 = String.format("%.1f", line203);
                        String result204 = String.format("%.1f", line204);
                        String result205 = String.format("%.1f", line205);

                        // Вывод результата вычисления в матрицу
                        String S129 = result196 + "   " + result197 + "    " + result198 + "  " + result199 + "  " + result200;
                        textView62.setText(S129);
                        String S130 = result201 + "   " + result202 + "    " + result203 + "  " + result204 + "  " + result205;
                        textView63.setText(S130);
                        String S131 = result191 + "   " + result192 + "    " + result193 + "  " + result194 + "  " + result195;
                        textView64.setText(S131);
                        String S132 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + b3;
                        textView65.setText(S132);

                        String str39 = " Ответ: ";
                        textView66.setText(str39);
                        String str40 = " Система имеет множество решений: ";
                        textView67.setText(str40);
                        textView68.setText(" x1 -  " + result199 + "x4" + " =" + result200);
                        textView69.setText(" x2 +  " + result204 + "x4" + " =" + result205);
                        textView70.setText(" x3 +  " + result194 + "x4" + " =" + result195);

                    } else {
                        // Проверяем если пользователь заполнил 4 строку нулями
                        if (a41 == 0 && a42 == 0 && a43 == 0 && a44 == 0 && b4 == 0) {

                            String str41 = "1-ую строку делим на " + a11;
                            textView26.setText(str41);
                            // расчет деления 1 строки в матрице на a11
                            double line206 = (double) a11 / a11;
                            double line207 = (double) a12 / a11;
                            double line208 = (double) a13 / a11;
                            double line209 = (double) a14 / a11;
                            double line210 = (double) b1 / a11;

                            String result206 = String.format("%.1f", line206);
                            String result207 = String.format("%.1f", line207);
                            String result208 = String.format("%.1f", line208);
                            String result209 = String.format("%.1f", line209);
                            String result210 = String.format("%.1f", line210);

                            // вывод деления 1 строки в матрице
                            String S133 = result206 + "             " + result207 + "                " + result208 + "              " + result209 + "                 " + result210;
                            textView27.setText(S133);
                            String S134 = a21 + "   " + a22 + "    " + a23 + "   " + a24 + "     " + b2;
                            textView28.setText(S134);
                            String S135 = a31 + "   " + a32 + "    " + a33 + "   " + a34 + "     " + b3;
                            textView29.setText(S135);
                            String S136 = a41 + "   " + a42 + "    " + a43 + "   " + a44 + "     " + b4;
                            textView30.setText(S136);

                            String str42 = "от 2 строки отнимаем 1 строку, умноженную на " + a21 + " от 3 строки отнимаем 1 строку, умноженную на " + a31;
                            textView31.setText(str42);

                            // расчет от 2 строки отнимаем 1 строку, умноженную на a21
                            double line211 = (double) a21 - line206 * a21;
                            double line212 = (double) a22 - line207 * a21;
                            double line213 = (double) a23 - line208 * a21;
                            double line214 = (double) a24 - line209 * a21;
                            double line215 = (double) b2 - line210 * a21;

                            String result211 = String.format("%.1f", line211);
                            String result212 = String.format("%.1f", line212);
                            String result213 = String.format("%.1f", line213);
                            String result214 = String.format("%.1f", line214);
                            String result215 = String.format("%.1f", line215);

                            // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                            double line216 = (double) a31 - line206 * a31;
                            double line217 = (double) a32 - line207 * a31;
                            double line218 = (double) a33 - line208 * a31;
                            double line219 = (double) a34 - line209 * a31;
                            double line220 = (double) b3 - line210 * a31;

                            String result216 = String.format("%.1f", line216);
                            String result217 = String.format("%.1f", line217);
                            String result218 = String.format("%.1f", line218);
                            String result219 = String.format("%.1f", line219);
                            String result220 = String.format("%.1f", line220);

                            // Вывод результата вычисления в матрицу
                            String S137 = result206 + "             " + result207 + "                " + result208 + "              " + result209 + "                 " + result210;
                            textView32.setText(S137);
                            String S138 = result211 + "   " + result212 + "    " + result213 + "   " + result214 + "     " + result215;
                            textView33.setText(S138);
                            String S139 = result216 + "   " + result217 + "    " + result218 + "   " + result219 + "     " + result220;
                            textView34.setText(S139);
                            String S140 = a41 + "   " + a42 + "    " + a43 + "   " + a44 + "     " + b4;
                            textView35.setText(S140);

                            String str43 = "поменяем 2-ую строку и 3-ую строку местами ";
                            textView36.setText(str43);

                            String S141 = result206 + "             " + result207 + "                " + result208 + "              " + result209 + "                 " + result210;
                            textView37.setText(S141);
                            String S142 = result216 + "   " + result217 + "    " + result218 + "   " + result219 + "     " + result220;
                            textView38.setText(S142);
                            String S143 = result211 + "   " + result212 + "    " + result213 + "   " + result214 + "     " + result215;
                            textView39.setText(S143);
                            String S144 = a41 + "   " + a42 + "    " + a43 + "   " + a44 + "     " + b4;
                            textView40.setText(S144);

                            String str44 = "2-ую строку делим на " + result217;
                            textView41.setText(str44);

                            // расчет деления 2 строки в матрице на result217
                            double line221 = (double) line216 / line217;
                            double line222 = (double) line217 / line217;
                            double line223 = (double) line218 / line217;
                            double line224 = (double) line219 / line217;
                            double line225 = (double) line220 / line217;

                            String result221 = String.format("%.1f", line221);
                            String result222 = String.format("%.1f", line222);
                            String result223 = String.format("%.1f", line223);
                            String result224 = String.format("%.1f", line224);
                            String result225 = String.format("%.1f", line225);

                            // вывод деления 2 строки в матрице
                            String S145 = result206 + "             " + result207 + "                " + result208 + "              " + result209 + "                 " + result210;
                            textView42.setText(S145);
                            String S146 = result221 + "   " + result222 + "    " + result223 + "   " + result224 + "     " + result225;
                            textView43.setText(S146);
                            String S147 = result211 + "   " + result212 + "    " + result213 + "   " + result214 + "     " + result215;
                            textView44.setText(S147);
                            String S148 = a41 + "   " + a42 + "    " + a43 + "   " + a44 + "     " + b4;
                            textView45.setText(S148);

                            String str45 = "от 1 строки отнимаем 2 строку, умноженную на " + result207;
                            textView46.setText(str45);

                            // расчет "от 1 строки отнимаем 2 строку, умноженную на result207
                            double line226 = (double) line206 - line221 * line207;
                            double line227 = (double) line207 - line222 * line207;
                            double line228 = (double) line208 - line223 * line207;
                            double line229 = (double) line209 - line224 * line207;
                            double line230 = (double) line210 - line225 * line207;

                            String result226 = String.format("%.1f", line226);
                            String result227 = String.format("%.1f", line227);
                            String result228 = String.format("%.1f", line228);
                            String result229 = String.format("%.1f", line229);
                            String result230 = String.format("%.1f", line230);

                            // Вывод результата вычисления в матрицу
                            String S149 = result226 + "             " + result227 + "                " + result228 + "              " + result229 + "                 " + result230;
                            textView47.setText(S149);
                            String S150 = result221 + "   " + result222 + "    " + result223 + "   " + result224 + "     " + result225;
                            textView48.setText(S150);
                            String S151 = result211 + "   " + result212 + "    " + result213 + "   " + result214 + "     " + result215;
                            textView49.setText(S151);
                            String S152 = a41 + "   " + a42 + "    " + a43 + "   " + a44 + "     " + b4;
                            textView50.setText(S152);

                            String str46 = "3-ую строку делим на " + result213;
                            textView51.setText(str46);

                            // расчет деления 3 строки в матрице на result228
                            double line231 = (double) line211 / line213;
                            double line232 = (double) line212 / line213;
                            double line233 = (double) line213 / line213;
                            double line234 = (double) line214 / line213;
                            double line235 = (double) line215 / line213;

                            String result231 = String.format("%.1f", line231);
                            String result232 = String.format("%.1f", line232);
                            String result233 = String.format("%.1f", line233);
                            String result234 = String.format("%.1f", line234);
                            String result235 = String.format("%.1f", line235);

                            // Вывод деления 3 строки в матрице
                            String S153 = result226 + "             " + result227 + "                " + result228 + "              " + result229 + "                 " + result230;
                            textView52.setText(S153);
                            String S154 = result221 + "   " + result222 + "    " + result223 + "   " + result224 + "     " + result225;
                            textView53.setText(S154);
                            String S155 = result231 + "   " + result232 + "    " + result233 + "   " + result234 + "     " + result235;
                            textView54.setText(S155);
                            String S156 = a41 + "   " + a42 + "    " + a43 + "   " + a44 + "     " + b4;
                            textView55.setText(S156);

                            String str47 = "от 1 строки отнимаем 3 строку, умноженную на " + result228 + " к 2 строке добавляем 3 строку, умноженную на " + result233;
                            textView56.setText(str47);

                            // расчет от 1 строки отнимаем 3 строку, умноженную на result228
                            double line236 = (double) line226 - line231 * line228;
                            double line237 = (double) line227 - line232 * line228;
                            double line238 = (double) line228 - line233 * line228;
                            double line239 = (double) line229 - line234 * line228;
                            double line240 = (double) line230 - line235 * line228;

                            String result236 = String.format("%.1f", line236);
                            String result237 = String.format("%.1f", line237);
                            String result238 = String.format("%.1f", line238);
                            String result239 = String.format("%.1f", line239);
                            String result240 = String.format("%.1f", line240);

                            // расчет к 2 строке добавляем 3 строку, умноженную на result233
                            double line241 = (double) line221 + line231 * line233;
                            double line242 = (double) line222 + line232 * line233;
                            double line243 = (double) line223 + line233 * line233;
                            double line244 = (double) line224 + line234 * line233;
                            double line245 = (double) line225 + line235 * line233;

                            String result241 = String.format("%.1f", line241);
                            String result242 = String.format("%.1f", line242);
                            String result243 = String.format("%.1f", line243);
                            String result244 = String.format("%.1f", line244);
                            String result245 = String.format("%.1f", line245);

                            // Вывод результата вычисления в матрицу
                            String S157 = result236 + "             " + result237 + "                " + result238 + "              " + result239 + "                 " + result240;
                            textView57.setText(S157);
                            String S158 = result241 + "   " + result242 + "    " + result243 + "   " + result244 + "     " + result245;
                            textView58.setText(S158);
                            String S159 = result231 + "   " + result232 + "    " + result233 + "   " + result234 + "     " + result235;
                            textView59.setText(S159);
                            String S160 = a41 + "   " + a42 + "    " + a43 + "   " + a44 + "     " + b4;
                            textView60.setText(S160);

                            String str48 = " Ответ: ";
                            textView61.setText(str48);
                            String str49 = " Система имеет множество решений: ";
                            textView62.setText(str49);
                            textView63.setText(" x1   " + result239 + "x4" + " = " + result240);
                            textView64.setText(" x2 +  " + result244 + "x4" + " = " + result245);
                            textView65.setText(" x3 +  " + result234 + "x4" + " = " + result235);

                            // Скрываем не нужный вывод результата
                            textView66.setVisibility(View.INVISIBLE);
                            textView67.setVisibility(View.INVISIBLE);
                            textView68.setVisibility(View.INVISIBLE);
                            textView69.setVisibility(View.INVISIBLE);
                            textView70.setVisibility(View.INVISIBLE);

                        } else {   // Проверяем если пользователь заполнил матрицу положительными значениями
                            if (a11 > 0 && a12 > 0 && a13 > 0 && a14 > 0 && b1 > 0 && a21 > 0 && a22 > 0 && a23 > 0 && a24 > 0 && b2 > 0 && a31 > 0 && a32 > 0 && a33 > 0 && a34 > 0 && b3 > 0 && a41 > 0 && a42 > 0 && a43 > 0 && a44 > 0 && b4 > 0) {
                                // Показываем нужный вывод результата
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
                                textView44.setVisibility(View.VISIBLE);
                                textView45.setVisibility(View.VISIBLE);
                                textView46.setVisibility(View.VISIBLE);
                                textView47.setVisibility(View.VISIBLE);
                                textView48.setVisibility(View.VISIBLE);
                                textView49.setVisibility(View.VISIBLE);
                                textView50.setVisibility(View.VISIBLE);
                                textView51.setVisibility(View.VISIBLE);
                                textView52.setVisibility(View.VISIBLE);
                                textView53.setVisibility(View.VISIBLE);
                                textView54.setVisibility(View.VISIBLE);
                                textView55.setVisibility(View.VISIBLE);
                                textView56.setVisibility(View.VISIBLE);
                                textView57.setVisibility(View.VISIBLE);
                                textView58.setVisibility(View.VISIBLE);
                                textView59.setVisibility(View.VISIBLE);
                                textView60.setVisibility(View.VISIBLE);
                                textView61.setVisibility(View.VISIBLE);
                                textView62.setVisibility(View.VISIBLE);
                                textView63.setVisibility(View.VISIBLE);
                                textView64.setVisibility(View.VISIBLE);
                                textView65.setVisibility(View.VISIBLE);
                                textView66.setVisibility(View.VISIBLE);
                                textView67.setVisibility(View.VISIBLE);
                                textView68.setVisibility(View.VISIBLE);
                                textView69.setVisibility(View.VISIBLE);
                                textView70.setVisibility(View.VISIBLE);
                            }
                        }
                    }
                }
            }
    }

    public void Clear5(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30, TextView textView32, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView38, TextView textView39, TextView textView40, TextView textView41, TextView textView42, TextView textView44, TextView textView45, TextView textView46, TextView textView47, TextView textView48, TextView textView50, TextView textView51, TextView textView52, TextView textView53, TextView textView54, TextView textView56, TextView textView57, TextView textView58, TextView textView59, TextView textView60, TextView textView62, TextView textView63, TextView textView64, TextView textView65, TextView textView66, TextView textView68, TextView textView69, TextView textView70, TextView textView71, TextView textView72, TextView textView74, TextView textView75, TextView textView76, TextView textView77, TextView textView78, TextView textView80, TextView textView81, TextView textView82, TextView textView83, TextView textView84, TextView textView86, TextView textView87, TextView textView88, TextView textView89, TextView textView90, TextView textView92, TextView textView93, TextView textView94, TextView textView95, TextView textView96, TextView textView98, TextView textView99, TextView textView100, TextView textView101, TextView textView102, TextView textView104, TextView textView105, TextView textView106, TextView textView107, TextView textView108, TextView textView110, TextView textView111, TextView textView112, TextView textView113, TextView textView114) {
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

        textView32.setText(null);
        textView33.setText(null);
        textView34.setText(null);
        textView35.setText(null);
        textView36.setText(null);
        textView38.setText(null);
        textView39.setText(null);
        textView40.setText(null);
        textView41.setText(null);
        textView42.setText(null);
        textView44.setText(null);
        textView45.setText(null);
        textView46.setText(null);
        textView47.setText(null);
        textView48.setText(null);
        textView50.setText(null);
        textView51.setText(null);
        textView52.setText(null);
        textView53.setText(null);
        textView54.setText(null);
        textView56.setText(null);
        textView57.setText(null);
        textView58.setText(null);
        textView59.setText(null);
        textView60.setText(null);
        textView62.setText(null);
        textView63.setText(null);
        textView64.setText(null);
        textView65.setText(null);
        textView66.setText(null);
        textView68.setText(null);
        textView69.setText(null);
        textView70.setText(null);
        textView71.setText(null);
        textView72.setText(null);
        textView74.setText(null);
        textView75.setText(null);
        textView76.setText(null);
        textView77.setText(null);
        textView78.setText(null);
        textView80.setText(null);
        textView81.setText(null);
        textView82.setText(null);
        textView83.setText(null);
        textView84.setText(null);
        textView86.setText(null);
        textView87.setText(null);
        textView88.setText(null);
        textView89.setText(null);
        textView90.setText(null);
        textView92.setText(null);
        textView93.setText(null);
        textView94.setText(null);
        textView95.setText(null);
        textView96.setText(null);
        textView98.setText(null);
        textView99.setText(null);
        textView100.setText(null);
        textView101.setText(null);
        textView102.setText(null);
        textView104.setText(null);
        textView105.setText(null);
        textView106.setText(null);
        textView107.setText(null);
        textView108.setText(null);
        textView110.setText(null);
        textView111.setText(null);
        textView112.setText(null);
        textView113.setText(null);
        textView114.setText(null);
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


    public void Rast5(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30, TextView textView31, TextView textView32, TextView textView33, TextView textView34, TextView textView35, TextView textView36, TextView textView37, TextView textView38, TextView textView39, TextView textView40, TextView textView41, TextView textView42, TextView textView43, TextView textView44, TextView textView45, TextView textView46, TextView textView47, TextView textView48, TextView textView49, TextView textView50, TextView textView51, TextView textView52, TextView textView53, TextView textView54, TextView textView55, TextView textView56, TextView textView57, TextView textView58, TextView textView59, TextView textView60, TextView textView61, TextView textView62, TextView textView63, TextView textView64, TextView textView65, TextView textView66, TextView textView67, TextView textView68, TextView textView69, TextView textView70, TextView textView71, TextView textView72, TextView textView73, TextView textView74, TextView textView75, TextView textView76, TextView textView77, TextView textView78, TextView textView79, TextView textView80, TextView textView81, TextView textView82, TextView textView83, TextView textView84, TextView textView85, TextView textView86, TextView textView87, TextView textView88, TextView textView89, TextView textView90, TextView textView91, TextView textView92, TextView textView93, TextView textView94, TextView textView95, TextView textView96, TextView textView97, TextView textView98, TextView textView99, TextView textView100, TextView textView101, TextView textView102, TextView textView103, TextView textView104, TextView textView105, TextView textView106, TextView textView107, TextView textView108, TextView textView109, TextView textView110, TextView textView111, TextView textView112, TextView textView113, TextView textView114) {
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

        textView31.setText("Перепишем систему уравнений в матричном виде");

        // Вывод общей матрицы
        String S1 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
        textView32.setText(S1);
        String S2 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
        textView33.setText(S2);
        String S3 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
        textView34.setText(S3);
        String S4 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
        textView35.setText(S4);
        String S5 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
        textView36.setText(S5);

        String str = "1-ую строку делим на " + a11;
        textView37.setText(str);

        // расчет деления 1 строки в матрице на а11
        double line1 = (double) a11 / a11;
        double line2 = (double) a12 / a11;
        double line3 = (double) a13 / a11;
        double line4 = (double) a14 / a11;
        double line5 = (double) a15 / a11;
        double line6 = (double) b1 / a11;

        String result1 = String.format("%.1f", line1);
        String result2 = String.format("%.1f", line2);
        String result3 = String.format("%.1f", line3);
        String result4 = String.format("%.1f", line4);
        String result5 = String.format("%.1f", line5);
        String result6 = String.format("%.1f", line6);

        // вывод деления 1 строки в матрице на а11
        String S6 = result1 + "   " + result2 + "    " + result3 + "   " + result4 + "    " + result5 + "    " + result6;
        textView38.setText(S6);
        String S7 = a21 + "   " + a22 + "    " + a23 + "   " + a24 + "     " + a25 + "     " + b2;
        textView39.setText(S7);
        String S8 = a31 + "   " + a32 + "    " + a33 + "   " + a34 + "     " + a35 + "     " + b3;
        textView40.setText(S8);
        String S9 = a41 + "   " + a42 + "    " + a43 + "   " + a44 + "     " + a45 + "     " + b4;
        textView41.setText(S9);
        String S10 = a51 + "   " + a52 + "    " + a53 + "   " + a54 + "     " + a55 + "     " + b5;
        textView42.setText(S10);

        String str1 = "от 2 строки отнимаем 1 строку, умноженную на " + a21 + " от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 4 строки отнимаем 1 строку, умноженную на " + a41 + " от 5 строки отнимаем 1 строку, умноженную на " + a51;
        textView43.setText(str1);

        // расчет от 2 строки отнимаем 1 строку, умноженную на a21
        double line7 = (double) a21 - line1 * a21;
        double line8 = (double) a22 - line2 * a21;
        double line9 = (double) a23 - line3 * a21;
        double line10 = (double) a24 - line4 * a21;
        double line11 = (double) a25 - line5 * a21;
        double line12 = (double) b2 - line6 * a21;

        String result7 = String.format("%.1f", line7);
        String result8 = String.format("%.1f", line8);
        String result9 = String.format("%.1f", line9);
        String result10 = String.format("%.1f", line10);
        String result11 = String.format("%.1f", line11);
        String result12 = String.format("%.1f", line12);

        // расчет от 3 строки отнимаем 1 строку, умноженную на a31
        double line13 = (double) a31 - line1 * a31;
        double line14 = (double) a32 - line2 * a31;
        double line15 = (double) a33 - line3 * a31;
        double line16 = (double) a34 - line4 * a31;
        double line17 = (double) a35 - line5 * a31;
        double line18 = (double) b3 - line6 * a31;

        String result13 = String.format("%.1f", line13);
        String result14 = String.format("%.1f", line14);
        String result15 = String.format("%.1f", line15);
        String result16 = String.format("%.1f", line16);
        String result17 = String.format("%.1f", line17);
        String result18 = String.format("%.1f", line18);

        // расчет от 4 строки отнимаем 1 строку, умноженную на a41
        double line19 = (double) a41 - line1 * a41;
        double line20 = (double) a42 - line2 * a41;
        double line21 = (double) a43 - line3 * a41;
        double line22 = (double) a44 - line4 * a41;
        double line23 = (double) a45 - line5 * a41;
        double line24 = (double) b4 - line6 * a41;

        String result19 = String.format("%.1f", line19);
        String result20 = String.format("%.1f", line20);
        String result21 = String.format("%.1f", line21);
        String result22 = String.format("%.1f", line22);
        String result23 = String.format("%.1f", line23);
        String result24 = String.format("%.1f", line24);

        // расчет от 5 строки отнимаем 1 строку, умноженную на a51
        double line25 = (double) a51 - line1 * a51;
        double line26 = (double) a52 - line2 * a51;
        double line27 = (double) a53 - line3 * a51;
        double line28 = (double) a54 - line4 * a51;
        double line29 = (double) a55 - line5 * a51;
        double line30 = (double) b5 - line6 * a51;

        String result25 = String.format("%.1f", line25);
        String result26 = String.format("%.1f", line26);
        String result27 = String.format("%.1f", line27);
        String result28 = String.format("%.1f", line28);
        String result29 = String.format("%.1f", line29);
        String result30 = String.format("%.1f", line30);

        // Вывод результата вычисления в матрицу
        String S11 = result1 + "   " + result2 + "    " + result3 + "   " + result4 + "    " + result5 + "    " + result6;
        textView44.setText(S11);
        String S12 = result7 + "   " + result8 + "    " + result9 + "   " + result10 + "     " + result11 + "     " + result12;
        textView45.setText(S12);
        String S13 = result13 + "   " + result14 + "    " + result15 + "   " + result16 + "     " + result17 + "     " + result18;
        textView46.setText(S13);
        String S14 = result19 + "   " + result20 + "    " + result21 + "   " + result22 + "     " + result23 + "     " + result24;
        textView47.setText(S14);
        String S15 = result25 + "   " + result26 + "    " + result27 + "   " + result28 + "     " + result29 + "     " + result30;
        textView48.setText(S15);

        String str2 = "2-ую строку делим на " + result8;
        textView49.setText(str2);

        // расчет деления 2 строки в матрице на result8
        double line31 = (double) line7 / line8;
        double line32 = (double) line8 / line8;
        double line33 = (double) line9 / line8;
        double line34 = (double) line10 / line8;
        double line35 = (double) line11 / line8;
        double line36 = (double) line12 / line8;

        String result31 = String.format("%.1f", line31);
        String result32 = String.format("%.1f", line32);
        String result33 = String.format("%.1f", line33);
        String result34 = String.format("%.1f", line34);
        String result35 = String.format("%.1f", line35);
        String result36 = String.format("%.1f", line36);

        // Вывод расчета деления 2 строки
        String S16 = result1 + "   " + result2 + "    " + result3 + "   " + result4 + "    " + result5 + "    " + result6;
        textView50.setText(S16);
        String S17 = result31 + "   " + result32 + "    " + result33 + "   " + result34 + "     " + result35 + "     " + result36;
        textView51.setText(S17);
        String S18 = result13 + "   " + result14 + "    " + result15 + "   " + result16 + "     " + result17 + "     " + result18;
        textView52.setText(S18);
        String S19 = result19 + "   " + result20 + "    " + result21 + "   " + result22 + "     " + result23 + "     " + result24;
        textView53.setText(S19);
        String S20 = result25 + "   " + result26 + "    " + result27 + "   " + result28 + "     " + result29 + "     " + result30;
        textView54.setText(S20);

        String str3 = "от 1 строки отнимаем 2 строку, умноженную на " + result2 + " от 3 строки отнимаем 2 строку, умноженную на " + result14 + " к 4 строке добавлем 2 строку, умноженную на " + result20 + " к 5 строке добавляем 2 строку, умноженную на " + result26;
        textView55.setText(str3);

        // расчет от 1 строки отнимаем 2 строку, умноженную на result2
        double line37 = (double) line1 - line31 * line2;
        double line38 = (double) line2 - line32 * line2;
        double line39 = (double) line3 - line33 * line2;
        double line40 = (double) line4 - line34 * line2;
        double line41 = (double) line5 - line35 * line2;
        double line42 = (double) line6 - line36 * line2;

        String result37 = String.format("%.1f", line37);
        String result38 = String.format("%.1f", line38);
        String result39 = String.format("%.1f", line39);
        String result40 = String.format("%.1f", line40);
        String result41 = String.format("%.1f", line41);
        String result42 = String.format("%.1f", line42);

        // расчет от 3 строки отнимаем 2 строку, умноженную на result14
        double line43 = (double) line13 - line31 * line14;
        double line44 = (double) line14 - line32 * line14;
        double line45 = (double) line15 - line33 * line14;
        double line46 = (double) line16 - line34 * line14;
        double line47 = (double) line17 - line35 * line14;
        double line48 = (double) line18 - line36 * line14;

        String result43 = String.format("%.1f", line43);
        String result44 = String.format("%.1f", line44);
        String result45 = String.format("%.1f", line45);
        String result46 = String.format("%.1f", line46);
        String result47 = String.format("%.1f", line47);
        String result48 = String.format("%.1f", line48);

        // расчет к 4 строке добавлем 2 строку, умноженную на result20
        double line49 = (double) line19 - line31 * line20;
        double line50 = (double) line20 - line32 * line20;
        double line51 = (double) line21 - line33 * line20;
        double line52 = (double) line22 - line34 * line20;
        double line53 = (double) line23 - line35 * line20;
        double line54 = (double) line24 - line36 * line20;

        String result49 = String.format("%.1f", line49);
        String result50 = String.format("%.1f", line50);
        String result51 = String.format("%.1f", line51);
        String result52 = String.format("%.1f", line52);
        String result53 = String.format("%.1f", line53);
        String result54 = String.format("%.1f", line54);

        // расчет к 5 строке добавляем 2 строку, умноженную на result26
        double line55 = (double) line25 - line31 * line26;
        double line56 = (double) line26 - line32 * line26;
        double line57 = (double) line27 - line33 * line26;
        double line58 = (double) line28 - line34 * line26;
        double line59 = (double) line29 - line35 * line26;
        double line60 = (double) line30 - line36 * line26;

        String result55 = String.format("%.1f", line55);
        String result56 = String.format("%.1f", line56);
        String result57 = String.format("%.1f", line57);
        String result58 = String.format("%.1f", line58);
        String result59 = String.format("%.1f", line59);
        String result60 = String.format("%.1f", line60);

        // Вывод результата вычисления в матрицу
        String S21 = result37 + "   " + result38 + "    " + result39 + "   " + result40 + "    " + result41 + "    " + result42;
        textView56.setText(S21);
        String S22 = result31 + "   " + result32 + "    " + result33 + "   " + result34 + "     " + result35 + "     " + result36;
        textView57.setText(S22);
        String S23 = result43 + "   " + result44 + "    " + result45 + "   " + result46 + "     " + result47 + "     " + result48;
        textView58.setText(S23);
        String S24 = result49 + "   " + result50 + "    " + result51 + "   " + result52 + "     " + result53 + "     " + result54;
        textView59.setText(S24);
        String S25 = result55 + "   " + result56 + "    " + result57 + "   " + result58 + "     " + result59 + "     " + result60;
        textView60.setText(S25);

        String str4 = "3-ую строку делим на " + result45;
        textView61.setText(str4);

        // расчет 3-ую строку делим на result45;
        double line61 = (double) line43 / line45;
        double line62 = (double) line44 / line45;
        double line63 = (double) line45 / line45;
        double line64 = (double) line46 / line45;
        double line65 = (double) line47 / line45;
        double line66 = (double) line48 / line45;

        String result61 = String.format("%.1f", line61);
        String result62 = String.format("%.1f", line62);
        String result63 = String.format("%.1f", line63);
        String result64 = String.format("%.1f", line64);
        String result65 = String.format("%.1f", line65);
        String result66 = String.format("%.1f", line66);

        // Вывод расчета деления 3 строки
        String S26 = result37 + "   " + result38 + "    " + result39 + "   " + result40 + "    " + result41 + "    " + result42;
        textView62.setText(S26);
        String S27 = result31 + "   " + result32 + "    " + result33 + "   " + result34 + "     " + result35 + "     " + result36;
        textView63.setText(S27);
        String S28 = result61 + "   " + result62 + "    " + result63 + "   " + result64 + "     " + result65 + "     " + result66;
        textView64.setText(S28);
        String S29 = result49 + "   " + result50 + "    " + result51 + "   " + result52 + "     " + result53 + "     " + result54;
        textView65.setText(S29);
        String S30 = result55 + "   " + result56 + "    " + result57 + "   " + result58 + "     " + result59 + "     " + result60;
        textView66.setText(S30);

        String str5 = "от 1 строки отнимаем 3 строку, умноженную на " + result39 + " от 2 строки отнимаем 3 строку, умноженную на " + result33 + " к 4 строке добавляем  3 строку, умноженную на " + result51 + " к 5 строке добавляем 3 строку, умноженную на " + result57;
        textView67.setText(str5);

        // расчет от 1 строки отнимаем 3 строку, умноженную на result39
        double line67 = (double) line37 - line61 * line39;
        double line68 = (double) line38 - line62 * line39;
        double line69 = (double) line39 - line63 * line39;
        double line70 = (double) line40 - line64 * line39;
        double line71 = (double) line41 - line65 * line39;
        double line72 = (double) line42 - line66 * line39;

        String result67 = String.format("%.1f", line67);
        String result68 = String.format("%.1f", line68);
        String result69 = String.format("%.1f", line69);
        String result70 = String.format("%.1f", line70);
        String result71 = String.format("%.1f", line71);
        String result72 = String.format("%.1f", line72);

        // расчет от 2 строки отнимаем 3 строку, умноженную на result33
        double line73 = (double) line31 - line61 * line33;
        double line74 = (double) line32 - line62 * line33;
        double line75 = (double) line33 - line63 * line33;
        double line76 = (double) line34 - line64 * line33;
        double line77 = (double) line35 - line65 * line33;
        double line78 = (double) line36 - line66 * line33;

        String result73 = String.format("%.1f", line73);
        String result74 = String.format("%.1f", line74);
        String result75 = String.format("%.1f", line75);
        String result76 = String.format("%.1f", line76);
        String result77 = String.format("%.1f", line77);
        String result78 = String.format("%.1f", line78);

        // расчетк к 4 строке добавляем 3 строку, умноженную на result51
        double line79 = (double) line49 - line61 * line51;
        double line80 = (double) line50 - line62 * line51;
        double line81 = (double) line51 - line63 * line51;
        double line82 = (double) line52 - line64 * line51;
        double line83 = (double) line53 - line65 * line51;
        double line84 = (double) line54 - line66 * line51;

        String result79 = String.format("%.1f", line79);
        String result80 = String.format("%.1f", line80);
        String result81 = String.format("%.1f", line81);
        String result82 = String.format("%.1f", line82);
        String result83 = String.format("%.1f", line83);
        String result84 = String.format("%.1f", line84);

        // расчетк к 5 строке добавляем 3 строку, умноженную на result57
        double line85 = (double) line55 - line61 * line57;
        double line86 = (double) line56 - line62 * line57;
        double line87 = (double) line57 - line63 * line57;
        double line88 = (double) line58 - line64 * line57;
        double line89 = (double) line59 - line65 * line57;
        double line90 = (double) line60 - line66 * line57;

        String result85 = String.format("%.1f", line85);
        String result86 = String.format("%.1f", line86);
        String result87 = String.format("%.1f", line87);
        String result88 = String.format("%.1f", line88);
        String result89 = String.format("%.1f", line89);
        String result90 = String.format("%.1f", line90);

        // Вывод результата вычисления в матрицу
        String S31 = result67 + "   " + result68 + "    " + result69 + "   " + result70 + "    " + result71 + "    " + result72;
        textView68.setText(S31);
        String S32 = result73 + "   " + result74 + "    " + result75 + "   " + result76 + "    " + result77 + "    " + result78;
        textView69.setText(S32);
        String S33 = result61 + "   " + result62 + "    " + result63 + "   " + result64 + "     " + result65 + "     " + result66;
        textView70.setText(S33);
        String S34 = result79 + "   " + result80 + "    " + result81 + "   " + result82 + "     " + result83 + "     " + result84;
        textView71.setText(S34);
        String S35 = result85 + "   " + result86 + "    " + result87 + "   " + result88 + "     " + result89 + "     " + result90;
        textView72.setText(S35);

        String str6 = "4-ую строку делим на " + result82;
        textView73.setText(str6);
        // расчет деления 4 строки в матрице на result82
        double line91 = (double) line79 / line82;
        double line92 = (double) line80 / line82;
        double line93 = (double) line81 / line82;
        double line94 = (double) line82 / line82;
        double line95 = (double) line83 / line82;
        double line96 = (double) line84 / line82;

        String result91 = String.format("%.1f", line91);
        String result92 = String.format("%.1f", line92);
        String result93 = String.format("%.1f", line93);
        String result94 = String.format("%.1f", line94);
        String result95 = String.format("%.1f", line95);
        String result96 = String.format("%.1f", line96);

        // Вывод расчета деления 4 строки
        String S36 = result67 + "   " + result68 + "    " + result69 + "   " + result70 + "    " + result71 + "    " + result72;
        textView74.setText(S36);
        String S37 = result73 + "   " + result74 + "    " + result75 + "   " + result76 + "    " + result77 + "    " + result78;
        textView75.setText(S37);
        String S38 = result61 + "   " + result62 + "    " + result63 + "   " + result64 + "     " + result65 + "     " + result66;
        textView76.setText(S38);
        String S39 = result91 + "   " + result92 + "    " + result93 + "   " + result94 + "     " + result95 + "     " + result96;
        textView77.setText(S39);
        String S40 = result85 + "   " + result86 + "    " + result87 + "   " + result88 + "     " + result89 + "     " + result90;
        textView78.setText(S40);

        String str7 = "от 1 строки отнимаем 4 строку, умноженную на " + result70 + " от 2 строки отнимаем 4 строку, умноженную на " + result76 + " к 3 строке добавлем 4 строку, умноженную на " + result64 + " к 5 строке добавлем 4 строку, умноженную на " + result88;
        textView79.setText(str7);

        // расчет от 1 строки отнимаем 4 строку, умноженную на result70
        double line97 = (double) line67 - line91 * line70;
        double line98 = (double) line68 - line92 * line70;
        double line99 = (double) line69 - line93 * line70;
        double line100 = (double) line70 - line94 * line70;
        double line101 = (double) line71 - line95 * line70;
        double line102 = (double) line72 - line96 * line70;

        String result97 = String.format("%.1f", line97);
        String result98 = String.format("%.1f", line98);
        String result99 = String.format("%.1f", line99);
        String result100 = String.format("%.1f", line100);
        String result101 = String.format("%.1f", line101);
        String result102 = String.format("%.1f", line102);

        // расчет от 2 строки отнимаем 4 строку, умноженную на " + result76
        double line103 = (double) line73 - line91 * line76;
        double line104 = (double) line74 - line92 * line76;
        double line105 = (double) line75 - line93 * line76;
        double line106 = (double) line76 - line94 * line76;
        double line107 = (double) line77 - line95 * line76;
        double line108 = (double) line78 - line96 * line76;

        String result103 = String.format("%.1f", line103);
        String result104 = String.format("%.1f", line104);
        String result105 = String.format("%.1f", line105);
        String result106 = String.format("%.1f", line106);
        String result107 = String.format("%.1f", line107);
        String result108 = String.format("%.1f", line108);

        // расчет к 3 строке добавлем 4 строку, умноженную на result64
        double line109 = (double) line61 - line91 * line64;
        double line110 = (double) line62 - line92 * line64;
        double line111 = (double) line63 - line93 * line64;
        double line112 = (double) line64 - line94 * line64;
        double line113 = (double) line65 - line95 * line64;
        double line114 = (double) line66 - line96 * line64;

        String result109 = String.format("%.1f", line109);
        String result110 = String.format("%.1f", line110);
        String result111 = String.format("%.1f", line111);
        String result112 = String.format("%.1f", line112);
        String result113 = String.format("%.1f", line113);
        String result114 = String.format("%.1f", line114);

        // расчет к 5 строки добавлем 4 строку, умноженную на result88
        double line115 = (double) line85 - line91 * line88;
        double line116 = (double) line86 - line92 * line88;
        double line117 = (double) line87 - line93 * line88;
        double line118 = (double) line88 - line94 * line88;
        double line119 = (double) line89 - line95 * line88;
        double line120 = (double) line90 - line96 * line88;

        String result115 = String.format("%.1f", line115);
        String result116 = String.format("%.1f", line116);
        String result117 = String.format("%.1f", line117);
        String result118 = String.format("%.1f", line118);
        String result119 = String.format("%.1f", line119);
        String result120 = String.format("%.1f", line120);

        // Вывод расчета в матрицу
        String S41 = result97 + "   " + result98 + "    " + result99 + "   " + result100 + "     " + result101 + "     " + result102;
        textView80.setText(S41);
        String S42 = result103 + "   " + result104 + "    " + result105 + "   " + result106 + "     " + result107 + "     " + result108;
        textView81.setText(S42);
        String S43 = result109 + "   " + result110 + "    " + result111 + "   " + result112 + "     " + result113 + "     " + result114;
        textView82.setText(S43);
        String S44 = result91 + "   " + result92 + "    " + result93 + "   " + result94 + "     " + result95 + "     " + result96;
        textView83.setText(S44);
        String S45 = result115 + "   " + result116 + "    " + result117 + "   " + result118 + "     " + result119 + "     " + result120;
        textView84.setText(S45);


        String str8 = "5-ую строку делим на " + result119;
        textView85.setText(str8);
        // расчет деления 5 строки в матрице на result119
        double line121 = (double) line115 / line119;
        double line122 = (double) line116 / line119;
        double line123 = (double) line117 / line119;
        double line124 = (double) line118 / line119;
        double line125 = (double) line119 / line119;
        double line126 = (double) line120 / line119;

        String result121 = String.format("%.1f", line121);
        String result122 = String.format("%.1f", line122);
        String result123 = String.format("%.1f", line123);
        String result124 = String.format("%.1f", line124);
        String result125 = String.format("%.1f", line125);
        String result126 = String.format("%.1f", line126);

        // Вывод расчета деления 5 строки
        String S46 = result97 + "   " + result98 + "    " + result99 + "   " + result100 + "     " + result101 + "     " + result102;
        textView86.setText(S46);
        String S47 = result103 + "   " + result104 + "    " + result105 + "   " + result106 + "     " + result107 + "     " + result108;
        textView87.setText(S47);
        String S48 = result109 + "   " + result110 + "    " + result111 + "   " + result112 + "     " + result113 + "     " + result114;
        textView88.setText(S48);
        String S49 = result91 + "   " + result92 + "    " + result93 + "   " + result94 + "     " + result95 + "     " + result96;
        textView89.setText(S49);
        String S50 = result121 + "   " + result122 + "    " + result123 + "   " + result124 + "     " + result125 + "     " + result126;
        textView90.setText(S50);

        String str9 = "к 1 строке добавлем 5 строку, умноженную на " + result101 + " от 2 строки отнимаем 5 строку, умноженную на " + result107 + " от 3 строки отнимаем 5 строку, умноженную на " + result113 + " от 4 строки отнимаем 5 строку, умноженную на " + result95;
        textView91.setText(str9);
        // расчет к 1 строке добавлем 5 строку, умноженную на result101
        double line127 = (double) line97 - line121 * line101;
        double line128 = (double) line98 - line122 * line101;
        double line129 = (double) line99 - line123 * line101;
        double line130 = (double) line100 - line124 * line101;
        double line131 = (double) line101 - line125 * line101;
        double line132 = (double) line102 - line126 * line101;

        String result127 = String.format("%.1f", line127);
        String result128 = String.format("%.1f", line128);
        String result129 = String.format("%.1f", line129);
        String result130 = String.format("%.1f", line130);
        String result131 = String.format("%.1f", line131);
        String result132 = String.format("%.1f", line132);

        // расчетот 2 строки отнимаем 5 строку, умноженную на result107
        double line133 = (double) line103 - line121 * line107;
        double line134 = (double) line104 - line122 * line107;
        double line135 = (double) line104 - line123 * line107;
        double line136 = (double) line106 - line124 * line107;
        double line137 = (double) line107 - line125 * line107;
        double line138 = (double) line108 - line126 * line107;

        String result133 = String.format("%.1f", line133);
        String result134 = String.format("%.1f", line134);
        String result135 = String.format("%.1f", line135);
        String result136 = String.format("%.1f", line136);
        String result137 = String.format("%.1f", line137);
        String result138 = String.format("%.1f", line138);

        // расчет от 3 строки отнимаем 5 строку, умноженную на result113
        double line139 = (double) line109 - line121 * line113;
        double line140 = (double) line110 - line122 * line113;
        double line141 = (double) line111 - line123 * line113;
        double line142 = (double) line112 - line124 * line113;
        double line143 = (double) line113 - line125 * line113;
        double line144 = (double) line114 - line126 * line113;

        String result139 = String.format("%.1f", line139);
        String result140 = String.format("%.1f", line140);
        String result141 = String.format("%.1f", line141);
        String result142 = String.format("%.1f", line142);
        String result143 = String.format("%.1f", line143);
        String result144 = String.format("%.1f", line144);

        // расчет от 4 строки отнимаем 5 строку, умноженную на result95
        double line145 = (double) line91 - line121 * line95;
        double line146 = (double) line92 - line122 * line95;
        double line147 = (double) line93 - line123 * line95;
        double line148 = (double) line94 - line124 * line95;
        double line149 = (double) line95 - line125 * line95;
        double line150 = (double) line96 - line126 * line95;

        String result145 = String.format("%.1f", line145);
        String result146 = String.format("%.1f", line146);
        String result147 = String.format("%.1f", line147);
        String result148 = String.format("%.1f", line148);
        String result149 = String.format("%.1f", line149);
        String result150 = String.format("%.1f", line150);

        // Вывод расчета в матрицу
        String S51 = result127 + "   " + result128 + "    " + result129 + "   " + result130 + "     " + result131 + "     " + result132;
        textView92.setText(S51);
        String S52 = result133 + "   " + result134 + "    " + result135 + "   " + result136 + "     " + result137 + "     " + result138;
        textView93.setText(S52);
        String S53 = result139 + "   " + result140 + "    " + result141 + "   " + result142 + "     " + result143 + "     " + result144;
        textView94.setText(S53);
        String S54 = result145 + "   " + result146 + "    " + result147 + "   " + result148 + "     " + result149 + "     " + result150;
        textView95.setText(S54);
        String S55 = result121 + "   " + result122 + "    " + result123 + "   " + result124 + "     " + result125 + "     " + result126;
        textView96.setText(S55);

        String str10 = " Ответ: ";
        textView97.setText(str10);
        String str11 = " X1 = " + result132;
        textView98.setText(str11);
        String str12 = " X2 = " + result138;
        textView99.setText(str12);
        String str13 = " X3 = " + result144;
        textView100.setText(str13);
        String str14 = " X4 = " + result150;
        textView101.setText(str14);
        String str15 = " X5 = " + result126;
        textView102.setText(str15);

        // Скрываем не нужный вывод результата
        textView103.setVisibility(View.INVISIBLE);
        textView104.setVisibility(View.INVISIBLE);
        textView105.setVisibility(View.INVISIBLE);
        textView106.setVisibility(View.INVISIBLE);
        textView107.setVisibility(View.INVISIBLE);
        textView108.setVisibility(View.INVISIBLE);
        textView109.setVisibility(View.INVISIBLE);
        textView110.setVisibility(View.INVISIBLE);
        textView111.setVisibility(View.INVISIBLE);
        textView112.setVisibility(View.INVISIBLE);
        textView113.setVisibility(View.INVISIBLE);
        textView114.setVisibility(View.INVISIBLE);


        // Делаем проверку если пользователь заполнил матрицу нулями
        if (a11 == 0 && a12 == 0 && a13 == 0 && a14 == 0 && a15 == 0 && b1 == 0 && a21 == 0 && a22 == 0 && a23 == 0 && a24 == 0 && a25 == 0 && b2 == 0 && a31 == 0 && a32 == 0 && a33 == 0 && a34 == 0 && a35 == 0 && b3 == 0 && a41 == 0 && a42 == 0 && a43 == 0 && a44 == 0 && a45 == 0 && b4 == 0 && a51 == 0 && a52 == 0 && a53 == 0 && a54 == 0 && a55 == 0 && b5 == 0) {
            textView31.setText("Перепишем систему уравнений в матричном виде");
            // Вывод общей матрицы
            String S297 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
            textView32.setText(S297);
            String S298 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
            textView33.setText(S298);
            String S299 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
            textView34.setText(S299);
            String S300 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
            textView35.setText(S300);
            String S301 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
            textView36.setText(S301);

            String str74 = " Ответ: ";
            textView37.setText(str74);
            String str75 = " Система имеет множество решений: ";
            textView38.setText(str75);
            textView39.setText(a15 + " = " + b1 + "  " + a25 + " = " + b2 + "  " + a35 + " = " + b3 + "  " + a45 + " = " + b4 + a55 + "  " + b5);

            // Скрываем не нужный вывод результата
            textView40.setVisibility(View.INVISIBLE);
            textView41.setVisibility(View.INVISIBLE);
            textView42.setVisibility(View.INVISIBLE);
            textView43.setVisibility(View.INVISIBLE);
            textView44.setVisibility(View.INVISIBLE);
            textView45.setVisibility(View.INVISIBLE);
            textView46.setVisibility(View.INVISIBLE);
            textView47.setVisibility(View.INVISIBLE);
            textView48.setVisibility(View.INVISIBLE);
            textView49.setVisibility(View.INVISIBLE);
            textView50.setVisibility(View.INVISIBLE);
            textView51.setVisibility(View.INVISIBLE);
            textView52.setVisibility(View.INVISIBLE);
            textView53.setVisibility(View.INVISIBLE);
            textView54.setVisibility(View.INVISIBLE);
            textView55.setVisibility(View.INVISIBLE);
            textView56.setVisibility(View.INVISIBLE);
            textView57.setVisibility(View.INVISIBLE);
            textView58.setVisibility(View.INVISIBLE);
            textView59.setVisibility(View.INVISIBLE);
            textView60.setVisibility(View.INVISIBLE);
            textView61.setVisibility(View.INVISIBLE);
            textView62.setVisibility(View.INVISIBLE);
            textView63.setVisibility(View.INVISIBLE);
            textView64.setVisibility(View.INVISIBLE);
            textView65.setVisibility(View.INVISIBLE);
            textView66.setVisibility(View.INVISIBLE);
            textView67.setVisibility(View.INVISIBLE);
            textView68.setVisibility(View.INVISIBLE);
            textView69.setVisibility(View.INVISIBLE);
            textView70.setVisibility(View.INVISIBLE);
            textView71.setVisibility(View.INVISIBLE);
            textView72.setVisibility(View.INVISIBLE);
            textView73.setVisibility(View.INVISIBLE);
            textView74.setVisibility(View.INVISIBLE);
            textView75.setVisibility(View.INVISIBLE);
            textView76.setVisibility(View.INVISIBLE);
            textView77.setVisibility(View.INVISIBLE);
            textView78.setVisibility(View.INVISIBLE);
            textView79.setVisibility(View.INVISIBLE);
            textView80.setVisibility(View.INVISIBLE);
            textView81.setVisibility(View.INVISIBLE);
            textView81.setVisibility(View.INVISIBLE);
            textView82.setVisibility(View.INVISIBLE);
            textView83.setVisibility(View.INVISIBLE);
            textView84.setVisibility(View.INVISIBLE);
            textView85.setVisibility(View.INVISIBLE);
            textView86.setVisibility(View.INVISIBLE);
            textView87.setVisibility(View.INVISIBLE);
            textView88.setVisibility(View.INVISIBLE);
            textView89.setVisibility(View.INVISIBLE);
            textView90.setVisibility(View.INVISIBLE);
            textView91.setVisibility(View.INVISIBLE);
            textView92.setVisibility(View.INVISIBLE);
            textView93.setVisibility(View.INVISIBLE);
            textView94.setVisibility(View.INVISIBLE);
            textView95.setVisibility(View.INVISIBLE);
            textView96.setVisibility(View.INVISIBLE);
            textView97.setVisibility(View.INVISIBLE);
            textView98.setVisibility(View.INVISIBLE);
            textView99.setVisibility(View.INVISIBLE);
            textView100.setVisibility(View.INVISIBLE);
            textView101.setVisibility(View.INVISIBLE);
            textView102.setVisibility(View.INVISIBLE);
        } else {
            if (a11 == 0 && a12 == 0 && a13 == 0 && a14 == 0 && a15 == 0 && b1 == 0) {

                String str16 = "поменяем 1-ую строку и 2-ую строку местами ";
                textView37.setText(str16);
                // Вывод результата перемещения 1 и 2 строки в матрице
                String S56 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                textView38.setText(S56);
                String S57 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView39.setText(S57);
                String S58 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                textView40.setText(S58);
                String S59 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                textView41.setText(S59);
                String S60 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                textView42.setText(S60);


                String str17 = "1-ую строку делим на " + a21;
                textView43.setText(str17);
                // расчет деления 5 строки
                double line151 = (double) a21 / a21;
                double line152 = (double) a22 / a21;
                double line153 = (double) a23 / a21;
                double line154 = (double) a24 / a21;
                double line155 = (double) a25 / a21;
                double line156 = (double) b2 / a21;

                String result151 = String.format("%.1f", line151);
                String result152 = String.format("%.1f", line152);
                String result153 = String.format("%.1f", line153);
                String result154 = String.format("%.1f", line154);
                String result155 = String.format("%.1f", line155);
                String result156 = String.format("%.1f", line156);

                // Вывод в матрицу деления 5 строки
                String S61 = result151 + "   " + result152 + "    " + result153 + "  " + result154 + "  " + result155 + "  " + result156;
                textView44.setText(S61);
                String S62 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView45.setText(S62);
                String S63 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                textView46.setText(S63);
                String S64 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                textView47.setText(S64);
                String S65 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                textView48.setText(S65);


                String str18 = "от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 4 строки отнимаем 1 строку, умноженную на " + a41 + " от 5 строки отнимаем 1 строку, умноженную на " + a51;
                textView49.setText(str18);

                // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                double line157 = (double) a31 - line151 * a31;
                double line158 = (double) a32 - line152 * a31;
                double line159 = (double) a33 - line153 * a31;
                double line160 = (double) a34 - line154 * a31;
                double line161 = (double) a35 - line155 * a31;
                double line162 = (double) b3 - line156 * a31;

                String result157 = String.format("%.1f", line157);
                String result158 = String.format("%.1f", line158);
                String result159 = String.format("%.1f", line159);
                String result160 = String.format("%.1f", line160);
                String result161 = String.format("%.1f", line161);
                String result162 = String.format("%.1f", line162);

                // расчет от 4 строки отнимаем 1 строку, умноженную на a41
                double line163 = (double) a41 - line151 * a41;
                double line164 = (double) a42 - line152 * a41;
                double line165 = (double) a43 - line153 * a41;
                double line166 = (double) a44 - line154 * a41;
                double line167 = (double) a45 - line155 * a41;
                double line168 = (double) b4 - line156 * a41;

                String result163 = String.format("%.1f", line163);
                String result164 = String.format("%.1f", line164);
                String result165 = String.format("%.1f", line165);
                String result166 = String.format("%.1f", line166);
                String result167 = String.format("%.1f", line167);
                String result168 = String.format("%.1f", line168);

                // расчет от 5 строки отнимаем 1 строку, умноженную на a51
                double line169 = (double) a51 - line151 * a51;
                double line170 = (double) a52 - line152 * a51;
                double line171 = (double) a53 - line153 * a51;
                double line172 = (double) a54 - line154 * a51;
                double line173 = (double) a55 - line155 * a51;
                double line174 = (double) b5 - line156 * a51;

                String result169 = String.format("%.1f", line169);
                String result170 = String.format("%.1f", line170);
                String result171 = String.format("%.1f", line171);
                String result172 = String.format("%.1f", line172);
                String result173 = String.format("%.1f", line173);
                String result174 = String.format("%.1f", line174);

                // Вывод результата вычисления в матрицу
                String S66 = result151 + "   " + result152 + "    " + result153 + "  " + result154 + "  " + result155 + "  " + result156;
                textView50.setText(S66);
                String S67 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView51.setText(S67);
                String S68 = result157 + "   " + result158 + "    " + result159 + "  " + result160 + "  " + result161 + "  " + result162;
                textView52.setText(S68);
                String S69 = result163 + "   " + result164 + "    " + result165 + "  " + result166 + "  " + result167 + "  " + result168;
                textView53.setText(S69);
                String S70 = result169 + "   " + result170 + "    " + result171 + "  " + result172 + "  " + result173 + "  " + result174;
                textView54.setText(S70);

                String str19 = "поменяем 2-ую строку и 3-ую строку местами ";
                textView55.setText(str19);
                // Вывод результата перемещения 2 и 3 строки в матрице
                String S71 = result151 + "   " + result152 + "    " + result153 + "  " + result154 + "  " + result155 + "  " + result156;
                textView56.setText(S71);
                String S72 = result157 + "   " + result158 + "    " + result159 + "  " + result160 + "  " + result161 + "  " + result162;
                textView57.setText(S72);
                String S73 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView58.setText(S73);
                String S74 = result163 + "   " + result164 + "    " + result165 + "  " + result166 + "  " + result167 + "  " + result168;
                textView59.setText(S74);
                String S75 = result169 + "   " + result170 + "    " + result171 + "  " + result172 + "  " + result173 + "  " + result174;
                textView60.setText(S75);

                String str20 = "2-ую строку делим на " + result158;
                textView61.setText(str20);
                // расчет деления 2 строки
                double line175 = (double) line157 / line158;
                double line176 = (double) line158 / line158;
                double line177 = (double) line159 / line158;
                double line178 = (double) line160 / line158;
                double line179 = (double) line161 / line158;
                double line180 = (double) line162 / line158;

                String result175 = String.format("%.1f", line175);
                String result176 = String.format("%.1f", line176);
                String result177 = String.format("%.1f", line177);
                String result178 = String.format("%.1f", line178);
                String result179 = String.format("%.1f", line179);
                String result180 = String.format("%.1f", line180);

                // Вывод в матрицу деления 2 строки
                String S76 = result151 + "   " + result152 + "    " + result153 + "  " + result154 + "  " + result155 + "  " + result156;
                textView62.setText(S76);
                String S77 = result175 + "   " + result176 + "    " + result177 + "  " + result178 + "  " + result179 + "  " + result180;
                textView63.setText(S77);
                String S78 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView64.setText(S78);
                String S79 = result163 + "   " + result164 + "    " + result165 + "  " + result166 + "  " + result167 + "  " + result168;
                textView65.setText(S79);
                String S80 = result169 + "   " + result170 + "    " + result171 + "  " + result172 + "  " + result173 + "  " + result174;
                textView66.setText(S80);

                String str21 = "от 1 строки отнимаем 2 строку, умноженную на " + result152 + " от 4 строки отнимаем 2 строку, умноженную на " + result164 + " от 5 строки отнимаем 2 строку, умноженную на " + result170;
                textView67.setText(str21);

                // расчет от 1 строки отнимаем 2 строку, умноженную на result152
                double line181 = (double) line151 - line175 * line152;
                double line182 = (double) line152 - line176 * line152;
                double line183 = (double) line153 - line177 * line152;
                double line184 = (double) line154 - line178 * line152;
                double line185 = (double) line155 - line179 * line152;
                double line186 = (double) line156 - line180 * line152;

                String result181 = String.format("%.1f", line181);
                String result182 = String.format("%.1f", line182);
                String result183 = String.format("%.1f", line183);
                String result184 = String.format("%.1f", line184);
                String result185 = String.format("%.1f", line185);
                String result186 = String.format("%.1f", line186);

                // расчет от 4 строки отнимаем 2 строку, умноженную на result164
                double line187 = (double) line163 - line175 * line164;
                double line188 = (double) line164 - line176 * line164;
                double line189 = (double) line165 - line177 * line164;
                double line190 = (double) line166 - line178 * line164;
                double line191 = (double) line167 - line179 * line164;
                double line192 = (double) line168 - line180 * line164;

                String result187 = String.format("%.1f", line187);
                String result188 = String.format("%.1f", line188);
                String result189 = String.format("%.1f", line189);
                String result190 = String.format("%.1f", line190);
                String result191 = String.format("%.1f", line191);
                String result192 = String.format("%.1f", line192);

                // расчет от 5 строки отнимаем 2 строку, умноженную на result170
                double line193 = (double) line169 - line175 * line170;
                double line194 = (double) line170 - line176 * line170;
                double line195 = (double) line171 - line177 * line170;
                double line196 = (double) line172 - line178 * line170;
                double line197 = (double) line173 - line179 * line170;
                double line198 = (double) line174 - line180 * line170;

                String result193 = String.format("%.1f", line193);
                String result194 = String.format("%.1f", line194);
                String result195 = String.format("%.1f", line195);
                String result196 = String.format("%.1f", line196);
                String result197 = String.format("%.1f", line197);
                String result198 = String.format("%.1f", line198);

                // Вывод результата вычисления в матрицу
                String S81 = result181 + "   " + result182 + "    " + result183 + "  " + result184 + "  " + result185 + "  " + result186;
                textView68.setText(S81);
                String S82 = result175 + "   " + result176 + "    " + result177 + "  " + result178 + "  " + result179 + "  " + result180;
                textView69.setText(S82);
                String S83 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView70.setText(S83);
                String S84 = result187 + "   " + result188 + "    " + result189 + "  " + result190 + "  " + result191 + "  " + result192;
                textView71.setText(S84);
                String S85 = result193 + "   " + result194 + "    " + result195 + "  " + result196 + "  " + result197 + "  " + result198;
                textView72.setText(S85);

                String str22 = "поменяем 3-ую строку и 4-ую строку местами ";
                textView73.setText(str22);
                // Вывод результата перемещения 3 и 4 строки в матрице
                String S86 = result181 + "   " + result182 + "    " + result183 + "  " + result184 + "  " + result185 + "  " + result186;
                textView74.setText(S86);
                String S87 = result175 + "   " + result176 + "    " + result177 + "  " + result178 + "  " + result179 + "  " + result180;
                textView75.setText(S87);
                String S88 = result187 + "   " + result188 + "    " + result189 + "  " + result190 + "  " + result191 + "  " + result192;
                textView76.setText(S88);
                String S89 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView77.setText(S89);
                String S90 = result193 + "   " + result194 + "    " + result195 + "  " + result196 + "  " + result197 + "  " + result198;
                textView78.setText(S90);

                String str23 = "3-ую строку делим на " + result189;
                textView79.setText(str23);
                // расчет деления 3 строки в матрице на result189
                double line199 = (double) line187 / line189;
                double line200 = (double) line188 / line189;
                double line201 = (double) line189 / line189;
                double line202 = (double) line190 / line189;
                double line203 = (double) line191 / line189;
                double line204 = (double) line192 / line189;

                String result199 = String.format("%.1f", line199);
                String result200 = String.format("%.1f", line200);
                String result201 = String.format("%.1f", line201);
                String result202 = String.format("%.1f", line202);
                String result203 = String.format("%.1f", line203);
                String result204 = String.format("%.1f", line204);

                // Вывод в матрицу деления 3 строки
                String S91 = result181 + "   " + result182 + "    " + result183 + "  " + result184 + "  " + result185 + "  " + result186;
                textView80.setText(S91);
                String S92 = result175 + "   " + result176 + "    " + result177 + "  " + result178 + "  " + result179 + "  " + result180;
                textView81.setText(S92);
                String S93 = result199 + "   " + result200 + "    " + result201 + "  " + result202 + "  " + result203 + "  " + result204;
                textView82.setText(S93);
                String S94 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView83.setText(S94);
                String S96 = result193 + "   " + result194 + "    " + result195 + "  " + result196 + "  " + result197 + "  " + result198;
                textView84.setText(S96);

                String str24 = "от 1 строке отнимаем 3 строку, умноженную на " + result183 + " от 2 строки отнимаем 3 строку, умноженную на " + result177 + " к 5 строки добавляем 3 строку, умноженную на " + result195;
                textView85.setText(str24);

                // расчет от 1 строки отнимаем 3 строку, умноженную на result183
                double line205 = (double) line181 - line199 * line183;
                double line206 = (double) line182 - line200 * line183;
                double line207 = (double) line183 - line201 * line183;
                double line208 = (double) line184 - line202 * line183;
                double line209 = (double) line185 - line203 * line183;
                double line210 = (double) line186 - line204 * line183;

                String result205 = String.format("%.1f", line205);
                String result206 = String.format("%.1f", line206);
                String result207 = String.format("%.1f", line207);
                String result208 = String.format("%.1f", line208);
                String result209 = String.format("%.1f", line209);
                String result210 = String.format("%.1f", line210);

                // расчет от 2 строки отнимаем 3 строку, умноженную на result177
                double line211 = (double) line175 - line199 * line177;
                double line212 = (double) line176 - line200 * line177;
                double line213 = (double) line177 - line201 * line177;
                double line214 = (double) line178 - line202 * line177;
                double line215 = (double) line179 - line203 * line177;
                double line216 = (double) line180 - line204 * line177;

                String result211 = String.format("%.1f", line211);
                String result212 = String.format("%.1f", line212);
                String result213 = String.format("%.1f", line213);
                String result214 = String.format("%.1f", line214);
                String result215 = String.format("%.1f", line215);
                String result216 = String.format("%.1f", line216);

                // расчет к 5 строки добавляем 3 строку, умноженную на result195
                double line217 = (double) line193 - line199 * line195;
                double line218 = (double) line194 - line200 * line195;
                double line219 = (double) line195 - line201 * line195;
                double line220 = (double) line196 - line202 * line195;
                double line221 = (double) line197 - line203 * line195;
                double line222 = (double) line198 - line204 * line195;

                String result217 = String.format("%.1f", line217);
                String result218 = String.format("%.1f", line218);
                String result219 = String.format("%.1f", line219);
                String result220 = String.format("%.1f", line220);
                String result221 = String.format("%.1f", line221);
                String result222 = String.format("%.1f", line222);

                // Вывод результата вычисления в матрицу
                String S97 = result205 + "   " + result206 + "    " + result207 + "  " + result208 + "  " + result209 + "  " + result210;
                textView86.setText(S97);
                String S98 = result211 + "   " + result212 + "    " + result213 + "  " + result214 + "  " + result215 + "  " + result216;
                textView87.setText(S98);
                String S99 = result199 + "   " + result200 + "    " + result201 + "  " + result202 + "  " + result203 + "  " + result204;
                textView88.setText(S99);
                String S100 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView89.setText(S100);
                String S101 = result217 + "   " + result218 + "    " + result219 + "  " + result220 + "  " + result221 + "  " + result222;
                textView90.setText(S101);

                String str25 = "поменяем 4-ую строку и 5-ую строку местами ";
                textView91.setText(str25);
                // Вывод результата перемещения 4 и 5 строки в матрице
                String S102 = result205 + "   " + result206 + "    " + result207 + "  " + result208 + "  " + result209 + "  " + result210;
                textView92.setText(S102);
                String S103 = result211 + "   " + result212 + "    " + result213 + "  " + result214 + "  " + result215 + "  " + result216;
                textView93.setText(S103);
                String S104 = result199 + "   " + result200 + "    " + result201 + "  " + result202 + "  " + result203 + "  " + result204;
                textView94.setText(S104);
                String S105 = result217 + "   " + result218 + "    " + result219 + "  " + result220 + "  " + result221 + "  " + result222;
                textView95.setText(S105);
                String S106 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView96.setText(S106);

                String str26 = "4-ую строку делим на " + result220;
                textView97.setText(str26);
                // расчет деления 4 строки
                double line223 = (double) line217 / line220;
                double line224 = (double) line218 / line220;
                double line225 = (double) line219 / line220;
                double line226 = (double) line220 / line220;
                double line227 = (double) line221 / line220;
                double line228 = (double) line222 / line220;

                String result223 = String.format("%.1f", line223);
                String result224 = String.format("%.1f", line224);
                String result225 = String.format("%.1f", line225);
                String result226 = String.format("%.1f", line226);
                String result227 = String.format("%.1f", line227);
                String result228 = String.format("%.1f", line228);

                // Вывод в матрицу деления 4 строки
                String S107 = result205 + "   " + result206 + "    " + result207 + "  " + result208 + "  " + result209 + "  " + result210;
                textView98.setText(S107);
                String S108 = result211 + "   " + result212 + "    " + result213 + "  " + result214 + "  " + result215 + "  " + result216;
                textView99.setText(S108);
                String S109 = result199 + "   " + result200 + "    " + result201 + "  " + result202 + "  " + result203 + "  " + result204;
                textView100.setText(S109);
                String S110 = result223 + "   " + result224 + "    " + result225 + "  " + result226 + "  " + result227 + "  " + result228;
                textView101.setText(S110);
                String S111 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView102.setText(S111);


                String str27 = "к 1 строке добавляем 4  строку, умноженную на " + result208 + " к 2 строке добавляем 4 строку, умноженную на " + result214 + " от 3 строки отнимаем 4 строку, умноженную на " + result202;
                textView103.setText(str27);

                // расчет к 1 строки добавляем 4 строку, умноженную на result208
                double line229 = (double) line205 - line223 * line208;
                double line230 = (double) line206 - line224 * line208;
                double line231 = (double) line207 - line225 * line208;
                double line232 = (double) line208 - line226 * line208;
                double line233 = (double) line209 - line227 * line208;
                double line234 = (double) line210 - line228 * line208;

                String result229 = String.format("%.1f", line229);
                String result230 = String.format("%.1f", line230);
                String result231 = String.format("%.1f", line231);
                String result232 = String.format("%.1f", line232);
                String result233 = String.format("%.1f", line233);
                String result234 = String.format("%.1f", line234);

                // расчетк к 2 строке добавляем 4 строку, умноженную на result214
                double line235 = (double) line211 - line223 * line214;
                double line236 = (double) line212 - line224 * line214;
                double line237 = (double) line213 - line225 * line214;
                double line238 = (double) line214 - line226 * line214;
                double line239 = (double) line215 - line227 * line214;
                double line240 = (double) line216 - line228 * line214;

                String result235 = String.format("%.1f", line235);
                String result236 = String.format("%.1f", line236);
                String result237 = String.format("%.1f", line237);
                String result238 = String.format("%.1f", line238);
                String result239 = String.format("%.1f", line239);
                String result240 = String.format("%.1f", line240);

                // расчет от 3 строки отнимаем 4 строку, умноженную на result202
                double line241 = (double) line199 - line223 * line202;
                double line242 = (double) line200 - line224 * line202;
                double line243 = (double) line201 - line225 * line202;
                double line244 = (double) line202 - line226 * line202;
                double line245 = (double) line202 - line227 * line202;
                double line246 = (double) line204 - line228 * line202;

                String result241 = String.format("%.1f", line241);
                String result242 = String.format("%.1f", line242);
                String result243 = String.format("%.1f", line243);
                String result244 = String.format("%.1f", line244);
                String result245 = String.format("%.1f", line245);
                String result246 = String.format("%.1f", line246);

                // Вывод результата вычисления в матрицу
                String S112 = result229 + "   " + result230 + "    " + result231 + "  " + result232 + "  " + result233 + "  " + result234;
                textView104.setText(S112);
                String S113 = result235 + "   " + result236 + "    " + result237 + "  " + result238 + "  " + result239 + "  " + result240;
                textView105.setText(S113);
                String S114 = result241 + "   " + result242 + "    " + result243 + "  " + result244 + "  " + result245 + "  " + result246;
                textView106.setText(S114);
                String S115 = result223 + "   " + result224 + "    " + result225 + "  " + result226 + "  " + result227 + "  " + result228;
                textView107.setText(S115);
                String S116 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + b1;
                textView108.setText(S116);

                String str28 = " Ответ: ";
                textView109.setText(str28);
                String str29 = " Система имеет множество решений: ";
                textView110.setText(str29);
                textView111.setText(" x1 -  " + result233 + "x5" + " =" + result234);
                textView112.setText(" x2 +  " + result239 + "x5" + " =" + result240);
                textView113.setText(" x3 +  " + result245 + "x5" + " =" + result246);
                textView114.setText(" x4 +  " + result227 + "x5" + " =" + result228);

                /*
                textView103.setVisibility(View.VISIBLE);
                textView104.setVisibility(View.VISIBLE);
                textView105.setVisibility(View.VISIBLE);
                textView106.setVisibility(View.VISIBLE);
                textView107.setVisibility(View.VISIBLE);
                textView108.setVisibility(View.VISIBLE);
                textView109.setVisibility(View.VISIBLE);
                textView110.setVisibility(View.VISIBLE);
                textView111.setVisibility(View.VISIBLE);
                textView112.setVisibility(View.VISIBLE);
                textView113.setVisibility(View.VISIBLE);
                textView114.setVisibility(View.VISIBLE);

                 */
            } else {      // Проверяем если пользователь заполнил 2 строку нулями
                if (a21 == 0 && a22 == 0 && a23 == 0 && a24 == 0 && a25 == 0 && b2 == 0) {

                    String str30 = "1-ую строку делим на " + a11;
                    textView37.setText(str30);

                    // расчет деления 1 строки
                    double line247 = (double) a11 / a11;
                    double line248 = (double) a12 / a11;
                    double line249 = (double) a13 / a11;
                    double line250 = (double) a14 / a11;
                    double line251 = (double) a15 / a11;
                    double line252 = (double) b1 / a11;

                    String result247 = String.format("%.1f", line247);
                    String result248 = String.format("%.1f", line248);
                    String result249 = String.format("%.1f", line249);
                    String result250 = String.format("%.1f", line250);
                    String result251 = String.format("%.1f", line251);
                    String result252 = String.format("%.1f", line252);

                    // Вывод в матрицу деления 1 строки
                    String S117 = result247 + "   " + result248 + "    " + result249 + "  " + result250 + "  " + result251 + "  " + result252;
                    textView38.setText(S117);
                    String S118 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView39.setText(S118);
                    String S119 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                    textView40.setText(S119);
                    String S120 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                    textView41.setText(S120);
                    String S121 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                    textView42.setText(S121);


                    String str31 = "от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 4 строки отнимаем 1 строку, умноженную на " + a41 + " от 5 строки отнимаем 1 строку, умноженную на " + a51;
                    textView43.setText(str31);

                    // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                    double line253 = (double) a31 - line247 * a31;
                    double line254 = (double) a32 - line248 * a31;
                    double line255 = (double) a33 - line249 * a31;
                    double line256 = (double) a34 - line250 * a31;
                    double line257 = (double) a35 - line251 * a31;
                    double line258 = (double) b3 - line252 * a31;

                    String result253 = String.format("%.1f", line253);
                    String result254 = String.format("%.1f", line254);
                    String result255 = String.format("%.1f", line255);
                    String result256 = String.format("%.1f", line256);
                    String result257 = String.format("%.1f", line257);
                    String result258 = String.format("%.1f", line258);

                    // расчет от 4 строки отнимаем 1 строку, умноженную на a41
                    double line259 = (double) a41 - line247 * a41;
                    double line260 = (double) a42 - line248 * a41;
                    double line261 = (double) a43 - line249 * a41;
                    double line262 = (double) a44 - line250 * a41;
                    double line263 = (double) a45 - line251 * a41;
                    double line264 = (double) b4 - line252 * a41;

                    String result259 = String.format("%.1f", line259);
                    String result260 = String.format("%.1f", line260);
                    String result261 = String.format("%.1f", line261);
                    String result262 = String.format("%.1f", line262);
                    String result263 = String.format("%.1f", line263);
                    String result264 = String.format("%.1f", line264);

                    // расчет от 5 строки отнимаем 1 строку, умноженную на a51
                    double line265 = (double) a51 - line247 * a51;
                    double line266 = (double) a52 - line248 * a51;
                    double line267 = (double) a53 - line249 * a51;
                    double line268 = (double) a54 - line250 * a51;
                    double line269 = (double) a55 - line251 * a51;
                    double line270 = (double) b5 - line252 * a51;

                    String result265 = String.format("%.1f", line265);
                    String result266 = String.format("%.1f", line266);
                    String result267 = String.format("%.1f", line267);
                    String result268 = String.format("%.1f", line268);
                    String result269 = String.format("%.1f", line269);
                    String result270 = String.format("%.1f", line270);

                    // Вывод результата вычисления в матрицу
                    String S122 = result247 + "   " + result248 + "    " + result249 + "  " + result250 + "  " + result251 + "  " + result252;
                    textView44.setText(S122);
                    String S123 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView45.setText(S123);
                    String S124 = result253 + "   " + result254 + "    " + result255 + "  " + result256 + "  " + result257 + "  " + result258;
                    textView46.setText(S124);
                    String S125 = result259 + "   " + result260 + "    " + result261 + "  " + result262 + "  " + result263 + "  " + result264;
                    textView47.setText(S125);
                    String S126 = result265 + "   " + result266 + "    " + result267 + "  " + result268 + "  " + result269 + "  " + result270;
                    textView48.setText(S126);

                    String str32 = "поменяем 2-ую строку и 3-ую строку местами ";
                    textView49.setText(str32);
                    // Вывод результата перемещения 2 и 3 строки в матрице
                    String S127 = result247 + "   " + result248 + "    " + result249 + "  " + result250 + "  " + result251 + "  " + result252;
                    textView50.setText(S127);
                    String S128 = result253 + "   " + result254 + "    " + result255 + "  " + result256 + "  " + result257 + "  " + result258;
                    textView51.setText(S128);
                    String S129 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView52.setText(S129);
                    String S130 = result259 + "   " + result260 + "    " + result261 + "  " + result262 + "  " + result263 + "  " + result264;
                    textView53.setText(S130);
                    String S131 = result265 + "   " + result266 + "    " + result267 + "  " + result268 + "  " + result269 + "  " + result270;
                    textView54.setText(S131);

                    String str33 = "2-ую строку делим на " + result254;
                    textView55.setText(str33);

                    // расчет деления 2 строки
                    double line271 = (double) line253 / line254;
                    double line272 = (double) line254 / line254;
                    double line273 = (double) line255 / line254;
                    double line274 = (double) line256 / line254;
                    double line275 = (double) line257 / line254;
                    double line276 = (double) line258 / line254;

                    String result271 = String.format("%.1f", line271);
                    String result272 = String.format("%.1f", line272);
                    String result273 = String.format("%.1f", line273);
                    String result274 = String.format("%.1f", line274);
                    String result275 = String.format("%.1f", line275);
                    String result276 = String.format("%.1f", line276);

                    // Вывод в матрицу деления 2 строки
                    String S132 = result247 + "   " + result248 + "    " + result249 + "  " + result250 + "  " + result251 + "  " + result252;
                    textView56.setText(S132);
                    String S133 = result271 + "   " + result272 + "    " + result273 + "  " + result274 + "  " + result275 + "  " + result276;
                    textView57.setText(S133);
                    String S134 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView58.setText(S134);
                    String S135 = result259 + "   " + result260 + "    " + result261 + "  " + result262 + "  " + result263 + "  " + result264;
                    textView59.setText(S135);
                    String S136 = result265 + "   " + result266 + "    " + result267 + "  " + result268 + "  " + result269 + "  " + result270;
                    textView60.setText(S136);

                    String str34 = "от 1 строки отнимаем 2 строку, умноженную на " + result248 + " к 4 строки добавляем  2 строку, умноженную на " + result260 + " к 5 строке добавляем 2 строку, умноженную на " + result266;
                    textView61.setText(str34);

                    // расчет от 1 строки отнимаем 2 строку, умноженную на result248
                    double line277 = (double) line247 - line271 * line248;
                    double line278 = (double) line248 - line272 * line248;
                    double line279 = (double) line249 - line273 * line248;
                    double line280 = (double) line250 - line274 * line248;
                    double line281 = (double) line251 - line275 * line248;
                    double line282 = (double) line252 - line276 * line248;

                    String result277 = String.format("%.1f", line277);
                    String result278 = String.format("%.1f", line278);
                    String result279 = String.format("%.1f", line279);
                    String result280 = String.format("%.1f", line280);
                    String result281 = String.format("%.1f", line281);
                    String result282 = String.format("%.1f", line282);

                    // расчет к 4 строки добавляем 2 строку, умноженную на result260
                    double line283 = (double) line259 - line271 * line260;
                    double line284 = (double) line260 - line272 * line260;
                    double line285 = (double) line261 - line273 * line260;
                    double line286 = (double) line262 - line274 * line260;
                    double line287 = (double) line263 - line275 * line260;
                    double line288 = (double) line264 - line276 * line260;

                    String result283 = String.format("%.1f", line283);
                    String result284 = String.format("%.1f", line284);
                    String result285 = String.format("%.1f", line285);
                    String result286 = String.format("%.1f", line286);
                    String result287 = String.format("%.1f", line287);
                    String result288 = String.format("%.1f", line288);

                    // расчет к 5 строке добавляем 2, умноженную на result266
                    double line289 = (double) line265 - line271 * line266;
                    double line290 = (double) line266 - line272 * line266;
                    double line291 = (double) line267 - line273 * line266;
                    double line292 = (double) line268 - line274 * line266;
                    double line293 = (double) line269 - line275 * line266;
                    double line294 = (double) line270 - line276 * line266;

                    String result289 = String.format("%.1f", line289);
                    String result290 = String.format("%.1f", line290);
                    String result291 = String.format("%.1f", line291);
                    String result292 = String.format("%.1f", line292);
                    String result293 = String.format("%.1f", line293);
                    String result294 = String.format("%.1f", line294);

                    // Вывод результата вычисления в матрицу
                    String S137 = result277 + "   " + result278 + "    " + result279 + "  " + result280 + "  " + result281 + "  " + result282;
                    textView62.setText(S137);
                    String S138 = result271 + "   " + result272 + "    " + result273 + "  " + result274 + "  " + result275 + "  " + result276;
                    textView63.setText(S138);
                    String S139 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView64.setText(S139);
                    String S140 = result283 + "   " + result284 + "    " + result285 + "  " + result286 + "  " + result287 + "  " + result288;
                    textView65.setText(S140);
                    String S141 = result289 + "   " + result290 + "    " + result291 + "  " + result292 + "  " + result293 + "  " + result294;
                    textView66.setText(S141);


                    String str35 = "поменяем 3-ую строку и 4-ую строку местами ";
                    textView67.setText(str35);
                    // Вывод результата перемещения 3 и 4 строки в матрице
                    String S142 = result277 + "   " + result278 + "    " + result279 + "  " + result280 + "  " + result281 + "  " + result282;
                    textView68.setText(S142);
                    String S143 = result271 + "   " + result272 + "    " + result273 + "  " + result274 + "  " + result275 + "  " + result276;
                    textView69.setText(S143);
                    String S144 = result283 + "   " + result284 + "    " + result285 + "  " + result286 + "  " + result287 + "  " + result288;
                    textView70.setText(S144);
                    String S145 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView71.setText(S145);
                    String S146 = result289 + "   " + result290 + "    " + result291 + "  " + result292 + "  " + result293 + "  " + result294;
                    textView72.setText(S146);


                    String str36 = "3-ую строку делим на " + result285;
                    textView73.setText(str36);
                    // расчет деления 3 строки
                    double line295 = (double) line283 / line285;
                    double line296 = (double) line284 / line285;
                    double line297 = (double) line285 / line285;
                    double line298 = (double) line286 / line285;
                    double line299 = (double) line287 / line285;
                    double line300 = (double) line288 / line285;

                    String result295 = String.format("%.1f", line295);
                    String result296 = String.format("%.1f", line296);
                    String result297 = String.format("%.1f", line297);
                    String result298 = String.format("%.1f", line298);
                    String result299 = String.format("%.1f", line299);
                    String result300 = String.format("%.1f", line300);

                    // Вывод в матрицу деления 2 строки
                    String S147 = result277 + "   " + result278 + "    " + result279 + "  " + result280 + "  " + result281 + "  " + result282;
                    textView74.setText(S147);
                    String S148 = result271 + "   " + result272 + "    " + result273 + "  " + result274 + "  " + result275 + "  " + result276;
                    textView75.setText(S148);
                    String S149 = result295 + "   " + result296 + "    " + result297 + "  " + result298 + "  " + result299 + "  " + result300;
                    textView76.setText(S149);
                    String S150 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView77.setText(S150);
                    String S151 = result289 + "   " + result290 + "    " + result291 + "  " + result292 + "  " + result293 + "  " + result294;
                    textView78.setText(S151);


                    String str37 = "к 1 строке добавляем 3 строку, умноженную на " + result279 + " от 2 строки отнимаем 3 строку, умноженную на " + result273 + " к 5 строке добавляем 3 строку, умноженную на " + result291;
                    textView79.setText(str37);

                    // расчет к 1 строке добавляеми 3 строку, умноженную на result279
                    double line301 = (double) line277 - line295 * line279;
                    double line302 = (double) line278 - line296 * line279;
                    double line303 = (double) line279 - line297 * line279;
                    double line304 = (double) line280 - line298 * line279;
                    double line305 = (double) line281 - line299 * line279;
                    double line306 = (double) line282 - line300 * line279;

                    String result301 = String.format("%.1f", line301);
                    String result302 = String.format("%.1f", line302);
                    String result303 = String.format("%.1f", line303);
                    String result304 = String.format("%.1f", line304);
                    String result305 = String.format("%.1f", line305);
                    String result306 = String.format("%.1f", line306);

                    // расчет от 2 строки отнимаем 3 строку, умноженную на result273
                    double line307 = (double) line271 - line295 * line273;
                    double line308 = (double) line272 - line296 * line273;
                    double line309 = (double) line273 - line297 * line273;
                    double line310 = (double) line274 - line298 * line273;
                    double line311 = (double) line275 - line299 * line273;
                    double line312 = (double) line276 - line300 * line273;

                    String result307 = String.format("%.1f", line307);
                    String result308 = String.format("%.1f", line308);
                    String result309 = String.format("%.1f", line309);
                    String result310 = String.format("%.1f", line310);
                    String result311 = String.format("%.1f", line311);
                    String result312 = String.format("%.1f", line312);

                    // расчет к 5 строке добавляеми 3 строку, умноженную на result291
                    double line313 = (double) line289 - line295 * line291;
                    double line314 = (double) line290 - line296 * line291;
                    double line315 = (double) line291 - line297 * line291;
                    double line316 = (double) line292 - line298 * line291;
                    double line317 = (double) line293 - line299 * line291;
                    double line318 = (double) line294 - line300 * line291;

                    String result313 = String.format("%.1f", line313);
                    String result314 = String.format("%.1f", line314);
                    String result315 = String.format("%.1f", line315);
                    String result316 = String.format("%.1f", line316);
                    String result317 = String.format("%.1f", line317);
                    String result318 = String.format("%.1f", line318);

                    // Вывод результата вычисления в матрицу
                    String S152 = result301 + "   " + result302 + "    " + result303 + "  " + result304 + "  " + result305 + "  " + result306;
                    textView80.setText(S152);
                    String S153 = result307 + "   " + result308 + "    " + result309 + "  " + result310 + "  " + result311 + "  " + result312;
                    textView81.setText(S153);
                    String S154 = result295 + "   " + result296 + "    " + result297 + "  " + result298 + "  " + result299 + "  " + result300;
                    textView82.setText(S154);
                    String S155 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView83.setText(S155);
                    String S156 = result313 + "   " + result314 + "    " + result315 + "  " + result316 + "  " + result317 + "  " + result318;
                    textView84.setText(S156);

                    String str38 = "поменяем 4-ую строку и 5-ую строку местами ";
                    textView85.setText(str38);
                    // Вывод результата перемещения 4 и 5 строки в матрице
                    String S157 = result301 + "   " + result302 + "    " + result303 + "  " + result304 + "  " + result305 + "  " + result306;
                    textView86.setText(S157);
                    String S158 = result307 + "   " + result308 + "    " + result309 + "  " + result310 + "  " + result311 + "  " + result312;
                    textView87.setText(S158);
                    String S159 = result295 + "   " + result296 + "    " + result297 + "  " + result298 + "  " + result299 + "  " + result300;
                    textView88.setText(S159);
                    String S160 = result313 + "   " + result314 + "    " + result315 + "  " + result316 + "  " + result317 + "  " + result318;
                    textView89.setText(S160);
                    String S161 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView90.setText(S161);

                    String str39 = "4-ую строку делим на " + result316;
                    textView91.setText(str39);
                    // расчет деления 4 строки
                    double line319 = (double) line313 / line316;
                    double line320 = (double) line314 / line316;
                    double line321 = (double) line315 / line316;
                    double line322 = (double) line316 / line316;
                    double line323 = (double) line317 / line316;
                    double line324 = (double) line318 / line316;

                    String result319 = String.format("%.1f", line319);
                    String result320 = String.format("%.1f", line320);
                    String result321 = String.format("%.1f", line321);
                    String result322 = String.format("%.1f", line322);
                    String result323 = String.format("%.1f", line323);
                    String result324 = String.format("%.1f", line324);

                    // Вывод в матрицу деления 4 строки
                    String S162 = result301 + "   " + result302 + "    " + result303 + "  " + result304 + "  " + result305 + "  " + result306;
                    textView92.setText(S162);
                    String S163 = result307 + "   " + result308 + "    " + result309 + "  " + result310 + "  " + result311 + "  " + result312;
                    textView93.setText(S163);
                    String S164 = result295 + "   " + result296 + "    " + result297 + "  " + result298 + "  " + result299 + "  " + result300;
                    textView94.setText(S164);
                    String S165 = result319 + "   " + result320 + "    " + result321 + "  " + result322 + "  " + result323 + "  " + result324;
                    textView95.setText(S165);
                    String S166 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView96.setText(S166);

                    String str40 = "к 1 строке добавляем 4 строку, умноженную на " + result304 + " от 2 строки отнимаем 4 строку, умноженную на " + result310 + "к 5 строке добавляем 4 строку, умноженную на " + result298;
                    textView97.setText(str40);

                    // расчет к 1 строке добавляем 4 строку, умноженную на result304
                    double line325 = (double) line301 - line319 * line304;
                    double line326 = (double) line302 - line320 * line304;
                    double line327 = (double) line303 - line321 * line304;
                    double line328 = (double) line304 - line322 * line304;
                    double line329 = (double) line305 - line323 * line304;
                    double line330 = (double) line306 - line324 * line304;

                    String result325 = String.format("%.1f", line325);
                    String result326 = String.format("%.1f", line326);
                    String result327 = String.format("%.1f", line327);
                    String result328 = String.format("%.1f", line328);
                    String result329 = String.format("%.1f", line329);
                    String result330 = String.format("%.1f", line330);

                    // расчет от 2 строки отнимаем 4 строку, умноженную на result310
                    double line334 = (double) line307 - line319 * line310;
                    double line335 = (double) line308 - line320 * line310;
                    double line336 = (double) line309 - line321 * line310;
                    double line337 = (double) line310 - line322 * line310;
                    double line338 = (double) line311 - line323 * line310;
                    double line339 = (double) line312 - line324 * line310;

                    String result334 = String.format("%.1f", line334);
                    String result335 = String.format("%.1f", line335);
                    String result336 = String.format("%.1f", line336);
                    String result337 = String.format("%.1f", line337);
                    String result338 = String.format("%.1f", line338);
                    String result339 = String.format("%.1f", line339);

                    // расчет к 5 строке добавляеми 3 строку, умноженную на result291
                    double line340 = (double) a21 - line319 * line291;
                    double line341 = (double) a22 - line320 * line291;
                    double line342 = (double) a23 - line321 * line291;
                    double line343 = (double) a24 - line322 * line291;
                    double line344 = (double) a25 - line323 * line291;
                    double line345 = (double) b2 - line324 * line291;

                    String result340 = String.format("%.1f", line340);
                    String result341 = String.format("%.1f", line341);
                    String result342 = String.format("%.1f", line342);
                    String result343 = String.format("%.1f", line343);
                    String result344 = String.format("%.1f", line344);
                    String result345 = String.format("%.1f", line345);

                    // Вывод результата вычисления в матрицу
                    String S167 = result325 + "   " + result326 + "    " + result327 + "  " + result328 + "  " + result329 + "  " + result330;
                    textView98.setText(S167);
                    String S168 = result334 + "   " + result335 + "    " + result336 + "  " + result337 + "  " + result338 + "  " + result339;
                    textView99.setText(S168);
                    String S169 = result340 + "   " + result341 + "    " + result342 + "  " + result343 + "  " + result344 + "  " + result345;
                    textView100.setText(S169);
                    String S170 = result319 + "   " + result320 + "    " + result321 + "  " + result322 + "  " + result323 + "  " + result324;
                    textView101.setText(S170);
                    String S171 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                    textView102.setText(S171);

                    String str41 = " Ответ: ";
                    textView103.setText(str41);
                    String str42 = " Система имеет множество решений: ";
                    textView104.setText(str42);
                    textView105.setText(" x1 -  " + result329 + "x5" + " =" + result330);
                    textView106.setText(" x2 +  " + result338 + "x5" + " =" + result339);
                    textView107.setText(" x3 +  " + result344 + "x5" + " =" + result345);
                    textView108.setText(" x4 +  " + result323 + "x5" + " =" + result324);


                    textView103.setVisibility(View.VISIBLE);
                    textView104.setVisibility(View.VISIBLE);
                    textView105.setVisibility(View.VISIBLE);
                    textView106.setVisibility(View.VISIBLE);
                    textView107.setVisibility(View.VISIBLE);
                    textView108.setVisibility(View.VISIBLE);
                } else {  // Проверяем если пользователь заполнил 3 строку нулями
                    if (a31 == 0 && a32 == 0 && a33 == 0 && a34 == 0 && a35 == 0 && b3 == 0) {
                        String str37 = "от 2 строки отнимаем 1 строку, умноженную на " + a21 + " от 4 строки отнимаем 1 строку, умноженную на " + a41 + " от 5 строки отнимаем 1 строку, умноженную на " + a51;
                        textView43.setText(str37);

                        // расчет от 2 строки отнимаем 1 строку, умноженную на a21
                        double line346 = (double) a21 - line1 * a21;
                        double line347 = (double) a22 - line2 * a21;
                        double line348 = (double) a23 - line3 * a21;
                        double line349 = (double) a24 - line4 * a21;
                        double line350 = (double) a25 - line5 * a21;
                        double line351 = (double) b2 - line6 * a21;

                        String result346 = String.format("%.1f", line346);
                        String result347 = String.format("%.1f", line347);
                        String result348 = String.format("%.1f", line348);
                        String result349 = String.format("%.1f", line349);
                        String result350 = String.format("%.1f", line350);
                        String result351 = String.format("%.1f", line351);

                        // расчет от 4 строки отнимаем 1 строку, умноженную на a41
                        double line352 = (double) a41 - line1 * a41;
                        double line353 = (double) a42 - line2 * a41;
                        double line354 = (double) a43 - line3 * a41;
                        double line355 = (double) a44 - line4 * a41;
                        double line356 = (double) a45 - line5 * a41;
                        double line357 = (double) b4 - line6 * a41;

                        String result352 = String.format("%.1f", line352);
                        String result353 = String.format("%.1f", line353);
                        String result354 = String.format("%.1f", line354);
                        String result355 = String.format("%.1f", line355);
                        String result356 = String.format("%.1f", line356);
                        String result357 = String.format("%.1f", line357);

                        // расчет от 5 строки отнимаем 1 строку, умноженную на a51
                        double line358 = (double) a51 - line1 * a51;
                        double line359 = (double) a52 - line2 * a51;
                        double line360 = (double) a53 - line3 * a51;
                        double line361 = (double) a54 - line4 * a51;
                        double line362 = (double) a55 - line5 * a51;
                        double line363 = (double) b5 - line6 * a51;

                        String result358 = String.format("%.1f", line358);
                        String result359 = String.format("%.1f", line359);
                        String result360 = String.format("%.1f", line360);
                        String result361 = String.format("%.1f", line361);
                        String result362 = String.format("%.1f", line362);
                        String result363 = String.format("%.1f", line363);

                        // Вывод расчета в матрицу
                        String S172 = result1 + "   " + result2 + "    " + result3 + "   " + result4 + "    " + result5 + "    " + result6;
                        textView44.setText(S172);
                        String S173 = result346 + "   " + result347 + "    " + result348 + "   " + result349 + "    " + result350 + "    " + result351;
                        textView45.setText(S173);
                        String S174 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                        textView46.setText(S174);
                        String S175 = result352 + "   " + result353 + "    " + result354 + "  " + result355 + "  " + result356 + "  " + result357;
                        textView47.setText(S175);
                        String S176 = result358 + "   " + result359 + "    " + result360 + "  " + result361 + "  " + result362 + "  " + result363;
                        textView48.setText(S176);

                        String str43 = "2-ую строку делим на " + result347;
                        textView49.setText(str43);

                        // расчет деления 2 строки в матрице на result347
                        double line364 = (double) line346 / line347;
                        double line365 = (double) line347 / line347;
                        double line366 = (double) line348 / line347;
                        double line367 = (double) line349 / line347;
                        double line368 = (double) line350 / line347;
                        double line369 = (double) line351 / line347;

                        String result364 = String.format("%.1f", line364);
                        String result365 = String.format("%.1f", line365);
                        String result366 = String.format("%.1f", line366);
                        String result367 = String.format("%.1f", line367);
                        String result368 = String.format("%.1f", line368);
                        String result369 = String.format("%.1f", line369);

                        // Вывод в матрицу деления 2 строки
                        String S177 = result1 + "   " + result2 + "    " + result3 + "   " + result4 + "    " + result5 + "    " + result6;
                        textView50.setText(S177);
                        String S178 = result364 + "   " + result365 + "    " + result366 + "   " + result367 + "    " + result368 + "    " + result369;
                        textView51.setText(S178);
                        String S179 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                        textView52.setText(S179);
                        String S180 = result352 + "   " + result353 + "    " + result354 + "  " + result355 + "  " + result356 + "  " + result357;
                        textView53.setText(S180);
                        String S181 = result358 + "   " + result359 + "    " + result360 + "  " + result361 + "  " + result362 + "  " + result363;
                        textView54.setText(S181);

                        String str44 = "от 1 строки отнимаем 2 строку, умноженную на " + result2 + "  к 4 строке добавляем 2 строку, умноженную на " + result353 + " к 5 строке добавляем 2 строку, умноженную на " + result359;
                        textView55.setText(str44);

                        // расчет от 1 строки отнимаем 2 строку, умноженную на result2
                        double line371 = (double) line1 - line364 * line2;
                        double line372 = (double) line2 - line365 * line2;
                        double line373 = (double) line3 - line366 * line2;
                        double line374 = (double) line4 - line367 * line2;
                        double line375 = (double) line5 - line368 * line2;
                        double line376 = (double) line6 - line369 * line2;

                        String result371 = String.format("%.1f", line371);
                        String result372 = String.format("%.1f", line372);
                        String result373 = String.format("%.1f", line373);
                        String result374 = String.format("%.1f", line374);
                        String result375 = String.format("%.1f", line375);
                        String result376 = String.format("%.1f", line376);

                        // расчет к 4 строке добавляем 2 строку, умноженную на result353
                        double line377 = (double) line352 - line364 * line353;
                        double line378 = (double) line353 - line365 * line353;
                        double line379 = (double) line354 - line366 * line353;
                        double line380 = (double) line355 - line367 * line353;
                        double line381 = (double) line356 - line368 * line353;
                        double line382 = (double) line357 - line369 * line353;

                        String result377 = String.format("%.1f", line377);
                        String result378 = String.format("%.1f", line378);
                        String result379 = String.format("%.1f", line379);
                        String result380 = String.format("%.1f", line380);
                        String result381 = String.format("%.1f", line381);
                        String result382 = String.format("%.1f", line382);

                        // расчет к 5 строке добавляем 2 строку, умноженную на result359
                        double line383 = (double) line358 - line364 * line359;
                        double line384 = (double) line359 - line365 * line359;
                        double line385 = (double) line360 - line366 * line359;
                        double line386 = (double) line361 - line367 * line359;
                        double line387 = (double) line362 - line368 * line359;
                        double line388 = (double) line363 - line369 * line359;

                        String result383 = String.format("%.1f", line383);
                        String result384 = String.format("%.1f", line384);
                        String result385 = String.format("%.1f", line385);
                        String result386 = String.format("%.1f", line386);
                        String result387 = String.format("%.1f", line387);
                        String result388 = String.format("%.1f", line388);

                        // Вывод результата вычисления
                        String S182 = result371 + "   " + result372 + "    " + result373 + "   " + result374 + "    " + result375 + "    " + result376;
                        textView56.setText(S182);
                        String S183 = result364 + "   " + result365 + "    " + result366 + "   " + result367 + "    " + result368 + "    " + result369;
                        textView57.setText(S183);
                        String S184 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                        textView58.setText(S184);
                        String S185 = result377 + "   " + result378 + "    " + result379 + "  " + result380 + "  " + result381 + "  " + result382;
                        textView59.setText(S185);
                        String S186 = result383 + "   " + result384 + "    " + result385 + "  " + result386 + "  " + result387 + "  " + result388;
                        textView60.setText(S186);

                        String str45 = "поменяем 3-ую строку и 4-ую строку местами ";
                        textView61.setText(str45);
                        // Вывод результата перемещения 3 и 4 строки в матрице
                        String S187 = result371 + "   " + result372 + "    " + result373 + "   " + result374 + "    " + result375 + "    " + result376;
                        textView62.setText(S187);
                        String S188 = result364 + "   " + result365 + "    " + result366 + "   " + result367 + "    " + result368 + "    " + result369;
                        textView63.setText(S188);
                        String S189 = result377 + "   " + result378 + "    " + result379 + "  " + result380 + "  " + result381 + "  " + result382;
                        textView64.setText(S189);
                        String S190 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                        textView65.setText(S190);
                        String S191 = result383 + "   " + result384 + "    " + result385 + "  " + result386 + "  " + result387 + "  " + result388;
                        textView66.setText(S191);


                        String str46 = "3-ую строку делим на " + result379;
                        textView67.setText(str46);

                        // расчет деления 3 строки
                        double line389 = (double) line377 / line379;
                        double line390 = (double) line378 / line379;
                        double line391 = (double) line379 / line379;
                        double line392 = (double) line380 / line379;
                        double line393 = (double) line381 / line379;
                        double line394 = (double) line382 / line379;

                        String result389 = String.format("%.1f", line389);
                        String result390 = String.format("%.1f", line390);
                        String result391 = String.format("%.1f", line391);
                        String result392 = String.format("%.1f", line392);
                        String result393 = String.format("%.1f", line393);
                        String result394 = String.format("%.1f", line394);

                        // Вывод в матрицу деления 3 строки
                        String S192 = result371 + "   " + result372 + "    " + result373 + "   " + result374 + "    " + result375 + "    " + result376;
                        textView68.setText(S192);
                        String S193 = result364 + "   " + result365 + "    " + result366 + "   " + result367 + "    " + result368 + "    " + result369;
                        textView69.setText(S193);
                        String S194 = result389 + "   " + result390 + "    " + result391 + "  " + result392 + "  " + result393 + "  " + result394;
                        textView70.setText(S194);
                        String S195 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                        textView71.setText(S195);
                        String S196 = result383 + "   " + result384 + "    " + result385 + "  " + result386 + "  " + result387 + "  " + result388;
                        textView72.setText(S196);


                        String str47 = "от 1 строки отнимаем 3 строку, умноженную на " + result373 + " от 2 строки отнимаем 3 строку, умноженную на " + result366 + " к 5 строке добавляем 3 строку, умноженную на " + result385;
                        textView73.setText(str47);

                        // расчет от 1 строки отнимаем 3 строку, умноженную на result373
                        double line395 = (double) line371 - line389 * line373;
                        double line396 = (double) line372 - line390 * line373;
                        double line397 = (double) line373 - line391 * line373;
                        double line398 = (double) line374 - line392 * line373;
                        double line399 = (double) line375 - line393 * line373;
                        double line400 = (double) line376 - line394 * line373;

                        String result395 = String.format("%.1f", line395);
                        String result396 = String.format("%.1f", line396);
                        String result397 = String.format("%.1f", line397);
                        String result398 = String.format("%.1f", line398);
                        String result399 = String.format("%.1f", line399);
                        String result400 = String.format("%.1f", line400);

                        // расчет от 2 строки отнимаем 3 строку, умноженную на result366
                        double line401 = (double) line364 - line389 * line366;
                        double line402 = (double) line365 - line390 * line366;
                        double line403 = (double) line366 - line391 * line366;
                        double line404 = (double) line367 - line392 * line366;
                        double line405 = (double) line368 - line393 * line366;
                        double line406 = (double) line369 - line394 * line366;

                        String result401 = String.format("%.1f", line401);
                        String result402 = String.format("%.1f", line402);
                        String result403 = String.format("%.1f", line403);
                        String result404 = String.format("%.1f", line404);
                        String result405 = String.format("%.1f", line405);
                        String result406 = String.format("%.1f", line406);

                        // расчетк 5 строке добавляем 3 строку, умноженную на result385
                        double line407 = (double) line383 - line389 * line385;
                        double line408 = (double) line384 - line390 * line385;
                        double line409 = (double) line385 - line391 * line385;
                        double line410 = (double) line386 - line392 * line385;
                        double line411 = (double) line387 - line393 * line385;
                        double line412 = (double) line388 - line394 * line385;

                        String result407 = String.format("%.1f", line407);
                        String result408 = String.format("%.1f", line408);
                        String result409 = String.format("%.1f", line409);
                        String result410 = String.format("%.1f", line410);
                        String result411 = String.format("%.1f", line411);
                        String result412 = String.format("%.1f", line412);

                        // Вывод результата вычисления в матрицу
                        String S197 = result395 + "   " + result396 + "    " + result397 + "   " + result398 + "    " + result399 + "    " + result400;
                        textView74.setText(S197);
                        String S198 = result401 + "   " + result402 + "    " + result403 + "   " + result404 + "    " + result405 + "    " + result406;
                        textView75.setText(S198);
                        String S199 = result389 + "   " + result390 + "    " + result391 + "  " + result392 + "  " + result393 + "  " + result394;
                        textView76.setText(S199);
                        String S200 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                        textView77.setText(S200);
                        String S201 = result407 + "   " + result408 + "    " + result409 + "  " + result410 + "  " + result411 + "  " + result412;
                        textView78.setText(S201);


                        String str48 = "поменяем 4-ую строку и 5-ую строку местами ";
                        textView79.setText(str48);
                        // Вывод результата перемещения 4 и 5 строки в матрице
                        String S202 = result395 + "   " + result396 + "    " + result397 + "   " + result398 + "    " + result399 + "    " + result400;
                        textView80.setText(S202);
                        String S203 = result401 + "   " + result402 + "    " + result403 + "   " + result404 + "    " + result405 + "    " + result406;
                        textView81.setText(S203);
                        String S204 = result389 + "   " + result390 + "    " + result391 + "  " + result392 + "  " + result393 + "  " + result394;
                        textView82.setText(S204);
                        String S205 = result407 + "   " + result408 + "    " + result409 + "  " + result410 + "  " + result411 + "  " + result412;
                        textView83.setText(S205);
                        String S206 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                        textView84.setText(S206);

                        String str49 = "4-ую строку делим на " + result410;
                        textView85.setText(str49);
                        // расчет деления 4 строки
                        double line413 = (double) line407 / line410;
                        double line414 = (double) line408 / line410;
                        double line415 = (double) line409 / line410;
                        double line416 = (double) line410 / line410;
                        double line417 = (double) line411 / line410;
                        double line418 = (double) line412 / line410;

                        String result413 = String.format("%.1f", line413);
                        String result414 = String.format("%.1f", line414);
                        String result415 = String.format("%.1f", line415);
                        String result416 = String.format("%.1f", line416);
                        String result417 = String.format("%.1f", line417);
                        String result418 = String.format("%.1f", line418);

                        // Вывод в матрицу деления 4 строки
                        String S207 = result395 + "   " + result396 + "    " + result397 + "   " + result398 + "    " + result399 + "    " + result400;
                        textView86.setText(S207);
                        String S208 = result401 + "   " + result402 + "    " + result403 + "   " + result403 + "    " + result404 + "    " + result405;
                        textView87.setText(S208);
                        String S209 = result389 + "   " + result390 + "    " + result391 + "  " + result392 + "  " + result393 + "  " + result394;
                        textView88.setText(S209);
                        String S210 = result413 + "   " + result414 + "    " + result415 + "  " + result416 + "  " + result417 + "  " + result418;
                        textView89.setText(S210);
                        String S211 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                        textView90.setText(S211);


                        String str50 = "от 1 строки отнимаем 4 строку, умноженную на " + result398 + " от 2 строки отнимаем 4 строку, умноженную на " + result403 + " к 3 строки добавляем 4 строку, умноженную на " + result392;
                        textView91.setText(str50);

                        // расчет от 1 строки отнимаем 4 строку, умноженную на result398
                        double line419 = (double) line395 - line413 * line398;
                        double line420 = (double) line396 - line414 * line398;
                        double line421 = (double) line397 - line415 * line398;
                        double line422 = (double) line398 - line416 * line398;
                        double line423 = (double) line399 - line417 * line398;
                        double line424 = (double) line400 - line418 * line398;

                        String result419 = String.format("%.1f", line419);
                        String result420 = String.format("%.1f", line420);
                        String result421 = String.format("%.1f", line421);
                        String result422 = String.format("%.1f", line422);
                        String result423 = String.format("%.1f", line423);
                        String result424 = String.format("%.1f", line424);

                        // расчет от 2 строки отнимаем 4 строку, умноженную на result403
                        double line425 = (double) line401 - line413 * line403;
                        double line426 = (double) line402 - line414 * line403;
                        double line427 = (double) line403 - line415 * line403;
                        double line428 = (double) line404 - line416 * line403;
                        double line429 = (double) line405 - line417 * line403;
                        double line430 = (double) line406 - line418 * line403;

                        String result425 = String.format("%.1f", line425);
                        String result426 = String.format("%.1f", line426);
                        String result427 = String.format("%.1f", line427);
                        String result428 = String.format("%.1f", line428);
                        String result429 = String.format("%.1f", line429);
                        String result430 = String.format("%.1f", line430);

                        // расчет к 3 строки добавляем 4 строку, умноженную на result392
                        double line431 = (double) line389 - line413 * line392;
                        double line432 = (double) line390 - line414 * line392;
                        double line433 = (double) line391 - line415 * line392;
                        double line434 = (double) line392 - line416 * line392;
                        double line435 = (double) line393 - line417 * line392;
                        double line436 = (double) line394 - line418 * line392;

                        String result431 = String.format("%.1f", line431);
                        String result432 = String.format("%.1f", line432);
                        String result433 = String.format("%.1f", line433);
                        String result434 = String.format("%.1f", line434);
                        String result435 = String.format("%.1f", line435);
                        String result436 = String.format("%.1f", line436);

                        // Вывод результата вычисления в матрицу
                        String S212 = result419 + "   " + result420 + "    " + result421 + "   " + result422 + "    " + result423 + "    " + result424;
                        textView92.setText(S212);
                        String S213 = result425 + "   " + result426 + "    " + result427 + "   " + result428 + "    " + result429 + "    " + result430;
                        textView93.setText(S213);
                        String S214 = result431 + "   " + result432 + "    " + result433 + "   " + result434 + "    " + result435 + "    " + result436;
                        textView94.setText(S214);
                        String S215 = result413 + "   " + result414 + "    " + result415 + "  " + result416 + "  " + result417 + "  " + result418;
                        textView95.setText(S215);
                        String S216 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                        textView96.setText(S216);

                        String str51 = " Ответ: ";
                        textView97.setText(str51);
                        String str52 = " Система имеет множество решений: ";
                        textView98.setText(str52);
                        textView99.setText(" x1 =  " + result424);
                        textView100.setText(" x2 +  " + result429 + "x5" + " = " + result430);
                        textView101.setText(" x3 +  " + result435 + "x5" + " = " + result436);
                        textView102.setText(" x4 +  " + result417 + "x5" + " = " + result418);

                        textView103.setVisibility(View.INVISIBLE);
                        textView104.setVisibility(View.INVISIBLE);
                        textView105.setVisibility(View.INVISIBLE);
                        textView106.setVisibility(View.INVISIBLE);
                        textView107.setVisibility(View.INVISIBLE);
                        textView108.setVisibility(View.INVISIBLE);
                        textView109.setVisibility(View.INVISIBLE);
                        textView110.setVisibility(View.INVISIBLE);
                        textView111.setVisibility(View.INVISIBLE);
                        textView112.setVisibility(View.INVISIBLE);
                        textView113.setVisibility(View.INVISIBLE);
                        textView114.setVisibility(View.INVISIBLE);
                    } else {     // Проверяем если пользователь заполнил 4 строку нулями
                        if (a41 == 0 && a42 == 0 && a43 == 0 && a44 == 0 && a45 == 0 && b4 == 0) {
                            String str53 = "1-ую строку делим на " + a11;
                            textView37.setText(str53);

                            // расчет деления 1 строки в матрице на а11
                            double line437 = (double) a11 / a11;
                            double line438 = (double) a12 / a11;
                            double line439 = (double) a13 / a11;
                            double line440 = (double) a14 / a11;
                            double line441 = (double) a15 / a11;
                            double line442 = (double) b1 / a11;

                            String result437 = String.format("%.1f", line437);
                            String result438 = String.format("%.1f", line438);
                            String result439 = String.format("%.1f", line439);
                            String result440 = String.format("%.1f", line440);
                            String result441 = String.format("%.1f", line441);
                            String result442 = String.format("%.1f", line442);

                            // Вывод в матрицу деления 1 строки
                            String S117 = result437 + "   " + result438 + "    " + result439 + "  " + result440 + "  " + result441 + "  " + result442;
                            textView38.setText(S117);
                            String S118 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                            textView39.setText(S118);
                            String S119 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                            textView40.setText(S119);
                            String S120 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                            textView41.setText(S120);
                            String S121 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                            textView42.setText(S121);

                            String str54 = "от 2 строки отнимаем 1 строку, умноженную на " + a21 + " от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 5 строки отнимаем 1 строку, умноженную на " + a51;
                            textView43.setText(str54);

                            // расчет от 2 строки отнимаем 1 строку, умноженную на a21
                            double line443 = (double) a21 - line1 * a21;
                            double line444 = (double) a22 - line2 * a21;
                            double line445 = (double) a23 - line3 * a21;
                            double line446 = (double) a24 - line4 * a21;
                            double line447 = (double) a25 - line5 * a21;
                            double line448 = (double) b2 - line6 * a21;

                            String result443 = String.format("%.1f", line443);
                            String result444 = String.format("%.1f", line444);
                            String result445 = String.format("%.1f", line445);
                            String result446 = String.format("%.1f", line446);
                            String result447 = String.format("%.1f", line447);
                            String result448 = String.format("%.1f", line448);

                            // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                            double line449 = (double) a31 - line1 * a31;
                            double line450 = (double) a32 - line2 * a31;
                            double line451 = (double) a33 - line3 * a31;
                            double line452 = (double) a34 - line4 * a31;
                            double line453 = (double) a35 - line5 * a31;
                            double line454 = (double) b3 - line6 * a31;

                            String result449 = String.format("%.1f", line449);
                            String result450 = String.format("%.1f", line450);
                            String result451 = String.format("%.1f", line451);
                            String result452 = String.format("%.1f", line452);
                            String result453 = String.format("%.1f", line453);
                            String result454 = String.format("%.1f", line454);

                            // расчет от 5 строки отнимаем 1 строку, умноженную на a51
                            double line455 = (double) a51 - line1 * a51;
                            double line456 = (double) a52 - line2 * a51;
                            double line457 = (double) a53 - line3 * a51;
                            double line458 = (double) a54 - line4 * a51;
                            double line459 = (double) a55 - line5 * a51;
                            double line460 = (double) b5 - line6 * a51;

                            String result455 = String.format("%.1f", line455);
                            String result456 = String.format("%.1f", line456);
                            String result457 = String.format("%.1f", line457);
                            String result458 = String.format("%.1f", line458);
                            String result459 = String.format("%.1f", line459);
                            String result460 = String.format("%.1f", line460);

                            // Вывод результата вычисления в матрицу
                            String S217 = result1 + "   " + result2 + "    " + result3 + "  " + result4 + "  " + result5 + "  " + result6;
                            textView44.setText(S217);
                            String S218 = result443 + "   " + result444 + "    " + result445 + "  " + result446 + "  " + result447 + "  " + result448;
                            textView45.setText(S218);
                            String S219 = result449 + "   " + result450 + "    " + result451 + "  " + result452 + "  " + result453 + "  " + result454;
                            textView46.setText(S219);
                            String S220 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                            textView47.setText(S220);
                            String S221 = result455 + "   " + result456 + "    " + result457 + "  " + result458 + "  " + result459 + "  " + result460;
                            textView48.setText(S221);


                            String str55 = "2-ую строку делим на " + result444;
                            textView49.setText(str55);

                            // расчет деления 2 строки в матрице на result444
                            double line461 = (double) line443 / line444;
                            double line462 = (double) line444 / line444;
                            double line463 = (double) line445 / line444;
                            double line464 = (double) line446 / line444;
                            double line465 = (double) line447 / line444;
                            double line466 = (double) line448 / line444;

                            String result461 = String.format("%.1f", line461);
                            String result462 = String.format("%.1f", line462);
                            String result463 = String.format("%.1f", line463);
                            String result464 = String.format("%.1f", line464);
                            String result465 = String.format("%.1f", line465);
                            String result466 = String.format("%.1f", line466);

                            // Вывод в матрицу деления 2 строки
                            String S222 = result1 + "   " + result2 + "    " + result3 + "  " + result4 + "  " + result5 + "  " + result6;
                            textView50.setText(S222);
                            String S223 = result461 + "   " + result462 + "    " + result463 + "  " + result464 + "  " + result465 + "  " + result466;
                            textView51.setText(S223);
                            String S224 = result449 + "   " + result450 + "    " + result451 + "  " + result452 + "  " + result453 + "  " + result454;
                            textView52.setText(S224);
                            String S225 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                            textView53.setText(S225);
                            String S226 = result455 + "   " + result456 + "    " + result457 + "  " + result458 + "  " + result459 + "  " + result460;
                            textView54.setText(S226);

                            String str56 = "от 1 строки отнимаем 2 строку, умноженную на " + result2 + "  к 3 строке добавляем 2 строку, умноженную на " + result450 + " к 5 строке добавляем 2 строку, умноженную на " + result456;
                            textView55.setText(str56);

                            // расчет от 1 строки отнимаем 2 строку, умноженную на result2
                            double line467 = (double) line1 - line461 * line2;
                            double line468 = (double) line2 - line462 * line2;
                            double line469 = (double) line3 - line463 * line2;
                            double line470 = (double) line4 - line464 * line2;
                            double line471 = (double) line5 - line465 * line2;
                            double line472 = (double) line6 - line466 * line2;

                            String result467 = String.format("%.1f", line467);
                            String result468 = String.format("%.1f", line468);
                            String result469 = String.format("%.1f", line469);
                            String result470 = String.format("%.1f", line470);
                            String result471 = String.format("%.1f", line471);
                            String result472 = String.format("%.1f", line472);

                            // расчет от 4 строки отнимаем 2 строку, умноженную на result450
                            double line473 = (double) line449 - line461 * line450;
                            double line474 = (double) line450 - line462 * line450;
                            double line475 = (double) line451 - line463 * line450;
                            double line476 = (double) line452 - line464 * line450;
                            double line477 = (double) line453 - line465 * line450;
                            double line478 = (double) line454 - line466 * line450;

                            String result473 = String.format("%.1f", line473);
                            String result474 = String.format("%.1f", line474);
                            String result475 = String.format("%.1f", line475);
                            String result476 = String.format("%.1f", line476);
                            String result477 = String.format("%.1f", line477);
                            String result478 = String.format("%.1f", line478);

                            // расчет от 5 строки отнимаем 2 строку, умноженную на result456
                            double line479 = (double) line455 - line461 * line456;
                            double line480 = (double) line456 - line462 * line456;
                            double line481 = (double) line457 - line463 * line456;
                            double line482 = (double) line458 - line464 * line456;
                            double line483 = (double) line459 - line465 * line456;
                            double line484 = (double) line460 - line466 * line456;

                            String result479 = String.format("%.1f", line479);
                            String result480 = String.format("%.1f", line480);
                            String result481 = String.format("%.1f", line481);
                            String result482 = String.format("%.1f", line482);
                            String result483 = String.format("%.1f", line483);
                            String result484 = String.format("%.1f", line484);

                            // Вывод результата вычисления в матрицу
                            String S227 = result467 + "   " + result468 + "    " + result469 + "  " + result470 + "  " + result471 + "  " + result472;
                            textView56.setText(S227);
                            String S228 = result461 + "   " + result462 + "    " + result463 + "  " + result464 + "  " + result465 + "  " + result466;
                            textView57.setText(S228);
                            String S229 = result473 + "   " + result474 + "    " + result475 + "  " + result476 + "  " + result476 + "  " + result477;
                            textView58.setText(S229);
                            String S230 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                            textView59.setText(S230);
                            String S231 = result479 + "   " + result480 + "    " + result481 + "  " + result482 + "  " + result483 + "  " + result484;
                            textView60.setText(S231);


                            String str57 = "3-ую строку делим на " + result475;
                            textView61.setText(str57);

                            // расчет деления 3 строки в матрице на result475
                            double line485 = (double) line473 / line475;
                            double line486 = (double) line474 / line475;
                            double line487 = (double) line475 / line475;
                            double line488 = (double) line476 / line475;
                            double line489 = (double) line477 / line475;
                            double line490 = (double) line478 / line475;

                            String result485 = String.format("%.1f", line485);
                            String result486 = String.format("%.1f", line486);
                            String result487 = String.format("%.1f", line487);
                            String result488 = String.format("%.1f", line488);
                            String result489 = String.format("%.1f", line489);
                            String result490 = String.format("%.1f", line490);

                            // Вывод в матрицу деления 3 строки
                            String S232 = result467 + "   " + result468 + "    " + result469 + "  " + result470 + "  " + result471 + "  " + result472;
                            textView62.setText(S232);
                            String S233 = result461 + "   " + result462 + "    " + result463 + "  " + result464 + "  " + result465 + "  " + result466;
                            textView63.setText(S233);
                            String S234 = result485 + "   " + result486 + "    " + result487 + "  " + result488 + "  " + result489 + "  " + result490;
                            textView64.setText(S234);
                            String S235 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                            textView65.setText(S235);
                            String S236 = result479 + "   " + result480 + "    " + result481 + "  " + result482 + "  " + result483 + "  " + result484;
                            textView66.setText(S236);


                            String str58 = "от 1 строки отнимаем 3 строку, умноженную на " + result469 + " от 2 строки отнимаем  3 строку, умноженную на " + result463 + " к 5 строке добавляем 3 строку, умноженную на " + result481;
                            textView67.setText(str58);

                            // расчет от 1 строки отнимаем 2 строку, умноженную на result469
                            double line491 = (double) line467 - line485 * line469;
                            double line492 = (double) line468 - line486 * line469;
                            double line493 = (double) line469 - line487 * line469;
                            double line494 = (double) line470 - line488 * line469;
                            double line495 = (double) line471 - line489 * line469;
                            double line496 = (double) line472 - line490 * line469;

                            String result491 = String.format("%.1f", line491);
                            String result492 = String.format("%.1f", line492);
                            String result493 = String.format("%.1f", line493);
                            String result494 = String.format("%.1f", line494);
                            String result495 = String.format("%.1f", line495);
                            String result496 = String.format("%.1f", line496);

                            // расчет от 4 строки отнимаем 2 строку, умноженную на result463
                            double line497 = (double) line461 - line485 * line463;
                            double line498 = (double) line462 - line486 * line463;
                            double line499 = (double) line463 - line487 * line463;
                            double line500 = (double) line464 - line488 * line463;
                            double line501 = (double) line465 - line489 * line463;
                            double line502 = (double) line466 - line490 * line463;

                            String result497 = String.format("%.1f", line497);
                            String result498 = String.format("%.1f", line498);
                            String result499 = String.format("%.1f", line499);
                            String result500 = String.format("%.1f", line500);
                            String result501 = String.format("%.1f", line501);
                            String result502 = String.format("%.1f", line502);

                            // расчет от 5 строки отнимаем 2 строку, умноженную на result481
                            double line503 = (double) line479 - line485 * line481;
                            double line504 = (double) line480 - line486 * line481;
                            double line505 = (double) line481 - line487 * line481;
                            double line506 = (double) line482 - line488 * line481;
                            double line507 = (double) line483 - line489 * line481;
                            double line508 = (double) line484 - line490 * line481;

                            String result503 = String.format("%.1f", line503);
                            String result504 = String.format("%.1f", line504);
                            String result505 = String.format("%.1f", line505);
                            String result506 = String.format("%.1f", line506);
                            String result507 = String.format("%.1f", line507);
                            String result508 = String.format("%.1f", line508);

                            // Вывод результата вычисления в матрицу
                            String S237 = result491 + "   " + result492 + "    " + result493 + "  " + result494 + "  " + result495 + "  " + result496;
                            textView68.setText(S237);
                            String S238 = result497 + "   " + result498 + "    " + result499 + "  " + result500 + "  " + result501 + "  " + result502;
                            textView69.setText(S238);
                            String S239 = result485 + "   " + result486 + "    " + result487 + "  " + result488 + "  " + result489 + "  " + result490;
                            textView70.setText(S239);
                            String S240 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                            textView71.setText(S240);
                            String S241 = result503 + "   " + result504 + "    " + result505 + "  " + result506 + "  " + result507 + "  " + result508;
                            textView72.setText(S241);


                            String str59 = "поменяем 4-ую строку и 5-ую строку местами ";
                            textView73.setText(str59);
                            // Вывод результата перемещения 4 и 5 строки в матрице
                            String S242 = result491 + "   " + result492 + "    " + result493 + "  " + result494 + "  " + result495 + "  " + result496;
                            textView74.setText(S242);
                            String S243 = result497 + "   " + result498 + "    " + result499 + "  " + result500 + "  " + result501 + "  " + result502;
                            textView75.setText(S243);
                            String S244 = result485 + "   " + result486 + "    " + result487 + "  " + result488 + "  " + result489 + "  " + result490;
                            textView76.setText(S244);
                            String S245 = result503 + "   " + result504 + "    " + result505 + "  " + result506 + "  " + result507 + "  " + result508;
                            textView77.setText(S245);
                            String S246 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                            textView78.setText(S246);

                            String str60 = "4-ую строку делим на " + result506;
                            textView79.setText(str60);

                            // расчет деления 4 строки в матрице на result506
                            double line509 = (double) line503 / line506;
                            double line510 = (double) line504 / line506;
                            double line511 = (double) line505 / line506;
                            double line512 = (double) line506 / line506;
                            double line513 = (double) line507 / line506;
                            double line514 = (double) line508 / line506;

                            String result509 = String.format("%.1f", line509);
                            String result510 = String.format("%.1f", line510);
                            String result511 = String.format("%.1f", line511);
                            String result512 = String.format("%.1f", line512);
                            String result513 = String.format("%.1f", line513);
                            String result514 = String.format("%.1f", line514);

                            String S247 = result491 + "   " + result492 + "    " + result493 + "  " + result494 + "  " + result495 + "  " + result496;
                            textView80.setText(S247);
                            String S248 = result497 + "   " + result498 + "    " + result499 + "  " + result500 + "  " + result501 + "  " + result502;
                            textView81.setText(S248);
                            String S249 = result485 + "   " + result486 + "    " + result487 + "  " + result488 + "  " + result489 + "  " + result490;
                            textView82.setText(S249);
                            String S250 = result509 + "   " + result510 + "    " + result511 + "  " + result512 + "  " + result513 + "  " + result514;
                            textView83.setText(S250);
                            String S251 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                            textView84.setText(S251);

                            String str61 = "от 1 строки отнимаем 4 строку, умноженную на " + result494 + " от 2 строки отнимаем 4 строку, умноженную на " + result500 + " к 3 строки добавляем 4 строку, умноженную на " + result488;
                            textView85.setText(str61);

                            // расчет от 1 строки отнимаем 4 строку, умноженную на result494
                            double line515 = (double) line491 - line509 * line494;
                            double line516 = (double) line492 - line510 * line494;
                            double line517 = (double) line493 - line511 * line494;
                            double line518 = (double) line494 - line512 * line494;
                            double line519 = (double) line495 - line513 * line494;
                            double line520 = (double) line496 - line514 * line494;

                            String result515 = String.format("%.1f", line515);
                            String result516 = String.format("%.1f", line516);
                            String result517 = String.format("%.1f", line517);
                            String result518 = String.format("%.1f", line518);
                            String result519 = String.format("%.1f", line519);
                            String result520 = String.format("%.1f", line520);

                            // расчет от 2 строки отнимаем 4 строку, умноженную на result500
                            double line521 = (double) line497 - line509 * line500;
                            double line522 = (double) line498 - line510 * line500;
                            double line523 = (double) line499 - line511 * line500;
                            double line524 = (double) line500 - line512 * line500;
                            double line525 = (double) line501 - line513 * line500;
                            double line526 = (double) line502 - line514 * line500;

                            String result521 = String.format("%.1f", line521);
                            String result522 = String.format("%.1f", line522);
                            String result523 = String.format("%.1f", line523);
                            String result524 = String.format("%.1f", line524);
                            String result525 = String.format("%.1f", line525);
                            String result526 = String.format("%.1f", line526);

                            // расчет  к 3 строки добавляем 4 строк, умноженную на result488
                            double line527 = (double) line485 - line509 * line488;
                            double line528 = (double) line486 - line510 * line488;
                            double line529 = (double) line487 - line511 * line488;
                            double line530 = (double) line488 - line512 * line488;
                            double line531 = (double) line489 - line513 * line488;
                            double line532 = (double) line490 - line514 * line488;

                            String result527 = String.format("%.1f", line527);
                            String result528 = String.format("%.1f", line528);
                            String result529 = String.format("%.1f", line529);
                            String result530 = String.format("%.1f", line530);
                            String result531 = String.format("%.1f", line531);
                            String result532 = String.format("%.1f", line532);

                            // Вывод результата вычисления в матрицу
                            String S252 = result515 + "   " + result516 + "    " + result517 + "  " + result518 + "  " + result519 + "  " + result520;
                            textView86.setText(S252);
                            String S253 = result521 + "   " + result522 + "    " + result523 + "  " + result524 + "  " + result525 + "  " + result526;
                            textView87.setText(S253);
                            String S254 = result527 + "   " + result528 + "    " + result529 + "  " + result530 + "  " + result531 + "  " + result532;
                            textView88.setText(S254);
                            String S255 = result509 + "   " + result510 + "    " + result511 + "  " + result512 + "  " + result513 + "  " + result514;
                            textView89.setText(S255);
                            String S256 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                            textView90.setText(S256);

                            String str62 = " Ответ: ";
                            textView91.setText(str62);
                            String str63 = " Система имеет множество решений: ";
                            textView92.setText(str63);
                            textView93.setText(" x1 =  " + result520);
                            textView94.setText(" x2 +  " + result525 + "x5" + " = " + result526);
                            textView95.setText(" x3 +  " + result531 + "x5" + " = " + result532);
                            textView96.setText(" x4 +  " + result513 + "x5" + " = " + result514);

                            // Скрываем не нужный вывод результата
                            textView97.setVisibility(View.INVISIBLE);
                            textView98.setVisibility(View.INVISIBLE);
                            textView99.setVisibility(View.INVISIBLE);
                            textView100.setVisibility(View.INVISIBLE);
                            textView101.setVisibility(View.INVISIBLE);
                            textView102.setVisibility(View.INVISIBLE);
                        } else {    // Проверяем если пользователь заполнил 5 строку нулями
                            if (a51 == 0 && a52 == 0 && a53 == 0 && a54 == 0 && a55 == 0 && b5 == 0) {
                                String str64 = "1-ую строку делим на " + a11;
                                textView37.setText(str64);

                                // расчет деления 1 строки в матрице на а11
                                double line532 = (double) a11 / a11;
                                double line533 = (double) a12 / a11;
                                double line534 = (double) a13 / a11;
                                double line535 = (double) a14 / a11;
                                double line536 = (double) a15 / a11;
                                double line537 = (double) b1 / a11;

                                String result532 = String.format("%.1f", line532);
                                String result533 = String.format("%.1f", line533);
                                String result534 = String.format("%.1f", line534);
                                String result535 = String.format("%.1f", line535);
                                String result536 = String.format("%.1f", line536);
                                String result537 = String.format("%.1f", line537);

                                // Вывод деления 1 строки в матрице
                                String S257 = result532 + "   " + result533 + "    " + result534 + "  " + result535 + "  " + result536 + "  " + result537;
                                textView38.setText(S257);
                                String S258 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + b2;
                                textView39.setText(S258);
                                String S259 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + b3;
                                textView40.setText(S259);
                                String S260 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + b4;
                                textView41.setText(S260);
                                String S261 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                                textView42.setText(S261);

                                String str65 = "от 2 строки отнимаем 1 строку, умноженную на " + a21 + " от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 4 строки отнимаем 1 строку, умноженную на " + a41;
                                textView43.setText(str65);

                                // расчет от 2 строки отнимаем 1 строку, умноженную на a21
                                double line538 = (double) a21 - line1 * a21;
                                double line539 = (double) a22 - line2 * a21;
                                double line540 = (double) a23 - line3 * a21;
                                double line541 = (double) a24 - line4 * a21;
                                double line542 = (double) a25 - line5 * a21;
                                double line543 = (double) b2 - line6 * a21;

                                String result538 = String.format("%.1f", line538);
                                String result539 = String.format("%.1f", line539);
                                String result540 = String.format("%.1f", line540);
                                String result541 = String.format("%.1f", line541);
                                String result542 = String.format("%.1f", line542);
                                String result543 = String.format("%.1f", line543);

                                // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                                double line544 = (double) a31 - line1 * a31;
                                double line545 = (double) a32 - line2 * a31;
                                double line546 = (double) a33 - line3 * a31;
                                double line547 = (double) a34 - line4 * a31;
                                double line548 = (double) a35 - line5 * a31;
                                double line549 = (double) b3 - line6 * a31;

                                String result544 = String.format("%.1f", line544);
                                String result545 = String.format("%.1f", line545);
                                String result546 = String.format("%.1f", line546);
                                String result547 = String.format("%.1f", line547);
                                String result548 = String.format("%.1f", line548);
                                String result549 = String.format("%.1f", line549);

                                // расчет от 4 строки отнимаем 1 строку, умноженную на a41
                                double line550 = (double) a41 - line1 * a41;
                                double line551 = (double) a42 - line2 * a41;
                                double line552 = (double) a43 - line3 * a41;
                                double line553 = (double) a44 - line4 * a41;
                                double line554 = (double) a45 - line5 * a41;
                                double line555 = (double) b4 - line6 * a41;

                                String result550 = String.format("%.1f", line550);
                                String result551 = String.format("%.1f", line551);
                                String result552 = String.format("%.1f", line552);
                                String result553 = String.format("%.1f", line553);
                                String result554 = String.format("%.1f", line554);
                                String result555 = String.format("%.1f", line555);

                                // Вывод результата вычисления в матрицу
                                String S262 = result1 + "   " + result2 + "    " + result3 + "  " + result4 + "  " + result5 + "  " + result6;
                                textView44.setText(S262);
                                String S263 = result538 + "   " + result539 + "    " + result540 + "  " + result541 + "  " + result542 + "  " + result543;
                                textView45.setText(S263);
                                String S264 = result544 + "   " + result545 + "    " + result546 + "  " + result547 + "  " + result548 + "  " + result549;
                                textView46.setText(S264);
                                String S265 = result550 + "   " + result551 + "    " + result552 + "  " + result553 + "  " + result554 + "  " + result555;
                                textView47.setText(S265);
                                String S266 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                                textView48.setText(S266);


                                String str66 = "2-ую строку делим на " + result539;
                                textView49.setText(str66);

                                // расчет деления 2 строки в матрице на result539
                                double line556 = (double) line538 / line539;
                                double line557 = (double) line539 / line539;
                                double line558 = (double) line540 / line539;
                                double line559 = (double) line541 / line539;
                                double line560 = (double) line542 / line539;
                                double line561 = (double) line543 / line539;

                                String result556 = String.format("%.1f", line556);
                                String result557 = String.format("%.1f", line557);
                                String result558 = String.format("%.1f", line558);
                                String result559 = String.format("%.1f", line559);
                                String result560 = String.format("%.1f", line560);
                                String result561 = String.format("%.1f", line561);

                                // Вывод деления 2 строки в матрице
                                String S267 = result1 + "   " + result2 + "    " + result3 + "  " + result4 + "  " + result5 + "  " + result6;
                                textView50.setText(S267);
                                String S268 = result556 + "   " + result557 + "    " + result558 + "  " + result559 + "  " + result560 + "  " + result561;
                                textView51.setText(S268);
                                String S269 = result544 + "   " + result545 + "    " + result546 + "  " + result547 + "  " + result548 + "  " + result549;
                                textView52.setText(S269);
                                String S270 = result550 + "   " + result551 + "    " + result552 + "  " + result553 + "  " + result554 + "  " + result555;
                                textView53.setText(S270);
                                String S271 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                                textView54.setText(S271);


                                String str67 = "от 1 строки отнимаем 2 строку, умноженную на " + result2 + "  к 3 строке добавляем 2 строку, умноженную на " + result545 + " к 4 строке добавляем 2 строку, умноженную на " + result551;
                                textView55.setText(str67);

                                // расчет от 1 строки отнимаем 2 строку, умноженную на result2
                                double line562 = (double) line1 - line556 * line2;
                                double line563 = (double) line2 - line557 * line2;
                                double line564 = (double) line3 - line558 * line2;
                                double line565 = (double) line4 - line559 * line2;
                                double line566 = (double) line5 - line560 * line2;
                                double line567 = (double) line6 - line561 * line2;

                                String result562 = String.format("%.1f", line562);
                                String result563 = String.format("%.1f", line563);
                                String result564 = String.format("%.1f", line564);
                                String result565 = String.format("%.1f", line565);
                                String result566 = String.format("%.1f", line566);
                                String result567 = String.format("%.1f", line567);

                                // расчет к 3 строке добавляем 2 строку, умноженную на result545
                                double line568 = (double) line544 - line556 * line545;
                                double line569 = (double) line545 - line557 * line545;
                                double line570 = (double) line546 - line558 * line545;
                                double line571 = (double) line547 - line559 * line545;
                                double line572 = (double) line548 - line560 * line545;
                                double line573 = (double) line549 - line561 * line545;

                                String result568 = String.format("%.1f", line568);
                                String result569 = String.format("%.1f", line569);
                                String result570 = String.format("%.1f", line570);
                                String result571 = String.format("%.1f", line571);
                                String result572 = String.format("%.1f", line572);
                                String result573 = String.format("%.1f", line573);

                                // расчет к 4 строки добавляем 2 строку, умноженную на result551
                                double line574 = (double) line550 - line556 * line551;
                                double line575 = (double) line551 - line557 * line551;
                                double line576 = (double) line552 - line558 * line551;
                                double line577 = (double) line553 - line559 * line551;
                                double line578 = (double) line554 - line560 * line551;
                                double line579 = (double) line555 - line561 * line551;

                                String result574 = String.format("%.1f", line574);
                                String result575 = String.format("%.1f", line575);
                                String result576 = String.format("%.1f", line576);
                                String result577 = String.format("%.1f", line577);
                                String result578 = String.format("%.1f", line578);
                                String result579 = String.format("%.1f", line579);

                                // Вывод результата вычисления в матрицу
                                String S272 = result562 + "   " + result563 + "    " + result564 + "  " + result565 + "  " + result566 + "  " + result567;
                                textView56.setText(S272);
                                String S273 = result556 + "   " + result557 + "    " + result558 + "  " + result559 + "  " + result560 + "  " + result561;
                                textView57.setText(S273);
                                String S274 = result568 + "   " + result569 + "    " + result570 + "  " + result571 + "  " + result572 + "  " + result573;
                                textView58.setText(S274);
                                String S275 = result574 + "   " + result575 + "    " + result576 + "  " + result577 + "  " + result578 + "  " + result579;
                                textView59.setText(S275);
                                String S276 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                                textView60.setText(S276);

                                String str68 = "3-ую строку делим на " + result570;
                                textView61.setText(str68);

                                // расчет деления 3 строки в матрице на result570
                                double line580 = (double) line568 / line570;
                                double line581 = (double) line569 / line570;
                                double line582 = (double) line570 / line570;
                                double line583 = (double) line571 / line570;
                                double line584 = (double) line572 / line570;
                                double line585 = (double) line573 / line570;

                                String result580 = String.format("%.1f", line580);
                                String result581 = String.format("%.1f", line581);
                                String result582 = String.format("%.1f", line582);
                                String result583 = String.format("%.1f", line583);
                                String result584 = String.format("%.1f", line584);
                                String result585 = String.format("%.1f", line585);

                                // Вывод деления 3 строки в матрице
                                String S277 = result562 + "   " + result563 + "    " + result564 + "  " + result565 + "  " + result566 + "  " + result567;
                                textView62.setText(S277);
                                String S278 = result556 + "   " + result557 + "    " + result558 + "  " + result559 + "  " + result560 + "  " + result561;
                                textView63.setText(S278);
                                String S279 = result580 + "   " + result581 + "    " + result582 + "  " + result583 + "  " + result584 + "  " + result585;
                                textView64.setText(S279);
                                String S280 = result574 + "   " + result575 + "    " + result576 + "  " + result577 + "  " + result578 + "  " + result579;
                                textView65.setText(S280);
                                String S281 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                                textView66.setText(S281);


                                String str69 = "от 1 строки отнимаем 3 строку, умноженную на " + result564 + " от 2 строки отнимаем 3 строку, умноженную на " + result558 + " к 4 строке добавляем 3 строку, умноженную на " + result576;
                                textView67.setText(str69);

                                // расчет от 1 строки отнимаем 3 строку, умноженную на result564
                                double line586 = (double) line562 - line580 * line564;
                                double line587 = (double) line563 - line581 * line564;
                                double line588 = (double) line564 - line582 * line564;
                                double line589 = (double) line565 - line583 * line564;
                                double line590 = (double) line566 - line584 * line564;
                                double line591 = (double) line567 - line585 * line564;

                                String result586 = String.format("%.1f", line586);
                                String result587 = String.format("%.1f", line587);
                                String result588 = String.format("%.1f", line588);
                                String result589 = String.format("%.1f", line589);
                                String result590 = String.format("%.1f", line590);
                                String result591 = String.format("%.1f", line591);

                                // расчет от 2 строки отнимаем 3 строку, умноженную на result558
                                double line592 = (double) line556 - line580 * line558;
                                double line593 = (double) line557 - line581 * line558;
                                double line594 = (double) line558 - line582 * line558;
                                double line595 = (double) line559 - line583 * line558;
                                double line596 = (double) line560 - line584 * line558;
                                double line597 = (double) line561 - line585 * line558;

                                String result592 = String.format("%.1f", line592);
                                String result593 = String.format("%.1f", line593);
                                String result594 = String.format("%.1f", line594);
                                String result595 = String.format("%.1f", line595);
                                String result596 = String.format("%.1f", line596);
                                String result597 = String.format("%.1f", line597);

                                // расчет к 4 строки добавляем 3 строку, умноженную на result576
                                double line598 = (double) line574 - line580 * line576;
                                double line599 = (double) line575 - line581 * line576;
                                double line600 = (double) line576 - line582 * line576;
                                double line601 = (double) line577 - line583 * line576;
                                double line602 = (double) line578 - line584 * line576;
                                double line603 = (double) line579 - line585 * line576;

                                String result598 = String.format("%.1f", line598);
                                String result599 = String.format("%.1f", line599);
                                String result600 = String.format("%.1f", line600);
                                String result601 = String.format("%.1f", line601);
                                String result602 = String.format("%.1f", line602);
                                String result603 = String.format("%.1f", line603);

                                // Вывод результата вычисления в матрицу
                                String S282 = result586 + "   " + result587 + "    " + result588 + "  " + result589 + "  " + result590 + "  " + result591;
                                textView68.setText(S282);
                                String S283 = result592 + "   " + result593 + "    " + result594 + "  " + result595 + "  " + result596 + "  " + result597;
                                textView69.setText(S283);
                                String S284 = result580 + "   " + result581 + "    " + result582 + "  " + result583 + "  " + result584 + "  " + result585;
                                textView70.setText(S284);
                                String S285 = result598 + "   " + result599 + "    " + result600 + "  " + result601 + "  " + result602 + "  " + result603;
                                textView71.setText(S285);
                                String S286 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                                textView72.setText(S286);

                                String str70 = "4-ую строку делим на " + result601;
                                textView73.setText(str70);

                                // расчет деления 4 строки в матрице на result601
                                double line604 = (double) line598 / line601;
                                double line605 = (double) line599 / line601;
                                double line606 = (double) line600 / line601;
                                double line607 = (double) line601 / line601;
                                double line608 = (double) line602 / line601;
                                double line609 = (double) line603 / line601;

                                String result604 = String.format("%.1f", line604);
                                String result605 = String.format("%.1f", line605);
                                String result606 = String.format("%.1f", line606);
                                String result607 = String.format("%.1f", line607);
                                String result608 = String.format("%.1f", line608);
                                String result609 = String.format("%.1f", line609);

                                // Вывод деления 4 строки в матрице
                                String S287 = result586 + "   " + result587 + "    " + result588 + "  " + result589 + "  " + result590 + "  " + result591;
                                textView74.setText(S287);
                                String S288 = result592 + "   " + result593 + "    " + result594 + "  " + result595 + "  " + result596 + "  " + result597;
                                textView75.setText(S288);
                                String S289 = result580 + "   " + result581 + "    " + result582 + "  " + result583 + "  " + result584 + "  " + result585;
                                textView76.setText(S289);
                                String S290 = result604 + "   " + result605 + "    " + result606 + "  " + result607 + "  " + result608 + "  " + result609;
                                textView77.setText(S290);
                                String S291 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                                textView78.setText(S291);

                                String str71 = "от 1 строки отнимаем 4 строку, умноженную на " + result589 + " от 2 строки отнимаем 4 строку, умноженную на " + result595 + " к 3 строки добавляем 4 строку, умноженную на " + result583;
                                textView79.setText(str71);

                                // расчет от 1 строки отнимаем 4 строку, умноженную на result589
                                double line610 = (double) line586 - line604 * line589;
                                double line611 = (double) line587 - line605 * line589;
                                double line612 = (double) line588 - line606 * line589;
                                double line613 = (double) line589 - line607 * line589;
                                double line614 = (double) line590 - line608 * line589;
                                double line615 = (double) line591 - line609 * line589;

                                String result610 = String.format("%.1f", line610);
                                String result611 = String.format("%.1f", line611);
                                String result612 = String.format("%.1f", line612);
                                String result613 = String.format("%.1f", line613);
                                String result614 = String.format("%.1f", line614);
                                String result615 = String.format("%.1f", line615);

                                // расчет от 2 строки отнимаем 4 строку, умноженную на result595
                                double line616 = (double) line592 - line580 * line595;
                                double line617 = (double) line593 - line581 * line595;
                                double line618 = (double) line594 - line582 * line595;
                                double line619 = (double) line595 - line583 * line595;
                                double line620 = (double) line596 - line584 * line595;
                                double line621 = (double) line597 - line585 * line595;

                                String result616 = String.format("%.1f", line616);
                                String result617 = String.format("%.1f", line617);
                                String result618 = String.format("%.1f", line618);
                                String result619 = String.format("%.1f", line619);
                                String result620 = String.format("%.1f", line620);
                                String result621 = String.format("%.1f", line621);

                                // расчет к 3 строки добавляем 4 строку, умноженную на result583
                                double line622 = (double) line580 - line580 * line583;
                                double line623 = (double) line581 - line581 * line583;
                                double line624 = (double) line582 - line582 * line583;
                                double line625 = (double) line583 - line583 * line583;
                                double line626 = (double) line584 - line584 * line583;
                                double line627 = (double) line585 - line585 * line583;

                                String result622 = String.format("%.1f", line622);
                                String result623 = String.format("%.1f", line623);
                                String result624 = String.format("%.1f", line624);
                                String result625 = String.format("%.1f", line625);
                                String result626 = String.format("%.1f", line626);
                                String result627 = String.format("%.1f", line627);

                                // Вывод результата вычисления в матрицу
                                String S292 = result610 + "   " + result611 + "    " + result612 + "  " + result613 + "  " + result614 + "  " + result615;
                                textView80.setText(S292);
                                String S293 = result616 + "   " + result617 + "    " + result618 + "  " + result619 + "  " + result620 + "  " + result621;
                                textView81.setText(S293);
                                String S294 = result622 + "   " + result623 + "    " + result624 + "  " + result625 + "  " + result626 + "  " + result627;
                                textView82.setText(S294);
                                String S295 = result604 + "   " + result605 + "    " + result606 + "  " + result607 + "  " + result608 + "  " + result609;
                                textView83.setText(S295);
                                String S296 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + b5;
                                textView84.setText(S296);

                                String str72 = " Ответ: ";
                                textView85.setText(str72);
                                String str73 = " Система имеет множество решений: ";
                                textView86.setText(str73);
                                textView87.setText(" x1 =  " + result615);
                                textView88.setText(" x2 +  " + result620 + "x5" + " = " + result621);
                                textView89.setText(" x3 +  " + result626 + "x5" + " = " + result627);
                                textView90.setText(" x4 +  " + result608 + "x5" + " = " + result609);

                                // Скрываем не нужный вывод результата
                                textView91.setVisibility(View.INVISIBLE);
                                textView92.setVisibility(View.INVISIBLE);
                                textView93.setVisibility(View.INVISIBLE);
                                textView94.setVisibility(View.INVISIBLE);
                                textView95.setVisibility(View.INVISIBLE);
                                textView96.setVisibility(View.INVISIBLE);
                                textView97.setVisibility(View.INVISIBLE);
                                textView98.setVisibility(View.INVISIBLE);
                                textView99.setVisibility(View.INVISIBLE);
                                textView100.setVisibility(View.INVISIBLE);
                                textView101.setVisibility(View.INVISIBLE);
                                textView102.setVisibility(View.INVISIBLE);
                            } else {  // Проверяем если пользователь заполнил матрицу положительными значениями
                                if (a11 > 0 && a12 > 0 && a13 > 0 && a14 > 0 && a15 > 0 && b1 > 0 && a21 > 0 && a22 > 0 && a23 > 0 && a24 > 0 && a25 > 0 && b2 > 0 && a31 > 0 && a32 > 0 && a33 > 0 && a34 > 0 && a35 > 0 && b3 > 0 && a41 > 0 && a42 > 0 && a43 > 0 && a44 > 0 && a45 > 0 && b4 > 0 && a51 > 0 && a52 > 0 && a53 > 0 && a54 > 0 && a55 > 0 && b5 > 0) {
                                    // Показываем нужный вывод результата
                                    textView43.setVisibility(View.VISIBLE);
                                    textView44.setVisibility(View.VISIBLE);
                                    textView45.setVisibility(View.VISIBLE);
                                    textView46.setVisibility(View.VISIBLE);
                                    textView47.setVisibility(View.VISIBLE);
                                    textView48.setVisibility(View.VISIBLE);
                                    textView49.setVisibility(View.VISIBLE);
                                    textView50.setVisibility(View.VISIBLE);
                                    textView51.setVisibility(View.VISIBLE);
                                    textView52.setVisibility(View.VISIBLE);
                                    textView53.setVisibility(View.VISIBLE);
                                    textView54.setVisibility(View.VISIBLE);
                                    textView55.setVisibility(View.VISIBLE);
                                    textView56.setVisibility(View.VISIBLE);
                                    textView57.setVisibility(View.VISIBLE);
                                    textView58.setVisibility(View.VISIBLE);
                                    textView59.setVisibility(View.VISIBLE);
                                    textView60.setVisibility(View.VISIBLE);
                                    textView61.setVisibility(View.VISIBLE);
                                    textView62.setVisibility(View.VISIBLE);
                                    textView63.setVisibility(View.VISIBLE);
                                    textView64.setVisibility(View.VISIBLE);
                                    textView65.setVisibility(View.VISIBLE);
                                    textView66.setVisibility(View.VISIBLE);
                                    textView67.setVisibility(View.VISIBLE);
                                    textView68.setVisibility(View.VISIBLE);
                                    textView69.setVisibility(View.VISIBLE);
                                    textView70.setVisibility(View.VISIBLE);
                                    textView71.setVisibility(View.VISIBLE);
                                    textView72.setVisibility(View.VISIBLE);
                                    textView73.setVisibility(View.VISIBLE);
                                    textView74.setVisibility(View.VISIBLE);
                                    textView75.setVisibility(View.VISIBLE);
                                    textView76.setVisibility(View.VISIBLE);
                                    textView77.setVisibility(View.VISIBLE);
                                    textView78.setVisibility(View.VISIBLE);
                                    textView79.setVisibility(View.VISIBLE);
                                    textView80.setVisibility(View.VISIBLE);
                                    textView81.setVisibility(View.VISIBLE);
                                    textView81.setVisibility(View.VISIBLE);
                                    textView82.setVisibility(View.VISIBLE);
                                    textView83.setVisibility(View.VISIBLE);
                                    textView84.setVisibility(View.VISIBLE);
                                    textView85.setVisibility(View.VISIBLE);
                                    textView86.setVisibility(View.VISIBLE);
                                    textView87.setVisibility(View.VISIBLE);
                                    textView88.setVisibility(View.VISIBLE);
                                    textView89.setVisibility(View.VISIBLE);
                                    textView90.setVisibility(View.VISIBLE);
                                    textView91.setVisibility(View.VISIBLE);
                                    textView92.setVisibility(View.VISIBLE);
                                    textView93.setVisibility(View.VISIBLE);
                                    textView94.setVisibility(View.VISIBLE);
                                    textView95.setVisibility(View.VISIBLE);
                                    textView96.setVisibility(View.VISIBLE);
                                    textView97.setVisibility(View.VISIBLE);
                                    textView98.setVisibility(View.VISIBLE);
                                    textView99.setVisibility(View.VISIBLE);
                                    textView100.setVisibility(View.VISIBLE);
                                    textView101.setVisibility(View.VISIBLE);
                                    textView102.setVisibility(View.VISIBLE);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    public void Clear6(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30, EditText editTextNumber31, EditText editTextNumber32, EditText editTextNumber33, EditText editTextNumber34, EditText editTextNumber35, EditText editTextNumber36, EditText editTextNumber37, EditText editTextNumber38, EditText editTextNumber39, EditText editTextNumber40, EditText editTextNumber41, EditText editTextNumber42, TextView textView44, TextView textView45, TextView textView46, TextView textView47, TextView textView48, TextView textView49, TextView textView51, TextView textView52, TextView textView53, TextView textView54, TextView textView55, TextView textView56, TextView textView58, TextView textView59, TextView textView60, TextView textView61, TextView textView62, TextView textView63, TextView textView65, TextView textView66, TextView textView67, TextView textView69, TextView textView70, TextView textView72, TextView textView73, TextView textView74, TextView textView75, TextView textView76, TextView textView77, TextView textView79, TextView textView80, TextView textView81, TextView textView82, TextView textView83, TextView textView84, TextView textView86, TextView textView87, TextView textView88, TextView textView89, TextView textView90, TextView textView91, TextView textView93, TextView textView94, TextView textView95, TextView textView96, TextView textView97, TextView textView98, TextView textView100, TextView textView101, TextView textView102, TextView textView103, TextView textView104, TextView textView105, TextView textView107, TextView textView108, TextView textView109, TextView textView110, TextView textView111, TextView textView112, TextView textView114, TextView textView115, TextView textView116, TextView textView117, TextView textView118, TextView textView119, TextView textView121, TextView textView122, TextView textView123, TextView textView124, TextView textView125, TextView textView126, TextView textView128, TextView textView129, TextView textView130, TextView textView131, TextView textView132, TextView textView133, TextView textView135, TextView textView136, TextView textView137, TextView textView138, TextView textView139, TextView textView140, TextView textView142, TextView textView143, TextView textView144, TextView textView145, TextView textView146, TextView textView147) {
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

        textView44.setText(null);
        textView45.setText(null);
        textView46.setText(null);
        textView47.setText(null);
        textView48.setText(null);
        textView49.setText(null);
        textView51.setText(null);
        textView52.setText(null);
        textView53.setText(null);
        textView54.setText(null);
        textView55.setText(null);
        textView56.setText(null);
        textView58.setText(null);
        textView59.setText(null);
        textView60.setText(null);
        textView61.setText(null);
        textView62.setText(null);
        textView63.setText(null);
        textView65.setText(null);
        textView66.setText(null);
        textView67.setText(null);
        textView69.setText(null);
        textView70.setText(null);
        textView72.setText(null);
        textView73.setText(null);
        textView74.setText(null);
        textView75.setText(null);
        textView76.setText(null);
        textView77.setText(null);
        textView79.setText(null);
        textView80.setText(null);
        textView81.setText(null);
        textView82.setText(null);
        textView83.setText(null);
        textView84.setText(null);
        textView86.setText(null);
        textView87.setText(null);
        textView88.setText(null);
        textView89.setText(null);
        textView90.setText(null);
        textView91.setText(null);
        textView93.setText(null);
        textView94.setText(null);
        textView95.setText(null);
        textView96.setText(null);
        textView97.setText(null);
        textView98.setText(null);
        textView100.setText(null);
        textView101.setText(null);
        textView102.setText(null);
        textView103.setText(null);
        textView104.setText(null);
        textView105.setText(null);
        textView107.setText(null);
        textView108.setText(null);
        textView109.setText(null);
        textView110.setText(null);
        textView111.setText(null);
        textView112.setText(null);
        textView114.setText(null);
        textView115.setText(null);
        textView116.setText(null);
        textView117.setText(null);
        textView118.setText(null);
        textView119.setText(null);
        textView121.setText(null);
        textView122.setText(null);
        textView123.setText(null);
        textView124.setText(null);
        textView125.setText(null);
        textView126.setText(null);
        textView128.setText(null);
        textView129.setText(null);
        textView130.setText(null);
        textView131.setText(null);
        textView132.setText(null);
        textView133.setText(null);
        textView135.setText(null);
        textView136.setText(null);
        textView137.setText(null);
        textView138.setText(null);
        textView139.setText(null);
        textView140.setText(null);
        textView142.setText(null);
        textView143.setText(null);
        textView144.setText(null);
        textView145.setText(null);
        textView146.setText(null);
        textView147.setText(null);
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

    public void Rast6(EditText editTextNumber1, EditText editTextNumber2, EditText editTextNumber3, EditText editTextNumber4, EditText editTextNumber5, EditText editTextNumber6, EditText editTextNumber7, EditText editTextNumber8, EditText editTextNumber9, EditText editTextNumber10, EditText editTextNumber11, EditText editTextNumber12, EditText editTextNumber13, EditText editTextNumber14, EditText editTextNumber15, EditText editTextNumber16, EditText editTextNumber17, EditText editTextNumber18, EditText editTextNumber19, EditText editTextNumber20, EditText editTextNumber21, EditText editTextNumber22, EditText editTextNumber23, EditText editTextNumber24, EditText editTextNumber25, EditText editTextNumber26, EditText editTextNumber27, EditText editTextNumber28, EditText editTextNumber29, EditText editTextNumber30, EditText editTextNumber31, EditText editTextNumber32, EditText editTextNumber33, EditText editTextNumber34, EditText editTextNumber35, EditText editTextNumber36, EditText editTextNumber37, EditText editTextNumber38, EditText editTextNumber39, EditText editTextNumber40, EditText editTextNumber41, EditText editTextNumber42, TextView textView43, TextView textView44, TextView textView45, TextView textView46, TextView textView47, TextView textView48, TextView textView49, TextView textView50, TextView textView51, TextView textView52, TextView textView53, TextView textView54, TextView textView55, TextView textView56, TextView textView57, TextView textView58, TextView textView59, TextView textView60, TextView textView61, TextView textView62, TextView textView63, TextView textView64, TextView textView65, TextView textView66, TextView textView67, TextView textView68, TextView textView69, TextView textView70, TextView textView71, TextView textView72, TextView textView73, TextView textView74, TextView textView75, TextView textView76, TextView textView77, TextView textView78, TextView textView79, TextView textView80, TextView textView81, TextView textView82, TextView textView83, TextView textView84, TextView textView85, TextView textView86, TextView textView87, TextView textView88, TextView textView89, TextView textView90, TextView textView91, TextView textView92, TextView textView93, TextView textView94, TextView textView95, TextView textView96, TextView textView97, TextView textView98, TextView textView99, TextView textView100, TextView textView101, TextView textView102, TextView textView103, TextView textView104, TextView textView105, TextView textView106, TextView textView107, TextView textView108, TextView textView109, TextView textView110, TextView textView111, TextView textView112, TextView textView113, TextView textView114, TextView textView115, TextView textView116, TextView textView117, TextView textView118, TextView textView119, TextView textView120, TextView textView121, TextView textView122, TextView textView123, TextView textView124, TextView textView125, TextView textView126, TextView textView127, TextView textView128, TextView textView129, TextView textView130, TextView textView131, TextView textView132, TextView textView133, TextView textView134, TextView textView135, TextView textView136, TextView textView137, TextView textView138, TextView textView139, TextView textView140, TextView textView141, TextView textView142, TextView textView143, TextView textView144, TextView textView145, TextView textView146, TextView textView147) {
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


        textView43.setText("Перепишем систему уравнений в матричном виде");

        // Вывод общей матрицы
        String S1 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
        textView44.setText(S1);
        String S2 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + a26 + "  " + b2;
        textView45.setText(S2);
        String S3 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + a36 + "  " + b3;
        textView46.setText(S3);
        String S4 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + a46 + "  " + b4;
        textView47.setText(S4);
        String S5 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + a56 + "  " + b5;
        textView48.setText(S5);
        String S6 = a61 + "   " + a62 + "    " + a63 + "  " + a64 + "  " + a65 + "  " + a66 + "  " + b6;
        textView49.setText(S6);

        String str = "1-ую строку делим на " + a11;
        textView50.setText(str);

        // расчет деления 1 строки в матрице на а11
        double line1 = (double) a11 / a11;
        double line2 = (double) a12 / a11;
        double line3 = (double) a13 / a11;
        double line4 = (double) a14 / a11;
        double line5 = (double) a15 / a11;
        double line6 = (double) a16 / a11;
        double line7 = (double) b1 / a11;

        String result1 = String.format("%.1f", line1);
        String result2 = String.format("%.1f", line2);
        String result3 = String.format("%.1f", line3);
        String result4 = String.format("%.1f", line4);
        String result5 = String.format("%.1f", line5);
        String result6 = String.format("%.1f", line6);
        String result7 = String.format("%.1f", line7);

        // вывод деления 1 строки в матрице на а11
        String S7 = result1 + "   " + result2 + "    " + result3 + "   " + result4 + "    " + result5 + "    " + result6 + "    " + result7;
        textView51.setText(S7);
        String S8 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + a26 + "  " + b2;
        textView52.setText(S8);
        String S9 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + a36 + "  " + b3;
        textView53.setText(S9);
        String S10 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + a46 + "  " + b4;
        textView54.setText(S10);
        String S11 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + a56 + "  " + b5;
        textView55.setText(S11);
        String S12 = a61 + "   " + a62 + "    " + a63 + "  " + a64 + "  " + a65 + "  " + a66 + "  " + b6;
        textView56.setText(S12);


        String str1 = "от 2 строки отнимаем 1 строку, умноженную на " + a21 + " от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 4 строки отнимаем 1 строку, умноженную на " + a41 + " от 5 строки отнимаем 1 строку, умноженную на " + a51 + " от 6 строки отнимаем 1 строку, умноженную на " + a61;
        textView57.setText(str1);

        // расчет от 2 строки отнимаем 1 строку, умноженную на a21
        double line8 = (double) a21 - line1 * a21;
        double line9 = (double) a22 - line2 * a21;
        double line10 = (double) a23 - line3 * a21;
        double line11 = (double) a24 - line4 * a21;
        double line12 = (double) a25 - line5 * a21;
        double line13 = (double) a26 - line6 * a21;
        double line14 = (double) b2 - line7 * a21;

        String result8 = String.format("%.1f", line8);
        String result9 = String.format("%.1f", line9);
        String result10 = String.format("%.1f", line10);
        String result11 = String.format("%.1f", line11);
        String result12 = String.format("%.1f", line12);
        String result13 = String.format("%.1f", line13);
        String result14 = String.format("%.1f", line14);

        // расчет от 3 строки отнимаем 1 строку, умноженную на a31
        double line15 = (double) a31 - line1 * a31;
        double line16 = (double) a32 - line2 * a31;
        double line17 = (double) a33 - line3 * a31;
        double line18 = (double) a34 - line4 * a31;
        double line19 = (double) a35 - line5 * a31;
        double line20 = (double) a36 - line6 * a31;
        double line21 = (double) b3 - line7 * a31;

        String result15 = String.format("%.1f", line15);
        String result16 = String.format("%.1f", line16);
        String result17 = String.format("%.1f", line17);
        String result18 = String.format("%.1f", line18);
        String result19 = String.format("%.1f", line19);
        String result20 = String.format("%.1f", line20);
        String result21 = String.format("%.1f", line21);

        // расчет от 4 строки отнимаем 1 строку, умноженную на a41
        double line22 = (double) a41 - line1 * a41;
        double line23 = (double) a42 - line2 * a41;
        double line24 = (double) a43 - line3 * a41;
        double line25 = (double) a44 - line4 * a41;
        double line26 = (double) a45 - line5 * a41;
        double line27 = (double) a46 - line6 * a41;
        double line28 = (double) b4 - line7 * a41;

        String result22 = String.format("%.1f", line22);
        String result23 = String.format("%.1f", line23);
        String result24 = String.format("%.1f", line24);
        String result25 = String.format("%.1f", line25);
        String result26 = String.format("%.1f", line26);
        String result27 = String.format("%.1f", line27);
        String result28 = String.format("%.1f", line28);

        // расчет от 5 строки отнимаем 1 строку, умноженную на a51
        double line29 = (double) a51 - line1 * a51;
        double line30 = (double) a52 - line2 * a51;
        double line31 = (double) a53 - line3 * a51;
        double line32 = (double) a54 - line4 * a51;
        double line33 = (double) a55 - line5 * a51;
        double line34 = (double) a56 - line6 * a51;
        double line35 = (double) b5 - line7 * a51;

        String result29 = String.format("%.1f", line29);
        String result30 = String.format("%.1f", line30);
        String result31 = String.format("%.1f", line31);
        String result32 = String.format("%.1f", line32);
        String result33 = String.format("%.1f", line33);
        String result34 = String.format("%.1f", line34);
        String result35 = String.format("%.1f", line35);

        // расчет от 6 строки отнимаем 1 строку, умноженную на a61
        double line36 = (double) a61 - line1 * a61;
        double line37 = (double) a62 - line2 * a61;
        double line38 = (double) a63 - line3 * a61;
        double line39 = (double) a64 - line4 * a61;
        double line40 = (double) a65 - line5 * a61;
        double line41 = (double) a66 - line6 * a61;
        double line42 = (double) b6 - line7 * a61;

        String result36 = String.format("%.1f", line36);
        String result37 = String.format("%.1f", line37);
        String result38 = String.format("%.1f", line38);
        String result39 = String.format("%.1f", line39);
        String result40 = String.format("%.1f", line40);
        String result41 = String.format("%.1f", line41);
        String result42 = String.format("%.1f", line42);

        // Вывод расчета в матрицу
        String S13 = result1 + "   " + result2 + "    " + result3 + "   " + result4 + "    " + result5 + "    " + result6 + "    " + result7;
        textView58.setText(S13);
        String S14 = result8 + "   " + result9 + "    " + result10 + "   " + result11 + "    " + result12 + "    " + result13 + "    " + result14;
        textView59.setText(S14);
        String S15 = result15 + "   " + result16 + "    " + result17 + "   " + result18 + "    " + result19 + "    " + result20 + "    " + result21;
        textView60.setText(S15);
        String S16 = result22 + "   " + result23 + "    " + result24 + "   " + result25 + "    " + result26 + "    " + result27 + "    " + result28;
        textView61.setText(S16);
        String S17 = result29 + "   " + result30 + "    " + result31 + "   " + result32 + "    " + result33 + "    " + result34 + "    " + result35;
        textView62.setText(S17);
        String S18 = result36 + "   " + result37 + "    " + result38 + "   " + result39 + "    " + result40 + "    " + result41 + "    " + result42;
        textView63.setText(S18);

        String str2 = "2-ую строку делим на " + result9;
        textView64.setText(str2);

        // расчет деления 2 строки в матрице на result9
        double line43 = (double) line8 / line9;
        double line44 = (double) line9 / line9;
        double line45 = (double) line10 / line9;
        double line46 = (double) line11 / line9;
        double line47 = (double) line12 / line9;
        double line48 = (double) line13 / line9;
        double line49 = (double) line14 / line9;

        String result43 = String.format("%.1f", line43);
        String result44 = String.format("%.1f", line44);
        String result45 = String.format("%.1f", line45);
        String result46 = String.format("%.1f", line46);
        String result47 = String.format("%.1f", line47);
        String result48 = String.format("%.1f", line48);
        String result49 = String.format("%.1f", line49);

        // Вывод расчета деления 2 строки в матрицу
        String S19 = result1 + "   " + result2 + "    " + result3 + "   " + result4 + "    " + result5 + "    " + result6 + "    " + result7;
        textView65.setText(S19);
        String S20 = result43 + "   " + result44 + "    " + result45 + "   " + result46 + "    " + result47 + "    " + result48 + "    " + result49;
        textView66.setText(S20);
        String S21 = result15 + "   " + result16 + "    " + result17 + "   " + result18 + "    " + result19 + "    " + result20 + "    " + result21;
        textView67.setText(S21);
        String S22 = result22 + "   " + result23 + "    " + result24 + "   " + result25 + "    " + result26 + "    " + result27 + "    " + result28;
        textView68.setText(S22);
        String S23 = result29 + "   " + result30 + "    " + result31 + "   " + result32 + "    " + result33 + "    " + result34 + "    " + result35;
        textView69.setText(S23);
        String S24 = result36 + "   " + result37 + "    " + result38 + "   " + result39 + "    " + result40 + "    " + result41 + "    " + result42;
        textView70.setText(S24);

        String str3 = "от 1 строки отнимаем 2 строку, умноженную на " + result2 + " к 3 строке добавляем 2 строку, умноженную на " + result16 + " к 4 строки добавляем 2 строку, умноженную на " + result23 + " от 5 строки отнимаем 2 строку, умноженную на " + result30 + " к 6 строки добавляем 2 строку, умноженную на " + result37;
        textView71.setText(str3);

        // расчет от 1 строки отнимаем 2 строку, умноженную на result2
        double line50 = (double) line1 - line43 * line2;
        double line51 = (double) line2 - line44 * line2;
        double line52 = (double) line3 - line45 * line2;
        double line53 = (double) line4 - line46 * line2;
        double line54 = (double) line5 - line47 * line2;
        double line55 = (double) line6 - line48 * line2;
        double line56 = (double) line7 - line49 * line2;

        String result50 = String.format("%.1f", line50);
        String result51 = String.format("%.1f", line51);
        String result52 = String.format("%.1f", line52);
        String result53 = String.format("%.1f", line53);
        String result54 = String.format("%.1f", line54);
        String result55 = String.format("%.1f", line55);
        String result56 = String.format("%.1f", line56);

        // расчет от 3 строки отнимаем 2 строку, умноженную на result16
        double line57 = (double) line15 - line43 * line16;
        double line58 = (double) line16 - line44 * line16;
        double line59 = (double) line17 - line45 * line16;
        double line60 = (double) line18 - line46 * line16;
        double line61 = (double) line19 - line47 * line16;
        double line62 = (double) line20 - line48 * line16;
        double line63 = (double) line21 - line49 * line16;

        String result57 = String.format("%.1f", line57);
        String result58 = String.format("%.1f", line58);
        String result59 = String.format("%.1f", line59);
        String result60 = String.format("%.1f", line60);
        String result61 = String.format("%.1f", line61);
        String result62 = String.format("%.1f", line62);
        String result63 = String.format("%.1f", line63);

        // расчет к 4 строки добавляем 2 строку, умноженную на result23
        double line64 = (double) line22 - line43 * line23;
        double line65 = (double) line23 - line44 * line23;
        double line66 = (double) line24 - line45 * line23;
        double line67 = (double) line25 - line46 * line23;
        double line68 = (double) line26 - line47 * line23;
        double line69 = (double) line27 - line48 * line23;
        double line70 = (double) line28 - line49 * line23;

        String result64 = String.format("%.1f", line64);
        String result65 = String.format("%.1f", line65);
        String result66 = String.format("%.1f", line66);
        String result67 = String.format("%.1f", line67);
        String result68 = String.format("%.1f", line68);
        String result69 = String.format("%.1f", line69);
        String result70 = String.format("%.1f", line70);

        // расчет от 5 строки отнимаем 2 строку, умноженную на result30
        double line71 = (double) line29 - line43 * line30;
        double line72 = (double) line30 - line44 * line30;
        double line73 = (double) line31 - line45 * line30;
        double line74 = (double) line32 - line46 * line30;
        double line75 = (double) line33 - line47 * line30;
        double line76 = (double) line34 - line48 * line30;
        double line77 = (double) line35 - line49 * line30;

        String result71 = String.format("%.1f", line71);
        String result72 = String.format("%.1f", line72);
        String result73 = String.format("%.1f", line73);
        String result74 = String.format("%.1f", line74);
        String result75 = String.format("%.1f", line75);
        String result76 = String.format("%.1f", line76);
        String result77 = String.format("%.1f", line77);

        // расчет к 6 строки добавляем 2 строку, умноженную на result37
        double line78 = (double) line36 - line43 * line37;
        double line79 = (double) line37 - line44 * line37;
        double line80 = (double) line38 - line45 * line37;
        double line81 = (double) line39 - line46 * line37;
        double line82 = (double) line40 - line47 * line37;
        double line83 = (double) line41 - line48 * line37;
        double line84 = (double) line42 - line49 * line37;

        String result78 = String.format("%.1f", line78);
        String result79 = String.format("%.1f", line79);
        String result80 = String.format("%.1f", line80);
        String result81 = String.format("%.1f", line81);
        String result82 = String.format("%.1f", line82);
        String result83 = String.format("%.1f", line83);
        String result84 = String.format("%.1f", line84);

        // Вывод расчета в матрицу
        String S25 = result50 + "   " + result51 + "    " + result52 + "   " + result53 + "    " + result54 + "    " + result55 + "    " + result56;
        textView72.setText(S25);
        String S26 = result43 + "   " + result44 + "    " + result45 + "   " + result46 + "    " + result47 + "    " + result48 + "    " + result49;
        textView73.setText(S26);
        String S27 = result57 + "   " + result58 + "    " + result59 + "   " + result60 + "    " + result61 + "    " + result62 + "    " + result63;
        textView74.setText(S27);
        String S28 = result64 + "   " + result65 + "    " + result66 + "   " + result67 + "    " + result68 + "    " + result69 + "    " + result70;
        textView75.setText(S28);
        String S29 = result71 + "   " + result72 + "    " + result73 + "   " + result74 + "    " + result75 + "    " + result76 + "    " + result77;
        textView76.setText(S29);
        String S30 = result78 + "   " + result79 + "    " + result80 + "   " + result81 + "    " + result82 + "    " + result83 + "    " + result84;
        textView77.setText(S30);

        String str4 = "3-ую строку делим на " + result59;
        textView78.setText(str4);

        // расчет деления 3 строки в матрице на result59
        double line85 = (double) line57 / line59;
        double line86 = (double) line58 / line59;
        double line87 = (double) line59 / line59;
        double line88 = (double) line60 / line59;
        double line89 = (double) line61 / line59;
        double line90 = (double) line62 / line59;
        double line91 = (double) line63 / line59;

        String result85 = String.format("%.1f", line85);
        String result86 = String.format("%.1f", line86);
        String result87 = String.format("%.1f", line87);
        String result88 = String.format("%.1f", line88);
        String result89 = String.format("%.1f", line89);
        String result90 = String.format("%.1f", line90);
        String result91 = String.format("%.1f", line91);

        // Вывод расчета деления 3 строки в матрицу
        String S31 = result50 + "   " + result51 + "    " + result52 + "   " + result53 + "    " + result54 + "    " + result55 + "    " + result56;
        textView79.setText(S31);
        String S32 = result43 + "   " + result44 + "    " + result45 + "   " + result46 + "    " + result47 + "    " + result48 + "    " + result49;
        textView80.setText(S32);
        String S33 = result85 + "   " + result86 + "    " + result87 + "   " + result88 + "    " + result89 + "    " + result90 + "    " + result91;
        textView81.setText(S33);
        String S34 = result64 + "   " + result65 + "    " + result66 + "   " + result67 + "    " + result68 + "    " + result69 + "    " + result70;
        textView82.setText(S34);
        String S35 = result71 + "   " + result72 + "    " + result73 + "   " + result74 + "    " + result75 + "    " + result76 + "    " + result77;
        textView83.setText(S35);
        String S36 = result78 + "   " + result79 + "    " + result80 + "   " + result81 + "    " + result82 + "    " + result83 + "    " + result84;
        textView84.setText(S36);


        String str5 = "к 1 строке добавляем 3 строку, умноженную на " + result52 + " от 2 строки отнимаем 3 строку, умноженную на " + result45 + " от 4 строки отнимаем 3 строку, умноженную на " + result66 + " от 5 строки отнимаем 3 строку, умноженную на " + result73 + " к 6 строке добавляем 3 строку, умноженную на " + result80;
        textView85.setText(str5);

        // расчет к 1 строке добавляем 3 строку, умноженную на result52
        double line92 = (double) line50 - line85 * line52;
        double line93 = (double) line51 - line86 * line52;
        double line94 = (double) line52 - line87 * line52;
        double line95 = (double) line53 - line88 * line52;
        double line96 = (double) line54 - line89 * line52;
        double line97 = (double) line55 - line90 * line52;
        double line98 = (double) line56 - line91 * line52;

        String result92 = String.format("%.1f", line92);
        String result93 = String.format("%.1f", line93);
        String result94 = String.format("%.1f", line94);
        String result95 = String.format("%.1f", line95);
        String result96 = String.format("%.1f", line96);
        String result97 = String.format("%.1f", line97);
        String result98 = String.format("%.1f", line98);

        // расчет от 2 строки отнимаем 3 строку, умноженную на result45
        double line99 = (double) line43 - line85 * line45;
        double line100 = (double) line44 - line86 * line45;
        double line101 = (double) line45 - line87 * line45;
        double line102 = (double) line46 - line88 * line45;
        double line103 = (double) line47 - line89 * line45;
        double line104 = (double) line48 - line90 * line45;
        double line105 = (double) line49 - line91 * line45;

        String result99 = String.format("%.1f", line99);
        String result100 = String.format("%.1f", line100);
        String result101 = String.format("%.1f", line101);
        String result102 = String.format("%.1f", line102);
        String result103 = String.format("%.1f", line103);
        String result104 = String.format("%.1f", line104);
        String result105 = String.format("%.1f", line105);

        // расчет от 4 строки отнимаем 3 строку, умноженную на result66
        double line106 = (double) line64 - line85 * line66;
        double line107 = (double) line65 - line86 * line66;
        double line108 = (double) line66 - line87 * line66;
        double line109 = (double) line67 - line88 * line66;
        double line110 = (double) line68 - line89 * line66;
        double line111 = (double) line69 - line90 * line66;
        double line112 = (double) line70 - line91 * line66;

        String result106 = String.format("%.1f", line106);
        String result107 = String.format("%.1f", line107);
        String result108 = String.format("%.1f", line108);
        String result109 = String.format("%.1f", line109);
        String result110 = String.format("%.1f", line110);
        String result111 = String.format("%.1f", line111);
        String result112 = String.format("%.1f", line112);

        // расчет от 5 строки отнимаем 3 строку, умноженную на result73
        double line113 = (double) line71 - line85 * line73;
        double line114 = (double) line72 - line86 * line73;
        double line115 = (double) line73 - line87 * line73;
        double line116 = (double) line74 - line88 * line73;
        double line117 = (double) line75 - line89 * line73;
        double line118 = (double) line76 - line90 * line73;
        double line119 = (double) line77 - line91 * line73;

        String result113 = String.format("%.1f", line113);
        String result114 = String.format("%.1f", line114);
        String result115 = String.format("%.1f", line115);
        String result116 = String.format("%.1f", line116);
        String result117 = String.format("%.1f", line117);
        String result118 = String.format("%.1f", line118);
        String result119 = String.format("%.1f", line119);

        // расчет к 6 строке добавляем 3 строку, умноженную на result80
        double line120 = (double) line78 - line85 * line80;
        double line121 = (double) line79 - line86 * line80;
        double line122 = (double) line80 - line87 * line80;
        double line123 = (double) line81 - line88 * line80;
        double line124 = (double) line82 - line89 * line80;
        double line125 = (double) line83 - line90 * line80;
        double line126 = (double) line84 - line91 * line80;

        String result120 = String.format("%.1f", line120);
        String result121 = String.format("%.1f", line121);
        String result122 = String.format("%.1f", line122);
        String result123 = String.format("%.1f", line123);
        String result124 = String.format("%.1f", line124);
        String result125 = String.format("%.1f", line125);
        String result126 = String.format("%.1f", line126);

        // Вывод расчета в матрицу
        String S37 = result92 + "   " + result93 + "    " + result94 + "   " + result95 + "    " + result96 + "    " + result97 + "    " + result98;
        textView86.setText(S37);
        String S38 = result99 + "   " + result100 + "    " + result101 + "   " + result102 + "    " + result103 + "    " + result104 + "    " + result105;
        textView87.setText(S38);
        String S39 = result85 + "   " + result86 + "    " + result87 + "   " + result88 + "    " + result89 + "    " + result90 + "    " + result91;
        textView88.setText(S39);
        String S40 = result106 + "   " + result107 + "    " + result108 + "   " + result109 + "    " + result110 + "    " + result111 + "    " + result112;
        textView89.setText(S40);
        String S41 = result113 + "   " + result114 + "    " + result115 + "   " + result116 + "    " + result117 + "    " + result118 + "    " + result119;
        textView90.setText(S41);
        String S42 = result120 + "   " + result121 + "    " + result122 + "   " + result123 + "    " + result124 + "    " + result125 + "    " + result126;
        textView91.setText(S42);

        String str6 = "4-ую строку делим на " + result109;
        textView92.setText(str6);

        // расчет деления 4 строки в матрице на result109
        double line127 = (double) line106 / line109;
        double line128 = (double) line107 / line109;
        double line129 = (double) line108 / line109;
        double line130 = (double) line109 / line109;
        double line131 = (double) line110 / line109;
        double line132 = (double) line111 / line109;
        double line133 = (double) line112 / line109;

        String result127 = String.format("%.1f", line127);
        String result128 = String.format("%.1f", line128);
        String result129 = String.format("%.1f", line129);
        String result130 = String.format("%.1f", line130);
        String result131 = String.format("%.1f", line131);
        String result132 = String.format("%.1f", line132);
        String result133 = String.format("%.1f", line133);

        // Вывод расчета в матрицу
        String S43 = result92 + "   " + result93 + "    " + result94 + "   " + result95 + "    " + result96 + "    " + result97 + "    " + result98;
        textView93.setText(S43);
        String S44 = result99 + "   " + result100 + "    " + result101 + "   " + result102 + "    " + result103 + "    " + result104 + "    " + result105;
        textView94.setText(S44);
        String S45 = result85 + "   " + result86 + "    " + result87 + "   " + result88 + "    " + result89 + "    " + result90 + "    " + result91;
        textView95.setText(S45);
        String S46 = result127 + "   " + result128 + "    " + result129 + "   " + result130 + "    " + result131 + "    " + result132 + "    " + result133;
        textView96.setText(S46);
        String S47 = result113 + "   " + result114 + "    " + result115 + "   " + result116 + "    " + result117 + "    " + result118 + "    " + result119;
        textView97.setText(S47);
        String S48 = result120 + "   " + result121 + "    " + result122 + "   " + result123 + "    " + result124 + "    " + result125 + "    " + result126;
        textView98.setText(S48);

        String str7 = "от 1 строки отнимаем 4 строку, умноженную на " + result95 + " от 2 строки отнимаем 4 строку, умноженную на " + result102 + " от 3 строки отнимаем 4 строку, умноженную на " + result88 + " от 5 строки отнимаем 4 строку, умноженную на " + result116 + " от 6 строки отнимаем 4 строку, умноженную на " + result123;
        textView99.setText(str7);

        // расчет от 1 строки отнимаем 4 строку, умноженную на result95
        double line134 = (double) line92 - line127 * line95;
        double line135 = (double) line93 - line128 * line95;
        double line136 = (double) line94 - line129 * line95;
        double line137 = (double) line95 - line130 * line95;
        double line138 = (double) line96 - line131 * line95;
        double line139 = (double) line97 - line132 * line95;
        double line140 = (double) line98 - line133 * line95;

        String result134 = String.format("%.1f", line134);
        String result135 = String.format("%.1f", line135);
        String result136 = String.format("%.1f", line136);
        String result137 = String.format("%.1f", line137);
        String result138 = String.format("%.1f", line138);
        String result139 = String.format("%.1f", line139);
        String result140 = String.format("%.1f", line140);

        // расчет от 2 строки отнимаем 4 строку, умноженную на result102
        double line141 = (double) line99 - line127 * line102;
        double line142 = (double) line100 - line128 * line102;
        double line143 = (double) line101 - line129 * line102;
        double line144 = (double) line102 - line130 * line102;
        double line145 = (double) line103 - line131 * line102;
        double line146 = (double) line104 - line132 * line102;
        double line147 = (double) line105 - line133 * line102;

        String result141 = String.format("%.1f", line141);
        String result142 = String.format("%.1f", line142);
        String result143 = String.format("%.1f", line143);
        String result144 = String.format("%.1f", line144);
        String result145 = String.format("%.1f", line145);
        String result146 = String.format("%.1f", line146);
        String result147 = String.format("%.1f", line147);

        // расчет к 3 строкe добавляем 4 строку, умноженную на result88
        double line148 = (double) line85 - line127 * line88;
        double line149 = (double) line86 - line128 * line88;
        double line150 = (double) line87 - line129 * line88;
        double line151 = (double) line88 - line130 * line88;
        double line152 = (double) line89 - line131 * line88;
        double line153 = (double) line90 - line132 * line88;
        double line154 = (double) line91 - line133 * line88;

        String result148 = String.format("%.1f", line148);
        String result149 = String.format("%.1f", line149);
        String result150 = String.format("%.1f", line150);
        String result151 = String.format("%.1f", line151);
        String result152 = String.format("%.1f", line152);
        String result153 = String.format("%.1f", line153);
        String result154 = String.format("%.1f", line154);

        // расчетот 5 строки отнимаем 4 строку, умноженную на result116
        double line155 = (double) line113 - line127 * line116;
        double line156 = (double) line114 - line128 * line116;
        double line157 = (double) line115 - line129 * line116;
        double line158 = (double) line116 - line130 * line116;
        double line159 = (double) line117 - line131 * line116;
        double line160 = (double) line118 - line132 * line116;
        double line161 = (double) line119 - line133 * line116;

        String result155 = String.format("%.1f", line155);
        String result156 = String.format("%.1f", line156);
        String result157 = String.format("%.1f", line157);
        String result158 = String.format("%.1f", line158);
        String result159 = String.format("%.1f", line159);
        String result160 = String.format("%.1f", line160);
        String result161 = String.format("%.1f", line161);

        // расчет к 6 строке добавляем 4 строку, умноженную на result123
        double line162 = (double) line120 - line127 * line123;
        double line163 = (double) line121 - line128 * line123;
        double line164 = (double) line122 - line129 * line123;
        double line165 = (double) line123 - line130 * line123;
        double line166 = (double) line124 - line131 * line123;
        double line167 = (double) line125 - line132 * line123;
        double line168 = (double) line126 - line133 * line123;

        String result162 = String.format("%.1f", line162);
        String result163 = String.format("%.1f", line163);
        String result164 = String.format("%.1f", line164);
        String result165 = String.format("%.1f", line165);
        String result166 = String.format("%.1f", line166);
        String result167 = String.format("%.1f", line167);
        String result168 = String.format("%.1f", line168);

        // Вывод расчета в матрицу
        String S49 = result134 + "   " + result135 + "    " + result136 + "   " + result137 + "    " + result138 + "    " + result139 + "    " + result140;
        textView100.setText(S49);
        String S50 = result141 + "   " + result142 + "    " + result143 + "   " + result144 + "    " + result145 + "    " + result146 + "    " + result147;
        textView101.setText(S50);
        String S51 = result148 + "   " + result149 + "    " + result150 + "   " + result151 + "    " + result152 + "    " + result153 + "    " + result154;
        textView102.setText(S51);
        String S52 = result127 + "   " + result128 + "    " + result129 + "   " + result130 + "    " + result131 + "    " + result132 + "    " + result133;
        textView103.setText(S52);
        String S53 = result155 + "   " + result156 + "    " + result157 + "   " + result158 + "    " + result159 + "    " + result160 + "    " + result161;
        textView104.setText(S53);
        String S54 = result162 + "   " + result163 + "    " + result164 + "   " + result165 + "    " + result166 + "    " + result167 + "    " + result168;
        textView105.setText(S54);


        String str8 = "поменяем 5-ую строку и 6-ую строку местами ";
        textView106.setText(str8);
        // Вывод расчета в матрицу
        String S55 = result134 + "   " + result135 + "    " + result136 + "   " + result137 + "    " + result138 + "    " + result139 + "    " + result140;
        textView107.setText(S55);
        String S56 = result141 + "   " + result142 + "    " + result143 + "   " + result144 + "    " + result145 + "    " + result146 + "    " + result147;
        textView108.setText(S56);
        String S57 = result148 + "   " + result149 + "    " + result150 + "   " + result151 + "    " + result152 + "    " + result153 + "    " + result154;
        textView109.setText(S57);
        String S58 = result127 + "   " + result128 + "    " + result129 + "   " + result130 + "    " + result131 + "    " + result132 + "    " + result133;
        textView110.setText(S58);
        String S59 = result162 + "   " + result163 + "    " + result164 + "   " + result165 + "    " + result166 + "    " + result167 + "    " + result168;
        textView111.setText(S59);
        String S60 = result155 + "   " + result156 + "    " + result157 + "   " + result158 + "    " + result159 + "    " + result160 + "    " + result161;
        textView112.setText(S60);


        String str9 = "5-ую строку делим на " + result166;
        textView113.setText(str9);

        // расчет деления 5 строки в матрице на result166
        double line169 = (double) line162 / line166;
        double line170 = (double) line163 / line166;
        double line171 = (double) line164 / line166;
        double line172 = (double) line165 / line166;
        double line173 = (double) line166 / line166;
        double line174 = (double) line167 / line166;
        double line175 = (double) line168 / line166;

        String result169 = String.format("%.1f", line169);
        String result170 = String.format("%.1f", line170);
        String result171 = String.format("%.1f", line171);
        String result172 = String.format("%.1f", line172);
        String result173 = String.format("%.1f", line173);
        String result174 = String.format("%.1f", line174);
        String result175 = String.format("%.1f", line175);

        // Вывод расчета в матрицу
        String S61 = result134 + "   " + result135 + "    " + result136 + "   " + result137 + "    " + result138 + "    " + result139 + "    " + result140;
        textView114.setText(S61);
        String S62 = result141 + "   " + result142 + "    " + result143 + "   " + result144 + "    " + result145 + "    " + result146 + "    " + result147;
        textView115.setText(S62);
        String S63 = result148 + "   " + result149 + "    " + result150 + "   " + result151 + "    " + result152 + "    " + result153 + "    " + result154;
        textView116.setText(S63);
        String S64 = result127 + "   " + result128 + "    " + result129 + "   " + result130 + "    " + result131 + "    " + result132 + "    " + result133;
        textView117.setText(S64);
        String S65 = result169 + "   " + result170 + "    " + result171 + "   " + result172 + "    " + result173 + "    " + result174 + "    " + result175;
        textView118.setText(S65);
        String S66 = result155 + "   " + result156 + "    " + result157 + "   " + result158 + "    " + result159 + "    " + result160 + "    " + result161;
        textView119.setText(S66);

        String str10 = "к 1 строке добавляем 5 строку, умноженную на " + result138 + " от 2 строки отнимаем 5 строку, умноженную на " + result145 + "к 3 строке добавляем 5 строку, умноженную на " + result152 + " от 4 строки отнимаем 5 строку, умноженную на " + result131 + " от 6 строки отнимаем 5 строку, умноженную на " + result131;
        textView120.setText(str10);


        double line176 = (double) line134 - line169 * line138;
        double line177 = (double) line135 - line170 * line138;
        double line178 = (double) line136 - line171 * line138;
        double line179 = (double) line137 - line172 * line138;
        double line180 = (double) line138 - line173 * line138;
        double line181 = (double) line139 - line174 * line138;
        double line182 = (double) line140 - line175 * line138;

        String result176 = String.format("%.1f", line176);
        String result177 = String.format("%.1f", line177);
        String result178 = String.format("%.1f", line178);
        String result179 = String.format("%.1f", line179);
        String result180 = String.format("%.1f", line180);
        String result181 = String.format("%.1f", line181);
        String result182 = String.format("%.1f", line182);


        double line183 = (double) line141 - line169 * line145;
        double line184 = (double) line142 - line170 * line145;
        double line185 = (double) line143 - line171 * line145;
        double line186 = (double) line144 - line172 * line145;
        double line187 = (double) line145 - line173 * line145;
        double line188 = (double) line146 - line174 * line145;
        double line189 = (double) line147 - line175 * line145;

        String result183 = String.format("%.1f", line183);
        String result184 = String.format("%.1f", line184);
        String result185 = String.format("%.1f", line185);
        String result186 = String.format("%.1f", line186);
        String result187 = String.format("%.1f", line187);
        String result188 = String.format("%.1f", line188);
        String result189 = String.format("%.1f", line189);


        double line190 = (double) line148 - line169 * line152;
        double line191 = (double) line149 - line170 * line152;
        double line192 = (double) line150 - line171 * line152;
        double line193 = (double) line151 - line172 * line152;
        double line194 = (double) line152 - line173 * line152;
        double line195 = (double) line153 - line174 * line152;
        double line196 = (double) line154 - line175 * line152;

        String result190 = String.format("%.1f", line190);
        String result191 = String.format("%.1f", line191);
        String result192 = String.format("%.1f", line192);
        String result193 = String.format("%.1f", line193);
        String result194 = String.format("%.1f", line194);
        String result195 = String.format("%.1f", line195);
        String result196 = String.format("%.1f", line196);


        double line197 = (double) line127 - line169 * line131;
        double line198 = (double) line128 - line170 * line131;
        double line199 = (double) line129 - line171 * line131;
        double line200 = (double) line130 - line172 * line131;
        double line201 = (double) line131 - line173 * line131;
        double line202 = (double) line132 - line174 * line131;
        double line203 = (double) line133 - line175 * line131;

        String result197 = String.format("%.1f", line197);
        String result198 = String.format("%.1f", line198);
        String result199 = String.format("%.1f", line199);
        String result200 = String.format("%.1f", line200);
        String result201 = String.format("%.1f", line201);
        String result202 = String.format("%.1f", line202);
        String result203 = String.format("%.1f", line203);

        double line204 = (double) line162 - line169 * line166;
        double line205 = (double) line163 - line170 * line166;
        double line206 = (double) line164 - line171 * line166;
        double line207 = (double) line165 - line172 * line166;
        double line208 = (double) line166 - line173 * line166;
        double line209 = (double) line167 - line174 * line166;
        double line210 = (double) line168 - line175 * line166;

        String result204 = String.format("%.1f", line204);
        String result205 = String.format("%.1f", line205);
        String result206 = String.format("%.1f", line206);
        String result207 = String.format("%.1f", line207);
        String result208 = String.format("%.1f", line208);
        String result209 = String.format("%.1f", line209);
        String result210 = String.format("%.1f", line210);

        // Вывод расчета в матрицу
        String S67 = result176 + "   " + result177 + "    " + result178 + "   " + result179 + "    " + result180 + "    " + result181 + "    " + result182;
        textView121.setText(S67);
        String S68 = result183 + "   " + result184 + "    " + result185 + "   " + result186 + "    " + result187 + "    " + result188 + "    " + result189;
        textView122.setText(S68);
        String S69 = result190 + "   " + result191 + "    " + result192 + "   " + result193 + "    " + result194 + "    " + result195 + "    " + result196;
        textView123.setText(S69);
        String S70 = result197 + "   " + result198 + "    " + result199 + "   " + result200 + "    " + result201 + "    " + result202 + "    " + result203;
        textView124.setText(S70);
        String S71 = result169 + "   " + result170 + "    " + result171 + "   " + result172 + "    " + result173 + "    " + result174 + "    " + result175;
        textView125.setText(S71);
        String S72 = result29 + "   " + result30 + "    " + result31 + "   " + result32 + "    " + result33 + "    " + result34 + "    " + result35;
        textView126.setText(S72);

        String str11 = "6-ую строку делим на " + result34;
        textView127.setText(str11);

        // расчет деления 6 строки в матрице на result34
        double line212 = (double) line29 / line34;
        double line213 = (double) line30 / line34;
        double line214 = (double) line31 / line34;
        double line215 = (double) line32 / line34;
        double line216 = (double) line33 / line34;
        double line217 = (double) line34 / line34;
        double line218 = (double) line35 / line34;

        String result212 = String.format("%.1f", line212);
        String result213 = String.format("%.1f", line213);
        String result214 = String.format("%.1f", line214);
        String result215 = String.format("%.1f", line215);
        String result216 = String.format("%.1f", line216);
        String result217 = String.format("%.1f", line217);
        String result218 = String.format("%.1f", line218);

        // Вывод расчета в матрицу
        String S73 = result176 + "   " + result177 + "    " + result178 + "   " + result179 + "    " + result180 + "    " + result181 + "    " + result182;
        textView128.setText(S73);
        String S74 = result183 + "   " + result184 + "    " + result185 + "   " + result186 + "    " + result187 + "    " + result188 + "    " + result189;
        textView129.setText(S74);
        String S75 = result190 + "   " + result191 + "    " + result192 + "   " + result193 + "    " + result194 + "    " + result195 + "    " + result196;
        textView130.setText(S75);
        String S76 = result197 + "   " + result198 + "    " + result199 + "   " + result200 + "    " + result201 + "    " + result202 + "    " + result203;
        textView131.setText(S76);
        String S77 = result169 + "   " + result170 + "    " + result171 + "   " + result172 + "    " + result173 + "    " + result174 + "    " + result175;
        textView132.setText(S77);
        String S78 = result212 + "   " + result213 + "    " + result214 + "   " + result215 + "    " + result216 + "    " + result217 + "    " + result218;
        textView133.setText(S78);

        String str12 = "от 1 строки отнимаем 6 строку, умноженную на " + result181 + " к 2 строки добавляем 6 строку, умноженную на " + result188 + " от 3 строки отнимаем 6 строку, умноженную на " + result195 + " к 4 строке добавляем 6 строку, умноженную на " + result202 + " от 5 строки отнимаем 6 строку, умноженную на " + result174;
        textView134.setText(str12);


        double line219 = (double) line176 - line212 * line181;
        double line220 = (double) line177 - line213 * line181;
        double line221 = (double) line178 - line214 * line181;
        double line222 = (double) line179 - line215 * line181;
        double line223 = (double) line180 - line216 * line181;
        double line224 = (double) line181 - line217 * line181;
        double line225 = (double) line182 - line218 * line181;

        String result219 = String.format("%.1f", line219);
        String result220 = String.format("%.1f", line220);
        String result221 = String.format("%.1f", line221);
        String result222 = String.format("%.1f", line222);
        String result223 = String.format("%.1f", line223);
        String result224 = String.format("%.1f", line224);
        String result225 = String.format("%.1f", line225);


        double line226 = (double) line183 - line212 * line188;
        double line227 = (double) line184 - line213 * line188;
        double line228 = (double) line185 - line214 * line188;
        double line229 = (double) line186 - line215 * line188;
        double line230 = (double) line187 - line216 * line188;
        double line231 = (double) line188 - line217 * line188;
        double line232 = (double) line189 - line218 * line188;

        String result226 = String.format("%.1f", line226);
        String result227 = String.format("%.1f", line227);
        String result228 = String.format("%.1f", line228);
        String result229 = String.format("%.1f", line229);
        String result230 = String.format("%.1f", line230);
        String result231 = String.format("%.1f", line231);
        String result232 = String.format("%.1f", line232);

        double line233 = (double) line190 - line212 * line195;
        double line234 = (double) line191 - line213 * line195;
        double line235 = (double) line192 - line214 * line195;
        double line236 = (double) line193 - line215 * line195;
        double line237 = (double) line194 - line216 * line195;
        double line238 = (double) line195 - line217 * line195;
        double line239 = (double) line196 - line218 * line195;

        String result233 = String.format("%.1f", line233);
        String result234 = String.format("%.1f", line234);
        String result235 = String.format("%.1f", line235);
        String result236 = String.format("%.1f", line236);
        String result237 = String.format("%.1f", line237);
        String result238 = String.format("%.1f", line238);
        String result239 = String.format("%.1f", line239);

        double line240 = (double) line197 - line212 * line202;
        double line241 = (double) line198 - line213 * line202;
        double line242 = (double) line199 - line214 * line202;
        double line243 = (double) line200 - line215 * line202;
        double line244 = (double) line201 - line216 * line202;
        double line245 = (double) line202 - line217 * line202;
        double line246 = (double) line203 - line218 * line202;

        String result240 = String.format("%.1f", line240);
        String result241 = String.format("%.1f", line241);
        String result242 = String.format("%.1f", line242);
        String result243 = String.format("%.1f", line243);
        String result244 = String.format("%.1f", line244);
        String result245 = String.format("%.1f", line245);
        String result246 = String.format("%.1f", line246);


        double line247 = (double) line169 - line212 * line174;
        double line248 = (double) line170 - line213 * line174;
        double line249 = (double) line171 - line214 * line174;
        double line250 = (double) line172 - line215 * line174;
        double line251 = (double) line173 - line216 * line174;
        double line252 = (double) line174 - line217 * line174;
        double line253 = (double) line175 - line218 * line174;

        String result247 = String.format("%.1f", line247);
        String result248 = String.format("%.1f", line248);
        String result249 = String.format("%.1f", line249);
        String result250 = String.format("%.1f", line250);
        String result251 = String.format("%.1f", line251);
        String result252 = String.format("%.1f", line252);
        String result253 = String.format("%.1f", line253);

        // Вывод расчета в матрицу
        String S79 = result219 + "   " + result220 + "    " + result221 + "   " + result222 + "    " + result223 + "    " + result224 + "    " + result225;
        textView135.setText(S79);
        String S80 = result226 + "   " + result227 + "    " + result228 + "   " + result229 + "    " + result230 + "    " + result231 + "    " + result232;
        textView136.setText(S80);
        String S81 = result233 + "   " + result234 + "    " + result235 + "   " + result236 + "    " + result237 + "    " + result238 + "    " + result239;
        textView137.setText(S81);
        String S82 = result240 + "   " + result241 + "    " + result242 + "   " + result243 + "    " + result244 + "    " + result245 + "    " + result246;
        textView138.setText(S82);
        String S83 = result247 + "   " + result248 + "    " + result249 + "   " + result250 + "    " + result251 + "    " + result252 + "    " + result253;
        textView139.setText(S83);
        String S84 = result212 + "   " + result213 + "    " + result214 + "   " + result215 + "    " + result216 + "    " + result217 + "    " + result218;
        textView140.setText(S84);


        String str13 = " Ответ: ";
        textView141.setText(str13);
        String str14 = " X1 = " + result225;
        textView142.setText(str14);
        String str15 = " X2 = " + result232;
        textView143.setText(str15);
        String str16 = " X3 = " + result239;
        textView144.setText(str16);
        String str17 = " X4 = " + result246;
        textView145.setText(str17);
        String str18 = " X5 = " + result253;
        textView146.setText(str18);
        String str19 = " X6 = " + result218;
        textView147.setText(str19);


        // Делаем проверку если пользователь заполнил матрицу нулями
        if (a11 == 0 && a12 == 0 && a13 == 0 && a14 == 0 && a15 == 0 && a16 == 0 && b1 == 0 && a21 == 0 && a22 == 0 && a23 == 0 && a24 == 0 && a25 == 0 && a26 == 0 && b2 == 0 && a31 == 0 || a32 == 0 || a33 == 0 || a34 == 0 || a35 == 0 || a36 == 0 || b3 == 0 || a41 == 0 || a42 == 0 || a43 == 0 || a44 == 0 || a45 == 0 || a46 == 0 || b4 == 0 || a51 == 0 || a52 == 0 || a53 == 0 || a54 == 0 || a55 == 0 || a56 == 0 || b5 == 0 || a61 == 0 || a62 == 0 || a63 == 0 || a64 == 0 || a65 == 0 || a66 == 0 || b6 == 0) {
            textView43.setText("Перепишем систему уравнений в матричном виде");

            // Вывод общей матрицы
            String S85 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
            textView44.setText(S85);
            String S86 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + a26 + "  " + b2;
            textView45.setText(S86);
            String S87 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + a36 + "  " + b3;
            textView46.setText(S87);
            String S88 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + a46 + "  " + b4;
            textView47.setText(S88);
            String S89 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + a56 + "  " + b5;
            textView48.setText(S89);
            String S90 = a61 + "   " + a62 + "    " + a63 + "  " + a64 + "  " + a65 + "  " + a66 + "  " + b6;
            textView49.setText(S90);

            String str20 = " Ответ: ";
            textView50.setText(str20);
            String str21 = " Система имеет множество решений: ";
            textView51.setText(str21);
            textView52.setText(a16 + " " + b1 + a26 + " " + b2 + a36 + " " + b3 + a46 + " " + b4 + a56 + " " + b5 + a66 + " " + b6);

            // Скрываем не нужный вывод результата
            textView53.setVisibility(View.INVISIBLE);
            textView54.setVisibility(View.INVISIBLE);
            textView55.setVisibility(View.INVISIBLE);
            textView56.setVisibility(View.INVISIBLE);
            textView57.setVisibility(View.INVISIBLE);
            textView58.setVisibility(View.INVISIBLE);
            textView59.setVisibility(View.INVISIBLE);
            textView60.setVisibility(View.INVISIBLE);
            textView61.setVisibility(View.INVISIBLE);
            textView62.setVisibility(View.INVISIBLE);
            textView63.setVisibility(View.INVISIBLE);
            textView64.setVisibility(View.INVISIBLE);
            textView65.setVisibility(View.INVISIBLE);
            textView66.setVisibility(View.INVISIBLE);
            textView67.setVisibility(View.INVISIBLE);
            textView68.setVisibility(View.INVISIBLE);
            textView69.setVisibility(View.INVISIBLE);
            textView70.setVisibility(View.INVISIBLE);
            textView71.setVisibility(View.INVISIBLE);
            textView72.setVisibility(View.INVISIBLE);
            textView73.setVisibility(View.INVISIBLE);
            textView74.setVisibility(View.INVISIBLE);
            textView75.setVisibility(View.INVISIBLE);
            textView76.setVisibility(View.INVISIBLE);
            textView77.setVisibility(View.INVISIBLE);
            textView78.setVisibility(View.INVISIBLE);
            textView79.setVisibility(View.INVISIBLE);
            textView80.setVisibility(View.INVISIBLE);
            textView81.setVisibility(View.INVISIBLE);
            textView81.setVisibility(View.INVISIBLE);
            textView82.setVisibility(View.INVISIBLE);
            textView83.setVisibility(View.INVISIBLE);
            textView84.setVisibility(View.INVISIBLE);
            textView85.setVisibility(View.INVISIBLE);
            textView86.setVisibility(View.INVISIBLE);
            textView87.setVisibility(View.INVISIBLE);
            textView88.setVisibility(View.INVISIBLE);
            textView89.setVisibility(View.INVISIBLE);
            textView90.setVisibility(View.INVISIBLE);
            textView91.setVisibility(View.INVISIBLE);
            textView92.setVisibility(View.INVISIBLE);
            textView93.setVisibility(View.INVISIBLE);
            textView94.setVisibility(View.INVISIBLE);
            textView95.setVisibility(View.INVISIBLE);
            textView96.setVisibility(View.INVISIBLE);
            textView97.setVisibility(View.INVISIBLE);
            textView98.setVisibility(View.INVISIBLE);
            textView99.setVisibility(View.INVISIBLE);
            textView100.setVisibility(View.INVISIBLE);
            textView101.setVisibility(View.INVISIBLE);
            textView102.setVisibility(View.INVISIBLE);
            textView103.setVisibility(View.INVISIBLE);
            textView104.setVisibility(View.INVISIBLE);
            textView105.setVisibility(View.INVISIBLE);
            textView106.setVisibility(View.INVISIBLE);
            textView107.setVisibility(View.INVISIBLE);
            textView108.setVisibility(View.INVISIBLE);
            textView109.setVisibility(View.INVISIBLE);
            textView110.setVisibility(View.INVISIBLE);
            textView111.setVisibility(View.INVISIBLE);
            textView112.setVisibility(View.INVISIBLE);
            textView113.setVisibility(View.INVISIBLE);
            textView114.setVisibility(View.INVISIBLE);
            textView115.setVisibility(View.INVISIBLE);
            textView116.setVisibility(View.INVISIBLE);
            textView117.setVisibility(View.INVISIBLE);
            textView118.setVisibility(View.INVISIBLE);
            textView119.setVisibility(View.INVISIBLE);
            textView120.setVisibility(View.INVISIBLE);
            textView121.setVisibility(View.INVISIBLE);
            textView122.setVisibility(View.INVISIBLE);
            textView123.setVisibility(View.INVISIBLE);
            textView124.setVisibility(View.INVISIBLE);
            textView125.setVisibility(View.INVISIBLE);
            textView126.setVisibility(View.INVISIBLE);
            textView127.setVisibility(View.INVISIBLE);
            textView128.setVisibility(View.INVISIBLE);
            textView129.setVisibility(View.INVISIBLE);
            textView130.setVisibility(View.INVISIBLE);
            textView131.setVisibility(View.INVISIBLE);
            textView132.setVisibility(View.INVISIBLE);
            textView133.setVisibility(View.INVISIBLE);
            textView134.setVisibility(View.INVISIBLE);
            textView135.setVisibility(View.INVISIBLE);
            textView136.setVisibility(View.INVISIBLE);
            textView137.setVisibility(View.INVISIBLE);
            textView138.setVisibility(View.INVISIBLE);
            textView139.setVisibility(View.INVISIBLE);
            textView140.setVisibility(View.INVISIBLE);
            textView141.setVisibility(View.INVISIBLE);
            textView142.setVisibility(View.INVISIBLE);
            textView143.setVisibility(View.INVISIBLE);
            textView144.setVisibility(View.INVISIBLE);
            textView145.setVisibility(View.INVISIBLE);
            textView146.setVisibility(View.INVISIBLE);
            textView147.setVisibility(View.INVISIBLE);
        } else {  // Проверяем если пользователь заполнил 1 строку нулями
            if (a11 == 0 && a12 == 0 && a13 == 0 && a14 == 0 && a15 == 0 && a16 == 0 && b1 == 0) {
                String str22 = "поменяем 1-ую строку и 2-ую строку местами";
                textView50.setText(str22);
                // Вывод результата перемещения 1 и 2 строки в матрице
                String S90 = a21 + "   " + a22 + "    " + a23 + "  " + a24 + "  " + a25 + "  " + a26 + "  " + b2;
                textView51.setText(S90);
                String S91 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView52.setText(S91);
                String S92 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + a36 + "  " + b3;
                textView53.setText(S92);
                String S93 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + a46 + "  " + b4;
                textView54.setText(S93);
                String S94 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + a56 + "  " + b5;
                textView55.setText(S94);
                String S95 = a61 + "   " + a62 + "    " + a63 + "  " + a64 + "  " + a65 + "  " + a66 + "  " + b6;
                textView56.setText(S95);

                String str23 = "1-ую строку делим на " + a21;
                textView57.setText(str23);

                // расчет деления 1 строки в матрице на а21
                double line254 = (double) a21 / a21;
                double line255 = (double) a22 / a21;
                double line256 = (double) a23 / a21;
                double line257 = (double) a24 / a21;
                double line258 = (double) a25 / a21;
                double line259 = (double) a26 / a21;
                double line260 = (double) b2 / a21;

                String result254 = String.format("%.1f", line254);
                String result255 = String.format("%.1f", line255);
                String result256 = String.format("%.1f", line256);
                String result257 = String.format("%.1f", line257);
                String result258 = String.format("%.1f", line258);
                String result259 = String.format("%.1f", line259);
                String result260 = String.format("%.1f", line260);

                // вывод деления 1 строки в матрице на а11
                String S96 = result254 + "   " + result255 + "    " + result256 + "   " + result257 + "    " + result258 + "    " + result259 + "    " + result260;
                textView58.setText(S96);
                String S97 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView59.setText(S97);
                String S98 = a31 + "   " + a32 + "    " + a33 + "  " + a34 + "  " + a35 + "  " + a36 + "  " + b3;
                textView60.setText(S98);
                String S99 = a41 + "   " + a42 + "    " + a43 + "  " + a44 + "  " + a45 + "  " + a46 + "  " + b4;
                textView61.setText(S99);
                String S100 = a51 + "   " + a52 + "    " + a53 + "  " + a54 + "  " + a55 + "  " + a56 + "  " + b5;
                textView62.setText(S100);
                String S101 = a61 + "   " + a62 + "    " + a63 + "  " + a64 + "  " + a65 + "  " + a66 + "  " + b6;
                textView63.setText(S101);

                String str24 = "от 3 строки отнимаем 1 строку, умноженную на " + a31 + " от 4 строки отнимаем 1 строку, умноженную на " + a41 + " от 5 строки отнимаем 1 строку, умноженную на " + a51 + " от 6 строки отнимаем 1 строку, умноженную на " + a61;
                textView64.setText(str24);

                // расчет от 3 строки отнимаем 1 строку, умноженную на a31
                double line261 = (double) a31 - line254 * a31;
                double line262 = (double) a32 - line255 * a31;
                double line263 = (double) a33 - line256 * a31;
                double line264 = (double) a34 - line257 * a31;
                double line265 = (double) a35 - line258 * a31;
                double line266 = (double) a36 - line259 * a31;
                double line267 = (double) b3 - line260 * a31;

                String result261 = String.format("%.1f", line261);
                String result262 = String.format("%.1f", line262);
                String result263 = String.format("%.1f", line263);
                String result264 = String.format("%.1f", line264);
                String result265 = String.format("%.1f", line265);
                String result266 = String.format("%.1f", line266);
                String result267 = String.format("%.1f", line267);

                // расчет от 4 строки отнимаем 1 строку, умноженную на a41
                double line268 = (double) a41 - line254 * a41;
                double line269 = (double) a42 - line255 * a41;
                double line270 = (double) a43 - line256 * a41;
                double line271 = (double) a44 - line257 * a41;
                double line272 = (double) a45 - line258 * a41;
                double line273 = (double) a46 - line259 * a41;
                double line274 = (double) b4 - line260 * a41;

                String result268 = String.format("%.1f", line268);
                String result269 = String.format("%.1f", line269);
                String result270 = String.format("%.1f", line270);
                String result271 = String.format("%.1f", line271);
                String result272 = String.format("%.1f", line272);
                String result273 = String.format("%.1f", line273);
                String result274 = String.format("%.1f", line274);

                // расчет от 5 строки отнимаем 1 строку, умноженную на a51
                double line275 = (double) a51 - line254 * a51;
                double line276 = (double) a52 - line255 * a51;
                double line277 = (double) a53 - line256 * a51;
                double line278 = (double) a54 - line257 * a51;
                double line279 = (double) a55 - line258 * a51;
                double line280 = (double) a56 - line259 * a51;
                double line281 = (double) b5 - line260 * a51;

                String result275 = String.format("%.1f", line275);
                String result276 = String.format("%.1f", line276);
                String result277 = String.format("%.1f", line277);
                String result278 = String.format("%.1f", line278);
                String result279 = String.format("%.1f", line279);
                String result280 = String.format("%.1f", line280);
                String result281 = String.format("%.1f", line281);

                // расчет от 6 строки отнимаем 1 строку, умноженную на a61
                double line282 = (double) a61 - line254 * a61;
                double line283 = (double) a62 - line255 * a61;
                double line284 = (double) a63 - line256 * a61;
                double line285 = (double) a64 - line257 * a61;
                double line286 = (double) a65 - line258 * a61;
                double line287 = (double) a66 - line259 * a61;
                double line288 = (double) b6 - line260 * a61;

                String result282 = String.format("%.1f", line282);
                String result283 = String.format("%.1f", line283);
                String result284 = String.format("%.1f", line284);
                String result285 = String.format("%.1f", line285);
                String result286 = String.format("%.1f", line286);
                String result287 = String.format("%.1f", line287);
                String result288 = String.format("%.1f", line288);

                // Вывод расчета в матрицу
                String S102 = result254 + "   " + result255 + "    " + result256 + "   " + result257 + "    " + result258 + "    " + result259 + "    " + result260;
                textView65.setText(S102);
                String S103 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView66.setText(S103);
                String S104 = result261 + "   " + result262 + "    " + result263 + "  " + result264 + "  " + result265 + "  " + result266 + "  " + result267;
                textView67.setText(S104);
                String S105 = result268 + "   " + result269 + "    " + result270 + "  " + result271 + "  " + result272 + "  " + result273 + "  " + result274;
                textView68.setText(S105);
                String S106 = result275 + "   " + result276 + "    " + result277 + "  " + result278 + "  " + result279 + "  " + result280 + "  " + result281;
                textView69.setText(S106);
                String S107 = result282 + "   " + result283 + "    " + result284 + "  " + result285 + "  " + result286 + "  " + result287 + "  " + result288;
                textView70.setText(S107);

                String str25 = "поменяем 2-ую строку и 3-ую строку местами ";
                textView71.setText(str25);
                // Вывод результата перемещения 2 и 3 строки в матрице
                String S108 = result254 + "   " + result255 + "    " + result256 + "   " + result257 + "    " + result258 + "    " + result259 + "    " + result260;
                textView72.setText(S108);
                String S109 = result261 + "   " + result262 + "    " + result263 + "  " + result264 + "  " + result265 + "  " + result266 + "  " + result267;
                textView73.setText(S109);
                String S110 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView74.setText(S110);
                String S111 = result268 + "   " + result269 + "    " + result270 + "  " + result271 + "  " + result272 + "  " + result273 + "  " + result274;
                textView75.setText(S111);
                String S112 = result275 + "   " + result276 + "    " + result277 + "  " + result278 + "  " + result279 + "  " + result280 + "  " + result281;
                textView76.setText(S112);
                String S113 = result282 + "   " + result283 + "    " + result284 + "  " + result285 + "  " + result286 + "  " + result287 + "  " + result288;
                textView77.setText(S113);

                String str26 = "2-ую строку делим на " + result262;
                textView78.setText(str26);
                // расчет деления 2 строки
                double line289 = (double) line261 / line262;
                double line290 = (double) line262 / line262;
                double line291 = (double) line263 / line262;
                double line292 = (double) line264 / line262;
                double line293 = (double) line265 / line262;
                double line294 = (double) line266 / line262;
                double line295 = (double) line267 / line262;

                String result289 = String.format("%.1f", line289);
                String result290 = String.format("%.1f", line290);
                String result291 = String.format("%.1f", line291);
                String result292 = String.format("%.1f", line292);
                String result293 = String.format("%.1f", line293);
                String result294 = String.format("%.1f", line294);
                String result295 = String.format("%.1f", line295);

                // Вывод в матрицу деления 2 строки
                String S114 = result254 + "   " + result255 + "    " + result256 + "   " + result257 + "    " + result258 + "    " + result259 + "    " + result260;
                textView79.setText(S114);
                String S115 = result289 + "   " + result290 + "    " + result291 + "  " + result292 + "  " + result293 + "  " + result294 + "  " + result295;
                textView80.setText(S115);
                String S116 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView81.setText(S116);
                String S117 = result268 + "   " + result269 + "    " + result270 + "  " + result271 + "  " + result272 + "  " + result273 + "  " + result274;
                textView82.setText(S117);
                String S118 = result275 + "   " + result276 + "    " + result277 + "  " + result278 + "  " + result279 + "  " + result280 + "  " + result281;
                textView83.setText(S118);
                String S119 = result282 + "   " + result283 + "    " + result284 + "  " + result285 + "  " + result286 + "  " + result287 + "  " + result288;
                textView84.setText(S119);

                String str27 = "от 1 строки отнимаем 2 строку, умноженную на " + result255 + " к 4 строке добавляем 2 строку, умноженную на " + result269 + " от 5 строки отнимаем 2 строку, умноженную на " + result276 + " к 6 строке добавляем 2 строку, умноженную на " + result283;
                textView85.setText(str27);

                // расчет от 1 строки отнимаем 2 строку, умноженную на result255
                double line296 = (double) line254 - line289 * line255;
                double line297 = (double) line255 - line290 * line255;
                double line298 = (double) line256 - line291 * line255;
                double line299 = (double) line257 - line292 * line255;
                double line300 = (double) line258 - line293 * line255;
                double line301 = (double) line259 - line294 * line255;
                double line302 = (double) line260 - line295 * line255;

                String result296 = String.format("%.1f", line296);
                String result297 = String.format("%.1f", line297);
                String result298 = String.format("%.1f", line298);
                String result299 = String.format("%.1f", line299);
                String result300 = String.format("%.1f", line300);
                String result301 = String.format("%.1f", line301);
                String result302 = String.format("%.1f", line302);

                // расчет к 4 строке добавляем 2 строку, умноженную на result290
                double line303 = (double) line268 - line289 * line269;
                double line304 = (double) line269 - line290 * line269;
                double line305 = (double) line270 - line291 * line269;
                double line306 = (double) line271 - line292 * line269;
                double line307 = (double) line272 - line293 * line269;
                double line308 = (double) line273 - line294 * line269;
                double line309 = (double) line274 - line295 * line269;

                String result303 = String.format("%.1f", line303);
                String result304 = String.format("%.1f", line304);
                String result305 = String.format("%.1f", line305);
                String result306 = String.format("%.1f", line306);
                String result307 = String.format("%.1f", line307);
                String result308 = String.format("%.1f", line308);
                String result309 = String.format("%.1f", line309);

                // расчет от 5 строки отнимаем 2 строку, умноженную на result276
                double line310 = (double) line275 - line289 * line276;
                double line311 = (double) line276 - line290 * line276;
                double line312 = (double) line277 - line291 * line276;
                double line313 = (double) line278 - line292 * line276;
                double line314 = (double) line279 - line293 * line276;
                double line315 = (double) line280 - line294 * line276;
                double line316 = (double) line281 - line295 * line276;

                String result310 = String.format("%.1f", line310);
                String result311 = String.format("%.1f", line311);
                String result312 = String.format("%.1f", line312);
                String result313 = String.format("%.1f", line313);
                String result314 = String.format("%.1f", line314);
                String result315 = String.format("%.1f", line315);
                String result316 = String.format("%.1f", line316);

                // расчет к 6 строке добавляем 2 строку, умноженную на result283
                double line317 = (double) line282 - line289 * line283;
                double line318 = (double) line283 - line290 * line283;
                double line319 = (double) line284 - line291 * line283;
                double line320 = (double) line285 - line292 * line283;
                double line321 = (double) line286 - line293 * line283;
                double line322 = (double) line287 - line294 * line283;
                double line323 = (double) line288 - line295 * line283;

                String result317 = String.format("%.1f", line317);
                String result318 = String.format("%.1f", line318);
                String result319 = String.format("%.1f", line319);
                String result320 = String.format("%.1f", line320);
                String result321 = String.format("%.1f", line321);
                String result322 = String.format("%.1f", line322);
                String result323 = String.format("%.1f", line323);

                // Вывод расчета в матрицу
                String S120 = result296 + "   " + result297 + "    " + result298 + "   " + result299 + "    " + result300 + "    " + result301 + "    " + result302;
                textView86.setText(S120);
                String S121 = result289 + "   " + result290 + "    " + result291 + "  " + result292 + "  " + result293 + "  " + result294 + "  " + result295;
                textView87.setText(S121);
                String S122 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView88.setText(S122);
                String S123 = result303 + "   " + result304 + "    " + result305 + "  " + result306 + "  " + result307 + "  " + result308 + "  " + result309;
                textView89.setText(S123);
                String S124 = result310 + "   " + result311 + "    " + result312 + "  " + result313 + "  " + result314 + "  " + result315 + "  " + result316;
                textView90.setText(S124);
                String S125 = result317 + "   " + result318 + "    " + result319 + "  " + result320 + "  " + result321 + "  " + result322 + "  " + result323;
                textView91.setText(S125);

                String str28 = "поменяем 3-ую строку и 4-ую строку местами ";
                textView92.setText(str28);
                // Вывод результата перемещения 3 и 4 строки в матрице
                String S126 = result296 + "   " + result297 + "    " + result298 + "   " + result299 + "    " + result300 + "    " + result301 + "    " + result302;
                textView93.setText(S126);
                String S127 = result289 + "   " + result290 + "    " + result291 + "  " + result292 + "  " + result293 + "  " + result294 + "  " + result295;
                textView94.setText(S127);
                String S128 = result303 + "   " + result304 + "    " + result305 + "  " + result306 + "  " + result307 + "  " + result308 + "  " + result309;
                textView95.setText(S128);
                String S129 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView96.setText(S129);
                String S130 = result310 + "   " + result311 + "    " + result312 + "  " + result313 + "  " + result314 + "  " + result315 + "  " + result316;
                textView97.setText(S130);
                String S131 = result317 + "   " + result318 + "    " + result319 + "  " + result320 + "  " + result321 + "  " + result322 + "  " + result323;
                textView98.setText(S131);

                String str29 = "3-ую строку делим на " + result305;
                textView99.setText(str29);
                // расчет деления 3 строки в матрице на result189
                double line324 = (double) line303 / line305;
                double line325 = (double) line304 / line305;
                double line326 = (double) line305 / line305;
                double line327 = (double) line306 / line305;
                double line328 = (double) line307 / line305;
                double line329 = (double) line308 / line305;
                double line330 = (double) line309 / line305;

                String result324 = String.format("%.1f", line324);
                String result325 = String.format("%.1f", line325);
                String result326 = String.format("%.1f", line326);
                String result327 = String.format("%.1f", line327);
                String result328 = String.format("%.1f", line328);
                String result329 = String.format("%.1f", line329);
                String result330 = String.format("%.1f", line330);

                // Вывод в матрицу деления 3 строки
                String S132 = result296 + "   " + result297 + "    " + result298 + "   " + result299 + "    " + result300 + "    " + result301 + "    " + result302;
                textView100.setText(S132);
                String S133 = result289 + "   " + result290 + "    " + result291 + "  " + result292 + "  " + result293 + "  " + result294 + "  " + result295;
                textView101.setText(S133);
                String S134 = result324 + "   " + result325 + "    " + result326 + "  " + result327 + "  " + result328 + "  " + result329 + "  " + result330;
                textView102.setText(S134);
                String S135 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView103.setText(S135);
                String S136 = result310 + "   " + result311 + "    " + result312 + "  " + result313 + "  " + result314 + "  " + result315 + "  " + result316;
                textView104.setText(S136);
                String S137 = result317 + "   " + result318 + "    " + result319 + "  " + result320 + "  " + result321 + "  " + result322 + "  " + result323;
                textView105.setText(S137);


                String str30 = "к 1 строке добавляем 3 строку, умноженную на " + result298 + " от 2 строки отнимаем 3 строку, умноженную на " + result291 + " от 5 строки отнимаем 3 строку, умноженную на " + result312 + " от 6 строки отнимаем 3 строку, умноженную на " + result319;
                textView106.setText(str30);

                // расчет к 1 строке добавляем 3строку, умноженную на result298
                double line331 = (double) line296 - line324 * line298;
                double line332 = (double) line297 - line325 * line298;
                double line333 = (double) line298 - line326 * line298;
                double line334 = (double) line299 - line327 * line298;
                double line335 = (double) line300 - line328 * line298;
                double line336 = (double) line301 - line329 * line298;
                double line337 = (double) line302 - line330 * line298;

                String result331 = String.format("%.1f", line331);
                String result332 = String.format("%.1f", line332);
                String result333 = String.format("%.1f", line333);
                String result334 = String.format("%.1f", line334);
                String result335 = String.format("%.1f", line335);
                String result336 = String.format("%.1f", line336);
                String result337 = String.format("%.1f", line337);

                // расчет от 2 строки отнимаем 3 строку, умноженную на result291
                double line338 = (double) line289 - line324 * line291;
                double line339 = (double) line290 - line325 * line291;
                double line340 = (double) line291 - line326 * line291;
                double line341 = (double) line292 - line327 * line291;
                double line342 = (double) line293 - line328 * line291;
                double line343 = (double) line294 - line329 * line291;
                double line344 = (double) line295 - line330 * line291;

                String result338 = String.format("%.1f", line338);
                String result339 = String.format("%.1f", line339);
                String result340 = String.format("%.1f", line340);
                String result341 = String.format("%.1f", line341);
                String result342 = String.format("%.1f", line342);
                String result343 = String.format("%.1f", line343);
                String result344 = String.format("%.1f", line344);

                // расчет от 5 строки отнимаем 3 строку, умноженную на result312
                double line345 = (double) line310 - line324 * line312;
                double line346 = (double) line311 - line325 * line312;
                double line347 = (double) line312 - line326 * line312;
                double line348 = (double) line313 - line327 * line312;
                double line349 = (double) line314 - line328 * line312;
                double line350 = (double) line315 - line329 * line312;
                double line351 = (double) line316 - line330 * line312;

                String result345 = String.format("%.1f", line345);
                String result346 = String.format("%.1f", line346);
                String result347 = String.format("%.1f", line347);
                String result348 = String.format("%.1f", line348);
                String result349 = String.format("%.1f", line349);
                String result350 = String.format("%.1f", line350);
                String result351 = String.format("%.1f", line351);

                // расчет от 6 строки отнимаем 3 строку, умноженную на result319
                double line352 = (double) line317 - line324 * line319;
                double line353 = (double) line318 - line325 * line319;
                double line354 = (double) line319 - line326 * line319;
                double line355 = (double) line320 - line327 * line319;
                double line356 = (double) line321 - line328 * line319;
                double line357 = (double) line322 - line329 * line319;
                double line358 = (double) line323 - line330 * line319;

                String result352 = String.format("%.1f", line352);
                String result353 = String.format("%.1f", line353);
                String result354 = String.format("%.1f", line354);
                String result355 = String.format("%.1f", line355);
                String result356 = String.format("%.1f", line356);
                String result357 = String.format("%.1f", line357);
                String result358 = String.format("%.1f", line358);


                String S138 = result331 + "   " + result332 + "    " + result333 + "   " + result334 + "    " + result335 + "    " + result336 + "    " + result337;
                textView107.setText(S138);
                String S139 = result338 + "   " + result339 + "    " + result340 + "  " + result341 + "  " + result342 + "  " + result343 + "  " + result344;
                textView108.setText(S139);
                String S140 = result324 + "   " + result325 + "    " + result326 + "  " + result327 + "  " + result328 + "  " + result329 + "  " + result330;
                textView109.setText(S140);
                String S141 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView110.setText(S141);
                String S142 = result345 + "   " + result346 + "    " + result347 + "  " + result348 + "  " + result349 + "  " + result350 + "  " + result351;
                textView111.setText(S142);
                String S143 = result352 + "   " + result353 + "    " + result354 + "  " + result355 + "  " + result356 + "  " + result357 + "  " + result358;
                textView112.setText(S143);

                String str31 = "поменяем 4-ую строку и 5-ую строку местами ";
                textView113.setText(str31);
                // Вывод результата перемещения 4 и 5 строки в матрице
                String S144 = result331 + "   " + result332 + "    " + result333 + "   " + result334 + "    " + result335 + "    " + result336 + "    " + result337;
                textView114.setText(S144);
                String S145 = result338 + "   " + result339 + "    " + result340 + "  " + result341 + "  " + result342 + "  " + result343 + "  " + result344;
                textView115.setText(S145);
                String S146 = result324 + "   " + result325 + "    " + result326 + "  " + result327 + "  " + result328 + "  " + result329 + "  " + result330;
                textView116.setText(S146);
                String S147 = result345 + "   " + result346 + "    " + result347 + "  " + result348 + "  " + result349 + "  " + result350 + "  " + result351;
                textView117.setText(S147);
                String S148 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView118.setText(S148);
                String S149 = result352 + "   " + result353 + "    " + result354 + "  " + result355 + "  " + result356 + "  " + result357 + "  " + result358;
                textView119.setText(S149);

                String str32 = "4-ую строку делим на " + result348;
                textView120.setText(str32);
                // расчет деления 4 строки
                double line359 = (double) line345 / line348;
                double line360 = (double) line346 / line348;
                double line361 = (double) line347 / line348;
                double line362 = (double) line348 / line348;
                double line363 = (double) line349 / line348;
                double line364 = (double) line350 / line348;
                double line365 = (double) line351 / line348;

                String result359 = String.format("%.1f", line359);
                String result360 = String.format("%.1f", line360);
                String result361 = String.format("%.1f", line361);
                String result362 = String.format("%.1f", line362);
                String result363 = String.format("%.1f", line363);
                String result364 = String.format("%.1f", line364);
                String result365 = String.format("%.1f", line365);

                // Вывод в матрицу деления 4 строки
                String S150 = result331 + "   " + result332 + "    " + result333 + "   " + result334 + "    " + result335 + "    " + result336 + "    " + result337;
                textView121.setText(S150);
                String S151 = result338 + "   " + result339 + "    " + result340 + "  " + result341 + "  " + result342 + "  " + result343 + "  " + result344;
                textView122.setText(S151);
                String S152 = result324 + "   " + result325 + "    " + result326 + "  " + result327 + "  " + result328 + "  " + result329 + "  " + result330;
                textView123.setText(S152);
                String S153 = result359 + "   " + result360 + "    " + result361 + "  " + result362 + "  " + result363 + "  " + result364 + "  " + result365;
                textView124.setText(S153);
                String S154 = a11 + "   " + a12 + "    " + a13 + "  " + a14 + "  " + a15 + "  " + a16 + "  " + b1;
                textView125.setText(S154);
                String S155 = result352 + "   " + result353 + "    " + result354 + "  " + result355 + "  " + result356 + "  " + result357 + "  " + result358;
                textView126.setText(S155);

                String str33 = "к 1 строке добавляем 4 строку, умноженную на " + result334 + " от 2 строки отнимаем 4 строку, умноженную на " + result341 + " к 3 строке добавляем 4, умноженную на " + result327 + " от 6 строки отнимаем 4 строку, умноженную на " + result355;
                textView127.setText(str33);
/*
                // расчет к 1 строке добавляем 3строку, умноженную на result298
                double line331 = (double) line296 - line324 * line298;
                double line332 = (double) line297 - line325 * line298;
                double line333 = (double) line298 - line326 * line298;
                double line334 = (double) line299 - line327 * line298;
                double line335 = (double) line300 - line328 * line298;
                double line336 = (double) line301 - line329 * line298;
                double line337 = (double) line302 - line330 * line298;

                String result331 = String.format("%.1f",line331);
                String result332 = String.format("%.1f",line332);
                String result333 = String.format("%.1f",line333);
                String result334 = String.format("%.1f",line334);
                String result335 = String.format("%.1f",line335);
                String result336 = String.format("%.1f",line336);
                String result337 = String.format("%.1f",line337);

                // расчет от 2 строки отнимаем 3 строку, умноженную на result291
                double line338 = (double) line289 - line324 * line291;
                double line339 = (double) line290 - line325 * line291;
                double line340 = (double) line291 - line326 * line291;
                double line341 = (double) line292 - line327 * line291;
                double line342 = (double) line293 - line328 * line291;
                double line343 = (double) line294 - line329 * line291;
                double line344 = (double) line295 - line330 * line291;

                String result338 = String.format("%.1f",line338);
                String result339 = String.format("%.1f",line339);
                String result340 = String.format("%.1f",line340);
                String result341 = String.format("%.1f",line341);
                String result342 = String.format("%.1f",line342);
                String result343 = String.format("%.1f",line343);
                String result344 = String.format("%.1f",line344);

                // расчет от 5 строки отнимаем 3 строку, умноженную на result312
                double line345 = (double) line310 - line324 * line312;
                double line346 = (double) line311 - line325 * line312;
                double line347 = (double) line312 - line326 * line312;
                double line348 = (double) line313 - line327 * line312;
                double line349 = (double) line314 - line328 * line312;
                double line350 = (double) line315 - line329 * line312;
                double line351 = (double) line316 - line330 * line312;

                String result345 = String.format("%.1f",line345);
                String result346 = String.format("%.1f",line346);
                String result347 = String.format("%.1f",line347);
                String result348 = String.format("%.1f",line348);
                String result349 = String.format("%.1f",line349);
                String result350 = String.format("%.1f",line350);
                String result351 = String.format("%.1f",line351);

                // расчет от 6 строки отнимаем 3 строку, умноженную на result319
                double line352 = (double) line317 - line324 * line319;
                double line353 = (double) line318 - line325 * line319;
                double line354 = (double) line319 - line326 * line319;
                double line355 = (double) line320 - line327 * line319;
                double line356 = (double) line321 - line328 * line319;
                double line357 = (double) line322 - line329 * line319;
                double line358 = (double) line323 - line330 * line319;

                String result352 = String.format("%.1f",line352);
                String result353 = String.format("%.1f",line353);
                String result354 = String.format("%.1f",line354);
                String result355 = String.format("%.1f",line355);
                String result356 = String.format("%.1f",line356);
                String result357 = String.format("%.1f",line357);
                String result358 = String.format("%.1f",line358);

                      */


            } else {  // Проверяем если пользователь заполнил 2 строку нулями
                if (a21 == 0 || a22 == 0 || a23 == 0 || a24 == 0 || a25 == 0 || a26 == 0 || b2 == 0) {

                } else {  // Проверяем если пользователь заполнил 3 строку нулями
                    if (a31 == 0 || a32 == 0 || a33 == 0 || a34 == 0 || a35 == 0 || a36 == 0 || b3 == 0) {

                    } else {  // Проверяем если пользователь заполнил 4 строку нулями
                        if (a41 == 0 || a42 == 0 || a43 == 0 || a44 == 0 || a45 == 0 || a46 == 0 || b4 == 0) {

                        } else {  // Проверяем если пользователь заполнил 5 строку нулями
                            if (a51 == 0 || a52 == 0 || a53 == 0 || a54 == 0 || a55 == 0 || a56 == 0 || b5 == 0) {


                            } else {  // Проверяем если пользователь заполнил 6 строку нулями
                                if (a61 == 0 || a62 == 0 || a63 == 0 || a64 == 0 || a65 == 0 || a66 == 0 || b6 == 0) {


                                }  // Проверяем если пользователь заполнил матрицу больше нулями
                                if (a11 > 0 || a12 > 0 || a13 > 0 || a14 > 0 || a15 > 0 || a16 > 0 || b1 > 0 || a21 > 0 || a22 > 0 || a23 > 0 || a24 > 0 || a25 > 0 || a26 > 0 || b2 > 0 || a31 > 0 || a32 > 0 || a33 > 0 || a34 == 0 || a35 > 0 || a36 > 0 || b3 > 0 || a41 > 0 || a42 > 0 || a43 > 0 || a44 > 0 || a45 > 0 || a46 > 0 || b4 > 0 || a51 > 0 || a52 > 0 || a53 > 0 || a54 > 0 || a55 > 0 || a56 > 0 || b5 > 0 || a61 > 0 || a62 > 0 || a63 > 0 || a64 > 0 || a65 > 0 || a66 > 0 || b6 > 0) {
                                    // Показываем нужный вывод результата
                                    textView53.setVisibility(View.VISIBLE);
                                    textView54.setVisibility(View.VISIBLE);
                                    textView55.setVisibility(View.VISIBLE);
                                    textView56.setVisibility(View.VISIBLE);
                                    textView57.setVisibility(View.VISIBLE);
                                    textView58.setVisibility(View.VISIBLE);
                                    textView59.setVisibility(View.VISIBLE);
                                    textView60.setVisibility(View.VISIBLE);
                                    textView61.setVisibility(View.VISIBLE);
                                    textView62.setVisibility(View.VISIBLE);
                                    textView63.setVisibility(View.VISIBLE);
                                    textView64.setVisibility(View.VISIBLE);
                                    textView65.setVisibility(View.VISIBLE);
                                    textView66.setVisibility(View.VISIBLE);
                                    textView67.setVisibility(View.VISIBLE);
                                    textView68.setVisibility(View.VISIBLE);
                                    textView69.setVisibility(View.VISIBLE);
                                    textView70.setVisibility(View.VISIBLE);
                                    textView71.setVisibility(View.VISIBLE);
                                    textView72.setVisibility(View.VISIBLE);
                                    textView73.setVisibility(View.VISIBLE);
                                    textView74.setVisibility(View.VISIBLE);
                                    textView75.setVisibility(View.VISIBLE);
                                    textView76.setVisibility(View.VISIBLE);
                                    textView77.setVisibility(View.VISIBLE);
                                    textView78.setVisibility(View.VISIBLE);
                                    textView79.setVisibility(View.VISIBLE);
                                    textView80.setVisibility(View.VISIBLE);
                                    textView81.setVisibility(View.VISIBLE);
                                    textView81.setVisibility(View.VISIBLE);
                                    textView82.setVisibility(View.VISIBLE);
                                    textView83.setVisibility(View.VISIBLE);
                                    textView84.setVisibility(View.VISIBLE);
                                    textView85.setVisibility(View.VISIBLE);
                                    textView86.setVisibility(View.VISIBLE);
                                    textView87.setVisibility(View.VISIBLE);
                                    textView88.setVisibility(View.VISIBLE);
                                    textView89.setVisibility(View.VISIBLE);
                                    textView90.setVisibility(View.VISIBLE);
                                    textView91.setVisibility(View.VISIBLE);
                                    textView92.setVisibility(View.VISIBLE);
                                    textView93.setVisibility(View.VISIBLE);
                                    textView94.setVisibility(View.VISIBLE);
                                    textView95.setVisibility(View.VISIBLE);
                                    textView96.setVisibility(View.VISIBLE);
                                    textView97.setVisibility(View.VISIBLE);
                                    textView98.setVisibility(View.VISIBLE);
                                    textView99.setVisibility(View.VISIBLE);
                                    textView100.setVisibility(View.VISIBLE);
                                    textView101.setVisibility(View.VISIBLE);
                                    textView102.setVisibility(View.VISIBLE);
                                    textView103.setVisibility(View.VISIBLE);
                                    textView104.setVisibility(View.VISIBLE);
                                    textView105.setVisibility(View.VISIBLE);
                                    textView106.setVisibility(View.VISIBLE);
                                    textView107.setVisibility(View.VISIBLE);
                                    textView108.setVisibility(View.VISIBLE);
                                    textView109.setVisibility(View.VISIBLE);
                                    textView110.setVisibility(View.VISIBLE);
                                    textView111.setVisibility(View.VISIBLE);
                                    textView112.setVisibility(View.VISIBLE);
                                    textView113.setVisibility(View.VISIBLE);
                                    textView114.setVisibility(View.VISIBLE);
                                    textView115.setVisibility(View.VISIBLE);
                                    textView116.setVisibility(View.VISIBLE);
                                    textView117.setVisibility(View.VISIBLE);
                                    textView118.setVisibility(View.VISIBLE);
                                    textView119.setVisibility(View.VISIBLE);
                                    textView120.setVisibility(View.VISIBLE);
                                    textView121.setVisibility(View.VISIBLE);
                                    textView122.setVisibility(View.VISIBLE);
                                    textView123.setVisibility(View.VISIBLE);
                                    textView124.setVisibility(View.VISIBLE);
                                    textView125.setVisibility(View.VISIBLE);
                                    textView126.setVisibility(View.VISIBLE);
                                    textView127.setVisibility(View.VISIBLE);
                                    textView128.setVisibility(View.VISIBLE);
                                    textView129.setVisibility(View.VISIBLE);
                                    textView130.setVisibility(View.VISIBLE);
                                    textView131.setVisibility(View.VISIBLE);
                                    textView132.setVisibility(View.VISIBLE);
                                    textView133.setVisibility(View.VISIBLE);
                                    textView134.setVisibility(View.VISIBLE);
                                    textView135.setVisibility(View.VISIBLE);
                                    textView136.setVisibility(View.VISIBLE);
                                    textView137.setVisibility(View.VISIBLE);
                                    textView138.setVisibility(View.VISIBLE);
                                    textView139.setVisibility(View.VISIBLE);
                                    textView140.setVisibility(View.VISIBLE);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
