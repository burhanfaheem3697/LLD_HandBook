package com.handbook.math;

/**
 * InternalCalculator
 */
class InternalCalculator {

    int add(int a,int b){
        return a + b;
    }

    int sub(int a,int b){
        return a - b;
    }

    int mul(int a,int b){
        return a * b;
    }

    int div(int a,int b){
        if(b == 0){
            throw new IllegalArgumentException("division by zero!!!");
        }

        return a / b;
    }
}