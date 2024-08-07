/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

/**
 *
 * @author ngocquy
 */
import com.mycompany.polylib.dao.PolyLibDao;
import com.mycompany.polylib.entity.PhieuMuon;
import com.mycompany.polylib.entity.PhieuTra;
import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huynh
 */
public class PhieuTraDao extends PolyLibDao<PhieuTra, String>{
    final String INSERT_SQL = "INSERT INTO PHIEUTRA (SOPHIEUTRA, NGAYTRA, SOPHIEUMUON, TINHTRANGSACH, TIENPHAT)(?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE PHIEUTRA SET NGAYTRA=?,SOPHIEUMUON=?, TINHTRANGSACH=?, TIENPHAT=? WHERE SOPHIEUTRA=?";
    final String DELETE_SQL = "DELETE FROM PHIEUTRA WHERE SOPHIEUTRA=? ";
    final String SELECT_ALL_SQL = "SELECT * FROM PHIEUTRA";
    final String SELECT_BY_ID_SQL = "SELECT * FROM PHIEUTRA WHERE SOPHIEUTRA=?";

    @Override
    public void insert(PhieuTra entity) {
        XJdbc.update(INSERT_SQL, entity.getSoPhieuTra(), entity.getNgayTra(), entity.getPhieuMuon().getSoPhieuMuon(),entity.getTinhTrangSach(),entity.getTienPhat());
    }

    @Override
    public void update(PhieuTra entity) {
     XJdbc.update(UPDATE_SQL, entity.getNgayTra(), entity.getPhieuMuon().getSoPhieuMuon(),entity.getTinhTrangSach(),entity.getTienPhat(),entity.getSoPhieuTra());    }

    @Override
    public void delete(String id) {
        XJdbc.update(DELETE_SQL, id);
    }

    @Override
    public PhieuTra selectById(String id) {
        List<PhieuTra> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<PhieuTra> selectAll() {
         return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<PhieuTra> selectBySql(String sql, Object... args) {
         List<PhieuTra> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                PhieuTra entity = new PhieuTra();
                entity.setSoPhieuTra(rs.getString("SOPHIEUTRA"));
                entity.setNgayTra(rs.getDate("NgayTra"));
                PhieuMuon entitytow = new PhieuMuon();
                entitytow.setSoPhieuMuon(rs.getString("SoPhieuMuon"));
                entity.setPhieuMuon(entitytow);
                entity.setTinhTrangSach(rs.getString("TinhtrangSach"));
                entity.setTienPhat(rs.getDouble("TIENPHAT"));
                
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;

    }
}
