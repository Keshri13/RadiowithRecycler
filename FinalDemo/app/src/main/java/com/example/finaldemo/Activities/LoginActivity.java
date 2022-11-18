package com.example.finaldemo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.finaldemo.Api.Api;
import com.example.finaldemo.Api.TenderApi;
import com.example.finaldemo.Models.LoginResponse;
import com.example.finaldemo.Models.TenderResponse;
import com.example.finaldemo.R;
import com.example.finaldemo.SaviorSharedPrefrence;

import androidx.annotation.NonNull;


import java.util.Arrays;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.app.ProgressDialog;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    TextView resetPassword;
    EditText empId,password;
    Button loginBtn;
    LoginResponse signInResponsesData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        resetPassword = findViewById(R.id.resetPassword);
        empId = findViewById(R.id.editTextEmployeeId);
        password = findViewById(R.id.editTextPassword);
        loginBtn = findViewById(R.id.loginbutton);


        // implement setOnClickListener event on sign up Button

        loginBtn.setOnClickListener(view -> {
            // validate the fields and call sign method to implement the api
            if (validate(empId) && validate(password)) {
                signUp();
            }
        });

        //SharedPreferences loginSharedPreference = getSharedPreferences("loginDataDemo",MODE_PRIVATE);

    }

    private void saveDataAndStartMainActivity(String empName,String storeId, String position, String primaryGroup, String location){

        SaviorSharedPrefrence saviorSharedPrefrence = new SaviorSharedPrefrence(empName,storeId,position,primaryGroup,location,this);

        saviorSharedPrefrence.saveLoginData();

        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
    }



//    private static boolean isValidEmail(String email) {
//        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
//    }

    private boolean validate(EditText editText) {
        // check the lenght of the enter data in EditText and give error if its empty
        if (editText.getText().toString().trim().length() > 0) {
            return true; // returns true if field is not empty
        }
        editText.setError("Please Fill This");
        editText.requestFocus();
        return false;
    }

    private void signUp() {
        // display a progress dialog
        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);
        progressDialog.setCancelable(false); // set cancelable to false
        progressDialog.setMessage("Please Wait"); // set message
        progressDialog.show(); // show progress dialog

        // Api is a class in which we define a method getClient() that returns the API Interface class object
        // registration is a POST request type method in which we are sending our field's data
        // enqueue is used for callback response and error
        String source = "mpos",DeviceId = "111122223333";
        String empno = empId.getText().toString().trim();
        String passwordx = password.getText().toString().trim();

        API_call(empno,passwordx,source,DeviceId);
        progressDialog.dismiss();

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                progressDialog.dismiss();
//                Intent i=new Intent(LoginActivity.this,
//                        MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        }, 1000);


    }

    private void API_call(String empno, String passwordx, String source, String DeviceId){
        //JIO

        (Api.getClient().registration(empno,
                passwordx,
                source,
                DeviceId)).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponse> call, @NonNull Response<LoginResponse> response) {

                if (!response.isSuccessful()) {
                    Log.d("Hellop: ", String.valueOf(response.code()));

                    Toast.makeText(LoginActivity.this,"Invalid Credentials !",Toast.LENGTH_LONG).show();



                    return;
                }
                //Log.d("hello", String.valueOf(signInResponsesData.getClass()));

                signInResponsesData = response.body();

                //Toast.makeText(getApplicationContext(), response.body().getMessage(), Toast.LENGTH_SHORT).show();
                System.out.println(signInResponsesData);

                Log.d("Hellop",call.toString());

                //resultTesxtView.setText(String.valueOf(signInResponsesData.getMessage()));

                Log.d("hello", String.valueOf(signInResponsesData.getMessage()));
                Log.d("hello", String.valueOf(signInResponsesData.getStatus()));

                saveDataAndStartMainActivity(
                        signInResponsesData.getData().getEmployee().getEmpnm(),
                        signInResponsesData.getData().getStoreDetails().getRetailStoreID(),
                        signInResponsesData.getData().getEmployee().getPosition(),
                        signInResponsesData.getData().getEmployee().getPrimaryGroup(),
                        signInResponsesData.getData().getStoreDetails().getStctry());
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                //resultTesxtView.setText(Arrays.toString(t.getStackTrace()));
                Log.d("response", Arrays.toString(t.getStackTrace()));
                Log.d("response2",call.toString());
                Log.d("response3",t.toString());
                //progressDialog.dismiss();

            }
        });
    }



}