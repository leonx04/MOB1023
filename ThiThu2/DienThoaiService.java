 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ThiThu2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dungn
 */
public class DienThoaiService extends javax.swing.JFrame {
    private DefaultTableModel model;
    /**
     * Creates new form DienThoaiService
     */
    public DienThoaiService() {
        initComponents();
        model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        model.setColumnIdentifiers(new Object[]{"STT", "Mã" , "Hãng" , "Màu sắc" , " Gia", " Bộ nhớ"});
        
        model.addRow(new Object[]{"1", "DT1", "Apple", "Đen", "8000", "256"});
        model.addRow(new Object[]{"2", "DT2", "Apple", "Đen", "7000", "64"});
        model.addRow(new Object[]{"3", "DT3", "SamSung", "Vàng", "8500", "128"});
        model.addRow(new Object[]{"4" , "DT4" ,"Oppo","Trắng", "3000","128"});
        model.addRow(new Object[]{"5","DT5̀", "SamSung","Trắng","5000", "128"});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdobtnDen = new javax.swing.JRadioButton();
        rdobtnTrang = new javax.swing.JRadioButton();
        rdobtnVang = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtBoNho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnMo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Quản lý điện thoại");

        jLabel2.setText("Mã");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Màu sắc :");

        buttonGroup1.add(rdobtnDen);
        rdobtnDen.setText("Đen");

        buttonGroup1.add(rdobtnTrang);
        rdobtnTrang.setText("Trắng");

        buttonGroup1.add(rdobtnVang);
        rdobtnVang.setText("Vàng");

        jLabel4.setText("Hãng");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apple", "SamSung", "Oppo" }));

        jLabel5.setText("Bộ nhớ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Giá");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("GB");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi file");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnMo.setText("Mở File");
        btnMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtBoNho))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMA)
                                    .addComponent(jComboBox1, 0, 122, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdobtnDen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdobtnTrang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdobtnVang))
                                    .addComponent(txtGia))
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnThem)
                .addGap(151, 151, 151)
                .addComponent(btnGhi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMo)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(rdobtnDen)
                    .addComponent(rdobtnTrang)
                    .addComponent(rdobtnVang))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBoNho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnGhi)
                    .addComponent(btnMo))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int HangDuocChon = Table.getSelectedRow();
        
            if(HangDuocChon != -1){
           String ma = Table.getValueAt(HangDuocChon, 1).toString();
           String hang = Table.getValueAt(HangDuocChon, 2).toString();
           String mauSac = Table.getValueAt(HangDuocChon, 3).toString();
           String boNho =  Table.getValueAt(HangDuocChon, 5).toString();
           Integer gia = Integer.parseInt(Table.getValueAt(HangDuocChon, 4).toString());

           txtMA.setText(ma);
           txtBoNho.setText(boNho);
           txtGia.setText(gia.toString());
           if(mauSac.equals("Đen")){
               rdobtnDen.setSelected(true);
           } else if(mauSac.equals("Trắng")){
               rdobtnTrang.setSelected(true);
           } else if(mauSac.equals("Vàng")){
               rdobtnVang.setSelected(true);
           }

           jComboBox1.setSelectedItem(hang);
       }
    }//GEN-LAST:event_TableMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        // Lấy thông tin từ các trường nhập liệu
        String ma = txtMA.getText();
        String hang = jComboBox1.getSelectedItem().toString();
        String mauSac = "";
        if (rdobtnDen.isSelected()) {
            mauSac = "Đen";
        } else if (rdobtnTrang.isSelected()) {
            mauSac = "Trắng";
        } else if (rdobtnVang.isSelected()) {
            mauSac = "Vàng";
        }
        String boNho = txtBoNho.getText();
        Integer gia = Integer.parseInt(txtGia.getText());

        // Tạo đối tượng DienThoai mới từ thông tin nhập liệu
        DienThoai dienThoai = new DienThoai(ma, hang, mauSac, boNho, gia);

        // Thêm đối tượng DienThoai vào mô hình dữ liệu của bảng
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.addRow(new Object[] {model.getRowCount() + 1, dienThoai.getMa(), dienThoai.getHang(), dienThoai.getMauSac(), dienThoai.getGia(), dienThoai.getBoNho()});

        // Cập nhật lại hiển thị của bảng
        Table.setModel(model);

        // Xóa nội dung trong các trường nhập liệu
        txtMA.setText("");
        jComboBox1.setSelectedIndex(0);
        rdobtnDen.setSelected(true);
        txtBoNho.setText("");
        txtGia.setText("");

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoActionPerformed

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
            java.util.logging.Logger.getLogger(DienThoaiService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DienThoaiService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DienThoaiService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DienThoaiService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DienThoaiService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnMo;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdobtnDen;
    private javax.swing.JRadioButton rdobtnTrang;
    private javax.swing.JRadioButton rdobtnVang;
    private javax.swing.JTextField txtBoNho;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMA;
    // End of variables declaration//GEN-END:variables
}
