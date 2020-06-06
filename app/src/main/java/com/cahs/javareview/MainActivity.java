package com.cahs.javareview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static com.cahs.javareview.MainActivity.Day.FRIDAY;
import static com.cahs.javareview.MainActivity.Day.MONDAY;
import static com.cahs.javareview.MainActivity.Day.SATURDAY;
import static com.cahs.javareview.MainActivity.Day.SUNDAY;


public class MainActivity extends AppCompatActivity {

    private String ETIQUETA = "Review";
    //array de Strings
    String[] deportes = new String[]{"futbol", "basket", "tenis", "voleybol"};
    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY }

    public void tellItLikeItIs() {

        Day day = MONDAY, SATURDAY;
        //Dentro de esta condicional solo puedo tener ints, Strings, enums
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    //Callback methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Llamar al método onCreate de la clase padre: AppCompatActivity
        super.onCreate(savedInstanceState);
        //Inflar el layout
        setContentView(R.layout.activity_main);//000954609
        Log.d(ETIQUETA, "Entra al onCreate");
        //manageStrings("Carlos", "Hernández");
        //manageInts(78, 69);
        int[] arrInts = new int[]{2, 4, 6};
        double[] arrDoubles = new double[]{3.0, 5.0, 7.0};
        //manageArrays(arrInts, arrDoubles);
        //Lista de Enteros
        List<Integer> integers = new ArrayList<>();
        for (int index = 0; index < 5; index++) integers.add(index * 2);
        //Lista de Strings
        List<String> stringList = new ArrayList<>();
        for (int index = 0; index < 4; index++) stringList.add("Palabra " + index);
        manageLists(integers, stringList);
        //Find views
        //ClassName  objectName = method(int)
        /*TextView helloPlanet = findViewById(R.id.textPlanet);
        TextView helloWorld = findViewById(R.id.textHello);*/
        //Repaso de While
        //manageWhile();
        //Repaso de Enums y switch
        //manageEnums();
        //Repaso de colecciones


    }

    private void manageEnums() {
        tellItLikeItIs();
    }

    //Iterar el array de deportes hasta que llegue a tenis
    private void manageWhile() {
        int index = 0;
        //Mientras se cumpla esta condición
        while (index < deportes.length) {
            if (deportes[index] != "tenis") Log.d(ETIQUETA, "deporte es: " + deportes[index]);
            else index = deportes.length;
            index++;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(ETIQUETA, "Entra al onStart");
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
    private void manageStrings(String first, String second) {
        String result = first + " " + second;
        boolean isValid;
        isValid = true;
        if (isValid) Log.d(ETIQUETA, "Mi nombre es: " + result);
        else Log.d(ETIQUETA, "No se halló un nombre ");
    }

    //Ints
    private void manageInts(int first, int second) {
        //suma
        int sum = first + second;
        //Resta
        int substraction = first - second;
        //Multiplicación
        int product = first * second;
        //División
        double division = first / second;

        Log.d(ETIQUETA, "Suma es: " + sum);
        Log.d(ETIQUETA, "Resta es: " + substraction);
        Log.d(ETIQUETA, "Multiplicación es: " + product);
        Log.d(ETIQUETA, "División es: " + division);
    }

    //Arrays
    private void manageArrays(int[] arrayInt, double[] doubleArray) {
        //Iterar sobre cada array
        for (int i = 0; i < doubleArray.length; i++)
            /*Log.d(ETIQUETA, "Element at index " + i +
                    " : "+ arrayInt[i]);*/
            Log.d(ETIQUETA, "Element double at index " + i +
                    " : " + doubleArray[i]);

    }

    //Todas las clases extienden de Object, para hacer uso de ciertos métodos:
    //toString(), hashCode(); equals()

    //Colecciones: ArrayList
    private void manageLists(List<Integer> integers, List<String> stringList) {

        //Remover elementos de stringList
    /*    System.out.println(stringList.remove("hawk"));
        System.out.println(stringList.remove("Palabra 2"));*/
        //Cambiar Palabra 1 por "Textos", lo hacemos mediante el método set()
        stringList.set(1, "Textos");
            //Iterar sobre cada elemento del ArrayList
        for (int i = 0; i < stringList.size(); i++)
            Log.d(ETIQUETA, "Elemento cadena en el índice " + i +
                    " : " + stringList.get(i));
        Log.d(ETIQUETA,"Es vacío? " + stringList.isEmpty());//false
        Log.d(ETIQUETA,"El tamaño es:" + stringList.size());//4
        //Next class: Set, Map
    }
}

