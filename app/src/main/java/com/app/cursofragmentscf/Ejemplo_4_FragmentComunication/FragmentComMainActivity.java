package com.app.cursofragmentscf.Ejemplo_4_FragmentComunication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.app.cursofragmentscf.R;

public class FragmentComMainActivity extends AppCompatActivity implements MyInterface{
    FragmentManager manager;
    TextView textViewCom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_com_main);
        textViewCom = findViewById(R.id.texto);
        manager=getSupportFragmentManager();
        addFragment();
    }

    public void addFragment(){
        MyFragmentCom myFragmentCom = new MyFragmentCom();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.myfragmentcom,myFragmentCom,"fragmentX");
        transaction.commit();
    }

    @Override
    public void senData(String dato) {
        textViewCom.setText(dato);
    }
}
