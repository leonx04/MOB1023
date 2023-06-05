/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab5_6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author dungn
 */
public class QuanLyNhanVien extends javax.swing.JFrame {
    private DefaultTableModel model;
    private int selectedRow;
    /**
     * Creates new form QuanLyNhanVien
     */
    private Integer parseInteger(String value) {
    if (value.isEmpty()) {
        return null;
    }
    try {
        return Integer.parseInt(value);
    } catch (NumberFormatException e) {
        return null;
    }
    }
    public QuanLyNhanVien() {
        initComponents();
        model =  (DefaultTableModel) Table.getModel();
        model.setColumnCount(2);
        model.setColumnIdentifiers(new Object[]{"Tên Nhân Viên","Sinh nhật","Giới Tính","Vòng 1","Vòng 2" ,"Vòng 3"});
    
        //Thêm bản ghi vào table
        model.addRow(new Object[]{"Nguyễn Thị Hoài", "25/05/2004", "Nữ", "120", "70", "100 "});
        model.addRow(new Object[]{"Nguyễn Hoài Thu", "26/05/2004", "Nữ", "130", "80", "110 "});
        model.addRow(new Object[]{"Nguyễn Minh Tâm", "27/05/2004", "Nữ", "140", "90", "120 "});
        model.addRow(new Object[]{"Nguyễn Phương Thu ", "28/05/2004", "Nữ", "150", "100", "130 "});
        model.addRow(new Object[]{"Nguyễn Minh Thơ", "29/05/2004", "Nữ", "160", "110", "150 "});
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSinhNhat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVong1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVong2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtVong3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        cbxGioiTinh = new javax.swing.JComboBox<>();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Quản lý nhân viên");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên Nhân viên");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Sinh Nhật");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Giới Tính");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Vòng 1");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Vòng 2");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Vòng 3");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        btnThem.setBackground(new java.awt.Color(51, 204, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 0, 51));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnDoc.setBackground(new java.awt.Color(51, 255, 51));
        btnDoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoc.setText("Đọc");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        btnGhi.setBackground(new java.awt.Color(255, 255, 0));
        btnGhi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        cbxGioiTinh.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        btnThoat.setBackground(new java.awt.Color(0, 0, 0));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(txtSinhNhat)
                                        .addComponent(txtVong1)
                                        .addComponent(txtVong2)
                                        .addComponent(txtVong3)
                                        .addComponent(cbxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDoc)
                .addGap(35, 35, 35)
                .addComponent(btnGhi)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtSinhNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtVong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtVong2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtVong3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(btnDoc)
                        .addComponent(btnGhi)))
                .addGap(7, 7, 7)
                .addComponent(btnThoat))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here
        // Lấy thông tin từ các trường nhập liệu
            String tenNhanVien = txtTenNV.getText();
            String sinhNhatStr = txtSinhNhat.getText();
            String gioiTinh = cbxGioiTinh.getSelectedItem().toString();
            Integer vong1 = parseInteger(txtVong1.getText());
            Integer vong2 = parseInteger(txtVong2.getText());
            Integer vong3 = parseInteger(txtVong3.getText());

            // Kiểm tra dữ liệu đầu vào
            if (tenNhanVien.isEmpty() || sinhNhatStr.isEmpty() || gioiTinh.isEmpty() || vong1 == null || vong2 == null || vong3 == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin.");
                return;
            }

            // Chuyển đổi chuỗi ngày sinh nhật thành kiểu Date
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date sinhNhat = null;
            try {
                sinhNhat = dateFormat.parse(sinhNhatStr);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Định dạng ngày sinh không hợp lệ. Vui lòng sử dụng định dạng dd/MM/yyyy.");
                return;
            }

            // Tạo một đối tượng NhanVien mới
            NhanVien nv = new NhanVien(tenNhanVien, sinhNhat, gioiTinh, vong1, vong2, vong3);

            // Thêm nhân viên vào danh sách và cập nhật bảng
            NhanVien.addNhanVien(nv);
            model.addRow(new Object[]{nv.getTenNhanVien(), dateFormat.format(nv.getSinhNhat()), nv.getGioiTinh(), nv.getVong1(), nv.getVong2(), nv.getVong3()});

            // Xóa dữ liệu trong các trường nhập liệu
            txtTenNV.setText("");
            txtSinhNhat.setText("");
            txtVong1.setText("");
            txtVong2.setText("");
            txtVong3.setText("");

            // Thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công.");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         // Lấy chỉ số dòng được chọn trong bảng
        int selectedRow = Table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên để xóa.");
            return;
        }

        // Xóa dòng được chọn trong bảng và danh sách
        model.removeRow(selectedRow);
        NhanVien.removeNhanVien(selectedRow);

        JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công.");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        // TODO add your handling code here:
            // Xóa hết các dòng hiện tại trong bảng
            model.setRowCount(0);

            // Đọc dữ liệu từ tệp văn bản
            try {
                File file = new File("QuanLyNhanVien.txt");
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] values = line.split(",");

                    if (values.length == 6) {
                        String tenNhanVien = values[0].trim();
                        String sinhNhatStr = values[1].trim();
                        String gioiTinh = values[2].trim();
                        Integer vong1 = parseInteger(values[3].trim());
                        Integer vong2 = parseInteger(values[4].trim());
                        Integer vong3 = parseInteger(values[5].trim());

                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date sinhNhat = dateFormat.parse(sinhNhatStr);

                        NhanVien nv = new NhanVien(tenNhanVien, sinhNhat, gioiTinh, vong1, vong2, vong3);
                        NhanVien.addNhanVien(nv);

                        model.addRow(new Object[]{nv.getTenNhanVien(), dateFormat.format(nv.getSinhNhat()), nv.getGioiTinh(), nv.getVong1(), nv.getVong2(), nv.getVong3()});
                    }
                }

                scanner.close();
                JOptionPane.showMessageDialog(this, "Đọc dữ liệu thành công từ tệp nhanvien.txt.");
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tệp nhanvien.txt.");
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Lỗi định dạng ngày sinh trong tệp nhanvien.txt.");
            }
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        String tenNhanVien = txtTenNV.getText();
        String sinhNhatStr = txtSinhNhat.getText();
        String gioiTinh = cbxGioiTinh.getSelectedItem().toString();
        String vong1 = txtVong1.getText();
        String vong2 = txtVong2.getText();
        String vong3 = txtVong3.getText();

        // Kiểm tra dữ liệu đầu vào
        if (tenNhanVien.isEmpty() || sinhNhatStr.isEmpty() || gioiTinh.isEmpty() || vong1.isEmpty() || vong2.isEmpty() || vong3.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin.");
            return;
        }

        // Tạo đối tượng FileWriter để ghi dữ liệu vào tệp tin
        File file = new File("QuanLyNhanVien.txt");
        try (FileWriter ThemDuLieu = new FileWriter(file, true)) {
            // Ghi dữ liệu vào tệp tin
            ThemDuLieu.write(tenNhanVien + "," + sinhNhatStr + "," + gioiTinh + "," + vong1 + "," + vong2 + "," + vong3 + "\n");

            // Xóa dữ liệu trong các trường nhập liệu
            txtTenNV.setText("");
            txtSinhNhat.setText("");
            cbxGioiTinh.setSelectedIndex(0);
            txtVong1.setText("");
            txtVong2.setText("");
            txtVong3.setText("");

            // Thông báo thành công
            JOptionPane.showMessageDialog(this, "Dữ liệu đã được ghi vào tệp tin.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi ghi dữ liệu vào tệp tin.");
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
       // Lấy chỉ số dòng được chọn trong bảng
    int selectedRow = Table.getSelectedRow();
    if (selectedRow == -1) {
        return;
    }

    // Lấy thông tin từ dòng được chọn và hiển thị trong các trường nhập liệu
    txtTenNV.setText(model.getValueAt(selectedRow, 0).toString());
    txtSinhNhat.setText(model.getValueAt(selectedRow, 1).toString());
    cbxGioiTinh.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
    txtVong1.setText(model.getValueAt(selectedRow, 3).toString());
    txtVong2.setText(model.getValueAt(selectedRow, 4).toString());
    txtVong3.setText(model.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_TableMouseClicked

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
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSinhNhat;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtVong1;
    private javax.swing.JTextField txtVong2;
    private javax.swing.JTextField txtVong3;
    // End of variables declaration//GEN-END:variables
}