/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.utils;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class Ximage {
//     /**
//     * Ảnh biểu tượng của ứng dụng, xuất hiện trên mọi cửa sổ
//     */
    public static Image getAppIcon(){
        String file = "/com/edusys/icon/fpt.png";
        return new ImageIcon(Ximage.class.getResource(file)).getImage();
    }
    
//    /**
//     * Sao chép file logo chuyên đề vào thư mục logo
//     * @param src là đối tượng file ảnh
//     */   
    public static void save(File src){
        File dst = new File("logos", src.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } 
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
//    /**
//     * Sao chép file excel danh sach nguoi học vào folder storeFiles
//     * @param src là đối tượng file excel
//     */   
    public static File saveExel(File src){
        File dst = new File("storeFiles", src.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            return dst;
        } 
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
//    /**
//     * Đọc hình ảnh logo chuyên đề
//     * @param fileName  là tên file logo
//     * @return ảnh đọc được
//     */   
    public static ImageIcon read(String fileName){
        File path = new File("src\\main\\resources\\img", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
