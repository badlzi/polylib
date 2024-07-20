/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.entity;

/**
 *
 * @author ngocquy
 */
public class phieuMuon {
    private String SoPhieuMuon;
    private String NgayMuon;
    private String NgayTra;
    private NguoiMuoi NguoiMuon;
    private NhanVien NhanVien;

    public String getSoPhieuMuon() {
        return SoPhieuMuon;
    }

    public void setSoPhieuMuon(String SoPhieuMuon) {
        this.SoPhieuMuon = SoPhieuMuon;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public String getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(String NgayTra) {
        this.NgayTra = NgayTra;
    }

    public NguoiMuoi getNguoiMuon() {
        return NguoiMuon;
    }

    public void setNguoiMuon(NguoiMuoi NguoiMuon) {
        this.NguoiMuon = NguoiMuon;
    }

    public NhanVien getNhanVien() {
        return NhanVien;
    }

    public void setNhanVien(NhanVien NhanVien) {
        this.NhanVien = NhanVien;
    }

    public phieuMuon() {
    }
}
