/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.KhachHangDAO;
import entity.KhachHang;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

/**
 * @author Trong Phu
 */
public class KhachHang_View extends javax.swing.JPanel {

    /**
     * Creates new form KhachHang_View
     */
    KhachHangDAO khdao = new KhachHangDAO();
    List<KhachHang> list = new ArrayList<>();
    int index;
    DefaultTableModel dtm = new DefaultTableModel();
    KhachHangDAO daoKH = new KhachHangDAO();
    int tienLui = 0;
    double soTrangLe;
    int soTrang;
    int viTriTrang = 1;

    public KhachHang_View() {
        initComponents();
        //list = daoKH.selectAll();
        list = daoKH.selectAll();
        loadDT(khdao.phanTrangKH(tienLui));
        setSoTrang();

    }

    void setSoTrang() {
        soTrangLe = Math.ceil((double) khdao.selectAll().size() / 5);
        soTrang = (int) soTrangLe;
        lblSoTrang.setText(viTriTrang + "/" + soTrang);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quản lý khách hàng view");
        KhachHang_View khachHang_View = new KhachHang_View();
        frame.add(khachHang_View);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void loadDT(List<KhachHang> listkh) {
        dtm = (DefaultTableModel) tblQLKH.getModel();
        dtm.setRowCount(0);
        for (KhachHang x : listkh) {
            Object roww[] = new Object[]{
                    x.getIdKH(), x.getHoTen(), x.getgioitinh(), x.getDiaChi(), x.getSdt(), x.getEmail(), x.getGhiChu(), x.getSoLuotMua(), x.getNgayTao()
            };
            dtm.addRow(roww);
        }

    }

    private void fillData() {
        //KhachHang kh = khdao.phanTrangKH(tienLui).get(index);

        txtMaKH.setText(tblQLKH.getValueAt(tblQLKH.getSelectedRow(), 0).toString());
        txtHoTen.setText(tblQLKH.getValueAt(tblQLKH.getSelectedRow(), 1).toString());
        txtDiaChi.setText(tblQLKH.getValueAt(tblQLKH.getSelectedRow(), 3).toString());

        txtSDT.setText(tblQLKH.getValueAt(tblQLKH.getSelectedRow(), 4).toString());

        txtEmail.setText(tblQLKH.getValueAt(tblQLKH.getSelectedRow(), 5).toString());

        txtGhiChu.setText(tblQLKH.getValueAt(tblQLKH.getSelectedRow(), 6).toString());

        if (tblQLKH.getValueAt(tblQLKH.getSelectedRow(), 0).toString().equalsIgnoreCase("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }

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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnThemKH = new javax.swing.JButton();
        btnSuaKH = new javax.swing.JButton();
        btnLamMoiForm = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPreview = new javax.swing.JButton();
        lblSoTrang = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQLKH = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1145, 683));

        jPanel1.setBackground(new java.awt.Color(255, 251, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)), "QUẢN LÝ KHÁCH HÀNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MÃ KH");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Họ tên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Địa chỉ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("SĐT");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Ghi chú");

        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoNu.setText("Nữ");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        btnThemKH.setBackground(new java.awt.Color(0, 204, 51));
        btnThemKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThemKH.setForeground(new java.awt.Color(255, 255, 255));
        btnThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Create.png"))); // NOI18N
        btnThemKH.setText("Thêm");
        btnThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKHActionPerformed(evt);
            }
        });

        btnSuaKH.setBackground(new java.awt.Color(255, 204, 51));
        btnSuaKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSuaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        btnSuaKH.setText("Sửa");
        btnSuaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKHActionPerformed(evt);
            }
        });

        btnLamMoiForm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLamMoiForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh (1).png"))); // NOI18N
        btnLamMoiForm.setText("Làm mới");
        btnLamMoiForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiFormActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách khách hàng"));

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPreview.setText("<");
        btnPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviewActionPerformed(evt);
            }
        });

        lblSoTrang.setText("jLabel9");

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        tblQLKH.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null}
                },
                new String[]{
                        "Khách hàng ID", "Họ tên", "Giới tính", "Địa chỉ", "SĐT", "Email", "Ghi chú", "Lượt mua hàng", "Ngày tạo"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblQLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLKH);

        txtTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemCaretUpdate(evt);
            }
        });
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search3.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnTimKiem))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(19, 19, 19))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(405, 405, 405)
                                                .addComponent(btnFirst)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPreview)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblSoTrang)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNext)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnLast)))
                                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTimKiem))
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPreview)
                                        .addComponent(btnNext)
                                        .addComponent(btnFirst)
                                        .addComponent(lblSoTrang)
                                        .addComponent(btnLast))
                                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(rdoNam)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rdoNu)))
                                                .addGap(71, 71, 71)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel6))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnLamMoiForm, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSuaKH, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnThemKH, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(92, 92, 92))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{btnLamMoiForm, btnSuaKH, btnThemKH});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(btnThemKH)
                                                .addGap(41, 41, 41)
                                                .addComponent(btnSuaKH)
                                                .addGap(40, 40, 40)
                                                .addComponent(btnLamMoiForm))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(rdoNam)
                                                                        .addComponent(rdoNu))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblQLKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLKHMouseClicked
        // TODO add your handling code here:
        int row = tblQLKH.getSelectedRow();
        fillData();
    }//GEN-LAST:event_tblQLKHMouseClicked

    private void btnThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKHActionPerformed
        // TODO add your handling code here:
        try {
            KhachHang viewModel = new KhachHang();

            viewModel.setIdKH(txtMaKH.getText());
            viewModel.setHoTen(txtHoTen.getText());

            boolean gt = true;
            if (rdoNam.isSelected()) {
                viewModel.setGioiTinh(true);
            } else {
                viewModel.setGioiTinh(false);
            }
            viewModel.setDiaChi(txtDiaChi.getText());
            viewModel.setSdt(txtSDT.getText());
            viewModel.setEmail(txtEmail.getText());
            viewModel.setGhiChu(txtGhiChu.getText());
            if (txtMaKH.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống mã khách hàng");
                return;
            }
            for (KhachHang nv : khdao.selectAll()) {
                if (nv.getIdKH().trim().equalsIgnoreCase(txtMaKH.getText())) {
                    JOptionPane.showMessageDialog(this, "Trùng mã khách hàng");
                    return;
                }
            }
            for (KhachHang nv : khdao.selectAll()) {
                if (nv.getSdt().trim().equalsIgnoreCase(txtSDT.getText())) {
                    JOptionPane.showMessageDialog(this, "Trùng SDT");
                    return;
                }
            }
            if (txtHoTen.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được trống Tên");
                txtHoTen.requestFocus();
                return;
            }

            if (!checksdt()) {
                txtSDT.requestFocus();
                return;
            }

            if (!checkten()) {
                txtHoTen.requestFocus();
                return;
            }

            if (txtDiaChi.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được trống địa chỉ");

                txtDiaChi.requestFocus();

                return;
            }

            if (txtSDT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vùi lòng nhập SDT");
                txtSDT.requestFocus();
                return;

            } else if (khdao.addNH(viewModel) > 0) {
                list = khdao.phanTrangKH(tienLui);
                loadDT(list);
                setSoTrang();
                JOptionPane.showMessageDialog(this, "Thêm thành công!!");

            } else {
                JOptionPane.showMessageDialog(this, "Lỗi thêm !!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi thêm !!");
        }
    }//GEN-LAST:event_btnThemKHActionPerformed

    private void btnSuaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKHActionPerformed
        // TODO add your handling code here:
        try {
            int row = tblQLKH.getSelectedRow();
            index = tblQLKH.getSelectedRow();
            String id = tblQLKH.getValueAt(index, 0).toString();
            KhachHang viewModel = new KhachHang();

            viewModel.setIdKH(txtMaKH.getText());
            viewModel.setHoTen(txtHoTen.getText());

            boolean gt = true;
            if (rdoNam.isSelected()) {
                viewModel.setGioiTinh(true);
            } else {
                viewModel.setGioiTinh(false);
            }
            viewModel.setDiaChi(txtDiaChi.getText());
            viewModel.setSdt(txtSDT.getText());
            viewModel.setEmail(txtEmail.getText());
            viewModel.setGhiChu(txtGhiChu.getText());
            if (txtMaKH.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống mã khách hàng");
                return;
            }

            for (KhachHang nv : khdao.selectAll()) {
                if (nv.getSdt().trim().equalsIgnoreCase(txtSDT.getText())) {
                    JOptionPane.showMessageDialog(this, "Trùng SDT");
                    return;
                }
            }
            if (txtHoTen.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được trống Tên");
                txtHoTen.requestFocus();
                return;
            }

            if (!checksdt()) {
                txtSDT.requestFocus();
                return;
            }

            if (!checkten()) {
                txtHoTen.requestFocus();
                return;
            }

            if (txtDiaChi.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được trống địa chỉ");

                txtDiaChi.requestFocus();

                return;
            }

            if (txtSDT.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vùi lòng nhập SDT");
                txtSDT.requestFocus();
                return;
            }
            khdao.update(viewModel, id);
            JOptionPane.showMessageDialog(this, "Sửa nhân viên thành công!!");
            list = khdao.phanTrangKH(tienLui);
            loadDT(list);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi thêm !!");
        }
    }//GEN-LAST:event_btnSuaKHActionPerformed

    private int TienLui = 0;
    private int so = 1;

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        // TODO add your handling code here:
        //        String txtSearch = this.txtTimKiem.getText();
        //       List<NhanVien> lstNV = new NhanVienDAO().timKiemTheoTenHoacMa1(txtSearch,TienLui);
        //        model = (DefaultTableModel) tblQLNV.getModel();
        //        model.setRowCount(0);
        //         for (NhanVien x : lstNV) {
        //            Object roww[] = new Object[]{
        //                //                x.getMaNV(), x.getTenNV(), x.getNgaySinh(), x.getDiaChi(), x.getSdt(), x.getEmail(), x.getChucVu().getTenCV(), x.getGioiTinh(), x.getDangNhap().getUserName(), x.getDangNhap().getPassWord(), x.getTrangThai() == 0 ? "Đi làm" : "Không đi làm"
        //                x.getNhanVien_id(), x.getHoTen(), x.getgioitinh(), x.getNgaySinh(), x.getDiaChi(), x.getSdt(), x.getTrangThai(), x.getVaiTro()
        //            };
        //            model.addRow(roww);
        //        }
    }//GEN-LAST:event_txtTimKiemCaretUpdate

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        // String id = txtTimKiem.getText();
        //  list =nvd.timkiem(id);
        loadTBTimKiem();

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
        // TODO add your handling code here:
        preview();
    }//GEN-LAST:event_btnPreviewActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLamMoiFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiFormActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnLamMoiFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLamMoiForm;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPreview;
    private javax.swing.JButton btnSuaKH;
    private javax.swing.JButton btnThemKH;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSoTrang;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblQLKH;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTimKiem;

    // End of variables declaration//GEN-END:variables
    public boolean checksdt() {

        if (txtSDT.getText().matches("[0,+84][\\d]{9}")) {
            return true;
        }
        JOptionPane.showMessageDialog(this, "vui lòng nhập đúng số điện thoại");

        return false;
    }

    public boolean checkten() {
        String paramater = "^[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+ [AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+(?: [AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]*)*";

        if (txtHoTen.getText().matches(paramater)) {
            return true;
        }
        if (txtHoTen.getText().length() > 2) {
            return true;
        }
        JOptionPane.showMessageDialog(this, "Tên Sai Định Dạng ( Phải Là chữ và lớn hơn 2 kí Tự)");

        return false;
    }

    public void loadTBTimKiem() {
        //tblQLNV.setModel(model);
        String id = txtTimKiem.getText();
        List<KhachHang> lstNV = khdao.timkiem(id);
        dtm = (DefaultTableModel) tblQLKH.getModel();
        dtm.setRowCount(0);
        for (KhachHang x : lstNV) {
            Object roww[] = new Object[]{
                    x.getIdKH(), x.getHoTen(), x.getgioitinh(), x.getDiaChi(), x.getSdt(), x.getEmail(), x.getGhiChu(), x.getSoLuotMua(), x.getNgayTao()
            };
            dtm.addRow(roww);
        }
    }

    private void next() {
        if (viTriTrang < soTrang) {
            tienLui += 5;
            viTriTrang += 1;
            setSoTrang();
            loadDT(khdao.phanTrangKH(tienLui));
        } else {
            first();
        }

    }

    private void first() {
        viTriTrang = 1;
        tienLui = 0;
        setSoTrang();
        loadDT(khdao.phanTrangKH(tienLui));
    }

    private void preview() {
        if (viTriTrang > 1) {
            tienLui -= 5;
            viTriTrang -= 1;
            setSoTrang();
            loadDT(khdao.phanTrangKH(tienLui));
        } else {
            last();
        }

    }

    private void last() {
        viTriTrang = soTrang;
        tienLui = soTrang * 5 - 5;
        setSoTrang();
        loadDT(khdao.phanTrangKH(tienLui));
    }

    private void clear() {
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtGhiChu.setText("");
        txtHoTen.setText("");
        txtMaKH.setText("");
        txtSDT.setText("");
        txtTimKiem.setText("");
        rdoNam.setSelected(true);

    }
}
