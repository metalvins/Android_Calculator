package com.example.vineshthakur_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

enum Oper {
    NONE,
    ADD,
    SUB,
    MUL,
    DIV
}

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    Button buttonE, buttonM, buttonD, buttonA, buttonS, buttonDot, buttonAC;
    EditText result;
    Float val1, val2;
    Oper operator = Oper.NONE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonE = findViewById(R.id.buttonE);
        buttonM = findViewById(R.id.buttonM);
        buttonD = findViewById(R.id.buttonD);
        buttonA = findViewById(R.id.buttonA);
        buttonS = findViewById(R.id.buttonS);
        buttonDot = findViewById(R.id.buttonDot);
        buttonAC = findViewById(R.id.buttonAC);
        result = findViewById(R.id.result);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!result.getText().toString().contains(".")) {
                    result.setText(result.getText() + ".");
                }
            }
        });
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result != null) {
                    operator = Oper.ADD;
                    val1 = Float.parseFloat(result.getText() + "");
                    result.setText(null);
                }
            }
        });
        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result != null) {
                    operator = Oper.SUB;
                    val1 = Float.parseFloat(result.getText() + "");
                    result.setText(null);
                }
            }
        });
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result != null) {
                    operator = Oper.MUL;
                    val1 = Float.parseFloat(result.getText() + "");
                    result.setText(null);
                }
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result != null) {
                    operator = Oper.DIV;
                    val1 = Float.parseFloat(result.getText() + "");
                    result.setText(null);
                }
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(result.getText() + "");
                switch(operator) {
                    case ADD:
                        result.setText((val1 + val2 + ""));
                        break;
                    case SUB:
                        result.setText((val1 - val2 + ""));
                        break;
                    case MUL:
                        result.setText((val1 * val2 + ""));
                        break;
                    case DIV:
                        result.setText((val1 / val2 + ""));
                        break;
                    case NONE:
                        break;
                }
                operator = Oper.NONE;
            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
    }
}