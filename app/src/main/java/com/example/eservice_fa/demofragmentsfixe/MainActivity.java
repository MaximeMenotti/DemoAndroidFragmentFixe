package com.example.eservice_fa.demofragmentsfixe;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        afficheMessage("Activity : onCreate");
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        afficheMessage("Activity : onStart");
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        afficheMessage("Activity : onStop");
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        afficheMessage("Activity : onResume");
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        afficheMessage("Activity : onRestart");
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        afficheMessage("Activity : onPause");
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        afficheMessage("Activity : onDestroy");
    }

    public void afficheMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
