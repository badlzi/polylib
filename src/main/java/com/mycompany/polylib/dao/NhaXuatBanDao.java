/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.entity.NhaXuatBan;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocquy
 */
public class NhaXuatBanDao extends PolyLibDao<NhaXuatBan,String> {
    final String INSERT_SQL = "INSERT INTO NHAXUATBAN(MANXB,TENNXB) VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE NHAXUATBAN SET TENNXB = ? WHERE MANXB=? ";
    final String DELETE_SQL = "DELETE FROM NHAXUATBAN WHERE MANXB=?";
    final String SELECT_ALL_SQL = "SELECT * FROM NHAXUATBAN";
    final String SELECT_BY_ID_SQL = "SELECT * FROM NHAXUATBAN WHERE MANXB = ?";
    @Override
    public void insert(NhaXuatBan entity) {
        XJdbc.update(INSERT_SQL, entity.getMaNhaXuatBan(),entity.getTenNhaXuatBan());
    }

    @Override
    public void update(NhaXuatBan entity) {
        XJdbc.update(UPDATE_SQL, entity.getTenNhaXuatBan(),entity.getMaNhaXuatBan());
    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public NhaXuatBan selectById(String id) {
        List<NhaXuatBan> list = selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhaXuatBan> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhaXuatBan> selectBySql(String sql, Object... args) {
         List<NhaXuatBan> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                NhaXuatBan entity = new NhaXuatBan();
                entity.setMaNhaXuatBan(rs.getString("MANXB"));
                entity.setTenNhaXuatBan(rs.getString("TENNXB"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
}
