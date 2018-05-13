package com.example.chelohholmes.tarjetas_colectivas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView Jorge = (ListView) findViewById(R.id.ListView);
        adapter buenas = new adapter();
        datos noches = new datos();
        buenas.context=this;
        buenas.ListaArreglo=noches.showAll();
        Jorge.setAdapter(buenas);
    }

}


