package com.Lesson_8;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar sb = findViewById(R.id.seekBar);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int progress = seekBar.getProgress();
                System.out.println(progress);
                TextView tv = findViewById(R.id.tv);
                tv.setText("Прогресс: " + progress);
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
    }
}
