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
}
