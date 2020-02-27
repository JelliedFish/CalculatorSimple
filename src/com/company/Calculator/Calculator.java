package com.company.Calculator;

public class Calculator {
    private double xValue ;
    private double yValue;
    private String input;
    private String Result;


    public String getResult() {
        return Result;
    }

    public Calculator(double xValue, double yValue, String input) {
        this.xValue = xValue;
        this.yValue = yValue;
        this.input = input;

            this.Result = String.valueOf(Calculate(input));
        }


    private double Calculate( String input) {

        switch (input) {

            case ("+"):
                return Plus(xValue,yValue);

            case ("-"):
                return Minus(xValue,yValue);

            case ("*"):
                return Multiply(xValue,yValue);

            case ("/"):
                return Divide(xValue,yValue);

            case ("^"):
                return Power(xValue,yValue);

            case ("sin"):
                return Sin(xValue);

            case ("cos"):
                return Cos(xValue);


            default:
                System.out.print("Incorrect input... Please choose : {+,-,*,/,%,^} \n");
                break;

        }
        return -1;

    }

    public static double Plus ( double xValue, double yValue ) {
        return xValue + yValue;
    }

    public static double Minus( double xValue, double yValue ) {
        return xValue - yValue;
    }

    public static double Multiply (double xValue, double yValue) {
        return xValue*yValue;
    }

    public static double Divide (double xValue, double yValue) {
        return xValue/yValue;
    }

    public static double Percent (double xValue, double yValue) {
        return xValue%yValue;
    }


    public  static double Power (double xValue, double yValue) {
        return Math.pow(xValue, yValue);
    }

    public  static double Sin (double xValue) {
        return Math.sin(xValue);
    }

    public  static double Cos (double xValue) {
        return Math.cos(xValue);
    }



}
