package com.buraksoykal.kazzan;

import android.content.Context;
import android.content.SharedPreferences;

import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;

/**
 * Created by bsoykal on 14/11/14.
 */
public class SharedPrefHelper {

    public static void putDataSharedPref(Context context, ArrayList<BasicNameValuePair> nameValuePairs){
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS",0);
        SharedPreferences.Editor editor = sharedPrefs.edit();

        for(BasicNameValuePair valuePair : nameValuePairs){

            editor.putString(valuePair.getName(),valuePair.getValue());
        }

        editor.commit();
    }


    public static String getDataFromSharedPref(Context context,String key){
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS",0);
        return sharedPrefs.getString(key,"");
    }

    public static void clearDataFromSharedPref(Context context,String name){
        ArrayList<String> temp = new ArrayList<String>();
        temp.add(name);
        clearDataFromSharedPref(context,temp);
    }

    public static void clearDataFromSharedPref(Context context,ArrayList<String> names){
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS",0);
        SharedPreferences.Editor editor = sharedPrefs.edit();

        for(String s : names){
            editor.remove(s);
        }

        editor.commit();
    }

    public static void clearALLDataFromSharedPref(Context context){
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS",0);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.clear();
        editor.commit();
    }

    public static boolean hasTutorialShown(Context context){
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS",0);
        return sharedPrefs.getBoolean("tutorial", false);
    }

    public static void setTutorialShown(Context context,boolean shown){
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS",0);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putBoolean("tutorial", shown);
        editor.commit();
    }

    public static boolean isUserLoggedIn(Context context){
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS",0);
        return sharedPrefs.getBoolean("loggedIn",false);
    }

    public static void setUserLoggedIn(Context context,boolean loggedIn) {
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS", 0);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putBoolean("loggedIn", loggedIn);
        editor.commit();
    }

    public static String getUserName(Context context){
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS",0);
        return sharedPrefs.getString("username","NaN");
    }

    public static void setUserName(Context context,String userName) {
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS", 0);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putString("username", userName);
        editor.commit();
    }

    public static int getKalanHak(Context context){
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS",0);
        return sharedPrefs.getInt("kalanhak",0);
    }

    public static void setKalanHak(Context context,int kalanHak) {
        SharedPreferences sharedPrefs = context.getSharedPreferences("PUS", 0);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putInt("kalanhak", kalanHak);
        editor.commit();
    }








}
