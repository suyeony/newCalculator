package edu.byui.calculator5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //buttons for numbers
    Button button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button0, buttonAdd, buttonMinus, buttonDivide, buttonMultiply,
            buttonEqual, buttonDot, buttonAC, buttonPercentage, buttonInt;

    TextView textField;

    public String left = "";
    public String operation = "";

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

        //button1.setOnClickListener(new view.onClickLis);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                if (textField.getText() == "0") {
                    textField.setText("1");
                }
                else {
                    textField.setText(textField.getText() + "1");
                }

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("2");
                }
                else if (operation != null) {
                    textField.setText("2");
                }
                else {
                    textField.setText(textField.getText() + "2");
                }
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("3");
                }
                else {
                    textField.setText(textField.getText() + "3");
                }
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("4");
                }
                else {
                    textField.setText(textField.getText() + "4");
                }
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("5");
                }
                else {
                    textField.setText(textField.getText() + "5");
                }
            }

        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("6");
                }
                else {
                    textField.setText(textField.getText() + "6");
                }
            }

        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("7");
                }
                else {
                    textField.setText(textField.getText() + "7");
                }
            }

        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("8");
                }
                else {
                    textField.setText(textField.getText() + "8");
                }
            }

        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("9");
                }
                else {
                    textField.setText(textField.getText() + "9");
                }
            }

        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                if (textField.getText() == "0") {
                    textField.setText("");
                }
                else {
                    textField.setText(textField.getText() + "0");
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

                textField.setText("0");
            }

        });

        buttonPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button

                textField.setText(String.valueOf((Double.parseDouble((String) textField.getText()) * 0.01)));
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                // String addResult = textField.getText() + "+";

                if (textField.getText() == null) {
                    textField.setText(textField.getText() + "");
                } else {
                    left = (String) textField.getText();
                    operation = "+";
                    textField.setText(textField.getText());
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                // String addResult = textField.getText() + "+";

                if (textField.getText() == null) {
                    textField.setText(textField.getText() + "");
                } else {
                    left = (String) textField.getText();
                    operation = "-";
                    textField.setText(textField.getText());
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button


                if (textField.getText() == null) {
                    textField.setText(textField.getText() + "");
                } else {
                    left = (String) textField.getText();
                    operation = "*";
                    textField.setText(textField.getText());
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                if (textField.getText() == null) {
                    textField.setText(textField.getText() + "");
                } else {
                    left = (String) textField.getText();
                    operation = "/";
                    textField.setText(textField.getText());
                }
            }
        });

        buttonInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                // String addResult = textField.getText() + "+";

                textField.setText((String.valueOf(Integer.parseInt((String) textField.getText()) * - 1)));

            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // executes on main thread after user presses button
                // String addResult = textField.getText() + "+";

                if (textField.getText() == null) {
                    textField.setText(textField.getText() + "");
                } else {
                    left += operation + textField.getText();
                    textField.setText(String.valueOf(Integer.parseInt(left)));
                }
            }
        });


    }
}

