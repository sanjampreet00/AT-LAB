package com.example.lab4_alarmclock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TimePicker;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TimePicker alarmTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNotificationChannel();

        Button buttonShowNotification = findViewById(R.id.show);

        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"lem")
                .setSmallIcon(R.drawable.ic_add_alert_black_24dp)
                .setContentTitle("Alarm")
                .setContentText("Alarm Notification")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager=NotificationManagerCompat.from(this);



        buttonShowNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextClock currentTime;

                alarmTime = findViewById(R.id.timePicker);
                currentTime = findViewById(R.id.textClock);
                final Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));



                Timer t = new Timer();
                t.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        int i=0;
                        if (currentTime.getText().toString().equals(AlarmTime())){
                            {
                                r.play();
                                if(i==0) {
                                    i=1;
                                    notificationManager.notify(100, builder.build());
                                }
                            }
                        }else{
                            r.stop();
                        }
                    }
                }, 0, 1000);
            }
        });

    }

    public String AlarmTime(){


        Integer alarmHours = alarmTime.getCurrentHour();
        Integer alarmMinutes = alarmTime.getCurrentMinute();
        String stringAlarmMinutes;

        if (alarmMinutes<10){
            stringAlarmMinutes = "0";
            stringAlarmMinutes = stringAlarmMinutes.concat(alarmMinutes.toString());
        }else{
            stringAlarmMinutes = alarmMinutes.toString();
        }
        String stringAlarmTime;
        if(alarmHours>12){
            alarmHours = alarmHours -12;
            stringAlarmTime = alarmHours.toString().concat(":").concat(stringAlarmMinutes).concat(" PM");
        }else{
            stringAlarmTime = alarmHours.toString().concat(":").concat(stringAlarmMinutes).concat(" AM");
        }
        return stringAlarmTime;
    }


    private void createNotificationChannel() {
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            CharSequence name="studentChannel";
            String description="Channel";
            int importance= NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel =new NotificationChannel("lem",name,importance);
            channel.setDescription(description);

            NotificationManager notificationManager=getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}