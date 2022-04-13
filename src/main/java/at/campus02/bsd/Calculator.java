package at.campus02.bsd;

public class Calculator {


    public static double add(double number1, double number2){
        Double result = 0.0;

        result = number1 + number2;

        return result;
    }

    public static double minus(double number1, double number2){
        Double result = 0.0;

        result = number1 - number2;

        return result;
    }

    public static double divide(double number1, double number2){
        Double result = 0.0;

        result = number1 / number2;

        return result;
    }

    public static double multiply(double number1, double number2){
        Double result = 0.0;

        result = number1 * number2;

        return result;
    }

    public static void main(String[] args) {
        Double number1 = 4.0;
        Double number2 = 3.0;

        System.out.printf("Calculator Result: " + add(number1,number2));
        System.out.printf("Calculator Result: " + minus(number1,number2));
        System.out.printf("Calculator Result: " + divide(number1,number2));
        System.out.printf("Calculator Result: " + multiply(number1,number2));


    }


}
