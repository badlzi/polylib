/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.polylib.ui;

import com.mycompany.polylib.utils.Auth;
import com.mycompany.polylib.utils.MsgBox;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author ngocquy
 */
public class ThongkeFrame extends javax.swing.JFrame {

    /**
     * Creates new form ThongkeFrame
     */
    public ThongkeFrame() {
        initComponents();
        txt_usename.setText(Auth.getManagername());
        JFreeChart pieChart = createChart(createDataset());
        ChartPanel chartPanel = new ChartPanel(pieChart);
        TBP_TKNM.addTab("Thống kê người mượn",chartPanel);
        ChartPanel chartPanel2 = new ChartPanel(createCharts());
        TBP_TKNM.addTab("Thống kê phiếu mượn",chartPanel2);
        ChartPanel chartPane4 = new ChartPanel(createLineChart());
        TBP_TKNM.addTab("Thống kê người mượn",chartPane4);
    }

       private static JFreeChart createChart(PieDataset datasets) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Thống kê số lượng người mượn sách trong 1 năm", datasets, true, true, true);
        return chart;
    }

    private static PieDataset createDataset() {
        DefaultPieDataset datasets = new DefaultPieDataset();
        datasets.setValue("Nhóm 0 - 14", new Double(25.0));
        datasets.setValue("Nhóm 15 - 59", new Double(67.0));
        datasets.setValue("Nhóm trên 60", new Double(9.0));
         datasets.setValue("Nhóm trên 70", new Double(9.0));
        return datasets;
    }
   //------------------------------------//
    public static JFreeChart createCharts() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "BIỂU ĐỒ phiếu mượn",
                "Tháng", "Số người",
                createDatasets(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }
     private static CategoryDataset createDatasets() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(0, "Số người", "Tháng 4");
        dataset.addValue(25, "Số người", "Tháng 5");
        dataset.addValue(75, "Số người", "Tháng 6");
        dataset.addValue(200, "Số người", "Tháng 7");
        return dataset;
    }
    //------------------------------------------------------
     public static JFreeChart createLineChart() {
    // Thay đổi hàm tạo để tạo biểu đồ đường
    JFreeChart lineChart = ChartFactory.createLineChart(
        "BIỂU ĐỒ Thống kê", // Tiêu đề
        "Tháng", // Trục hoành
        "Số người", // Trục tung
        createDatasetss(), // Dữ liệu
        PlotOrientation.VERTICAL, // Phương hướng biểu đồ
        true, // Hiển thị legend
        true, // Tooltips
        false // URL
    );
    return lineChart;
}
        private static CategoryDataset createDatasetss() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(0, "Số người", "Tháng 4");
        dataset.addValue(25, "Số người", "Tháng 5");
        dataset.addValue(75, "Số người", "Tháng 6");
        dataset.addValue(200, "Số người", "Tháng 7");
        dataset.addValue(0, "Số người", "Tháng 8");
        dataset.addValue(25, "Số người", "Tháng 9");
        dataset.addValue(75, "Số người", "Tháng 10");
        dataset.addValue(200, "Số người", "Tháng 11");
        //-------------------
        dataset.addValue(200, "Số sách", "Tháng 4");
        dataset.addValue(75, "Số sách", "Tháng 5");
        dataset.addValue(25, "Số sách", "Tháng 6");
        dataset.addValue(100, "Số sách", "Tháng 7");
        dataset.addValue(50, "Số sách", "Tháng 8");
        dataset.addValue(85, "Số sách", "Tháng 9");
        dataset.addValue(175, "Số sách", "Tháng 10");
        dataset.addValue(45, " Số sách", "Tháng 11");
        //---------------------
        dataset.addValue(125, "Phiếu mượn", "Tháng 4");
        dataset.addValue(3, "Phiếu mượn", "Tháng 5");
        dataset.addValue(180, "Phiếu mượn", "Tháng 6");
        dataset.addValue(120, "Phiếu mượn", "Tháng 7");
        dataset.addValue(60, "Phiếu mượn", "Tháng 8");
        dataset.addValue(70, "Phiếu mượn", "Tháng 9");
        dataset.addValue(65, "Phiếu mượn", "Tháng 10");
        dataset.addValue(145, "Phiếu mượn", "Tháng 11");
        return dataset;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_usename = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSach = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        btnPhieuMuon1 = new javax.swing.JButton();
        btnNhanVien1 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        btnThongKe1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TBP_TKNM = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_usename.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_usename.setText("Phan Huỳnh Ngọc Quý");

        jLabel11.setText("Phần mền quản lý thư viện");

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ebook.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jLabel3)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setText("QUẢN LÝ THƯ VIÊN");

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSach.setBackground(new java.awt.Color(255, 153, 0));
        btnSach.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Book.png"))); // NOI18N
        btnSach.setText("Sách");
        btnSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSachActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 153, 0));
        jButton12.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/graduated.png"))); // NOI18N
        jButton12.setText("Đọc giả");
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        btnPhieuMuon1.setBackground(new java.awt.Color(255, 153, 0));
        btnPhieuMuon1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnPhieuMuon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        btnPhieuMuon1.setText("Phiếu Mượn");
        btnPhieuMuon1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPhieuMuon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhieuMuon1ActionPerformed(evt);
            }
        });

        btnNhanVien1.setBackground(new java.awt.Color(255, 153, 0));
        btnNhanVien1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnNhanVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        btnNhanVien1.setText("Nhân Viên");
        btnNhanVien1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhanVien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVien1ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 153, 0));
        jButton17.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Brick house.png"))); // NOI18N
        jButton17.setText("Giới Thiệu");
        jButton17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnThongKe1.setBackground(new java.awt.Color(255, 204, 204));
        btnThongKe1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnThongKe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Statistics.png"))); // NOI18N
        btnThongKe1.setText("Thống Kê");
        btnThongKe1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKe1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(btnPhieuMuon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThongKe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(btnSach, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPhieuMuon1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNhanVien1)
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addGap(18, 18, 18)
                .addComponent(btnThongKe1)
                .addGap(55, 55, 55)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("8:44");

        jLabel21.setBackground(new java.awt.Color(255, 102, 51));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 102));
        jLabel21.setText("Quản lý thống kê");

        jMenu1.setText("Hệ thống");

        jMenuItem1.setText("Đổi mật khẩu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Đăng xuất");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Thoát");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lí");

        jMenu6.setText("Sách");

        jMenuItem11.setText("Tác giả");
        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("Nhà xuất bản");
        jMenu6.add(jMenuItem12);

        jMenuItem13.setText("Loại sách");
        jMenu6.add(jMenuItem13);

        jMenu2.add(jMenu6);

        jMenuItem4.setText("Thống kê");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Đọc giả");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Phiếu mượn");
        jMenu2.add(jMenuItem6);

        jMenuItem9.setText("Nhân viên");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu8.setText("Trợ Giúp");

        jMenuItem10.setText("Giới Thiệu");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        jMenuItem14.setText("Hướng dẫn");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem14);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(486, 486, 486)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(txt_usename)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TBP_TKNM)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_usename)
                                .addComponent(jLabel21)))
                        .addGap(29, 29, 29)
                        .addComponent(TBP_TKNM)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Auth.clear();
        DangNhapJDialog pm = new DangNhapJDialog();
        pm.setVisible(true);
        ThongkeFrame.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
              new DoiMatKhau(this, true).setVisible(true);
        if(Auth.isLogin()){
        new DoiMatKhau(this, true).setVisible(true);
        }
        else{
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSachActionPerformed
      openSach();
    }//GEN-LAST:event_btnSachActionPerformed

    private void btnThongKe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThongKe1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      openNguoiMuon();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnPhieuMuon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhieuMuon1ActionPerformed
      openPhieuMuon();
    }//GEN-LAST:event_btnPhieuMuon1ActionPerformed

    private void btnNhanVien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVien1ActionPerformed
       openNhanVien();
    }//GEN-LAST:event_btnNhanVien1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThongkeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongkeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongkeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongkeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongkeFrame().setVisible(true);
            }
        });
    }

    void openSach() {
        SachJFrame sach = new SachJFrame();
        sach.setVisible(true);
        ThongkeFrame.this.dispose();
    }

    void openNhanVien() {
        NhanVienJFrame nv = new NhanVienJFrame();
        nv.setVisible(true);
        ThongkeFrame.this.dispose();
    }

    void openNguoiMuon() {
        NguoiMuonJFrame nm = new NguoiMuonJFrame();
        nm.setVisible(true);
        ThongkeFrame.this.dispose();
    }

    void openPhieuMuon() {
        PhieuMuonJFrame tk = new PhieuMuonJFrame();
        tk.setVisible(true);
        ThongkeFrame.this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TBP_TKNM;
    private javax.swing.JButton btnNhanVien1;
    private javax.swing.JButton btnPhieuMuon1;
    private javax.swing.JButton btnSach;
    private javax.swing.JButton btnThongKe1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txt_usename;
    // End of variables declaration//GEN-END:variables
}
