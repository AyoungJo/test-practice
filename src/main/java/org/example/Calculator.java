package org.example;

public class Calculator {
    public static int calculate(int operand1, String operator, int oprand2) {

        if ("+".equals(operator)) {
            return operand1 + oprand2;
        }else if("-".equals((operator))){
            return operand1 - oprand2;
        }else if("*".equals((operator))){
            return operand1 * oprand2;
        }else if("/".equals((operator))){
            return operand1 / oprand2;
        }

        return 0;
    }
}
