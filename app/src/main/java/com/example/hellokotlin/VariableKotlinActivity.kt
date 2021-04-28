package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {


    var clickCount = 0
    val startTime = System.currentTimeMillis()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val txtElapsedTime = findViewById<TextView>(R.id.txtElapsedTime)


        btnClickMe.setOnClickListener {
            var elpasedSecons : Long = ((System.currentTimeMillis()-startTime)/1000.0).toLong()
            clickCount++
            txtCountBtnClicks.text =
                "Button clicks = ${clickCount}";//"Button clicks = " + clickCount;
            txtElapsedTime.text =
                "${elpasedSecons}  seconds elapsed"

        }
        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREAN).format(startTime)
        var elpasedSecons : Long = ((System.currentTimeMillis()))
        txtActivityStartTime.text = "Activity start time = ${timeText}"

    }
}