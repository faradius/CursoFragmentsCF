package com.app.cursofragmentscf.Ejemplo_4_FragmentComunication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.app.cursofragmentscf.R;

public class MyFragmentCom extends Fragment {
    EditText editText;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myfragmentcom,container,false);
        Button boton;

        editText = view.findViewById(R.id.data);
        boton = view.findViewById(R.id.enviar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepareData();
            }
        });

        return view;
    }
    private void prepareData(){
        String xdata = editText.getText().toString();
        MyInterface myInterface = (MyInterface) getActivity();
        myInterface.senData(xdata);
    }
}
