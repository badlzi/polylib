/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.utils;

import com.mycompany.polylib.entity.Sach;

/**
 *
 * @author ngocquy
 */
public class Book {
    public static Sach user = null;
//    /**
//     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
//     */
    public static void clear() {
        Book.user = null;
    }
//    /**
//     * Kiểm tra xem đăng nhập hay chưa
//     */
    public static boolean isBook() {
        return Book.user != null;
    }
//     /**
//     * Kiểm tra xem có phải là trưởng phòng hay không
//     */
    
    public static String getBookname() {
        return user.getTenSach();
    }
    
}
