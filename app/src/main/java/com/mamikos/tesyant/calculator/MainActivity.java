package com.mamikos.tesyant.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_c, btn_plus,
            btn_minus, btn_divide, btn_multiply, btn_coma, btn_equals;

    TextView tv_numbers;

    private float firstValue, nextValue;

    boolean btnPlusActive, btnMinusActive, btnMulActive, btnDivActive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_c = (Button)findViewById(R.id.btn_clear);
        btn_plus = (Button)findViewById(R.id.btn_plus);
        btn_minus = (Button)findViewById(R.id.btn_minus);
        btn_divide = (Button)findViewById(R.id.btn_divide);
        btn_multiply = (Button)findViewById(R.id.btn_multiply);
        btn_coma = (Button)findViewById(R.id.btn_coma);
        btn_equals = (Button)findViewById(R.id.btn_equals);

        tv_numbers = (TextView)findViewById(R.id.tv_numbers);

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numbers.setText("");
            }
        });

        btn_coma.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (tv_numbers.getText().toString().isEmpty()) {
                    tv_numbers.setText("0.");
                }
                else {
                    if (tv_numbers.getText().toString().contains(".")){
                        btn_coma.setEnabled(false);
                    }
                    else {
                        tv_numbers.setText(Objects.requireNonNull(tv_numbers).getText() + ".");
                    }
                }
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_numbers.setText(tv_numbers.getText() + "9");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_numbers.getText().toString().isEmpty()) {
                    tv_numbers.setText("");
                }
                else {
                    firstValue = Float.parseFloat(tv_numbers.getText() + "");
                    btnPlusActive = true;
                    tv_numbers.setText("");
                }
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_numbers.getText().toString().isEmpty()) {
                    tv_numbers.setText("");
                }
                else {
                    firstValue = Float.parseFloat(tv_numbers.getText() + "");
                    btnMinusActive = true;
                    tv_numbers.setText("");
                }
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_numbers.getText().toString().isEmpty()) {
                    tv_numbers.setText("");
                }
                else {
                    firstValue = Float.parseFloat(tv_numbers.getText() + "");
                    btnMulActive = true;
                    tv_numbers.setText("");
                }
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_numbers.getText().toString().isEmpty()) {
                    tv_numbers.setText("");
                }
                else {
                    firstValue = Float.parseFloat(tv_numbers.getText() + "");
                    btnDivActive = true;
                    tv_numbers.setText("");
                }
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                nextValue = Float.parseFloat(tv_numbers.getText() + "");
                if (btnPlusActive) {
                    tv_numbers.setText(firstValue + nextValue + "");
                    btnPlusActive = false;
                }
                if (btnMinusActive) {
                    tv_numbers.setText(firstValue - nextValue + "");
                    btnMinusActive = false;
                }
                if (btnMulActive) {
                    tv_numbers.setText(firstValue * nextValue + "");
                    btnMulActive = false;
                }
                if (btnDivActive) {
                    tv_numbers.setText(firstValue / nextValue + "");
                    btnDivActive = false;
                }
            }
        });


    }
}
