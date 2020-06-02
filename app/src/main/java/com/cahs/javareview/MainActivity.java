package com.cahs.javareview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static String ETIQUETA = "Review";

    //Callback methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Llamar al método onCreate de la clase padre: AppCompatActivity
        super.onCreate(savedInstanceState);
        //Inflar el layout
        setContentView(R.layout.activity_main);//000954609
        Log.d(ETIQUETA,"Entra al onCreate");
        //manageStrings("Carlos", "Hernández");
        //manageInts(78, 69);
        int[] arrInts = new int[] {2, 4, 6};
        double[] arrDoubles = new double[] {3.0, 5.0, 7.0};
        //manageArrays(arrInts, arrDoubles);
        //Lista de Enteros
        List<Integer> integers = new ArrayList<>();
        for (int index = 0; index < 5; index++) integers.add(index*2);
        //Lista de Strings
        List<String> stringList = new ArrayList<>();
        for (int index = 0; index < 4; index++) stringList.add("Palabra " + index);
        manageLists(integers, stringList);
        //Find views
        //ClassName  objectName = method(int)
        TextView helloPlanet = findViewById(R.id.textPlanet);
        TextView helloWorld = findViewById(R.id.textHello);

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

    //Unir cadenas
    private void manageStrings(String first, String second){
        String result = first + " " + second;
        boolean isValid;
        isValid = true;
        if (isValid) Log.d(ETIQUETA, "Mi nombre es: " + result);
        else Log.d(ETIQUETA, "No se halló un nombre " );
    }

    //Ints
    private void manageInts(int first, int second){
        //suma
        int sum = first + second;
        //Resta
        int substraction = first - second;
        //Multiplicación
        int product = first * second;
        //División
        double division = first/second;

        Log.d(ETIQUETA, "Suma es: " + sum);
        Log.d(ETIQUETA, "Resta es: " + substraction);
        Log.d(ETIQUETA, "Multiplicación es: " + product );
        Log.d(ETIQUETA, "División es: " + division);
    }

    //Arrays
    private void manageArrays(int [] arrayInt, double [] doubleArray){
        //Iterar sobre cada array
        for (int i = 0; i < doubleArray.length; i++)
            /*Log.d(ETIQUETA, "Element at index " + i +
                    " : "+ arrayInt[i]);*/
        Log.d(ETIQUETA, "Element double at index " + i +
                    " : "+ doubleArray[i]);

    }

    //Listas
    private void manageLists(List<Integer> integers, List<String> stringList){
        //Iterar sobre cada array
        for (int i = 0; i < stringList.size(); i++)
            Log.d(ETIQUETA, "Elemento cadena en el índice " + i +
                    " : "+ stringList.get(i));
    }


}
