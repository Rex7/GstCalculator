package com.example.hp.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual, fivePercentage, twelPercntage, eighteenPercentage, twentyEightPerc;

    EditText edt1;

    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);

        buttonAdd = (Button) findViewById(R.id.plus);
        buttonSub = (Button) findViewById(R.id.btnMinus);
        buttonMul = (Button) findViewById(R.id.btnmul);
        buttonDivision = (Button) findViewById(R.id.divButton);
        buttonC = (Button) findViewById(R.id.clear);
        buttonEqual = (Button) findViewById(R.id.equal);
        fivePercentage = (Button) findViewById(R.id.percentage5);
        twelPercntage = (Button) findViewById(R.id.percentage12);
        eighteenPercentage = findViewById(R.id.percentage18);
        twentyEightPerc = findViewById(R.id.percentage28);


        edt1 = findViewById(R.id.inputText);

        fivePercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float val = Float.parseFloat(edt1.getText().toString());
                float amount = (val * 5) / 100;
                float total = val + amount;
                edt1.setText("");
                edt1.setText("" + total);

            }
        });
        twelPercntage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float val = Float.parseFloat(edt1.getText().toString());
                float amount = (val * 12) / 100;
                float total = val + amount;
                edt1.setText("");
                edt1.setText("" + total);
            }
        });
        eighteenPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float val = Float.parseFloat(edt1.getText().toString());
                float amount = (val * 18) / 100;
                float total = val + amount;
                edt1.setText("");
                edt1.setText("" + total);
            }
        });
        twentyEightPerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float val = Float.parseFloat(edt1.getText().toString());
                float amount = (val * 28) / 100;
                float total = val + amount;
                edt1.setText("");
                edt1.setText("" + total);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mSubtract = true;
                edt1.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true;
                edt1.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mDivision = true;
                edt1.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edt1.getText() + "");

                if (mAddition == true) {

                    edt1.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }


                if (mSubtract == true) {
                    edt1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    edt1.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    edt1.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.menu,menu);
      return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.faq:
                startActivity(new Intent(this, Faq.class));
                break;
        }


        return true;
    }
}