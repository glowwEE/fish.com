/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author h p
 */
public class Calculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {
      case '+' -> {
          result = number1 + number2;
          System.out.println(number1 + " + " + number2 + " = " + result);
            }
      case '-' -> {
          result = number1 - number2;
          System.out.println(number1 + " - " + number2 + " = " + result);
            }
      case '*' -> {
          result = number1 * number2;
          System.out.println(number1 + " * " + number2 + " = " + result);
            }
      case '/' -> {
          result = number1 / number2;
          System.out.println(number1 + " / " + number2 + " = " + result);
            }

      default -> System.out.println("Invalid operator!");
    }
        // performs addition between numbers
        // performs subtraction between numbers
        // performs multiplication between numbers
        // performs division between numbers
                // TODO code application logic here
    }
    
}

        // TODO code application logic here
