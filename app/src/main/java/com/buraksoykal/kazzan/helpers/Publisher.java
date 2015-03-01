package com.buraksoykal.kazzan.helpers;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.buraksoykal.kazzan.Entity.MessageData;


public class Publisher {

	private static final String TAG = "Publisher";

	public static void sendMessageToService(Context context,MessageData data){

		Log.i(TAG,"Broadcast will be sending to service!!");
		Intent intent = new Intent("serviceEvent");
		intent.putExtra("message", data);
		context.sendBroadcast(intent);
		Log.i(TAG,"Broadcast sent!!");

	}


    public static void sendMessageToActivity(Context context,MessageData data){

        Log.i(TAG,"Broadcast will be sending to activity!!");
        Intent intent = new Intent("activityEvent");
        intent.putExtra("message", data);
        context.sendBroadcast(intent);
        Log.i(TAG,"Broadcast sent!!");

    }

}
