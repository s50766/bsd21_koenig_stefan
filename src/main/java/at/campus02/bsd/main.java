package at.campus02.bsd;

import static at.campus02.bsd.Calculator.*;

public class main {

    public static void main(String[] args) {
        Double number1 = 4.0;
        Double number2 = 3.0;

        System.out.printf("Calculator + Result: " + add(number1,number2) + "\n");
        System.out.printf("Calculator - Result: " + minus(number1,number2) + "\n");
        System.out.printf("Calculator : Result: " + divide(number1,number2) + "\n");
        System.out.printf("Calculator * Result: " + multiply(number1,number2) + "\n");
        System.out.printf("Calculator Faculty: " + faculty(number1));


    }

}
