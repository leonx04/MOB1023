package ASG1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class ASG_FORM extends javax.swing.JFrame {
    private DefaultTableModel model;
    private Timer labelTimer;
    private int labelPosition;
    /**
     * Creates new form ASG_FORM
     */
    public ASG_FORM() {
        initComponents();
        model =  (DefaultTableModel) Table.getModel();
        model.setColumnCount(2);
        model.setColumnIdentifiers(new Object[]{"Mã Sản Phẩm","Tên Sản phẩm","Số lượng","Đơn Giá","Loại tủ lạnh" ,"Dung tích chứa"});
        // Khởi tạo và cấu hình Timer cho dòng chữ " QUẢN LÝ TỦ LẠNH "
        labelTimer = new Timer(100, new ActionListener() {
            private int counter = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                String labelText = txtQLTL.getText();
                int labelLength = labelText.length();
                String shiftedText = labelText.substring(labelPosition) + labelText.substring(0, labelPosition);
                txtQLTL.setText(shiftedText);
                labelPosition = (labelPosition + 1) % labelLength;

                counter++;
                if (counter == 0) { // Thiết lập thời gian dừng 
                    labelTimer.stop();
                }
            }
        });
        labelTimer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRadio = new javax.swing.ButtonGroup();
        txtQLTL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaTL = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenTL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboboxDTC = new javax.swing.JComboBox<>();
        btnRadio1 = new javax.swing.JRadioButton();
        btnRadio2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnGhi = new javax.swing.JButton();
        Load = new javax.swing.JButton();
        New = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        btnClock = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnTimKiemTheoTen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTimKiemTheoTruongDacTrung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 102));

        txtQLTL.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        txtQLTL.setForeground(new java.awt.Color(153, 153, 255));
        txtQLTL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtQLTL.setText(" QUẢN LÝ TỦ LẠNH ");
        txtQLTL.setToolTipText("");
        txtQLTL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtQLTL.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Mã sản phẩm");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Số lượng");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("Tên sản phẩm");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("Đơn Giá (đơn vị: Triệu vnđ)");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("Loại tủ lạnh");

        comboboxDTC.setForeground(new java.awt.Color(204, 204, 204));
        comboboxDTC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200" }));
        comboboxDTC.setToolTipText("");

        btnRadio.add(btnRadio1);
        btnRadio1.setText("Tủ 2 cánh");

        btnRadio.add(btnRadio2);
        btnRadio2.setText("Tủ 4 cánh");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setText("Dung tích chứa(đơn vị : Kg)");

        Table.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        Table.setMinimumSize(new java.awt.Dimension(60, 70));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        btnGhi.setBackground(new java.awt.Color(0, 255, 153));
        btnGhi.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnGhi.setText("Lưu");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        Load.setBackground(new java.awt.Color(0, 204, 153));
        Load.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Load.setText("Hiển thị");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });

        New.setBackground(new java.awt.Color(204, 204, 255));
        New.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        New.setForeground(new java.awt.Color(51, 0, 51));
        New.setText("Thêm mới");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(51, 255, 255));
        Update.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 51, 51));
        Update.setText("Cập nhật");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(153, 153, 0));
        Delete.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Delete.setText("Xóa");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 51, 51));
        Exit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Exit.setText("Thoát");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        btnClock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClock.setText("00:00:00");
        btnClock.setToolTipText("");
        btnClock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClock.setFocusPainted(false);
        btnClock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClock.setName(""); // NOI18N
        btnClock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClockActionPerformed(evt);
            }
        });

        btnDoc.setBackground(new java.awt.Color(0, 102, 102));
        btnDoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoc.setForeground(new java.awt.Color(255, 255, 255));
        btnDoc.setText("Đọc");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        btnTimKiemTheoTen.setBackground(new java.awt.Color(255, 255, 51));
        btnTimKiemTheoTen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiemTheoTen.setText("Tìm kiếm theo tên");
        btnTimKiemTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemTheoTenActionPerformed(evt);
            }
        });

        btnTimKiemTheoTruongDacTrung.setBackground(new java.awt.Color(153, 153, 0));
        btnTimKiemTheoTruongDacTrung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiemTheoTruongDacTrung.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiemTheoTruongDacTrung.setText("Tìm kiếm");
        btnTimKiemTheoTruongDacTrung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemTheoTruongDacTrungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaTL, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(32, 32, 32)
                                    .addComponent(btnRadio1)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnRadio2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(43, 43, 43)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDonGia)
                            .addComponent(txtTenTL, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(comboboxDTC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiemTheoTen)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(txtQLTL, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnGhi)
                        .addGap(18, 18, 18)
                        .addComponent(btnDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Load)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimKiemTheoTruongDacTrung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(New)
                        .addGap(32, 32, 32)
                        .addComponent(Update)
                        .addGap(18, 18, 18)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnClock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtQLTL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnRadio1)
                            .addComponent(btnRadio2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTenTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiemTheoTen))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboboxDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGhi)
                        .addComponent(Load)
                        .addComponent(New)
                        .addComponent(Update)
                        .addComponent(btnDoc)
                        .addComponent(btnTimKiemTheoTruongDacTrung)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit)
                    .addComponent(btnClock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        // TODO add your handling code here:
      DefaultTableModel model = (DefaultTableModel) Table.getModel();
      model.setRowCount(0);
      
      //Thêm bản ghi vào table
      model.addRow(new Object[]{"SP001", "TOSHIBA", "1.0", "1000000", "Tủ 2 cánh", "10 "});
      model.addRow(new Object[]{"SP002", "LG", "2.0", "2000000", "Tủ 4 cánh", "20 "});
      model.addRow(new Object[]{"SP003", "SAM SUNG", "3.0", "3000000", "Tủ 2 cánh", "30 "});
      model.addRow(new Object[]{"SP004", "Panasonic", "4.0", "4000000", "Tủ 4 cánh", "40 "});
      model.addRow(new Object[]{"SP005", "Huawei", "5.0", "5000000", "Tủ 2 cánh", "50 "});
      model.addRow(new Object[]{"SP006", "ONEPLUS", "6.0", "6000000", "Tủ 4 cánh", "60 "});
      model.addRow(new Object[]{"SP007", "XIAOMI", "7.0", "7000000", "Tủ 2 cánh", "70 "});
      model.addRow(new Object[]{"SP008", "APPLE", "8.0", "8000000", "Tủ 4 cánh", "80 "});
      model.addRow(new Object[]{"SP009", "HP", "9.0", "9000000", "Tủ 2 cánh", "90 "});
      model.addRow(new Object[]{"SP010", "KT", "10.0", "10000000", "Tủ 4 cánh", "100 "});
      
    }//GEN-LAST:event_LoadActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here: 
        // Lấy model của JTable để truy cập dữ liệu
        DefaultTableModel model = (DefaultTableModel) Table.getModel();

        // Lấy chỉ số dòng được chọn
        int selectedRowIndex = Table.getSelectedRow();

        // Kiểm tra xem có dòng nào được chọn không
        if (selectedRowIndex >= 0) {
            try {
                // Lấy dữ liệu từ các ô trong dòng được chọn
                String data = "";
                for (int columnIndex = 0; columnIndex < model.getColumnCount(); columnIndex++) {
                    Object cellValue = model.getValueAt(selectedRowIndex, columnIndex);
                    data += cellValue.toString() + ",";
                }
                data += "\n";

                // Ghi dữ liệu vào file ASIGNMENT.txt
                FileWriter writer = new FileWriter("ASIGNMENT.txt", true);
                writer.write(data);
                writer.close();

                JOptionPane.showMessageDialog(null, "Dữ liệu đã được lưu vào file ASIGNMENT.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Lỗi khi ghi dữ liệu vào file ASIGNMENT.txt: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hãy chọn một dòng trên bảng");
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        // TODO add your handling code here:
        // Xác nhận với người dùng
    int confirmed = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thêm dữ liệu?", "Xác nhận thêm", JOptionPane.YES_NO_OPTION);

    if (confirmed == JOptionPane.YES_OPTION) {
        String maTL = txtMaTL.getText();
        String tenTL = txtTenTL.getText();
        String soLuongStr = txtSoLuong.getText();
        String donGiaStr = txtDonGia.getText();
        String loaiTL = btnRadio1.isSelected() ? "Tủ lạnh 2 cánh" : "Tủ lạnh 4 cánh";
        String DTC = comboboxDTC.getSelectedItem().toString();

        // Kiểm tra xem các trường thông tin có trống không
        if (maTL.isEmpty() || tenTL.isEmpty() || soLuongStr.isEmpty() || donGiaStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            // Thực hiện chuyển đổi dữ liệu
            Double soLuong = Double.parseDouble(soLuongStr);
            BigDecimal donGia = new BigDecimal(donGiaStr);
            
            // Kiểm tra loại tủ lạnh được chọn
            if (btnRadio1.isSelected()) {
                loaiTL = "Tủ lạnh 2 cánh";
            } else if (btnRadio2.isSelected()) {
                loaiTL = "Tủ lạnh 4 cánh";
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn loại tủ lạnh!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return; // Dừng lại nếu loại tủ lạnh chưa được chọn
            }

            // Kiểm tra dung tích chứa được chọn
            if (comboboxDTC.getSelectedIndex() != 0) {
                DTC = comboboxDTC.getSelectedItem().toString();
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn dung tích chứa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return; // Dừng lại nếu dung tích chưa được chọn
            }
            
            // Thêm thông tin vào bảng
            DefaultTableModel model = (DefaultTableModel) Table.getModel();
            model.addRow(new Object[]{maTL, tenTL, soLuong, donGia, loaiTL, DTC});

            // Xóa dữ liệu trong các ô nhập liệu
            txtMaTL.setText("");
            txtTenTL.setText("");
            txtSoLuong.setText("");
            txtDonGia.setText("");
            btnRadio1.setSelected(false);
            btnRadio2.setSelected(false);
            comboboxDTC.setSelectedIndex(0);
        }
        }
        JOptionPane.showMessageDialog(this, "Dữ liệu đã được thêm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_NewActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = Table.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để cập nhật!", "Thông báo", JOptionPane.WARNING_MESSAGE);
    } else {
        // Xác nhận với người dùng
        int confirmed = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn cập nhật dữ liệu?", "Xác nhận cập nhật", JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            String maSanPham = txtMaTL.getText();
            String tenSanPham = txtTenTL.getText();
            String soLuong = txtSoLuong.getText();
            String donGia = txtDonGia.getText();
            String loaiTuLanh = "";
            if (btnRadio1.isSelected()) {
                loaiTuLanh = "Tủ 2 cánh";
            } else if (btnRadio2.isSelected()) {
                loaiTuLanh = "Tủ 4 cánh";
            }

            String dungTichChua = comboboxDTC.getSelectedItem().toString();
            if (comboboxDTC.getSelectedIndex() != 0) {
                dungTichChua = comboboxDTC.getSelectedItem().toString();
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn dung tích chứa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return; // Dừng lại nếu dung tích chưa được chọn
            }

            Table.setValueAt(maSanPham, selectedRow, 0);
            Table.setValueAt(tenSanPham, selectedRow, 1);
            Table.setValueAt(soLuong, selectedRow, 2);
            Table.setValueAt(donGia, selectedRow, 3);
            Table.setValueAt(loaiTuLanh, selectedRow, 4);
            Table.setValueAt(dungTichChua, selectedRow, 5);

            JOptionPane.showMessageDialog(this, "Dữ liệu đã được cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int HangDuocChon = Table.getSelectedRow();
        if (HangDuocChon == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return ;
        }else{
        model.removeRow(HangDuocChon);
        JOptionPane.showMessageDialog(this, "Dữ liệu đã được xóa thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        return ;
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        // Xác nhận thoát với người dùng
        int confirmed = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            // Thoát khỏi ứng dụng
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        // Lấy chỉ mục hàng được chọn
        int rowIndex = Table.getSelectedRow();

        // Lấy giá trị từ các cột của hàng được chọn
        String maTL = Table.getValueAt(rowIndex, 0).toString();
        String tenTL = Table.getValueAt(rowIndex, 1).toString();
        double soLuong = Double.parseDouble(Table.getValueAt(rowIndex, 2).toString());
        BigDecimal donGia = new BigDecimal(Table.getValueAt(rowIndex, 3).toString());
        String loaiTL = Table.getValueAt(rowIndex, 4).toString();
        String DTC = Table.getValueAt(rowIndex, 5).toString();

        // Hiển thị giá trị lên các ô nhập liệu
        txtMaTL.setText(maTL);
        txtTenTL.setText(tenTL);
        txtSoLuong.setText(String.valueOf(soLuong));
        txtDonGia.setText(donGia.toString());

        // Kiểm tra và hiển thị cho loại tủ lạnh
        if (loaiTL.equals("Tủ 2 cánh")) {
            btnRadio1.setSelected(true);
        } else if (loaiTL.equals("Tủ 4 cánh")) {
            btnRadio2.setSelected(true);
        }

        // Đặt chọn cho combobox dung tích chứa
        comboboxDTC.setSelectedItem(DTC);
    }//GEN-LAST:event_TableMouseClicked

    private void btnClockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClockActionPerformed
        // TODO add your handling code here:
        // Tạo một đối tượng Timer với khoảng thời gian là 1 giây (1000 milliseconds)
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy thời gian hiện tại
                Date currentTime = new Date();

                // Định dạng thời gian theo định dạng HH:mm:ss
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                String formattedTime = timeFormat.format(currentTime);

                // Định dạng ngày tháng năm theo định dạng dd/MM/yyyy
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String formattedDate = dateFormat.format(currentTime);

                // Hiển thị thời gian và ngày tháng năm lên button hoặc label tương ứng
                btnClock.setText(formattedTime + " " + formattedDate); // Thay thế "btnClock" bằng tên của button hoặc label hiển thị đồng hồ và ngày tháng năm trong giao diện của bạn
            }
        });

        // Bắt đầu chạy Timer
        timer.start();
    }//GEN-LAST:event_btnClockActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        // TODO add your handling code here:
         File file = new File("ASIGNMENT.txt");
    if (!file.exists()) {
        JOptionPane.showMessageDialog(this, "File không tồn tại.");
        return;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        // Xóa tất cả các dòng cũ trong bảng
        model.setRowCount(0);

        // Đọc từng dòng trong file và thêm vào bảng
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");

            // Thêm dòng vào bảng
            model.addRow(values);
        }

        JOptionPane.showMessageDialog(this, "Đã đọc dữ liệu từ file thành công.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Lỗi đọc file: " + e.getMessage());
    }
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnTimKiemTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemTheoTenActionPerformed
        // TODO add your handling code here:
        // Lấy tên cần tìm kiếm từ ô txtTenTL
        String tenTimKiem = txtTenTL.getText();
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int rowCount = model.getRowCount();
        boolean found = false;

        for (int i = 0; i < rowCount; i++) {
            String tenSanPham = (String) model.getValueAt(i, 1);
            if (tenSanPham.equalsIgnoreCase(tenTimKiem)) {
                Table.setRowSelectionInterval(i, i);
                found = true;
            }
        }

        if (found) {
            // Xóa các dòng không khớp với tên tìm kiếm
            for (int i = rowCount - 1; i >= 0; i--) {
                String tenSanPham = (String) model.getValueAt(i, 1);
                if (!tenSanPham.equalsIgnoreCase(tenTimKiem)) {
                    model.removeRow(i);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin.");
        }
    }//GEN-LAST:event_btnTimKiemTheoTenActionPerformed

    private void btnTimKiemTheoTruongDacTrungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemTheoTruongDacTrungActionPerformed
        // TODO add your handling code here:
         String maTL = txtMaTL.getText();
        String tenTL = txtTenTL.getText();
        String soLuongStr = txtSoLuong.getText();
        String donGiaStr = txtDonGia.getText();

        // Kiểm tra nếu tất cả các trường tìm kiếm đều rỗng
        if (maTL.isEmpty() && tenTL.isEmpty() && soLuongStr.isEmpty() && donGiaStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tìm kiếm thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        boolean found = false;

        for (int row = 0; row < model.getRowCount(); row++) {
            boolean match = false;

            String rowMaTL = model.getValueAt(row, 0).toString();
            String rowTenTL = model.getValueAt(row, 1).toString();
            String rowSoLuong = model.getValueAt(row, 2).toString();
            String rowDonGia = model.getValueAt(row, 3).toString();

            if ((maTL.isEmpty() || rowMaTL.equals(maTL)) &&
                (tenTL.isEmpty() || rowTenTL.equals(tenTL)) &&
                (soLuongStr.isEmpty() || rowSoLuong.equals(soLuongStr)) &&
                (donGiaStr.isEmpty() || rowDonGia.equals(donGiaStr))) {
                match = true;
            }

            if (match) {
                Table.setRowSelectionInterval(row, row);
                found = true;
            } else {
                Table.removeRowSelectionInterval(row, row);
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiemTheoTruongDacTrungActionPerformed

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
            java.util.logging.Logger.getLogger(ASG_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASG_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASG_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASG_FORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASG_FORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Load;
    private javax.swing.JButton New;
    private javax.swing.JTable Table;
    private javax.swing.JButton Update;
    private javax.swing.JButton btnClock;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnGhi;
    private javax.swing.ButtonGroup btnRadio;
    private javax.swing.JRadioButton btnRadio1;
    private javax.swing.JRadioButton btnRadio2;
    private javax.swing.JButton btnTimKiemTheoTen;
    private javax.swing.JButton btnTimKiemTheoTruongDacTrung;
    private javax.swing.JComboBox<String> comboboxDTC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaTL;
    private javax.swing.JLabel txtQLTL;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenTL;
    // End of variables declaration//GEN-END:variables
}
