package com.example.chris.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends Activity implements View.OnClickListener {

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal;
    EditText disp;
    double num1, num2;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        disp = (EditText) findViewById(R.id.display);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        cancel = (Button) findViewById(R.id.cancel);
        equal = (Button) findViewById(R.id.equal);
        try {
            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);
            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);
            zero.setOnClickListener(this);
            add.setOnClickListener(this);
            sub.setOnClickListener(this);
            mul.setOnClickListener(this);
            div.setOnClickListener(this);
            cancel.setOnClickListener(this);
            equal.setOnClickListener(this);
        } catch (Exception e) {
        }
    }

    public void operate() {
        if (operator.equals("+")) {
            num2 = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            num1 = num1 + num2;
            disp.setText(Double.toString(num1));
        } else if (operator.equals("-")) {
            num2 = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            num1 = num1 - num2;
            disp.setText(Double.toString(num1));
        } else if (operator.equals("*")) {
            num2 = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            num1 = num1 * num2;
            disp.setText(Double.toString(num1));
        } else if (operator.equals("/")) {
            num2 = Double.parseDouble(disp.getText().toString());
            disp.setText("");
            num1 = num1 / num2;
            disp.setText(Double.toString(num1));
        }
    }

    @Override
    public void onClick(View arg0) {
        Editable str = disp.getText();
        switch (arg0.getId()) {
            case R.id.one:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(one.getText());
                disp.setText(str);
                break;
            case R.id.two:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.three:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(three.getText());
                disp.setText(str);
                break;
            case R.id.four:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(four.getText());
                disp.setText(str);
                break;
            case R.id.five:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.six:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(six.getText());
                disp.setText(str);
                break;
            case R.id.seven:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(seven.getText());
                disp.setText(str);
                break;
            case R.id.eight:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(eight.getText());
                disp.setText(str);

                break;
            case R.id.nine:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(nine.getText());
                disp.setText(str);

            case R.id.zero:
                if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                }
                str = str.append(zero.getText());
                disp.setText(str);

                break;
            case R.id.cancel:
                num1 = 0;
                num2 = 0;
                disp.setText("");
                disp.setHint("Type a number here:");

                break;
            case R.id.add:
                operator = "+";
                if (num1 == 0) {
                    num1 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                } else {
                    num2 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    num1 = num1 + num2;
                    disp.setText(Double.toString(num1));
                }
                break;
            case R.id.sub:
                operator = "-";
                if (num1 == 0) {
                    num1 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                } else {
                    num2 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    num1 = num1 - num2;
                    disp.setText(Double.toString(num1));
                }
                break;
            case R.id.mul:
                operator = "*";
                if (num1 == 0) {
                    num1 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                } else {
                    num2 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    num1 = num1 * num2;
                    disp.setText(Double.toString(num1));
                }
                break;
            case R.id.div:
                operator = "/";
                if (num1 == 0) {
                    num1 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if (num2 != 0) {
                    num2 = 0;
                    disp.setText("");
                } else {
                    num2 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    num1 = num1 / num2;
                    disp.setText(Double.toString(num1));
                }
                break;
            case R.id.equal:
                if (!operator.equals(null)) {
                    if (num2 != 0) {
                        if (operator.equals("+")) {
                            disp.setText(Double.toString(num1));
                        } else if (operator.equals("-")) {
                            disp.setText(Double.toString(num1));
                        } else if (operator.equals("*")) {
                            disp.setText(Double.toString(num1));
                        } else if (operator.equals("/")) {
                            disp.setText("");/*
                            op1 = op1 / op2;*/
                            disp.setText(Double.toString(num1));
                        }
                    } else {
                        operate();
                    }
                }
                break;
        }
    }
}