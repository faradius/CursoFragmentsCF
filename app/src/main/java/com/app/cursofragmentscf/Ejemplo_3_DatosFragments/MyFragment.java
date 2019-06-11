package com.app.cursofragmentscf.Ejemplo_3_DatosFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.app.cursofragmentscf.R;

public class MyFragment extends Fragment {
    TextView textView;
    Button botonF;
    int numero;
    String valor1;
    int valor2;
    MyObject myObject;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragment_layout, container, false);
        //Recibiendo datos del activity por medio del objeto Bundle
        /*Bundle bundle = getArguments();
        String dato = bundle.getString(Constants.DATA1,"No tiene valor");
        numero = bundle.getInt(Constants.DATA2,0);*/

        textView = view.findViewById(R.id.fragmentdata);
        //Seteando el valor1 que se obtuvieron del activity por medio del metodo getData
        textView.setText(valor1);
        botonF = view.findViewById(R.id.botonF);

        botonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Seteando el valor2 que se obtuvieron del activity por medio del metodo getData
                textView.setText(String.valueOf(valor2));
            }
        });
        return view;
    }

    public void setData(String dato, int numero) {
        //Asignando los valores en  las variables de valor1 y valor2 que se pusieron en el activity
        valor1 = dato;
        valor2 = numero;
    }

    public void setObject(MyObject myObject){
        this.myObject = myObject;
    }

}
