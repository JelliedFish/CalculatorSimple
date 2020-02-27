package com.company.Calculator;

import com.company.Menu.Menu;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void setUp () throws Exception {
        calculator = new Calculator(2,2,"+");
    }


    @Test
    public void CheckCalculate(){
        String result = calculator.getResult();
        String exxpected =  "4";

        Assert.assertEquals(result,exxpected);
    }

    @Test
    public void CheckPlus(){

        double expected = 4 + 4;

        double result = Calculator.Plus(4,4);

        Assert.assertEquals(expected,result,4);
    }

    @Test
    public void CheckMinus(){


        double expected = 5 - 4;

        double result = Calculator.Minus(5,4);

        Assert.assertEquals(expected,result,4);
    }

    @Test
    public void CheckMultiply(){

        double expected = 4 * 4;

        double result = Calculator.Multiply(4,4);

        Assert.assertEquals(expected,result,4);
    }

    @Test
    public void CheckDivide(){


        double expected = 10 / 4;

        double result = Calculator.Divide(10,4);

        Assert.assertEquals(expected,result,4);
    }

    @Test
    public void CheckPercent(){


        double expected = 4 % 4;

        double result = Calculator.Percent(4,4);

        Assert.assertEquals(expected,result,4);
    }

    @Test
    public void CheckPower(){


        double expected =Math.pow(2,5);

        double result = Calculator.Plus(2,45);

        Assert.assertEquals(expected,result,4);
    }

}