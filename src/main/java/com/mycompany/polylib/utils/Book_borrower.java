/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.utils;

import com.mycompany.polylib.entity.NguoiMuoi;

/**
 *
 * @author ngocquy
 */
public class Book_borrower {
     public static NguoiMuoi user = null;
//    /**
//     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
//     */

    public static void clear() {
        Book_borrower.user = null;
    }
//    /**
//     * Kiểm tra xem đăng nhập hay chưa
//     */

    public static boolean isbook_loan() {
        return Book_borrower.user != null;
    }
//     /**
//     * Kiểm tra xem có phải là trưởng phòng hay không
//     */

    public static String getBookNM() {
        return user.getMaNM();
    }
}
