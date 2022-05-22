package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static at.campus02.bsd.Calculator.*;

public class main {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("It is a info logger.");
        logger.error("It is an error logger.");

        Double number1 = 4.0;
        Double number2 = 3.0;

        System.out.printf("Calculator + Result: " + add(number1,number2) + "\n");
        logger.debug("Used add paramenters are: " + number1 + " " + number2);

        System.out.printf("Calculator - Result: " + minus(number1,number2) + "\n");
        logger.debug("Used minus paramenters are: " + number1 + " " + number2);

        System.out.printf("Calculator : Result: " + divide(number1,number2) + "\n");
        logger.debug("Used divide paramenters are: " + number1 + " " + number2);

        System.out.printf("Calculator * Result: " + multiply(number1,number2) + "\n");
        logger.debug("Used multiply paramenters are: " + number1 + " " + number2);

        System.out.printf("Calculator Faculty: " + faculty(number1));
        logger.debug("Used faculty paramenter is: " + number1);

    }

}
