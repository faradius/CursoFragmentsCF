package com.app.cursofragmentscf.Ejemplo_5_Comunicacion_Entre_Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.cursofragmentscf.R;

public class BetweenFragmentB extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.between_fragment_b,container,false);
        textView = view.findViewById(R.id.textViewF);
        return view;
    }

    public void reciveData(String data){
        textView.setText("Recibimos el dato: "+data);
    }
}
