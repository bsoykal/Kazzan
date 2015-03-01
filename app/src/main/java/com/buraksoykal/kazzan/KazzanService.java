package com.buraksoykal.kazzan;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.util.Log;

import com.buraksoykal.kazzan.Entity.MessageData;

import org.json.JSONObject;

import java.util.Timer;

public class KazzanService extends Service {
    private static final String TAG = "KazzanService" ;
    private ServiceBroadcastReceiver receiver;

    public KazzanService() {
    }

    @Override
    public void onCreate() {
        Log.i(TAG, "KazzanService Created");
        receiver = new ServiceBroadcastReceiver(this);
        registerReceiver(receiver, new IntentFilter(
                "serviceEvent"));




    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("KazzanService", "Received start id " + startId + ": "
                + intent);
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void startTimer(long time){
        CountDownTimer timer = new CountDownTimer(time,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

            }
        };
    }

    public class ServiceBroadcastReceiver extends BroadcastReceiver {

        private static final String TAG = "ServiceBroadcastReceiver";
        private KazzanService service;

        public ServiceBroadcastReceiver(KazzanService service){
            this.service = service;
        }

        @Override
        public void onReceive(Context context, Intent intent) {

            MessageData data;

            data = (MessageData) intent.getSerializableExtra("message");

            if(data.getData().equals("starttimer")){
                service.startTimer(1800000);
            }

        }
    }

}
