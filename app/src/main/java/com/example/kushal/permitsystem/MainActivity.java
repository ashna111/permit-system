package com.example.kushal.permitsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView calendar = (CalendarView) findViewById(R.id.calendar);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(CalendarView calendar,int year, int month, int dayOfMonth){
                String date = dayOfMonth+"/"+(month+1)+"/"+year;
                Intent i = new Intent(MainActivity.this ,DetailsActivity.class);
                i.putExtra("date",date);
                startActivity(i);
            }

        });
    }

}
