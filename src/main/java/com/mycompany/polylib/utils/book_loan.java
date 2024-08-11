/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.utils;

import com.mycompany.polylib.entity.PhieuMuon;
import java.util.Date;

/**
 *
 * @author ngocquy
 */
public class book_loan {

    public static PhieuMuon user = null;
//    /**
//     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
//     */

    public static void clear() {
       book_loan.user = null;
    }
//    /**
//     * Kiểm tra xem đăng nhập hay chưa
//     */

    public static boolean isbook_loan() {
        return book_loan.user != null;
    }
//     /**
//     * Kiểm tra xem có phải là trưởng phòng hay không
//     */

    public static String getBookNM() {
        return user.getNguoiMuon().getMaNM();
    }

    public static Date getBookNgayM() {
        return user.getNgayMuon();
    }

    public static Date getBookNgayt() {
        return user.getNgayTra();
    }
}
