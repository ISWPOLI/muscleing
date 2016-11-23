package com.example.cristian.muscleregistrationylogin;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class UserAreaActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    AlarmManager alarmManager;
    private PendingIntent pending_intent;
    private TimePicker alarmTimePicker;
    private static UserAreaActivity inst;
    private TextView alarmTextView;

    private AlarmReceiver alarm;
    private Context context;
    Spinner spinner;
    int richard_quote = 0;


    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final Button bSiguiente = (Button) findViewById(R.id.bSiguiente);

        bSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent1 = new Intent(UserAreaActivity.this, UserAreaActivity2.class);
                UserAreaActivity.this.startActivity(registerIntent1);
            }
        });


        this.context = this;
        alarmTextView = (TextView) findViewById(R.id.alarmText);

        final Intent myIntent = new Intent(this.context, AlarmReceiver.class);

        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        final Calendar calendar = Calendar.getInstance();
        alarmTimePicker = (TimePicker) findViewById(R.id.alarmTimePicker);

        Spinner spinner = (Spinner) findViewById(R.id.richard_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dawkins_sounds, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

        Button start_alarm= (Button) findViewById(R.id.start_alarm);
        start_alarm.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.M)

            @Override
            public void onClick(View v) {

                calendar.set(Calendar.HOUR_OF_DAY, alarmTimePicker.getHour());
                calendar.set(Calendar.MINUTE, alarmTimePicker.getMinute());

                final int hour = alarmTimePicker.getHour();
                final int minute = alarmTimePicker.getMinute();;

                String minute_string = String.valueOf(minute);
                String hour_string = String.valueOf(hour);

                if (minute < 10) {
                    minute_string = "0" + String.valueOf(minute);
                }

                if (hour > 12) {
                    hour_string = String.valueOf(hour - 12) ;
                }

                myIntent.putExtra("extra", "yes");
                myIntent.putExtra("quote id", String.valueOf(richard_quote));
                pending_intent = PendingIntent.getBroadcast(UserAreaActivity.this, 0, myIntent, PendingIntent.FLAG_UPDATE_CURRENT);

                alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pending_intent);

                setAlarmText("Alarma a las " + hour_string + ":" + minute_string);
            }

        });

        Button stop_alarm= (Button) findViewById(R.id.stop_alarm);
        stop_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myIntent.putExtra("extra", "no");
                myIntent.putExtra("quote id", String.valueOf(richard_quote));
                sendBroadcast(myIntent);

                alarmManager.cancel(pending_intent);
                setAlarmText("Alarma cancelada");

            }
        });

    }
    public void setAlarmText(String alarmText)
    {
        alarmTextView.setText(alarmText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onStart() {
        super.onStart();
        inst = this;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.e("MyActivity", "on Destroy");
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        richard_quote = (int) id;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}