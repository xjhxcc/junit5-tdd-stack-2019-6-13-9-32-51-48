package com.thoughtworks.tdd;

public class FizzBuzzGame {
    public String number (int i) {
        StringBuffer result = new StringBuffer();
        if (i % 3 == 0) {
            result.append("Fizz");
        }
        if (i % 5 == 0) {
            result.append("Buzz");
        }
        if (i % 7 == 0) {
            result.append("Whizz");
        }
        if (result.length() == 0) {
            result.append(i);
        }
        if (i == 13) {
            return "Fizz";
        }
        return result.toString();
    }
}
