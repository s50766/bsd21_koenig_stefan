# Calculator with args by Stefan König
## A Java program from this semester.

### This semester we made a simple calculator that gets the numbers and the operators via args.

## How to install this program?
First you have to download and unzip the folder. Then just open it in your IDE and open the java file in the src folder.

## How is this project used?
It uses java to calculate the numbers and operators.
````
        double number1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double number2 = Double.parseDouble(args[2]);
        double result;
````
This code shows how each variable will be filled from the args array.
Then a simple if and else if construct calculates and if needed throws an exception.
````
        if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")){
            result = number1 / number2;
        } else if (operator.equals("+")){
            result = number1 + number2;
        } else if (operator.equals("-")){
            result = number1 - number2;
        } else {
            throw new java.lang.Error("Error - arguments must be of type NUMBER1 {'*'|'/'|'+'|'-'} NUMBER2");
        }
        System.out.println(number1 + operator + number2 + " = " + result);
    }
````

I made this as an exercise nad of course the code shown above can be edited, but it should work fine.

Down here i will post my exercise links.

[Exercise 1](exercise1.md)

[Exercise 2](exercise2.md)

[Exercise 3](exercise3.md)


Here are also links to my github and to the website of Campus02.

[Github](https://github.com/s50766)

[Campus02](https://www.campus02.at/)
