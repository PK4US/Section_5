package com.MyApp_5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.myapp5.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg1 = findViewById(R.id.rg1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.RB_hleb_beliy:{
                        System.out.println("Выбран белый хлеб");
                        break;
                    }
                    case R.id.RB_hleb_cherniy:{
                        System.out.println("Выбран черный хлеб");
                        break;
                    }
                }
                String result = "Выбран вариант: " + ((RadioButton)findViewById(i)).getText();
                System.out.println(result);
            }
        });

        RadioGroup rg2 = findViewById(R.id.rg2);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.RB_napitok_chay:{
                        System.out.println("Выбран чай");
                        break;
                    }
                    case R.id.RB_napitok_sok:{
                        System.out.println("Выбран сок");
                        break;
                    }
                    case R.id.RB_napitok_cola:{
                        System.out.println("Выбрана кола");
                        break;
                    }
                }
                String result = "Выбран вариант: " + ((RadioButton)findViewById(i)).getText();
                System.out.println(result);
            }
        });

        Button button = findViewById(R.id.button_otpravit_zakaz);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, BackActivity.class);

        startActivity(intent);
    }
}