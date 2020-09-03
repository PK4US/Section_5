package com.MyApp_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapp2.R;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText slovo = findViewById(R.id.etper);
        String strSlovo = slovo.getText().toString();
        String reverse = new StringBuffer(strSlovo).reverse().toString();
        TextView textViwerPerevernut = findViewById(R.id.tv);
        textViwerPerevernut.setText(reverse);
    }
}
