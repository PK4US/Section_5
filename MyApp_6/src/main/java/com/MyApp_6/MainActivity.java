package com.MyApp_6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println("Вы выбрали: " + adapterView.getItemAtPosition(i).toString());
                TextView tv = (TextView) findViewById(R.id.textView);
                if (adapterView.getItemAtPosition(i).toString().equals("Красный"))
                    tv.setTextColor(Color.RED);
                else if (adapterView.getItemAtPosition(i).toString().equals("Желтый"))
                    tv.setTextColor(Color.YELLOW);
                else if (adapterView.getItemAtPosition(i).toString().equals("Синий"))
                    tv.setTextColor(Color.BLUE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                System.out.println("Ничего не выбрали");
            }
        });
    }
}
