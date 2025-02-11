/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.utils;

import com.mycompany.polylib.entity.NhanVien;

/**
 *
 * @author ngocquy
 */
public class Auth {
     public static NhanVien user = null;
//    /**
//     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
//     */
    public static void clear() {
        Auth.user = null;
    }
//    /**
//     * Kiểm tra xem đăng nhập hay chưa
//     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
//     /**
//     * Kiểm tra xem có phải là trưởng phòng hay không
//     */
    public static boolean isManager() {
        return Auth.isLogin() && user.isChucVu();
    }
    public static String getManagername() {
        if(Auth.isLogin()){
        return user.getTenNhanVien();
        }
         return null;
    }
      public static String getManagercode() {
        if(Auth.isLogin()){
        return user.getMaNhanVien();
        }
         return null;
    }
          public static String getManagerpassword(){
        if(Auth.isLogin()){
        return user.getMatKhau();
        }
         return null;
    }
      
    
}
