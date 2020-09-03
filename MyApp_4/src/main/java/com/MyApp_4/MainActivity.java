package com.MyApp_4;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp4.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    ArrayList<CheckBox> checkboxes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout = findViewById(R.id.layout);
        int count = layout.getChildCount();
        for (int i = 0; i < count; i++) {
            View v = layout.getChildAt(i);
            if (v instanceof CheckBox) {
                ((CheckBox) v).setOnCheckedChangeListener(this);
                checkboxes.add((CheckBox) v);
            }
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        TextView textvipolnenogozadaniya = findViewById(R.id.textView2);
        String result = "Вы сделали задание: «";
        for (CheckBox c : checkboxes) { if (c.isChecked()) result += c.getText() + "», «"; }
        if (result.equals("Вы сделали задание: «")) { result=""; textvipolnenogozadaniya.setText(result);
        } else result = result.substring(0, result.length() - 3);
        textvipolnenogozadaniya.setText(result);
    }
}
