/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.entity.Sach;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocquy
 */
public class SachDao extends PolyLibDao<Sach, String> {

    final String INSERT_SQL = "INSERT INTO SACH (MASACH,TENSACH,SOTRANG,SOLUONGBANSAO,NGAYNHAPKHO,GHICHU,TRANGTHAI,HINH,MATG,MALOAISACH,MANXB,MAVT) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE SACH SET TENSACH=?, SOTRANG=?, SOLUONGBANSAO=?, NGAYNHAPKHO=?, GHICHU=?, TRANGTHAI=?, HINH=?, MATG=?, MALOAISACH=?, MANXB=?, MAVT=? WHERE MASACH=?";
    final String DELETE_SQL = "DELETE FROM SACH WHERE MASACH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM SACH";
    final String SELECT_BY_ID_SQL = "SELECT * FROM SACH WHERE MASACH=?";

    @Override
    public void insert(Sach entity) {
        XJdbc.update(INSERT_SQL, entity.getMaSach(), entity.getTenSach(), entity.getSoTrang(), entity.getSoLuong(), entity.getNgayNhapKho(),
                entity.getGhiChu(), entity.getTrangThai(), entity.getHinh(), entity.getTacGia(), entity.getLoaiSach(), entity.getNhaXuatBan(), entity.getViTri());
    }

    @Override
    public void update(Sach entity) {
        XJdbc.update(UPDATE_SQL, entity.getTenSach(), entity.getSoTrang(), entity.getSoLuong(), entity.getNgayNhapKho(), entity.getGhiChu(),
                entity.getTrangThai(), entity.getHinh(), entity.getTacGia(), entity.getLoaiSach(), entity.getNhaXuatBan(), entity.getViTri(), entity.getMaSach());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public Sach selectById(String id) {
        List<Sach> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Sach> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<Sach> selectBySql(String sql, Object... args) {
        List<Sach> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Sach entity = new Sach();
                entity.setMaSach(rs.getString("MASACH"));
                entity.setTenSach(rs.getString("TENSACH"));
                entity.setSoTrang(rs.getInt("SOTRANG"));
                entity.setSoLuong(rs.getInt("SOLUONG"));
                entity.setGhiChu(rs.getString("GHICHU"));
                entity.setHinh(rs.getString("HINH"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
