package edu.byui.calculator5;

import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {


    //buttons for numbers
    public MaterialButton button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button0, buttonAdd, buttonMinus, buttonDivide, buttonMultiply,
            buttonEqual, buttonDot, buttonAC, buttonPercentage, buttonInt;

    TextView textField;

    public String currentNum = "";
    public String currentOperation = null;
    public String leftValue = "";
    public String rightValue = "";
    public double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // make a view/layout
        textField = findViewById(R.id.textView);
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
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonMinus = findViewById(R.id.buttonSub);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonAC = findViewById(R.id.buttonAC);
        buttonPercentage = findViewById(R.id.buttonPercent);
        buttonDot = findViewById(R.id.buttonDot);
        buttonInt = findViewById(R.id.buttonInt);
        buttonEqual = findViewById(R.id.buttonEqual);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                if (textField.getText() == "0") {
                    textField.setText("1");
                    currentNum = "1";
                }
                else {
                        currentNum = currentNum + "1";
                        textField.setText(currentNum);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("2");
                    currentNum = "2";
                }
                else {
                    currentNum = currentNum + "2";
                    textField.setText(currentNum);
                }
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("3");
                    currentNum = "3";
                }
                else {
                    currentNum = currentNum + "3";
                    textField.setText(currentNum);
                }
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("4");
                    currentNum = "4";
                }
                else {
                    currentNum = currentNum + "4";
                    textField.setText(currentNum);
                }
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("5");
                    currentNum = "5";
                }
                else {
                    currentNum = currentNum + "5";
                    textField.setText(currentNum);
                }
            }

        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("6");
                    currentNum = "6";
                }
                else {
                    currentNum = currentNum + "6";
                    textField.setText(currentNum);
                }
            }

        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("7");
                    currentNum = "7";
                }
                else {
                    currentNum = currentNum + "7";
                    textField.setText(currentNum);
                }
            }

        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("8");
                    currentNum = "8";
                }
                else {
                    currentNum = currentNum + "8";
                    textField.setText(currentNum);
                }
            }

        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("9");
                    currentNum = "9";
                }
                else {
                    currentNum = currentNum + "9";
                    textField.setText(currentNum);
                }
            }

        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("");
                    currentNum = "0";
                }
                else {
                    currentNum = currentNum + "0";
                    textField.setText(currentNum);
                }
            }

        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText(".");
                }
                else {
                    textField.setText(textField.getText() + ".");
                }
            }

        });

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                currentNum = "";
                currentOperation = null;
                leftValue = "";
                rightValue = "";
                textField.setText("0");
            }

        });

        buttonPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                textField.setText(String.valueOf((parseDouble((String) textField.getText()) * 0.01)));
            }
        });


        buttonInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                // String addResult = textField.getText() + "+";
                currentNum = String.valueOf(Integer.parseInt((String) textField.getText()) * - 1);
                textField.setText(currentNum);

            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                operationClicked("+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                operationClicked("-");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                operationClicked("+");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                operationClicked("*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                operationClicked("/");
            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                operationClicked("=");
            }
        });
    }

    private void operationClicked(String operator) {
        if (currentOperation != null) {
            if (currentNum != "") {
                rightValue = currentNum;
                currentNum = "";

                if (currentOperation == "+") {
                    result = parseDouble(leftValue) + parseDouble(rightValue);
                }

                if (currentOperation == "-") {
                    result = parseDouble(leftValue) - parseDouble(rightValue);
                }

                if (currentOperation == "*") {
                    result = parseDouble(leftValue) * parseDouble(rightValue);
                }

                if (currentOperation == "/") {
                    result = parseDouble(leftValue) / parseDouble(rightValue);
                }

                textField.setText(String.valueOf(result));
                leftValue = String.valueOf(result);

            }
        } else {
            leftValue = currentNum;
            currentNum = "";
        }

        currentOperation = operator;
    }

}

