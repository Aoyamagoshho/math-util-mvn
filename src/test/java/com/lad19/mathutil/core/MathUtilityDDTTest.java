/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lad19.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityDDTTest {

    //ta tách bọ data kiểm thử ra khỏi các câu lệnh so sánh
    //kĩ thuật này gọi là DDT - Data Driven Testing
    //kiểm thử hàm, app mà tách riêng bộ data ra 1 chỗ để dễ kiểm 
    //soát sự thiếu đủ của các testcase, các test data
    //data test để riêng ra 1 chỗ, thường là mảng, hay file Excel
    //hoặc table
    //0! -> 1
    //1! -> 1
    //2! -> 2
    //3! -> 6
    //4! -> 24
    //5! -> 120
    //mảng 2 chiều
    
    public static Object[][] initData(){
        //int[] a = {phần tử của mảng 1 chiều cách nhau dấu phẩy 5, 10, 15};
        Object[][] testData = {{0,1},
                               {1, 1},
                               {2,2},
                               {3, 6},
                               {4, 24},
                               {5, 120}
                                //n expected
                               };
        return testData;
    }
    
    
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnsOk(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
