package com.hipercube.codegate2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        setLayout();
    }

    private void setLayout() {
        findViewById(R.id.btnLicense).setOnClickListener(this);
        findViewById(R.id.btnUnLocker).setOnClickListener(this);
        findViewById(R.id.btnInAppPayment).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLicense:
                startActivity(new Intent(getApplicationContext(), LicenseActivity.class));
                break;
            case R.id.btnUnLocker:
                System.out.println("UnLocker");
                break;
            case R.id.btnInAppPayment:
                break;
        }
    }
}
