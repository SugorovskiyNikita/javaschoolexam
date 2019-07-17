package com.tsystems.javaschool.tasks.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test
    public void evaluate() {
        //given
        String input = "2+3";
        String expectedResult = "5";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate1() {
        //given
        String input = "4-6";
        String expectedResult = "-2";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate2() {
        //given
        String input = "2*3";
        String expectedResult = "6";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate3() {
        //given
        String input = "12/3";
        String expectedResult = "4";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate4() {
        //given
        String input = "2+3*4";
        String expectedResult = "14";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate5() {
        //given
        String input = "10/2-7+3*4";
        String expectedResult = "10";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate6() {
        //given
        String input = "10/(2-7+3)*4";
        String expectedResult = "-20";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate7() {
        //given
        String input = "22/3*3.0480";
        String expectedResult = "22.352";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate8() {
        //given
        String input = "22/4*2.159";
        String expectedResult = "11.8745";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate9() {
        //given
        String input = "22/4*2,159";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate10() {
        //given
        String input = "- 12)1//(";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate11() {
        //given
        String input = "10/(5-5)";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate12() {
        //given
        String input = null;
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate13() {
        //given
        String input = "(12*(5-1)";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate14() {
        //given
        String input = "";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate15() {
        //given
        String input = "5+41..1-6";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate16() {
        //given
        String input = "5++41-6";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate17() {
        //given
        String input = "5--41-6";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate18() {
        //given
        String input = "5**41-6";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate19() {
        //given
        String input = "5//41-6";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate20() {
        //given
        String input = "(20-6)+9)";
        String expectedResult = null;

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate21() {
        //given
        String input = "3-(30*2-(12 + 2.5)+8.8)";
        String expectedResult = "-51.3";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate22() {
        //given
        String input = "100/3";
        String expectedResult = "33.3333";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate23() {
        //given
        String input = "(1+38)*4-5";
        String expectedResult = "151";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate24() {
        //given
        String input = "7*6/2+8";
        String expectedResult = "29";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate25() {
        //given
        String input = "10212356/100000";
        String expectedResult = "102.1236";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate26() {
        //given
        String input = "11/4";
        String expectedResult = "2.75";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void evaluate27() {
        //given
        String input = "100/41";
        String expectedResult = "2.439";

        //run
        String result = calc.evaluate(input);

        //assert
        Assert.assertEquals(expectedResult, result);
    }
}