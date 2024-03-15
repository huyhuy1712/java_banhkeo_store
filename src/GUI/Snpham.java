/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author DELL
 */
public class Snpham extends javax.swing.JPanel {

    /**
     * Creates new form Snpham
     */
    public Snpham() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        them_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        soLuong_textF = new javax.swing.JFormattedTextField();
        tim_btn = new javax.swing.JButton();
        idSP_textF = new javax.swing.JFormattedTextField();
        xoa_btn = new javax.swing.JButton();
        thanhToan_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(760, 470));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Số thứ tự", "Mã Sản Phẩm", "Tên", "Giá", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        them_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        them_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/carts.png"))); // NOI18N
        them_btn.setText("Thêm");
        them_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                them_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jLabel2.setText("Tìm kiếm");

        jLabel3.setText("Số lượng");

        soLuong_textF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soLuong_textFActionPerformed(evt);
            }
        });

        tim_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tim_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loupe.png"))); // NOI18N
        tim_btn.setText("Tìm");
        tim_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tim_btnActionPerformed(evt);
            }
        });

        idSP_textF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idSP_textFActionPerformed(evt);
            }
        });

        xoa_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xoa_btn.setMnemonic('X');
        xoa_btn.setText("Xóa");
        xoa_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoa_btnActionPerformed(evt);
            }
        });

        thanhToan_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thanhToan_btn.setText("Thanh toán");
        thanhToan_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thanhToan_btnMouseClicked(evt);
            }
        });
        thanhToan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thanhToan_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/visual-merchandising.png"))); // NOI18N
        jLabel1.setText("Sản phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(idSP_textF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tim_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soLuong_textF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(them_btn)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xoa_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(thanhToan_btn)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(soLuong_textF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(them_btn)
                    .addComponent(tim_btn)
                    .addComponent(idSP_textF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xoa_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thanhToan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void them_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_them_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_them_btnActionPerformed

    private void soLuong_textFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soLuong_textFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soLuong_textFActionPerformed

    private void tim_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tim_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tim_btnActionPerformed

    private void idSP_textFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idSP_textFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idSP_textFActionPerformed

    private void xoa_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoa_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoa_btnActionPerformed

    private void thanhToan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thanhToan_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thanhToan_btnActionPerformed

    private void thanhToan_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thanhToan_btnMouseClicked
        jScrollPane1.removeAll();
        jScrollPane1.revalidate();
//        jScrollPane1.add(new Snpham());

        // TODO add your handling code here:
    }//GEN-LAST:event_thanhToan_btnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField idSP_textF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField soLuong_textF;
    private javax.swing.JButton thanhToan_btn;
    private javax.swing.JButton them_btn;
    private javax.swing.JButton tim_btn;
    private javax.swing.JButton xoa_btn;
    // End of variables declaration//GEN-END:variables
}
