package com.MyApp_7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private TextView tv_birthday;
    private Calendar calendar = Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_birthday = findViewById(R.id.tv);
        Button buttonDate = findViewById(R.id.button);


        buttonDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        calendar.set(Calendar.YEAR,year);
                        calendar.set(Calendar.MONTH,month);
                        calendar.set(Calendar.DAY_OF_MONTH,day);
                        SetTextView();
                        System.out.println(calendar.get(Calendar.YEAR));
                    }
                };
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, dateSetListener, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
                datePickerDialog.show();
            }
        });
    }


    private void SetTextView()  {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Date d  = new Date(calendar.getTimeInMillis());
        tv_birthday.setText(sdf.format(d));

        Date d1=calendar.getTime();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        Date d2=calendar.getTime();

        long dt=d2.getTime()-d1.getTime(); //в миллисекундах
        long diffDays = dt / (24 * 60 * 60 * 1000); //в днях

        TextView vi_projili = findViewById(R.id.tv_vi_projili);
        vi_projili.setText("Вы прожили " + diffDays + " дней");
    }
}