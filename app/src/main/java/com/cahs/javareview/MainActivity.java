package com.cahs.javareview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static String ETIQUETA = "Review";

    //Callback methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(ETIQUETA,"Entra al onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(ETIQUETA,"Entra al onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(ETIQUETA, "Entra al onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ETIQUETA, "Entra al onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(ETIQUETA, "Entra al onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(ETIQUETA, "Entra al onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(ETIQUETA, "Entra al onDestroy");
    }
}
