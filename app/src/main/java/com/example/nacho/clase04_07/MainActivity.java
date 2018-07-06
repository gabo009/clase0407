package com.example.nacho.clase04_07;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btm_menu;
    TextInputEditText tiet_nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btm_menu = (BottomNavigationView) findViewById(R.id.btm_menu);
        tiet_nombre = (TextInputEditText) findViewById(R.id.tiet_nombre);
        btm_menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.inicio:
                        Toast.makeText(MainActivity.this, tiet_nombre.getText().toString(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.grabar:
                        Toast.makeText(MainActivity.this, "grabar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.eliminar:
                        Toast.makeText(MainActivity.this, "eliminar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.salir:
                        Toast.makeText(MainActivity.this, "salir", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.opciones:
                        Toast.makeText(MainActivity.this, "opciones", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
    }
}
