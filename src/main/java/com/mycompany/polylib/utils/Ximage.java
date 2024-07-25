/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polylib.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
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

    public static Image getAppIcon() {
        URL url = Ximage.class.getResource("D:\\polylib\\src\\main\\resources\\icon\\books(1).png");
        return new ImageIcon(url).getImage();
    }

    public static void save(File src) {
        File dst = new File("logos", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
//    getAppIcon(): Phương thức này lấy biểu tượng của ứng dụng từ tài nguyên (/com/edusys/icon/fpt.png) và trả về đối tượng Image đại diện cho biểu tượng đó.
//    save(File src): Phương thức này dường như sẽ lưu một tệp tin, nhưng nội dung chi tiết chưa được triển khai.
//    read(String fileName): Phương thức này đọc một tệp tin hình ảnh từ thư mục logos và trả về một đối tượng ImageIcon đại diện cho hình ảnh đó.
/* save: lưu một file vaò thư mục có tên là logo và lấy tên file
            người ta đưa vô,sau đó kiểm tra thư mục logo đó tồn tại hay chưa, nếu
            chưa thì tạo ra và chép cái file người ta đưa cho mình vô trong thư mục logo đó
     */
}
