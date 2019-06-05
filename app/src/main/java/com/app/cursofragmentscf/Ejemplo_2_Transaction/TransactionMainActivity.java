package com.app.cursofragmentscf.Ejemplo_2_Transaction;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.cursofragmentscf.R;

public class TransactionMainActivity extends AppCompatActivity {
    Button addA,addB,removeA,removeB;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_main);

        addA = findViewById(R.id.addA);
        addB = findViewById(R.id.addB);
        removeA = findViewById(R.id.removeA);
        removeB = findViewById(R.id.removeB);
        fragmentManager = getSupportFragmentManager();

        addA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentA fragmentA = new FragmentA();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.frameLayoutTransaction,fragmentA,"FragmentA");
                fragmentTransaction.commit();
            }
        });

        addB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentB fragmentB = new FragmentB();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.frameLayoutTransaction,fragmentB,"FragmentB");
                fragmentTransaction.commit();
            }
        });

        removeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("FragmentA");
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if (fragmentA != null) {
                    fragmentTransaction.remove(fragmentA);
                    fragmentTransaction.commit();
                }else{

                }
            }
        });

        removeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentByTag("FragmentB");
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if (fragmentB != null){
                    fragmentTransaction.remove(fragmentB);
                    fragmentTransaction.commit();
                }else {

                }
            }
        });
    }
}
