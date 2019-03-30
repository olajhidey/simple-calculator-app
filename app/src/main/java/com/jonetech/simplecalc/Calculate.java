package com.jonetech.simplecalc;

public class Calculate {

    public enum Operators {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    /**
     * Addition operation
     *
     * @param firstOperand
     * @param secondOperand
     * @return
     */

    public double add(double firstOperand, double secondOperand) {
        double result = firstOperand + secondOperand;
        return result;
    }

    /**
     * Subtraction operation
     *
     * @param firstOperand
     * @param secondOperand
     * @return
     */

    public double subtract(double firstOperand, double secondOperand) {
        double result = firstOperand - secondOperand;
        return result;
    }

    /**
     * Multiply operation
     *
     * @param firstOperand
     * @param secondOperand
     * @return
     */

    public double multiply(double firstOperand, double secondOperand) {
        double result = firstOperand * secondOperand;
        return result;
    }

    /**
     * Division operation
     *
     * @param firstOperand
     * @param secondOperand
     * @return
     */
    public double divide(double firstOperand, double secondOperand) {
        double result = firstOperand / secondOperand;
        return result;
    }


}
