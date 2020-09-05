package com.MyApp_8;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SeekBar sb = findViewById(R.id.seekBar);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int progress = seekBar.getProgress();
                System.out.println(progress);
                TextView tv = findViewById(R.id.tv);
                tv.setText("Ваш возраст: " + progress + " лет");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                System.out.println("Нажат");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                System.out.println("Отпущен");
            }
        });

        Button button = findViewById(R.id.button);
        final EditText et_number = findViewById(R.id.et_number);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(et_number.getText().toString());

                sb.setProgress(num);
            }
        });
    }
}
