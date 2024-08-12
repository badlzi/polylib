/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.polylib.ui;

import com.mycompany.polylib.dao.PhieuMuonDao;
import com.mycompany.polylib.entity.NguoiMuoi;
import com.mycompany.polylib.entity.NhanVien;
import com.mycompany.polylib.entity.PhieuMuon;
import com.mycompany.polylib.utils.Auth;
import com.mycompany.polylib.utils.MsgBox;
import com.mycompany.polylib.utils.XDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngocquy
 */
public class PhieumuonJDialog extends javax.swing.JDialog {

    /**
     * Creates new form PhieumuonJDialog
     */
    public PhieumuonJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lblMaNV.setText(Auth.getManagername());
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDateTime = now.format(formatter);
        txtNgayTra.setText(formattedDateTime);
        HienThiLenban();
    }
    int row = 0;
    PhieuMuonDao PMD = new PhieuMuonDao();
    List<PhieuMuon> PML = new ArrayList<>();
    DefaultTableModel model;
    DefaultComboBoxModel Bcmodel;
    
     public void HienThiLenban() {
        PML = PMD.selectAll();
        String[] headers = {"Số phiếu mượn", "Mã người mượn", "Ngày mượn", "Ngày trả", "Mã nhân viên"};
        model = new DefaultTableModel(headers, 0);
        for (PhieuMuon pml : PML) {
            Object[] row = new Object[]{
            pml.getSoPhieuMuon(),pml.getNguoiMuon().getMaNM(), pml.getNgayMuon(),pml.getNgayTra(), pml.getNhanVien().getMaNhanVien()};
            model.addRow(row);
        }
        tbl_PhieuMuon.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDau = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_PhieuMuon = new javax.swing.JTable();
        btnCuoi = new javax.swing.JButton();
        btnSau = new javax.swing.JButton();
        btnTruoc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNgayMuon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        txtPhieuMuon = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        txtNgayTra = new javax.swing.JTextField();
        lblMaNV = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDau.setText("<<");
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách phiếu trả:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        tbl_PhieuMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_PhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_PhieuMuonMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_PhieuMuon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        btnCuoi.setText(">>");
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });

        btnSau.setText(">");
        btnSau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauActionPerformed(evt);
            }
        });

        btnTruoc.setText("<");
        btnTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruocActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setText("PHIẾU MƯỢN ");

        txtNgayMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayMuonActionPerformed(evt);
            }
        });
        txtNgayMuon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNgayMuonKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel2.setText("Mã người mượn");

        lblTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(153, 51, 0));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel3.setText("Ngày Trả:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel4.setText("Số phiếu mượn: ");

        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel5.setText("Ngày mượn");

        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        txtNgayTra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNgayTraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNgayTraKeyReleased(evt);
            }
        });

        lblMaNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaNV.setText("Ngoc Quý");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel7.setText("Nhân viên");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNgayTra)
                    .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDau, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSau, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtPhieuMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(255, 255, 255)
                        .addComponent(jLabel7)
                        .addGap(62, 62, 62))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaNV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhieuMuon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)
                            .addComponent(btnLamMoi)
                            .addComponent(btnDau)
                            .addComponent(btnTruoc)
                            .addComponent(btnSau)
                            .addComponent(btnCuoi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Danh sách phiếu mượn:"); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnDauActionPerformed

    private void tbl_PhieuMuonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PhieuMuonMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tbl_PhieuMuon.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tbl_PhieuMuonMousePressed

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnCuoiActionPerformed

    private void btnSauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnSauActionPerformed

    private void btnTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruocActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnTruocActionPerformed

    private void txtNgayMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayMuonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNgayMuonActionPerformed

    private void txtNgayMuonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayMuonKeyReleased
        // TODO add your handling code here:
//        double tien = 0;
//        if(txtNgayMuon.getText().contains("mất")){
//            tien = 100000;
//            lblTienPhat.setText(String.valueOf(tien));
//        }else if(txtNgayMuon.getText().contains("tốt")){
//            tien = 0;
//            lblTienPhat.setText(String.valueOf(tien));
//        }else if(txtNgayMuon.getText().contains("nhẹ")){
//            tien = 20000;
//            lblTienPhat.setText(String.valueOf(tien));
//        }else if(txtNgayMuon.getText().contains("hư hỏng")){
//            tien = 75000;
//            lblTienPhat.setText(String.valueOf(tien));
//        }
    }//GEN-LAST:event_txtNgayMuonKeyReleased

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        clear();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDateTime = now.format(formatter);
        txtNgayTra.setText(formattedDateTime);
        lblMaNV.setText(Auth.getManagername());
        
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void txtNgayTraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayTraKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayTraKeyPressed

    private void txtNgayTraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNgayTraKeyReleased
//        Date toDate = XDate.toDate(txtNgayTra.getText(),"yyyy-MM-dd");
//        Date toDateold = getGiaByTenS(txtPhieuMuon.getText());
//        System.out.println(toDate +"\n"+ toDateold);
    }//GEN-LAST:event_txtNgayTraKeyReleased
     public void updatMAmnJD(String name) {
        txtMa.setText(name);
        System.out.println("code  vui " + name);
    }
    
    void edit() {
        String spm = (String) tbl_PhieuMuon.getValueAt(this.row, 0);
        PhieuMuon pm = PMD.selectById(spm);
        this.setForm(pm);
    }
    void setForm(PhieuMuon pm) {
        txtPhieuMuon.setText(pm.getSoPhieuMuon());
        txtMa.setText(pm.getNguoiMuon().getMaNM());
        txtNgayMuon.setText(XDate.toString(pm.getNgayMuon(),"yyyy-MM-dd"));
        txtNgayTra.setText(XDate.toString(pm.getNgayTra(),"yyyy-MM-dd"));
        lblMaNV.setText(pm.getNhanVien().getMaNhanVien());
    }
    PhieuMuon getForm() {
        PhieuMuon pm = new PhieuMuon();
        pm.setSoPhieuMuon(txtPhieuMuon.getText());
        NguoiMuoi nm = new NguoiMuoi();
        nm.setMaNM(txtMa.getText());
        pm.setNguoiMuon(nm);
        pm.setNgayMuon(XDate.toDate(txtNgayMuon.getText(),"yyyy-MM-dd"));
        pm.setNgayTra(XDate.toDate(txtNgayTra.getText(), "yyyy-MM-dd"));
        NhanVien nv = new NhanVien();
        nv.setMaNhanVien(lblMaNV.getText());
        pm.setNhanVien(nv);
        return pm;
    }
    void insert() {
        PhieuMuon model = getForm();
        try {
            PMD.insert(model);
            this.HienThiLenban();
            this.clear();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    void clear() {
        txtPhieuMuon.setText("");
        txtMa.setText("");
        txtNgayMuon.setText("");
        txtNgayTra.setText("");
        lblMaNV.setText("");
    }

    void update() {
        PhieuMuon model = getForm();
       try {
            PMD.update(model);
            this.HienThiLenban();
            MsgBox.alert(this, "Cập nhật thành công!");
       } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa người học này?")) {
            String spm = txtPhieuMuon.getText();
            try {
                PMD.delete(spm);
                this.HienThiLenban();
                this.clear();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }
    }
    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }else{
            this.row = tbl_PhieuMuon.getRowCount() - 1;
            this.edit();
        }
    }

    void next() {
        if (this.row <= tbl_PhieuMuon.getRowCount() - 1) {
            this.row++;
            this.edit();
        }else{
            this.row = 0;
            this.edit();
        }
    }

    void last() {
        this.row = tbl_PhieuMuon.getRowCount() - 1;
        this.edit();
    }
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
            java.util.logging.Logger.getLogger(PhieumuonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieumuonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieumuonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieumuonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PhieumuonJDialog dialog = new PhieumuonJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSau;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTruoc;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JTable tbl_PhieuMuon;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgayMuon;
    private javax.swing.JTextField txtNgayTra;
    private javax.swing.JTextField txtPhieuMuon;
    // End of variables declaration//GEN-END:variables
}
