/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.entity;

/**
 *
 * @author ngocquy
 */
public class PhieuMuonChiTiet {
    private Sach sach;
    private PhieuMuon phieuMuon;
    private String ghiChu;
    private int SoLuong;
    
    public String toString(){
        return sach.getMaSach() + "\n" + phieuMuon.getSoPhieuMuon() + "\n" + ghiChu + "\n" + SoLuong;
    }

    public PhieuMuonChiTiet() {
    }

    public PhieuMuonChiTiet(Sach sach, PhieuMuon phieuMuon, String ghiChu, int SoLuong) {
        this.sach = sach;
        this.phieuMuon = phieuMuon;
        this.ghiChu = ghiChu;
        this.SoLuong = SoLuong;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public PhieuMuon getPhieuMuon() {
        return phieuMuon;
    }

    public void setPhieuMuon(PhieuMuon phieuMuon) {
        this.phieuMuon = phieuMuon;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }



 
    
}
