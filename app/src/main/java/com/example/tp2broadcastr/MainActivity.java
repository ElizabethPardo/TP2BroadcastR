package com.example.tp2broadcastr;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private DesbloqueoApp desbloqueoReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        desbloqueoReceiver = new DesbloqueoApp();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_USER_PRESENT);
        registerReceiver(desbloqueoReceiver, filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (desbloqueoReceiver != null) {
            unregisterReceiver(desbloqueoReceiver);
        }
    }
}