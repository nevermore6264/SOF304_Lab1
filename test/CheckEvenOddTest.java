import com.fpoly.CheckEvenOdd;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenOddTest {

    @org.junit.Test
    public void checkEvenOdd() {
    }

    private CheckEvenOdd checkEvenOdd;

    @Before
    public void setUp() {
        checkEvenOdd = new CheckEvenOdd();
    }

    //check 0
    @Test
    public void enterValueIs0() {
        boolean check = checkEvenOdd.check("0");
        assertEquals(check, true);
    }

    //check 1
    @Test
    public void enterValueIsNegative1() {
        boolean check = checkEvenOdd.check("1");
        assertEquals(check, false);
    }

    //check -1
    @Test
    public void enterValueIs1() {
        boolean check = checkEvenOdd.check("1");
        assertEquals(check, false);
    }

    //check 2
    @Test
    public void enterValueIs2() {
        boolean check = checkEvenOdd.check("2");
        assertEquals(check, true);
    }

    //check null
    @Test
    public void enterValueIsNull() {
        boolean check = checkEvenOdd.check(null);
        assertEquals(check, false);
    }

    //check ""
    @Test
    public void enterValueIsSpace() {
        boolean check = checkEvenOdd.check("     ");
        assertEquals(check, false);
    }

    //check #$!!#&!(#&
    @Test
    public void enterValueIsSpecialCharacter() {
        boolean check = checkEvenOdd.check("!@#$%^&");
        assertEquals(check, false);
    }

    //check double
    @Test
    public void enterValueIsDoubleValue() {
        boolean check = checkEvenOdd.check("6.5");
        assertEquals(check, false);
    }

    //check double
    @Test
    public void enterValueIsBoolean() {
        boolean check = checkEvenOdd.check("true");
        assertEquals(check, false);
    }

    //check max value of interger
    @Test
    public void enterValueIsMaxValueInteger() {
        Integer number = Integer.MAX_VALUE;
        boolean check = checkEvenOdd.check(String.valueOf(number));
        assertEquals(check, false);
    }

    //check max value of interger + 1
    @Test
    public void enterValueIsMaxValueIntegerPlus1() {
        long number = Integer.MAX_VALUE + 1;
        boolean check = checkEvenOdd.check(String.valueOf(number));
        assertEquals(check, false);
    }

    //check double max value of interger
    @Test
    public void enterValueIsPlusDoubleMaxValueInteger() {
        long number = Integer.MAX_VALUE * 2;
        boolean check = checkEvenOdd.check(String.valueOf(number));
        assertEquals(check, false);
    }

    //check double max value of interger
    @Test
    public void enterValueIsMaxValueLong() {
        long number = Long.MAX_VALUE;
        boolean check = checkEvenOdd.check(String.valueOf(number));
        assertEquals(check, false);
    }

    //check max value of interger - 1
    @Test
    public void enterValueIsMaxValueIntegerExpect1() {
        long number = Integer.MAX_VALUE - 1;
        boolean check = checkEvenOdd.check(String.valueOf(number));
        assertEquals(check, true);
    }

    //check min value of integer
    @Test
    public void enterValueIsMinValueInteger() {
        Integer number = Integer.MIN_VALUE;
        boolean check = checkEvenOdd.check(String.valueOf(number));
        assertEquals(check, false);
    }

    //check min value of integer - 1
    @Test
    public void enterValueIsMinValueIntegerExpect1() {
        Integer number = Integer.MIN_VALUE - 1;
        boolean check = checkEvenOdd.check(String.valueOf(number));
        assertEquals(check, false);
    }
}