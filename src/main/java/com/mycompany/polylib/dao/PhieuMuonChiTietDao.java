/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.entity.NguoiMuoi;
import com.mycompany.polylib.entity.NhanVien;
import com.mycompany.polylib.entity.PhieuMuonChiTiet;
import com.mycompany.polylib.entity.Sach;
import com.mycompany.polylib.entity.PhieuMuon;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocquy
 */
public class PhieuMuonChiTietDao extends PolyLibDao<PhieuMuonChiTiet, String> {

    final String INSERT_SQL = "INSERT INTO PHIEUMUONCHITIET( MASACH,SOPHIEUMUON,GHICHU,SOLUONG) VALUES(?,?,?,?)";
    final String UPDATE_SQL = "UPDATE PHIEUMUONCHITIET SET GHICHU=?, SOLUONG=? WHERE SOPHIEUMUON=? and MASACH=?";
    final String DELETE_SQL = "DELETE FROM PHIEUMUONCHITIET WHERE SOPHIEUMUON=? and MASACH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM PHIEUMUONCHITIET";
    final String SELECT_BY_ID_SQL = "SELECT * FROM PHIEUMUONCHITIET  a INNER JOIN PHIEUMUON b ON a.SoPhieuMuon = b.SoPhieuMuon WHERE a.SOPHIEUMUON=? and MASACH=?";
    final String SELECT_ALL_PM_PMCT = "SELECT * FROM PHIEUMUONCHITIET a INNER JOIN PHIEUMUON b ON a.SoPhieuMuon = b.SoPhieuMuon";

    @Override
    public void insert(PhieuMuonChiTiet entity) {
        XJdbc.update(INSERT_SQL, entity.getSach().getMaSach(), entity.getPhieuMuon().getSoPhieuMuon(), entity.getGhiChu(), entity.getSoLuong());
    }

    @Override
    public void update(PhieuMuonChiTiet entity) {
        XJdbc.update(UPDATE_SQL, entity.getGhiChu(), entity.getSoLuong(), entity.getPhieuMuon().getSoPhieuMuon(), entity.getSach().getMaSach());
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public PhieuMuonChiTiet selectByMS_MPM(String id, String idtwo) {
        List<PhieuMuonChiTiet> list = this.selectBySql(SELECT_BY_ID_SQL, id, idtwo);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<PhieuMuonChiTiet> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<PhieuMuonChiTiet> selectBySql(String sql, Object... args) {
        List<PhieuMuonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                PhieuMuonChiTiet entity = new PhieuMuonChiTiet();
                Sach childentity = new Sach();
                childentity.setMaSach(rs.getString("MASACH"));
                PhieuMuon entitytow = new PhieuMuon();
                entity.setSach(childentity);
                
                entitytow.setSoPhieuMuon(rs.getString("SOPHIEUMUON"));
                entitytow.setNgayMuon(rs.getDate("NgayMuon"));
                entitytow.setNgayTra(rs.getDate("NgayTra"));

                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNV"));
                entitytow.setNhanVien(nv);

                NguoiMuoi nm = new NguoiMuoi();
                nm.setMaNM(rs.getString("MaNM"));
                entitytow.setNguoiMuon(nm);

                entitytow.setNhanVien(nv);
                entity.setSach(childentity);
                entity.setPhieuMuon(entitytow);
                entity.setGhiChu(rs.getString("GHICHU"));
                entity.setSoLuong(rs.getInt("SOLUONG"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<PhieuMuonChiTiet> selectPM_PMCT() {
        return selectBySql(SELECT_ALL_PM_PMCT);
    }

    @Override
    public PhieuMuonChiTiet selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
