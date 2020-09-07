package com.Lesson_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CallToast(View view) {
        Toast toast  = Toast.makeText(this, "Hello",Toast.LENGTH_SHORT);
        toast.show();
    }
}
