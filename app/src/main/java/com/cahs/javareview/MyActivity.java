package com.cahs.javareview;

import android.os.Bundle;

public class MyActivity extends MainActivity{

    static MainActivity myActivity = new MainActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private static void prueba(){
        //String str = myActivity.TAG;
    }

}
