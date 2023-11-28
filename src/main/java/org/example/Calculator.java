package org.example;

public class Calculator {
    public int add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        if(numbers.length()==1){
            if(numbers.matches(".*[^a-zA-Z0-9].*")){
                throw new IllegalArgumentException("Invalid input: Single hyphen is not allowed");
            }
        }
        return 0;
    }
}
