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
public class PhieuMuon {
    private String SoPhieuMuon;
    private Date NgayMuon;
    private Date NgayTra;
    private NguoiMuoi NguoiMuon;
    private NhanVien NhanVien;

    public PhieuMuon() {
    }

    public PhieuMuon(String SoPhieuMuon, Date NgayMuon, Date NgayTra, NguoiMuoi NguoiMuon, NhanVien NhanVien) {
        this.SoPhieuMuon = SoPhieuMuon;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
        this.NguoiMuon = NguoiMuon;
        this.NhanVien = NhanVien;
    }

    public String getSoPhieuMuon() {
        return SoPhieuMuon;
    }

    public void setSoPhieuMuon(String SoPhieuMuon) {
        this.SoPhieuMuon = SoPhieuMuon;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
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

    
}
