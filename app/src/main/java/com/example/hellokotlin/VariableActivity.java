package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableActivity extends AppCompatActivity {
    TextView txtActivityStartTime, txtCountBtnClicks;
    TextView txtElapsedTime;
    Button btnClickeME;

    final long startTime = System.currentTimeMillis();
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartTime);
        txtCountBtnClicks = findViewById(R.id.txtCountBtnClicks);
        btnClickeME = findViewById(R.id.btnClickMe);
        txtElapsedTime = findViewById(R.id.txtElapsedTime);

        btnClickeME.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                long elapsedSeconds = ((System.currentTimeMillis()-startTime)/1000);
                clickCount++;
                txtCountBtnClicks.setText("Button Clicks : " + clickCount);
                txtElapsedTime.setText( elapsedSeconds +"seconds elapsed");

            }
        });
        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        txtActivityStartTime.setText("Avtivity start time = " + timeText);




    }
}