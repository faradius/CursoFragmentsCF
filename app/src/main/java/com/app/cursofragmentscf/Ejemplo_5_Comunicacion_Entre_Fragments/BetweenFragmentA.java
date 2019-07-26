package com.app.cursofragmentscf.Ejemplo_5_Comunicacion_Entre_Fragments;

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

public class BetweenFragmentA extends Fragment {
    EditText editText;
    Button btnSend;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.between_fragment_a,container,false);
        editText = view.findViewById(R.id.dataA);
        btnSend = view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send();
            }
        });
        return view;
    }

    private void send(){
        Send send_dato = (Send) getActivity();
        send_dato.SendData(editText.getText().toString());
    }
}
