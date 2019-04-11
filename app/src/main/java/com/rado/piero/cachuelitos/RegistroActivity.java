package com.rado.piero.cachuelitos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


    }
    public void callRegister(View view){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
