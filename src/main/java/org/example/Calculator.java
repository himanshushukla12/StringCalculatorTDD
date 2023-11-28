package org.example;

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
        String[] number=numbers.split(DEFAULT_DELIMITER);

        return sum(number);
    }

    private int sum(String[] numbers) {
        int result=0;
        for(String number:numbers){
            result+=Integer.parseInt(number);
        }
        return result;
    }


}
