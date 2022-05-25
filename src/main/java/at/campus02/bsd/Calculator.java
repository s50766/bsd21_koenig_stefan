package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is the Calculator.java class and here are all the methods written.
 *
 *
 * @author Stefan König
 *
 */
public class Calculator {

    /**
     * New logger object for the maven logger plugin
     */
    private static Logger logger = LogManager.getLogger();

    /**
     *
     * This Method makes an addition of two variables.
     *
     * @param  number1   A Double Value given as a variable
     * @param  number1   A Double Value given as a variable
     * @return      the result of the addition
     */
    public static double add(double number1, double number2){
        Double result = 0.0;


        result = number1 + number2;

        return result;
    }

    /**
     *
     * This Method makes an substraction of two variables.
     *
     * @param  number1   A Double Value given as a variable
     * @param  number1   A Double Value given as a variable
     * @return      the result of the substraction
     */
    public static double minus(double number1, double number2){
        Double result = 0.0;

        result = number1 - number2;

        return result;
    }

    /**
     *
     * This Method makes a division of two variables.
     *
     * @param  number1   A Double Value given as a variable
     * @param  number1   A Double Value given as a variable
     * @return      the result of the division
     */
    public static double divide(double number1, double number2){
        Double result = 0.0;

        result = number1 / number2;

        if (number2 == 0){
            logger.error("Divide by zero.");

        }


        return result;
    }

    /**
     *
     * This Method makes an multiplication of two variables.
     *
     * @param  number1   A Double Value given as a variable
     * @param  number1   A Double Value given as a variable
     * @return      the result of the multiplication
     */
    public static double multiply(double number1, double number2){
        Double result = 0.0;

        result = number1 * number2;

        return result;
    }

    /**
     *
     * This Method computes the faculty of two variables.
     *
     * @param  number1   A Double Value given as a variable
     * @param  number1   A Double Value given as a variable
     * @return      the result of the addition
     */
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
