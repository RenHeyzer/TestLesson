package com.geeks.testlesson

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class MainActivityKotlin : AppCompatActivity() {

    // Объявляем кнопку и текстовое поле и указываем, что дадим им значение позже
    lateinit var editText: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Даем значение кнопке и текстовому полю, находя их по id из дизайна.
        editText = findViewById(R.id.edit_text)
        button = findViewById(R.id.button)

        // Вешаем слушатель на нажатие по кнопке.
        button.setOnClickListener {
            // Создаем действия для перехода в гугл с введеным текстом.
            val intent = Intent(
                Intent.ACTION_VIEW,
                "https://www.google.com/search?q=${editText.text.toString().trim()}".toUri()
            )

            // Запускаем действие
            startActivity(intent)
        }
    }
}