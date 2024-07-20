/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.entity.NguoiMuoi;
import com.mycompany.polylib.entity.NhanVien;
import com.mycompany.polylib.entity.phieuMuon;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocquy
 */
public class PhieuMuonDao extends PolyLibDao<phieuMuon, String> {

    final String INSERT_SQL = "INSERT INTO PHIEUMUON( SOPHIEUMUON,NGAYMUON,NGAYTRA,MANV,MANM) VALUES(?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE PHIEUMUON SET NGAYMUON=?, NGAYTRA=?, MANV=?, MANM=? WHERE SOPHIEUMUON=?";
    final String DELETE_SQL = "DELETE FROM PHIEUMUON WHERE SOPHIEUMUON=?";
    final String SELECT_ALL_SQL = "SELECT * FROM PHIEUMUON";
    final String SELECT_BY_ID_SQL = "SELECT * FROM PHIEUMUON WHERE SOPHIEUMUON = ?";

    @Override
    public void insert(phieuMuon entity) {
        XJdbc.update(INSERT_SQL, entity.getSoPhieuMuon(), entity.getNgayMuon(), entity.getNgayTra(), entity.getNhanVien().getMaNhanVien(), entity.getNguoiMuon().getMaNM());
    }

    @Override
    public void update(phieuMuon entity) {
        XJdbc.update(UPDATE_SQL, entity.getNgayMuon(), entity.getNgayTra(), entity.getNhanVien().getMaNhanVien(), entity.getNguoiMuon().getMaNM(), entity.getSoPhieuMuon());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public phieuMuon selectById(String id) {
        List<phieuMuon> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<phieuMuon> selectAll() {
         return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<phieuMuon> selectBySql(String sql, Object... args) {
         List<phieuMuon> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                phieuMuon entity = new phieuMuon();
                entity.setSoPhieuMuon(rs.getString("SOPHIEUMUON"));
                entity.setNgayMuon(rs.getString("NGAYMUON"));
                entity.setNgayTra(rs.getString("NGAYTRA"));
                NhanVien childentity = new NhanVien();
                childentity.setMaNhanVien(rs.getString("MaNV"));
                NguoiMuoi childentitytow = new NguoiMuoi();
                childentitytow.setMaNM(rs.getString("MANXB"));
                entity.setNhanVien(childentity);
                entity.setNguoiMuon(childentitytow);
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;

    }

}
