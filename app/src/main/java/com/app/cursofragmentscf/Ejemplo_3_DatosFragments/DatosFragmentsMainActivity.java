package com.app.cursofragmentscf.Ejemplo_3_DatosFragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.cursofragmentscf.R;

public class DatosFragmentsMainActivity extends AppCompatActivity {
    EditText dato;
    Button send;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_fragments_main);
        fragmentManager = getSupportFragmentManager();

        dato = findViewById(R.id.dato);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String info = dato.getText().toString();
                //int numero = Integer.valueOf(dato.getText().toString());
                int numero = 10;
                //Envio de datos a un fragment por medio del objeto bundle
                /*Bundle bundle = new Bundle();
                bundle.putString(Constants.DATA1,info);
                bundle.putInt(Constants.DATA2, numero);*/

                MyFragment myFragment = new MyFragment();
                //myFragment.setArguments(bundle);
                //Enviando datos por medio del metodo setData del fragment
                myFragment.setData(info,numero);
                myFragment.setObject(new MyObject());

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.add(R.id.container,myFragment);
                transaction.commit();
            }
        });
    }
}
