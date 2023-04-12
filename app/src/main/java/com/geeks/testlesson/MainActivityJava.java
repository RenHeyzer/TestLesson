package com.geeks.testlesson;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityJava extends AppCompatActivity {

    // Объявляем кнопку и текстовое поле и указываем, что дадим им значение позже
    EditText editText;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Даем значение кнопке и текстовому полю, находя их по id из дизайна.
        editText = findViewById(R.id.edit_text);
        button = findViewById(R.id.button);

        // Вешаем слушатель на нажатие по кнопке.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем действия для перехода в гугл с введеным текстом.
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + editText.getText().toString().trim()));

                // Запускаем действие
                startActivity(intent);
            }
        });
    }
}
