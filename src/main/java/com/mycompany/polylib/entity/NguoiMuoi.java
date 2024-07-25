/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.entity;

import java.util.Date;

/**
 *
 * @author ngocquy
 */
public class NguoiMuoi {
       private String  MaNM;
       private String TenNM ;
       private boolean GioiTinh ;
       private Date NgaySinh;
       private String SoDienThoai ;
       private String Email ;

    public String getMaNM() {
        return MaNM;
    }

    public void setMaNM(String MaNM) {
        this.MaNM = MaNM;
    }

    public String getTenNM() {
        return TenNM;
    }

    public void setTenNM(String TenNM) {
        this.TenNM = TenNM;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public NguoiMuoi() {
        
    }
}
