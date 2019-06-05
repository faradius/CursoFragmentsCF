package com.app.cursofragmentscf.Ejemplo_1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.cursofragmentscf.Ejemplo_1.TwoFragment;
import com.app.cursofragmentscf.R;

public class FragmentBasicMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_basic_activity_main);

        TwoFragment codeFragment = new TwoFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.contenedorFrame,codeFragment);
        fragmentTransaction.commit();
    }

}
