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

    public static double faculty(double number1){
        double number = number1, i = 1;
        double factorial = 1;
        if (number > 0){
        while(i <= number)
        {
            factorial *= i;
            i++;
        }
        return factorial;
        } else
        return 0;
    }


}
