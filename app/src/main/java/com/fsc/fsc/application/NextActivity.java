package com.fsc.fsc.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class NextActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }
    public void btnA(View v){
        startActivity(new Intent(this,BothActivity.class));
    }
}
