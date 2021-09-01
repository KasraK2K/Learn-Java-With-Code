package com.kevin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpretion {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("vin$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Kvin");
        boolean isFind = matcher.find();

        System.out.println(isFind);
    }

}
