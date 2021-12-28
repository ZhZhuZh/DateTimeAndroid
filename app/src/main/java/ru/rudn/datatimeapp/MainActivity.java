package ru.rudn.datatimeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.myBtn);
        txt = findViewById(R.id.myTxt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocalDateTime dateTime = LocalDateTime.now();

                String formatDateTime = DateTimeFormatter
                        .ofPattern(getString(R.string.date_time_format)).format(dateTime);
                txt.setText(formatDateTime);
            }
        });
    }
}