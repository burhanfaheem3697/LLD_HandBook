package com.example.Calculator;

import java.util.Arrays;

/**
 * LegacyCalculator
 */
class LegacyCalculator {

    int calculateSum(String csvNumbers){
        if(csvNumbers == null || csvNumbers.trim().isEmpty()){
            return 0;
        }


        return Arrays.stream(csvNumbers.split(",")).map(String::trim).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
    }
    
}