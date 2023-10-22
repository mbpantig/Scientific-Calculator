package com.example.scical;

import static com.example.scical.R.id.allDeleteButton;
import static com.example.scical.R.id.squareButton;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.annotation.SuppressLint;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button piButton, factorialButton, logButton, expButton, pointButton, sqreButton, tanButton, clearButton, cosButton, sinButton, squareRootButton, addButton, minusButton, multiplyButton, divideButton, openParenButton, closeParenButton, allDeleteButton,
            oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton, equalsButton;

    TextView inputField, answerField;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        piButton = findViewById(R.id.piButton);
        factorialButton = findViewById(R.id.factorialButton);
        logButton = findViewById(R.id.logButton);
        pointButton = findViewById(R.id.pointButton);
        sqreButton = findViewById(R.id.squareButton);
        tanButton = findViewById(R.id.tanButton);
        clearButton = findViewById(R.id.clearButton);
        cosButton = findViewById(R.id.cosButton);
        sinButton = findViewById(R.id.sinButton);
        squareRootButton = findViewById(R.id.squareRootButton);
        addButton = findViewById(R.id.addButton);
        minusButton = findViewById(R.id.minusButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        openParenButton = findViewById(R.id.openParenButton);
        closeParenButton = findViewById(R.id.closeParenButton);
        allDeleteButton = findViewById(R.id.allDeleteButton);
        oneButton = findViewById(R.id.oneButton);
        twoButton = findViewById(R.id.twoButton);
        threeButton = findViewById(R.id.threeButton);
        fourButton = findViewById(R.id.fourButton);
        fiveButton = findViewById(R.id.fiveButton);
        sixButton = findViewById(R.id.sixButton);
        sevenButton = findViewById(R.id.sevenButton);
        eightButton = findViewById(R.id.eightButton);
        nineButton = findViewById(R.id.nineButton);
        zeroButton = findViewById(R.id.zeroButton);
        equalsButton = findViewById(R.id.equalsButton);

        inputField = findViewById(R.id.inputField);
        answerField = findViewById(R.id.answerField);

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "1");
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "2");
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "3");
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "4");
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "5");
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "6");
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "7");
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "8");
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "9");
            }
        });
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "0");
            }
        });
        pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + ".");
            }
        });
        allDeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText("");
                answerField.setText("");
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = inputField.getText().toString();
                val = val.substring(0, val.length() - 1);
                inputField.setText(val);
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "+");
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "-");
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "×");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "÷");
            }
        });
        squareRootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = inputField.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                answerField.setText(String.valueOf(r));
            }
        });
        piButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val = inputField.getText().toString();
                double r = Math.PI;
                inputField.setText(inputField.getText()+String.valueOf(r));

            }
        });
        openParenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + "(");
            }
        });
        closeParenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + ")");
            }
        });
        sinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText()+"sin");
            }
        });
        cosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText()+"cos");
            }
        });
        tanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText()+"tan");
            }
        });
        closeParenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText() + ")");
            }
        });
        sqreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(inputField.getText().toString());
                double square = d*d;
                answerField.setText(String.valueOf(square));
                inputField.setText(d+"²");
            }
        });
        factorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(inputField.getText().toString());
                int fact = factorial(val);
                answerField.setText(String.valueOf(fact));
                inputField.setText(val+"!");
            }
        });
        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputField.setText(inputField.getText().toString()+"log");
            }
        });
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = inputField.getText().toString();
                String replacedString = val.replace('÷','/').replace('×', '*');
                double result = eval(replacedString);
                String r = String.valueOf(result);
                answerField.setText(r);
                inputField.setText(val);
            }
        });
    }

    int factorial(int n)
    {

        // find factorial
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);

    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

    @Override
    public void onClick(View view) {

    }
}