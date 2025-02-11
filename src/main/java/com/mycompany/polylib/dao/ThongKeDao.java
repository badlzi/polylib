/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.dao;

import com.mycompany.polylib.utils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocquy
 */
public class ThongKeDao {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list=new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i=0; i<cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
     public List<Object[]> getSoLuongPhieuMuon(Integer thang){
        String sql = "{CALL sp_SoluongPhieuMuon (?)}"; // 
        String[] cols = {"soluongphieumuon"};
        return this.getListOfArray(sql, cols, thang);
    }
     
        public List<Object[]> getSoLuongNguoiMuon(Integer thang){
        String sql = "{CALL sp_SoluongNguoiMuon (?)}"; // 
        String[] cols = {"SoluongNguoiMuon"};
        return this.getListOfArray(sql, cols, thang);
    }
    
    
    public List<Object[]> getLuongNguoiHoc(){
        String sql = "{CALL sp_ThongKeNguoiHoc}"; // 
        String[] cols = {"Nam", "SoLuong", "DauTien", "CuoiCung"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDiemChuyenDe(){
        String sql = "{CALL sp_ThongKeDiem}";
        String[] cols = {"ChuyenDe", "SoHV", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getDoanhThu(int nam){
        String sql = "{CALL sp_ThongKeDoanhThu (?)}"; //
        String[] cols = {"ChuyenDe", "SoKH", "SoHV",  "DoanhThu", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(sql, cols, nam);
    }

}
