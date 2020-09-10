package com.MyApp_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> beverages;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beverages = new ArrayList();
        adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,beverages);
        ListView lv = findViewById(R.id.LV);
        lv.setAdapter(adapter);
    }

    public void onClick(View view) {
        EditText et = findViewById(R.id.et);
        beverages.add(et.getText().toString());
        adapter.notifyDataSetChanged();
    }
}
