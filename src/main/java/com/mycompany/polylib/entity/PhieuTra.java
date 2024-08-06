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
   private String SophieuMuon ;
   private String TinhTrangSach ;
   private Double  TienPhat;

    public PhieuTra() {
    }

    public PhieuTra(String SoPhieuTra, Date NgayTra, String SophieuMuon, String TinhTrangSach, Double TienPhat) {
        this.SoPhieuTra = SoPhieuTra;
        this.NgayTra = NgayTra;
        this.SophieuMuon = SophieuMuon;
        this.TinhTrangSach = TinhTrangSach;
        this.TienPhat = TienPhat;
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

    public String getSophieuMuon() {
        return SophieuMuon;
    }

    public void setSophieuMuon(String SophieuMuon) {
        this.SophieuMuon = SophieuMuon;
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

