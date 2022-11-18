package com.example.finaldemo;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class SaviorSharedPrefrence {

    private String empName,storeId, position, primaryGroup, location;
    Context context;
    private SharedPreferences loginSharedPreference;

    private static String loginSharedPreferenceName = "loginDataDemo";

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public SaviorSharedPrefrence(String empName, String storeId, String position, String primaryGroup, String location, Context context) {
        this.empName = empName;
        this.storeId = storeId;
        this.position = position;
        this.primaryGroup = primaryGroup;
        this.location = location;
        this.context = context;
    }

    public SaviorSharedPrefrence(Context context){
        this.context=context;
        recoverLoginData(context);
    }

    private static SharedPreferences getPrefs(Context context) {
        return context.getSharedPreferences(loginSharedPreferenceName, Context.MODE_PRIVATE);
    }

    public void saveLoginData(){

        SharedPreferences.Editor loginEditor = getPrefs(context).edit();

        loginEditor.putString("empName",empName);
        loginEditor.putString("storeId",storeId);
        loginEditor.putString("position",position);
        loginEditor.putString("primaryGroup",primaryGroup);
        loginEditor.putString("location",location);

        loginEditor.apply();
    }

    public void recoverLoginData(Context mContext){

        loginSharedPreference = mContext.getSharedPreferences(loginSharedPreferenceName, Context.MODE_PRIVATE);

        empName = loginSharedPreference.getString("empName","Afjal Nazirahmed Shaikh");
        storeId = loginSharedPreference.getString("storeId","101");
        position = loginSharedPreference.getString("position","Customer Care Associate");
        primaryGroup = loginSharedPreference.getString("primaryGroup","CASHIER");
        location = loginSharedPreference.getString("location","MUMBAI");


    }



    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPrimaryGroup() {
        return primaryGroup;
    }

    public void setPrimaryGroup(String primaryGroup) {
        this.primaryGroup = primaryGroup;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
