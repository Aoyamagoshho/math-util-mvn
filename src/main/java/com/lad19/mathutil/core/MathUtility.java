/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lad19.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    public static final double PI = 3.14;
    
    public static long getFactorial (int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n, n must be 0.....20");
        
        if(n == 0 || n == 1)
            return 1;
        
        long result = 1;
        
        for(int i = 2; i <= n; i++)
            result *= i;
        
        return result;
    }
}
