package com.tsystems.javaschool.tasks.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Stack;

public class Calculator {
    /**
     * Evaluate statement represented as string.
     *
     * @param statement mathematical statement containing digits, '.' (dot) as decimal mark,
     *                  parentheses, operations signs '+', '-', '*', '/'<br>
     *                  Example: <code>(1 + 38) * 4.5 - 1 / 2.</code>
     * @return string value containing result of evaluation or null if statement is invalid
     */

    public String evaluate(String statement) {
        try {
            statement = expToRPN(statement);
            if (statement == null || statement.equals("")) {
                return null;
            } else if (statement.contains("(")|| statement.contains(")")) {
                return null;
            }
            double calc = 0;
            String currentElement = "";
            Stack<Double> stack = new Stack<>();
            for (int i = 0; i < statement.length(); i++) {
                char currentChar = statement.charAt(i);
                if (currentChar == ' ') {
                    continue;
                }
                if (getPriority(currentChar) == 0 || currentChar == '.') { // if current element is number
                    currentElement += statement.charAt(i);                 // add to string
                    if (getPriority(statement.charAt(i + 1)) != 0          // if next element not number,
                            && statement.charAt(i + 1) != '.'
                            || statement.charAt(i + 1) == ' ') {
                        stack.push(Double.parseDouble(currentElement));    // add to stack
                        currentElement = "";
                    }
                }
                if (getPriority(currentChar) > 1) {                         // if current element is operator,
                    calc = calculate(stack.pop(), stack.pop(), currentChar);// calculate
                    stack.push(calc);                                       // and add result to stack
                }
            }
            return parse(calc);
        } catch (Exception e) {
            return null;
        }
    }

    private String expToRPN(String expression) {
        String string = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            int priority = getPriority(currentChar);
            switch (priority) {
                case 0:             // if number, add to string
                    string += currentChar;
                    break;
                case 1:             // if open bracket, add to stack
                    stack.push(currentChar);
                    break;
                case -1:
                    string += " ";  // if close bracket, add to string from stack
                    while (getPriority(stack.peek()) != 1) {    // all elements after open bracket
                        string += stack.peek();
                        stack.pop();
                    }
                    stack.pop();    // delete open bracket
                    break;
                default:            // if operator
                    string += " ";
                    while (!stack.empty()) {
                        if (getPriority(stack.peek()) >= priority) { // if we have elements with more priority,
                            string += stack.peek();                  // add them to string and delete from stack
                            stack.pop();
                        } else {
                            break;
                        }
                    }
                stack.push(currentChar);                             // and add new element to stack
            }
        }
        while (!stack.empty()) {
            string += stack.peek();
            stack.pop();
        }
        return string;
    }

    private String parse(double exp) {
        String result;
        if (exp % 1 == 0) {
            int a = (int) exp;
            result = String.valueOf(a);
        } else {
            exp = (double) Math.round (exp * 10000) / 10000;
            result = String.valueOf(exp);
        }
        return result;
    }

    private double calculate(double firstElement, double secondElement, char operator) throws Exception {
        double result = 0;
        switch (operator) {
            case '+':
                result = secondElement + firstElement;
                break;
            case '-':
                result = secondElement - firstElement;
                break;
            case '*':
                result = secondElement * firstElement ;
                break;
            case '/':
                if (firstElement == 0) {
                    throw new ArithmeticException();
                }
                result = secondElement / firstElement;
                break;
        }
        return result;
    }

    private int getPriority(char symbol) {
        switch (symbol) {
            case '(':
                return 1;
            case '+':
            case '-':
                return 2;
            case '/':
            case '*':
                return 3;
            case ')':
                return -1;
            default:
                return 0;
        }
    }
}
