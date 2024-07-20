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
    private Sach Sach;
    private phieuMuon PhieuMuon;
    private String GhiChu;
    private int SoLuong;

    public PhieuMuonChiTiet() {
    }

    public Sach getSach() {
        return Sach;
    }

    public void setSach(Sach Sach) {
        this.Sach = Sach;
    }

    public phieuMuon getPhieuMuon() {
        return PhieuMuon;
    }

    public void setPhieuMuon(phieuMuon PhieuMuon) {
        this.PhieuMuon = PhieuMuon;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
