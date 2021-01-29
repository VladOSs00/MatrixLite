package com.example.matrixlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] matrix = {"2 x 2", "3 x 3", "4 x 4", "5 x 5", "6 x 6"};
    private ImageView mBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   mBackground = (ImageView) findViewById(R.id.mBackground);
      //  ImageView imageView = new ImageView(this);
      //  mBackground.setImageResource(R.drawable.ic_launcher_background);

        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, matrix);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Получаем экземпляр элемента Spinner
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        // Вызываем адапетр
        spinner1.setAdapter(adapter);
        spinner1.setPrompt("Выберите размер матрицы:");
        spinner1.setSelection(0, true);
        // устанавливаем обработчик нажатия
        //  final String[] chosee = getResources().getStringArray(R.array.animals);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (matrix[position] == "2 x 2"){
                    Intent intent = new Intent(MainActivity.this, Gaus2Activity.class);
                    startActivity(intent);
                    //  setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
                else  if (matrix[position] == "3 x 3"){
                    Intent intent = new Intent(MainActivity.this, Gaus3Activity.class);
                    startActivity(intent);
                    // setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
                else if (matrix[position] == "4 x 4"){
                    Intent intent = new Intent(MainActivity.this, Gaus4Activity.class);
                    startActivity(intent);
                    //  setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

                } else if (matrix[position] == "5 x 5"){
                    Intent intent = new Intent(MainActivity.this, Gaus5Activity.class);
                    startActivity(intent);
                    // setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

                } else if (matrix[position] == "6 x 6"){
                    Intent intent = new Intent(MainActivity.this, Gaus6Activity.class);
                    startActivity(intent);
                    //   setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        // Вызываем адапетр
        spinner2.setAdapter(adapter);
        spinner2.setPrompt("Выберите размер матрицы:");
        spinner2.setSelection(0, true);
        // устанавливаем обработчик нажатия
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (matrix[position] == "2 x 2"){
                    Intent intent = new Intent(MainActivity.this, Kramer2Activity.class);
                    startActivity(intent);
                    // setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
                else  if (matrix[position] == "3 x 3"){
                    Intent intent = new Intent(MainActivity.this, Kramer3Activity.class);
                    startActivity(intent);
                    // setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
                else if (matrix[position] == "4 x 4"){
                    Intent intent = new Intent(MainActivity.this, Kramer4Activity.class);
                    startActivity(intent);
                    //  setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

                } else if (matrix[position] == "5 x 5"){
                    Intent intent = new Intent(MainActivity.this, Kramer5Activity.class);
                    startActivity(intent);
                    //  setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

                } else if (matrix[position] == "6 x 6"){
                    Intent intent = new Intent(MainActivity.this, Kramer6Activity.class);
                    startActivity(intent);
                    // setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}