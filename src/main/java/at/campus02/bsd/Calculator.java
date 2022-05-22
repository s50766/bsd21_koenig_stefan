package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();

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

        if (number2 == 0){
            logger.error("Divide by zero.");

        }


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
