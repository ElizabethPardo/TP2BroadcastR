package com.example.tp2broadcastr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class DesbloqueoApp extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {

        if (Intent.ACTION_USER_PRESENT.equals(intent.getAction())) {

            // Toast
            Toast.makeText(context, "Pantalla desbloqueada detectada", Toast.LENGTH_LONG).show();

            // Log
            Log.d("DesbloqueoReceiver", "Se detectó desbloqueo de pantalla");

            // Abrir app de llamadas
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:2664508236"));
            callIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(callIntent);
        }
    }
}