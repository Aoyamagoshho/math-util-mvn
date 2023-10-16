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
    
    
    
    //5! = 1.2.3.4.5
    //5! = 4! X 5 = 5 X 4!
    //4! = 1.2.3.4
    //4! = 3!.4 = 4.3!
    //3! = 3 X 2!
    //2! = 2 X 1! - DỪNG LẠI
    //N! = N X (N-1)! -> CTHUC ĐỆ QUY XUẤT HIỆN
    //ĐỆ QUY - RECURSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    
    public static long getFactorial (int n){//N!
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n, n must be 0.....20");
        
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n-1);
        
        //tối ưu code, thay ruột của hàm để chạy ngon hơn
        //nhanh hơn, hoặc code viết đẹp hơn
        //hoặc fix bug thì phải sửa code
        //DÙ BẠN SỬA CODE VÌ LÝ DO GÌ, THÌ CODE PHẢI ĐC TEST LẠI
        //VÀ TEST LẠI ĐỂ ĐẢM BẢO RẰNG NÓ VẪN XANH NHƯ LẦN TRƯỚC
        //NẾU TA VIẾT CODE ĐI KÈM TEST SCRIPT THÌ VIỆC TEST LẠI CÁI HÀM SẼ CỰC NHANH, KO CẦN DÙNG MẮT ĐỂ DÒ TỪNG DÒNG LỆNH
        //ĐÚNG SAI, MÀ CHỈ NHÌN MÀU XANH LÀ ĐỦ - VÌ HÀM TRẢ VỀ NHƯ EXPECTED
        //TEST LẠI NHỮNG GÌ ĐÃ TỪNG TEST -> REGRESSION TEST
        //                              KIỂM THỬ HỒI QUY
        //KIỂM THỬ LẠI HÀM LÚC NÀY CỰC NHANH, VÌ GITHUB ACTIONS LO GIÙM
        //TA CHỈ CẦN MÀU XANH, HOẶC NHẬN EMAIL CHỬI VÌ CODE ĐỎ
        
        
    }
//    public static long getFactorial (int n){
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n, n must be 0.....20");
//        
//        if(n == 0 || n == 1)
//            return 1;
//        
//        long result = 1;
//        
//        for(int i = 2; i <= n; i++)
//            result *= i;
//        
//        return result;
//    }
}
