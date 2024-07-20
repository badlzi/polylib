/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.entity.TacGia;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huynh
 */
public class TacGiaDao extends PolyLibDao<TacGia,String>{
    final String INSERT_SQL = "INSERT INTO TACGIA(MATG,TENTG) VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE TACGIA SET TENTG = ? WHERE MATG=? ";
    final String DELETE_SQL = "DELETE FROM TACGIA WHERE MATG=?";
    final String SELECT_ALL_SQL = "SELECT * FROM TACGIA";
    final String SELECT_BY_ID_SQL = "SELECT * FROM TACGIA WHERE MATG = ?";
    
    @Override
    public void insert(TacGia entity) {
        XJdbc.update(INSERT_SQL, entity.getMaTacGia(),entity.getTenTacGia());
    }

    @Override
    public void update(TacGia entity) {
        XJdbc.update(UPDATE_SQL, entity.getTenTacGia(),entity.getMaTacGia());
    }

    @Override
    public void delete(String name) {
        XJdbc.update(DELETE_SQL, name);
    }

    @Override
    public List<TacGia> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    public TacGia selectById(String id) {
        List<TacGia> list = selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<TacGia> selectBySql(String sql, Object... args) {
        List<TacGia> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                TacGia entity = new TacGia();
                entity.setMaTacGia(rs.getString("MATG"));
                entity.setTenTacGia(rs.getString("TENTG"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }



}
