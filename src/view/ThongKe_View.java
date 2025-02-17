/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.SanPhamChiTietDAO;
import dao.ThongKeDAO;
import entity.HoaDon;
import entity.SanPhamChiTiet;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Trong Phu
 */
public class ThongKe_View extends javax.swing.JPanel {

    //SanPhamDAO spDAO = new SanPhamDAO();
    SanPhamChiTietDAO spctDAO = new SanPhamChiTietDAO();

    ThongKeDAO thongKeDAO = new ThongKeDAO();

    /**
     * Creates new form ThongKe_View
     */
    public ThongKe_View() {
        initComponents();
//        setSLSPDB();
//        setSLSPNB();

        Date month = new Date();
        SimpleDateFormat fomaterMonth = new SimpleDateFormat("MM");
        String nowString = fomaterMonth.format(month);

        Date day = new Date();
        SimpleDateFormat fomaterDay = new SimpleDateFormat("dd-MM-yyyy");
        String dayString = fomaterDay.format(day);

        lblTieuDeDoanhThuThang.setText("Doanh thu tháng " + nowString);
        lblTieuDeDoanhThuNgay.setText("Doanh thu ngày " + dayString);

        //fillTBThongKeSanPham(thongKeDAO.bangThongKeSPCT());
        fillTableThongKeNgay(thongKeDAO.danhSachDoanhThuNgay());
        fillTableThongKeNam(thongKeDAO.danhSachDoanhThuNam());
        /// doanh thu
        setLBLALL(lblDoanhThuNgay, thongKeDAO.doanhThuNgay() == null ? "0" : thongKeDAO.doanhThuNgay() + "");
        setLBLALL(lblDoanhThuThang, thongKeDAO.doanhThuThang() == null ? "0" : thongKeDAO.doanhThuThang() + "");
        setLBLALL(lblTongDoanhThu, thongKeDAO.tongDoanhThu() + "");

    }

    private void setLBLALL(JLabel lb, String values) {
        lb.setText(values);
    }

    //    private void fillTBThongKeSanPham(List<SanPhamChiTiet> list) {
//        DefaultTableModel model = (DefaultTableModel) tblThongKeSanPham.getModel();
//        model.setRowCount(0);
//        for (SanPhamChiTiet spct : list) {
//            model.addRow(new Object[]{
//                spct.getsPCT_id(),
//                spct.getSanPham_id(),
//                spct.getSanPham(),
//                spct.getSoLuong(),
//                spct.getSize(),
//                spct.getMauSac(),
//                spct.getChatLieu(),
//                spct.getSoLuongBan(),
//                spct.getDoanhThu(),
//                spct.getTrangThai()});
//        }
//    }
    private void fillTableThongKeNgay(List<HoaDon> list) {
        DefaultTableModel model = (DefaultTableModel) tblThongKeNgay.getModel();
        model.setRowCount(0);
        for (HoaDon hd : list) {
            model.addRow(new Object[]{
                    hd.getNgayTao(),
                    hd.getTongTien(),
                    hd.getTongSoHD()
            });
        }
    }

    private void fillTableThongKeNam(List<Object[]> list) {
        DefaultTableModel model = (DefaultTableModel) tblThongKeNam.getModel();
        model.setRowCount(0);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quản lý sản phẩm view");

        ThongKe_View tKV = new ThongKe_View();
        frame.add(tKV);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabsThongKe = new javax.swing.JTabbedPane();
        jpnThongKeDoanhThu = new javax.swing.JPanel();
        jpnDoanhThuNgay = new javax.swing.JPanel();
        lblTieuDeDoanhThuNgay = new javax.swing.JLabel();
        lblDoanhThuNgay = new javax.swing.JLabel();
        jpnDoanThuThang = new javax.swing.JPanel();
        lblTieuDeDoanhThuThang = new javax.swing.JLabel();
        lblDoanhThuThang = new javax.swing.JLabel();
        jpnTongDoanhThu = new javax.swing.JPanel();
        lbTitle7 = new javax.swing.JLabel();
        lblTongDoanhThu = new javax.swing.JLabel();
        jpnThongKeTheoNgay = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKeNgay = new javax.swing.JTable();
        jpnThongKeTheoNam = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongKeNam = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1145, 683));

        tabsThongKe.setBackground(new java.awt.Color(255, 255, 255));
        tabsThongKe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THỐNG KÊ DOANH THU", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jpnThongKeDoanhThu.setBackground(new java.awt.Color(255, 251, 246));

        jpnDoanhThuNgay.setBackground(new java.awt.Color(255, 255, 255));
        jpnDoanhThuNgay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTieuDeDoanhThuNgay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTieuDeDoanhThuNgay.setForeground(new java.awt.Color(0, 0, 0));
        lblTieuDeDoanhThuNgay.setText("Doanh thu ngày dd-MM-yyyy");

        lblDoanhThuNgay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDoanhThuNgay.setForeground(new java.awt.Color(255, 51, 0));
        lblDoanhThuNgay.setText("Values");

        javax.swing.GroupLayout jpnDoanhThuNgayLayout = new javax.swing.GroupLayout(jpnDoanhThuNgay);
        jpnDoanhThuNgay.setLayout(jpnDoanhThuNgayLayout);
        jpnDoanhThuNgayLayout.setHorizontalGroup(
                jpnDoanhThuNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDoanhThuNgayLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpnDoanhThuNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTieuDeDoanhThuNgay)
                                        .addComponent(lblDoanhThuNgay))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDoanhThuNgayLayout.setVerticalGroup(
                jpnDoanhThuNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDoanhThuNgayLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTieuDeDoanhThuNgay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDoanhThuNgay)
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpnDoanThuThang.setBackground(new java.awt.Color(255, 255, 255));
        jpnDoanThuThang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTieuDeDoanhThuThang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTieuDeDoanhThuThang.setForeground(new java.awt.Color(0, 0, 0));
        lblTieuDeDoanhThuThang.setText("Doanh thu tháng");

        lblDoanhThuThang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDoanhThuThang.setForeground(new java.awt.Color(255, 51, 0));
        lblDoanhThuThang.setText("Values");

        javax.swing.GroupLayout jpnDoanThuThangLayout = new javax.swing.GroupLayout(jpnDoanThuThang);
        jpnDoanThuThang.setLayout(jpnDoanThuThangLayout);
        jpnDoanThuThangLayout.setHorizontalGroup(
                jpnDoanThuThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDoanThuThangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpnDoanThuThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTieuDeDoanhThuThang)
                                        .addComponent(lblDoanhThuThang))
                                .addContainerGap(129, Short.MAX_VALUE))
        );
        jpnDoanThuThangLayout.setVerticalGroup(
                jpnDoanThuThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnDoanThuThangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTieuDeDoanhThuThang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDoanhThuThang)
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpnTongDoanhThu.setBackground(new java.awt.Color(255, 255, 255));
        jpnTongDoanhThu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbTitle7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitle7.setForeground(new java.awt.Color(0, 0, 0));
        lbTitle7.setText("Tổng doanh thu");

        lblTongDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTongDoanhThu.setForeground(new java.awt.Color(255, 51, 0));
        lblTongDoanhThu.setText("Values");

        javax.swing.GroupLayout jpnTongDoanhThuLayout = new javax.swing.GroupLayout(jpnTongDoanhThu);
        jpnTongDoanhThu.setLayout(jpnTongDoanhThuLayout);
        jpnTongDoanhThuLayout.setHorizontalGroup(
                jpnTongDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnTongDoanhThuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpnTongDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbTitle7)
                                        .addComponent(lblTongDoanhThu))
                                .addContainerGap(111, Short.MAX_VALUE))
        );
        jpnTongDoanhThuLayout.setVerticalGroup(
                jpnTongDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnTongDoanhThuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbTitle7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTongDoanhThu)
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpnThongKeTheoNgay.setBackground(new java.awt.Color(255, 255, 255));
        jpnThongKeTheoNgay.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin thống kê theo ngày", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tblThongKeNgay.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "Thời gian", "Doanh thu", "Tổng Hoá đơn"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblThongKeNgay);

        javax.swing.GroupLayout jpnThongKeTheoNgayLayout = new javax.swing.GroupLayout(jpnThongKeTheoNgay);
        jpnThongKeTheoNgay.setLayout(jpnThongKeTheoNgayLayout);
        jpnThongKeTheoNgayLayout.setHorizontalGroup(
                jpnThongKeTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongKeTheoNgayLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
        );
        jpnThongKeTheoNgayLayout.setVerticalGroup(
                jpnThongKeTheoNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongKeTheoNgayLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        jpnThongKeTheoNam.setBackground(new java.awt.Color(255, 255, 255));
        jpnThongKeTheoNam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin thống kê theo năm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jpnThongKeTheoNam.setPreferredSize(new java.awt.Dimension(478, 200));

        tblThongKeNam.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String[]{
                        "Năm", "Doanh thu", "Tháng doanh thu cao nhất", "Tháng doanh thu thấp nhất", "Doanh thu trung bình tháng"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblThongKeNam);

        jButton1.setText("Xem chi tiết");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnThongKeTheoNamLayout = new javax.swing.GroupLayout(jpnThongKeTheoNam);
        jpnThongKeTheoNam.setLayout(jpnThongKeTheoNamLayout);
        jpnThongKeTheoNamLayout.setHorizontalGroup(
                jpnThongKeTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnThongKeTheoNamLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThongKeTheoNamLayout.setVerticalGroup(
                jpnThongKeTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongKeTheoNamLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpnThongKeTheoNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(274, 274, 274))
        );

        javax.swing.GroupLayout jpnThongKeDoanhThuLayout = new javax.swing.GroupLayout(jpnThongKeDoanhThu);
        jpnThongKeDoanhThu.setLayout(jpnThongKeDoanhThuLayout);
        jpnThongKeDoanhThuLayout.setHorizontalGroup(
                jpnThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpnThongKeTheoNam, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
                        .addGroup(jpnThongKeDoanhThuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpnThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpnThongKeDoanhThuLayout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jpnDoanhThuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(103, 103, 103)
                                                .addComponent(jpnDoanThuThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jpnTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))
                                        .addComponent(jpnThongKeTheoNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpnThongKeDoanhThuLayout.setVerticalGroup(
                jpnThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnThongKeDoanhThuLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jpnThongKeDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jpnDoanhThuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jpnDoanThuThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jpnTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpnThongKeTheoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpnThongKeTheoNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(365, 365, 365))
        );

        tabsThongKe.addTab("Doanh thu", jpnThongKeDoanhThu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tabsThongKe)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tabsThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 671, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (tblThongKeNam.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Chọn năm cần xem chi tiết");
        } else {
            thongKeThangJDialog.nam = tblThongKeNam.getValueAt(tblThongKeNam.getSelectedRow(), 0).toString();
            TrangChu tc = new TrangChu();
            new thongKeThangJDialog(tc, true).setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnDoanThuThang;
    private javax.swing.JPanel jpnDoanhThuNgay;
    private javax.swing.JPanel jpnThongKeDoanhThu;
    private javax.swing.JPanel jpnThongKeTheoNam;
    private javax.swing.JPanel jpnThongKeTheoNgay;
    private javax.swing.JPanel jpnTongDoanhThu;
    private javax.swing.JLabel lbTitle7;
    private javax.swing.JLabel lblDoanhThuNgay;
    private javax.swing.JLabel lblDoanhThuThang;
    private javax.swing.JLabel lblTieuDeDoanhThuNgay;
    private javax.swing.JLabel lblTieuDeDoanhThuThang;
    private javax.swing.JLabel lblTongDoanhThu;
    private javax.swing.JTabbedPane tabsThongKe;
    private javax.swing.JTable tblThongKeNam;
    private javax.swing.JTable tblThongKeNgay;
    // End of variables declaration//GEN-END:variables
}
