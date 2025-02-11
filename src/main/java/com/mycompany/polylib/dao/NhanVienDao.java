/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.entity.NhanVien;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocquy
 * 
 */
public class NhanVienDao extends PolyLibDao<NhanVien, String>{
      public void insert(NhanVien model){
        String sql="INSERT INTO NhanVien (MANV , TENNV, TAIKHOAN, MATKHAU,CHUCVU, SODIENTHOAI, EMAIL) VALUES (?, ?, ?, ? ,?, ?,?)";
        XJdbc.update(sql, 
                model.getMaNhanVien(),
                model.getTenNhanVien(),
                model.getTaiKhoan(),
                model.getMatKhau(),
                model.isChucVu(),
                model.getSDT(),
                model.getEmail()
        );
    }

    @Override
    public void update(NhanVien model) {
            String sql="UPDATE NHANVIEN SET TENNV=?, TAIKHOAN=?, MATKHAU=?, CHUCVU=?, SODIENTHOAI=?, EMAIL=? WHERE MANV=?";
        XJdbc.update(sql,
                model.getTenNhanVien(),
                model.getTaiKhoan(),
                model.getMatKhau(), 
                model.isChucVu(),
                model.getSDT(),
                model.getEmail(),
                model.getMaNhanVien()
        );
    }
    
    public void updatepassword(NhanVien model) {
            String sql="UPDATE NHANVIEN SET MATKHAU=? WHERE MANV=?";
        XJdbc.update(sql,
                model.getMatKhau(), 
                model.getMaNhanVien()
        );
    }
        public void forgotpassword(NhanVien model) {
            String sql="UPDATE NHANVIEN SET MATKHAU=? WHERE EMAIL=?";
        XJdbc.update(sql,
                model.getMatKhau(), 
                model.getEmail()
        );
    }
         public NhanVien selectByemail(String email) {
        String sql="SELECT * FROM NhanVien WHERE EMAIL=?";
        List<NhanVien> list = this.selectBySql(sql, email);
        return list.size() > 0 ? list.get(0) : null;
    }


    @Override
    public void delete(String MaNV) {
        String sql="DELETE FROM NhanVien WHERE MaNV=?";
        XJdbc.update(sql, MaNV);
    }

    @Override
    public NhanVien selectById(String manv) {
        String sql="SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NhanVien> selectAll() {
        String sql="SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
         List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    NhanVien entity = new NhanVien();
                    entity.setMaNhanVien(rs.getString("MaNV"));
                    entity.setTenNhanVien(rs.getString("TENNV"));
                    entity.setTaiKhoan(rs.getString("TAIKHOAN"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setChucVu(rs.getBoolean("CHUCVU"));
                    entity.setSDT(rs.getString("SODIENTHOAI"));
                    entity.setEmail(rs.getString("EMAIL"));
                    list.add(entity);
                }
            } 
            finally{
                if(rs != null)
                    rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    }
