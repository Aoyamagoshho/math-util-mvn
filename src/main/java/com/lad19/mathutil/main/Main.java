/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.lad19.mathutil.main;

import com.lad19.mathutil.core.MathUtility;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // test case %1 - xem chi tiet mo ta o duoi (case n = 0 | 0!)
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        
        //so sánh giữa expected = actual hay ko?
        System.out.println("0! --> expected = " + expected + " | actual= " + actual);
        
        //cách 1: kiểm thử = sức người :mắt nhìn, não nghĩ
        
        //test case #2 - mô tả ở dưới
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! --> expected = " + expected + " | actual= " + actual);
        
        //test case #3 - mô tả ở dưới, dùng n = 5
        System.out.println("5! --> expected = 120" + " | actual= " + MathUtility.getFactorial(5));

    }
    
    //TEST CASE #2: Check getFactorial(with n = 1)
    //STEPS/PROCEDURES:
    //              1. given n = 1:
    //              2. call/invoke getFactorial(n = 1)
    
    //EXPECTED RESULT
    //                  the method returns 1 (standing for 1! = 1)
    
    
    //TEST CASE #3: Check getFactorial(with n = 5)
    //STEPS/PROCEDURES:
    //              1. given n = 5:
    //              2. call/invoke getFactorial(n = 5)
    
    //EXPECTED RESULT
    //                  the method returns 120 (standing for 5! = 120)
    
    
    // DEV phải test code của mình
        //Cách 1: in kết quả xử lý ra màn hình
        
        //Nhắc lại: công việc của QC bao gồm
        //thiết kế test case, run test code, ghi lại bug nếu có
        //          test case, test run             log bug --> Jira, Bugzilla
        //test case: nói ra bạn sẽ test app thế nào
        //bằng cách đưa vào data, giá trị kì vọng, cách dùng app với bộ data đó
        //Lát rồi run thử app xem sao !! -> TEST RUN
        
        //ĐỀ THI PE LUÔN Ở ĐÂY !!! THIẾT KẾ TEST CASE
        //TA THIẾT KẾ TEST CASE ĐỂ TEST HÀM TÍNH GIAI THỪA
        //TEST CODE THÌ ĐƯỢC GỌI LÀ UNIT TEST
        //TEST CASE CHO UNIT TEST THÌ GỌI LÀ UNIT TEST CASE
        
        //TEST CASE #1: Check getFactorial() with n = 0
        //STEPS/PROCEDURES:
        //          1. Given n = 0
        //          2. Invoke/call getFactorial(n = 0)
        
        //EXPECTED RESULT: the method return 1 stands for 0! = 1
        //Status         : passed/failed? --> lúc chạy hàm mới biết kết quả
        //                                    gọi là test run, có thể test đi test lại nhiều lần
}
