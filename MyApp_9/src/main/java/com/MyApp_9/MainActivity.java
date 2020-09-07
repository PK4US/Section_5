package com.MyApp_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void CallToast(View view) {
        EditText et = findViewById(R.id.et_text);
        String str = et.getText().toString();
        Toast toast  = Toast.makeText(this, str,Toast.LENGTH_SHORT);
        toast.show();
    }
}
