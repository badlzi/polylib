/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.entity.LoaiSach;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocquy
 */
public class LoaiSachDao extends PolyLibDao<LoaiSach,String> {
    final String INSERT_SQL = "INSERT INTO LOAISACH(MALOAISACH,TENLOAISACH) VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE LOAISACH SET TENLOAISACH = ? WHERE MALOAISACH=? ";
    final String DELETE_SQL = "DELETE FROM LOAISACH WHERE MALOAISACH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM LOAISACH";
    final String SELECT_BY_ID_SQL = "SELECT * FROM LOAISACH WHERE MALOAISACH = ?";

    @Override
    public void insert(LoaiSach entity) {
        XJdbc.update(INSERT_SQL, entity.getMaloaiSach(),entity.getTenloaiSach());
    }

    @Override
    public void update(LoaiSach entity) {
        XJdbc.update(UPDATE_SQL, entity.getTenloaiSach(),entity.getMaloaiSach());
    }

    @Override
    public void delete(String name) {
      XJdbc.update(DELETE_SQL, name);
    }

    @Override
    public LoaiSach selectById(String id) {
        List<LoaiSach> list = selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LoaiSach> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LoaiSach> selectBySql(String sql, Object... args) {
         List<LoaiSach> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                LoaiSach entity = new LoaiSach();
                entity.setMaloaiSach(rs.getString("MALOAISACH"));
                entity.setTenloaiSach(rs.getString("TENLOAISACH"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    }

