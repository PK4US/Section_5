package com.MyApp_5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp5.R;

public class BackActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        Button button = findViewById(R.id.button_nazad);
        button.setOnClickListener(this);

//        TextView textvipolnenogozakaza = findViewById(R.id.tv_spisok_zakaza);
//        String result = "Выбран вариант: " + ((RadioButton)findViewById(i)).getText();
//        textvipolnenogozakaza.setText(result);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}