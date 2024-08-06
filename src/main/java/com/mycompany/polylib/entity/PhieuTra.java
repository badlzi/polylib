/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.entity;

import java.util.Date;

/**
 *
 * @author huynh
 */
public class PhieuTra {

    private String SoPhieuTra;
    private Date NgayTra;
    private PhieuMuon phieuMuon;
    private String TinhTrangSach;
    private Double TienPhat;

    public PhieuTra() {
    }

    public PhieuMuon getPhieuMuon() {
        return phieuMuon;
    }

    public void setPhieuMuon(PhieuMuon phieuMuon) {
        this.phieuMuon = phieuMuon;
    }


    public String getSoPhieuTra() {
        return SoPhieuTra;
    }

    public void setSoPhieuTra(String SoPhieuTra) {
        this.SoPhieuTra = SoPhieuTra;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getTinhTrangSach() {
        return TinhTrangSach;
    }

    public void setTinhTrangSach(String TinhTrangSach) {
        this.TinhTrangSach = TinhTrangSach;
    }

    public Double getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(Double TienPhat) {
        this.TienPhat = TienPhat;
    }
}
