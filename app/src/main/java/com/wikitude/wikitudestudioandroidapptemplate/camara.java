package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class camara extends AppCompatActivity implements View.OnClickListener {

    Button imagen ;

    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
       setContentView(R.layout.informacion);
       imagen= findViewById(R.id.button);


       imagen.setOnClickListener((View.OnClickListener)this);

    }

    @Override



    public void onClick(View v) {

        if (v == imagen) {
            Intent intent = new Intent(this,SampleCamActivity.class);

            startActivity(intent);


        }


    }
}
