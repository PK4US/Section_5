package com.MyApp_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapp3.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button butt = findViewById(R.id.button1);
        TextView textView = findViewById(R.id.textView);
        if (butt.getText()=="Стоп") {
            butt.setText("Старт");
            butt.setTextColor(Color.RED);

            textView.setText("Запись остановлна");
        } else{
            butt.setText("Стоп");
            butt.setTextColor(Color.GREEN);

            textView.setText("Запись началась");
        }
    }
}
