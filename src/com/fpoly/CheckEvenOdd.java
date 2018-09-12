package com.fpoly;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEvenOdd {
    private static Pattern pattern = Pattern.compile("^[0-9]*$");

    public boolean check(String number) {
        if (number == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches() == true) {
            Long value = Long.valueOf(number);
            if (value % 2 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CheckEvenOdd checkEvenOdd = new CheckEvenOdd();
        int value = (int) (Math.pow(2,32)-1);
        System.out.println(checkEvenOdd.check(String.valueOf(value)));
        System.out.println(value);
        System.out.println(Integer.MAX_VALUE);
        long a = Long.MAX_VALUE;
    }
}
