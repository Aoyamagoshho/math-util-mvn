/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lad19.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
    
    //TEST CASE TEMPLATE/STRUCTURE
    //ID | DESC | STEP/PROCEDURES | EXPECTED RESULT | STATUS (PASSED/FAILED)
    
    //TEST CASE #1: Verify the getfactorial() function with n = 0
    //Steps/Procedures:
    //          1. Given n = 0
    //          2. Call/Invoke getFactorial(int n)
    //Expected Result
    //          The method getFactorial(n = 0) must return 1
    //                          as the result of 0! == 1
    //STATUS: PASSED | FAILED ĐOÁN XEM KHI CHẠY APP/HÀM/METHOD
    @Test // dính dáng đến thuật ngữ framework
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //TEST CASE #2....n = 1
    @Test // dính dáng đến thuật ngữ framework
    public void verifyFactorialGivenRightArgument1ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    //TEST CASE #3 .... n = 6
    @Test // dính dáng đến thuật ngữ framework
    public void verifyFactorialGivenRightArgument6ReturnsOk(){
        assertEquals(720, MathUtility.getFactorial(6));
    }
    
}
