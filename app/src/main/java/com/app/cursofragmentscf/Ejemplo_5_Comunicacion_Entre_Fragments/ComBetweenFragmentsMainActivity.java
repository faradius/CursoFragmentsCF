package com.app.cursofragmentscf.Ejemplo_5_Comunicacion_Entre_Fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.cursofragmentscf.R;

public class ComBetweenFragmentsMainActivity extends AppCompatActivity implements Send{
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com_between_fragments_main);
        fragmentManager = getSupportFragmentManager();
        addFragmentA();
        addFragmentB();
    }

    public void addFragmentA(){
        BetweenFragmentA fragmentA = new BetweenFragmentA();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.containerA, fragmentA,"fragmentA");
        transaction.commit();
    }

    public void addFragmentB(){
        BetweenFragmentB fragmentB = new BetweenFragmentB();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.containerB, fragmentB, "fragmentB");
        transaction.commit();
    }

    @Override
    public void SendData(String dato) {
        BetweenFragmentB fragmentB = (BetweenFragmentB) fragmentManager.findFragmentByTag("fragmentB");
        fragmentB.reciveData(dato);
    }
}
