/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.entity.ViTri;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocquy
 */
public class ViTriDao extends PolyLibDao<ViTri,String> {
    final String INSERT_SQL = "INSERT INTO VITRI(MAVT,VITRIDATSACH) VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE VITRI SET TVITRIDATSACH = ? WHERE MAVT=? ";
    final String DELETE_SQL = "DELETE FROM VITRI WHERE MAVT=?";
    final String SELECT_ALL_SQL = "SELECT * FROM VITRI";
    final String SELECT_BY_ID_SQL = "SELECT * FROM VITRI WHERE MAVT = ?";
    
    @Override
    public void insert(ViTri entity) {
        XJdbc.update(INSERT_SQL, entity.getMaViTri(),entity.getViTriDatSach());
    }

    @Override
    public void update(ViTri entity) {
       XJdbc.update(UPDATE_SQL, entity.getViTriDatSach(),entity.getMaViTri());
    }

    @Override
    public void delete(String vitri) {
        XJdbc.update(DELETE_SQL, vitri);
    }

    @Override
    public ViTri selectById(String id) {
        List<ViTri> list = selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ViTri> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<ViTri> selectBySql(String sql, Object... args) {
         List<ViTri> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                ViTri entity = new ViTri();
                entity.setMaViTri(rs.getString("MAVT"));
                entity.setViTriDatSach(rs.getString("VITRIDATSACH"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    }
    
