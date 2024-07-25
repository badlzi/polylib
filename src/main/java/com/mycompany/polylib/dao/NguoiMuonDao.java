/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.entity.NguoiMuoi;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocquy
 */
public class NguoiMuonDao extends PolyLibDao<NguoiMuoi, String> {

    final String INSERT_SQL = "INSERT INTO NGUOIMUON(MANM,TENNM,GIOITINH,NGAYSINH,SODIENTHOAI,EMAIL) VALUES(?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE NGUOIMUON SET TENNM=?, GIOITINH=?, NGAYSINH=?, SODIENTHOAI=?, EMAIL=? WHERE MANM=?";
    final String DELETE_SQL = "DELETE FROM NGUOIMUON WHERE MANM=?";
    final String SELECT_ALL_SQL = "SELECT * FROM NGUOIMUON";
    final String SELECT_BY_ID_SQL = "SELECT * FROM NGUOIMUON WHERE MANM = ?";

    @Override
    public void insert(NguoiMuoi entity) {
        XJdbc.update(INSERT_SQL, entity.getMaNM(), entity.getTenNM(), entity.isGioiTinh(), entity.getNgaySinh(), entity.getSoDienThoai(), entity.getEmail());
    }

    @Override
    public void update(NguoiMuoi entity) {
        XJdbc.update(UPDATE_SQL, entity.getMaNM(), entity.getTenNM(), entity.isGioiTinh(), entity.getNgaySinh(), entity.getSoDienThoai(), entity.getEmail());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public NguoiMuoi selectById(String id) {
        List<NguoiMuoi> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiMuoi> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NguoiMuoi> selectBySql(String sql, Object... args) {
        List<NguoiMuoi> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                NguoiMuoi entity = new NguoiMuoi();
                entity.setMaNM(rs.getString("MANM"));
                entity.setTenNM(rs.getString("TENNM"));
                entity.setGioiTinh(rs.getBoolean("GIOITINH"));
                entity.setNgaySinh(rs.getString("NGAYSINH"));
                entity.setSoDienThoai(rs.getString("SODIENTHOAI"));
                entity.setEmail(rs.getString("EMAIL"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
