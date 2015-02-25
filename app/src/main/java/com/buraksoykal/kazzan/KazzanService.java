package com.buraksoykal.kazzan;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;

public class KazzanService extends Service {
    private static final String TAG = "KazzanService" ;

    public KazzanService() {
    }

    @Override
    public void onCreate() {
        Log.i(TAG, "KazzanService Created");


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

}
