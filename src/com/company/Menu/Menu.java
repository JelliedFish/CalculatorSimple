package com.company.Menu;

import com.company.Calculator.Calculator;

import java.util.Scanner;

public class Menu {
    Calculator calculator;

    public void Cheking(){
        String s = " ";

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please, write the first value: ");
            String xValue = sc.next();


            System.out.println("Please, write the operand: ");
            String input = sc.next();

            //Push

            if (!input.equals("sin") && !input.equals("cos")) {
                System.out.println("Please, write the second value: ");
                String yValue = sc.next();
                Calculator calculator = new Calculator(Double.parseDouble(xValue),Double.parseDouble(yValue),input);
                Show(calculator);
            }
            else {
                String yValue = "1.0";
                Calculator calculator = new Calculator(Double.parseDouble(xValue),Double.parseDouble(yValue),input);
                Show(calculator);
            }


        }
    }



    private void Show(Calculator calculator){
         System.out.println("The answer is : "+calculator.getResult());
    }

}
