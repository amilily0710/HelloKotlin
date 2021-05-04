package com.example.hellokotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FlowControlKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fieldNumber = findViewById<EditText>(R.id.fieldNumber)
        val btnLD = findViewById<Button>(R.id.btnLD)

        btnLD.setOnClickListener(View.OnClickListener {
            val number = fieldNumber.text.toString().toInt()

            if (number % 2 == 0) {
                Toast.makeText(applicationContext, "${number}은(는) 2의 배수", Toast.LENGTH_SHORT)
                    .show()
            } else if (number % 3 == 0) {
                Toast.makeText(applicationContext, "${number}은(는) 2의 배수", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(applicationContext, "${number}은(는) else", Toast.LENGTH_SHORT)
                    .show()
            }
            when (number) {
                4 -> btnLD.text = "실행 for 4"
                9 -> btnLD.text = "실행 for 9"
                else -> btnLD.text = "실행 for else"
            }
        })
    }
    }
