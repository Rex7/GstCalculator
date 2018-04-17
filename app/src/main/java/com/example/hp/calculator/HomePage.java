package com.example.hp.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity implements View.OnClickListener{
Button gstCal,productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        gstCal=findViewById(R.id.gstCalculator);
        productList=findViewById(R.id.listOfProduct);
        gstCal.setOnClickListener(this);
        productList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.gstCalculator:
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                break;
            case R.id.listOfProduct:
                startActivity(new Intent(getApplicationContext(),ProductList.class));
                break;
        }
    }
}
