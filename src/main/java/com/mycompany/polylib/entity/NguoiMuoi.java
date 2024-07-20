/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.entity;

/**
 *
 * @author ngocquy
 */
public class NguoiMuoi {
       private String  MaNM;
       private String TenNM ;
       private boolean GioiTinh ;
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

    public String getSODIENTHOAI() {
        return SoDienThoai;
    }

    public void setSODIENTHOAI(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getEMAIL() {
        return Email;
    }

    public void setEMAIL(String Email) {
        this.Email = Email;
    }

    public NguoiMuoi() {
    }
}
