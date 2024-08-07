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

    final String INSERT_SQL = "INSERT INTO SACH (MASACH,TENSACH,SOTRANG,SOLUONGBANSAO,GHICHU,HINH,MATG,MALOAISACH,MANXB,MAVT) VALUES (?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE SACH SET TENSACH=?, SOTRANG=?, SOLUONGBANSAO=?,GHICHU=?, HINH=?, MATG=?, MALOAISACH=?, MANXB=?, MAVT=? WHERE MASACH=?";
    final String DELETE_SQL = "DELETE FROM SACH WHERE MASACH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM SACH";
    final String SELECT_BY_ID_SQL = "SELECT * FROM SACH WHERE MASACH=?";

    @Override
    public void insert(Sach entity) {
        XJdbc.update(INSERT_SQL, entity.getMaSach(), entity.getTenSach(), entity.getSoTrang(), entity.getSoLuong(),
                entity.getGhiChu(), entity.getHinh(), entity.getTacGia(), entity.getLoaiSach(), entity.getNhaXuatBan(), entity.getViTri());
    }

    @Override
    public void update(Sach entity) {
        XJdbc.update(UPDATE_SQL, entity.getTenSach(), entity.getSoTrang(), entity.getSoLuong(), entity.getGhiChu(),
                 entity.getHinh(), entity.getTacGia(), entity.getLoaiSach(), entity.getNhaXuatBan(), entity.getViTri(), entity.getMaSach());
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
                 entity.setHinh(rs.getString("HINH"));
                entity.setSoTrang(rs.getInt("SOTRANG"));
                entity.setSoLuong(rs.getInt("SOLUONGBANSAO"));
                entity.setGhiChu(rs.getString("GHICHU"));
               
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
   public List<Sach> selectByMaSach(String maSach) {
    String sql = "SELECT * FROM SACH WHERE MASACH LIKE ?";
    return this.selectBySql(sql, "%" + maSach + "%");
}

public List<Sach> selectByTenSach(String tenSach) {
    String sql = "SELECT * FROM SACH WHERE TENSACH LIKE ?";
    return this.selectBySql(sql, "%" + tenSach + "%");
}

public List<Sach> selectBySoTrang(int soTrang) {
    String sql = "SELECT * FROM SACH WHERE SOTRANG = ?";
    return this.selectBySql(sql, soTrang);
}

public List<Sach> selectBySoLuotBanSao(int soLuotBanSao) {
    String sql = "SELECT * FROM SACH WHERE SOLUONGBANSAO = ?";
    return this.selectBySql(sql, soLuotBanSao);
}

public List<Sach> selectByGhiChu(String ghiChu) {
    String sql = "SELECT * FROM SACH WHERE GHICHU LIKE ?";
    return this.selectBySql(sql, "%" + ghiChu + "%");
}

public List<Sach> selectByHinh(String hinh) {
    String sql = "SELECT * FROM SACH WHERE HINH LIKE ?";
    return this.selectBySql(sql, "%" + hinh + "%");
}

public List<Sach> selectByMatg(String matg) {
    String sql = "SELECT * FROM SACH WHERE MATG LIKE ?";
    return this.selectBySql(sql, "%" + matg + "%");
}

public List<Sach> selectByMaLoaiSach(String maLoaiSach) {
    String sql = "SELECT * FROM SACH WHERE MALOAISACH LIKE ?";
    return this.selectBySql(sql, "%" + maLoaiSach + "%");
}

public List<Sach> selectByMaNXB(String maNXB) {
    String sql = "SELECT * FROM SACH WHERE MANXB LIKE ?";
    return this.selectBySql(sql, "%" + maNXB + "%");
}

public List<Sach> selectByMAVT(String mavt) {
    String sql = "SELECT * FROM SACH WHERE MAVT LIKE ?";
    return this.selectBySql(sql, "%" + mavt + "%");
}

}
