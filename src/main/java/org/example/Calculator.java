package org.example;

import java.util.regex.Pattern;

public class Calculator {
    private static final String DEFAULT_DELIMITER ="[,\\n]";
    public int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }else if(numbers.length()==1){
            if(numbers.matches(".*[^a-zA-Z0-9].*")){
                throw new IllegalArgumentException("Invalid input: Single hyphen is not allowed");
            }
            else if(numbers.matches(".*\\d.*")){
                return Integer.parseInt(numbers);
            }
        }
        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            String customDelimiter = Character.toString(numbers.charAt(2));
            String numbersPart = numbers.substring(4);
            return sum(splitNumbers(numbersPart, Pattern.quote(customDelimiter)));
        } else {
            // Use the default delimiter
            return sum(splitNumbers(numbers, DEFAULT_DELIMITER));
        }
    }
    private String[] splitNumbers(String numbers, String delimiter) {
        // Trim each number to handle spaces
        String[] numList = numbers.split(delimiter);
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i].trim();
        }
        return numList;
    }
    private int sum(String[] numbers) {
        int result=0;
        StringBuilder negatives = new StringBuilder();

        for (String num : numbers) {
            int n = Integer.parseInt(num);
            if (n < 0) {
                negatives.append(n);
            } else if (n <= 1000) {
                // Ignore numbers greater than 1000
                result += n;
            }
        }


        return result;
    }
}