package com.gzeinnumer.dateadd1secondtotime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat writeTime = new SimpleDateFormat("HH:mm");
        writeTime.setTimeZone(TimeZone.getTimeZone("GMT+07:00"));
        String time_upload1 = writeTime.format(new Date());
        String time_upload2 = writeTime.format(new Date(System.currentTimeMillis()+300000));

        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);

        txt1.setText(time_upload1);
        txt2.setText(time_upload2);


    }
}
