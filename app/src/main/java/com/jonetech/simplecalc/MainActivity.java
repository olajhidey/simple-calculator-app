package com.jonetech.simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText firstOperand;
    private EditText secondOperand;
    private TextView resultText;
    public Calculate fCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fCalculate = new Calculate();

        firstOperand = (EditText) findViewById(R.id.first_operand);
        secondOperand = (EditText) findViewById(R.id.second_operand);
        resultText = (TextView) findViewById(R.id.results);
    }

    /**
     * Button addition Event Handler
     *
     * @param view
     */

    public void add(View view) {
        if (getOperandText(firstOperand).isEmpty() && getOperandText(secondOperand).isEmpty()) {
//            Toast.makeText(getApplicationContext(), "Text boxes can\'t be left empty", Toast.LENGTH_SHORT).show();
        } else {

            compute(Calculate.Operators.ADD);
        }
    }

    /**
     * Button subtract Event Handler
     *
     * @param view
     */

    public void subtract(View view) {
        if (getOperandText(firstOperand).isEmpty() && getOperandText(secondOperand).isEmpty()) {
//            Toast.makeText(getApplicationContext(), "Text boxes can\'t be left empty", Toast.LENGTH_SHORT).show();
        } else {

            compute(Calculate.Operators.SUBTRACT);
        }
    }

    /**
     * Button Divide Event Handler
     *
     * @param view
     */

    public void divide(View view) {
        if (getOperandText(firstOperand).isEmpty() && getOperandText(secondOperand).isEmpty()) {
//            Toast.makeText(getApplicationContext(), "Text boxes can\'t be left empty", Toast.LENGTH_SHORT).show();
        } else {

            compute(Calculate.Operators.DIVIDE);
        }
    }

    /**
     * Button Multiply Event Handler
     *
     * @param view
     */
    public void multiply(View view) {
        if (getOperandText(firstOperand).isEmpty() && getOperandText(secondOperand).isEmpty()) {
//            Toast.makeText(getApplicationContext(), "Text boxes can\'t be left empty", Toast.LENGTH_SHORT).show();
        } else {

            compute(Calculate.Operators.MULTIPLY);
        }
    }


    public void compute(Calculate.Operators operators) {

        try {
            double firstOperands = 0.0;
            double secondOperands = 0;

            try {
                firstOperands = getOperands(firstOperand);
                secondOperands = getOperands(secondOperand);

            } catch (NumberFormatException ex) {
                Log.e("NumberFormatException", ex.getMessage());
                resultText.setText(String.valueOf(0));
//            Toast.makeText(getApplicationContext(), "Computation Error", Toast.LENGTH_SHORT).show();
            }

            String results ;

            switch (operators) {

                case ADD:
                    results = String.valueOf(fCalculate.add(firstOperands, secondOperands));
                    break;
                case MULTIPLY:
                    results = String.valueOf(fCalculate.multiply(firstOperands, secondOperands));
                    break;
                case DIVIDE:
                    results = String.valueOf(fCalculate.divide(firstOperands, secondOperands));
                    break;
                case SUBTRACT:
                    results = String.valueOf(fCalculate.subtract(firstOperands, secondOperands));
                    break;
                default:
                    results = String.valueOf(0);
            }

            resultText.setText(results);

        } catch (Exception ex) {
            Log.e("MainActivity", ex.getMessage());
        }


    }

    /**
     * @param operand
     * @return the text available in an edit text
     */
    public static String getOperandText(EditText operand) {
        return operand.getText().toString();
    }

    /**
     * @param operand
     * @return the text gotten from the Edit Text to double
     */
    private static Double getOperands(EditText operand) {
        return Double.valueOf(operand.getText().toString());
    }
}
