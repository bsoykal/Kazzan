package com.buraksoykal.kazzan.Entity;


import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Created by bsoykal on 1.2.2015.
 */
public class MessageData implements Serializable{


    private String data;
    private ArrayList<BasicNameValuePair> params;

    public MessageData(){
        data = "";
        params = new ArrayList<BasicNameValuePair>();
    }

    public ArrayList<BasicNameValuePair> getParams() {
        return params;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setParams(ArrayList<BasicNameValuePair> params){
        this.params = params;
    }

    public void addParameter(String name, String value){
         params.add(new BasicNameValuePair(name,value));
    }

    public String getValueFromParams(String name){
        if(params.size()!=0){
            for(BasicNameValuePair bnvp : params){
                if(bnvp.getName().equals(name)){
                    return bnvp.getValue();
                }
            }
        }

        return null;
    }


  }
