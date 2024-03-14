package GUI;

import static com.github.weisj.jsvg.geometry.util.GeometryUtil.top;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class MAIN extends javax.swing.JFrame {

    public MAIN() {
        initComponents();
        setTitle("Tiệm ĐỒ Ngọt");
        setIconImage();
        home.setSVGImage("Image/shop.svg", 90, 90);
        back.setSVGImage("Image/arrow.svg", 70, 70);

    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("shop.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainchinh = new javax.swing.JPanel();
        Title1 = new GUI.jPanelGradient();
        jLabel1 = new javax.swing.JLabel();
        Danhmuc = new javax.swing.JPanel();
        back = new GUI.SvgImage1();
        Nhaphang = new javax.swing.JButton();
        Sanphambtn = new javax.swing.JButton();
        home = new GUI.SvgImage1();
        Thongkebtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Nhanvienbtn1 = new javax.swing.JButton();
        Kmbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        mainchinh.setBackground(new java.awt.Color(255, 255, 255));
        mainchinh.setPreferredSize(new java.awt.Dimension(760, 470));
        mainchinh.setLayout(new java.awt.CardLayout());

        Title1.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 232, 173));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SWEET SUPERMARKET");
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 28));
        jLabel1.setMinimumSize(new java.awt.Dimension(900, 28));

        javax.swing.GroupLayout Title1Layout = new javax.swing.GroupLayout(Title1);
        Title1.setLayout(Title1Layout);
        Title1Layout.setHorizontalGroup(
            Title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Title1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
        );
        Title1Layout.setVerticalGroup(
            Title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        Danhmuc.setBackground(new java.awt.Color(167, 255, 244));
        Danhmuc.setAlignmentX(0.0F);
        Danhmuc.setAlignmentY(0.0F);
        Danhmuc.setPreferredSize(new java.awt.Dimension(140, 470));

        Nhaphang.setBackground(new java.awt.Color(38, 170, 226));
        Nhaphang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Nhaphang.setForeground(new java.awt.Color(255, 255, 255));
        Nhaphang.setText("Nhập Hàng");
        Nhaphang.setPreferredSize(new java.awt.Dimension(130, 40));
        Nhaphang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhaphangMouseClicked(evt);
            }
        });
        Nhaphang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhaphangActionPerformed(evt);
            }
        });

        Sanphambtn.setBackground(new java.awt.Color(38, 170, 226));
        Sanphambtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sanphambtn.setForeground(new java.awt.Color(255, 255, 255));
        Sanphambtn.setText("Sản Phẩm");
        Sanphambtn.setMaximumSize(new java.awt.Dimension(132, 32));
        Sanphambtn.setPreferredSize(new java.awt.Dimension(132, 40));
        Sanphambtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanphambtnMouseClicked(evt);
            }
        });
        Sanphambtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SanphambtnActionPerformed(evt);
            }
        });

        home.setPreferredSize(new java.awt.Dimension(120, 120));

        Thongkebtn.setBackground(new java.awt.Color(38, 170, 226));
        Thongkebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Thongkebtn.setForeground(new java.awt.Color(255, 255, 255));
        Thongkebtn.setText("Thống Kê");
        Thongkebtn.setMaximumSize(new java.awt.Dimension(132, 32));
        Thongkebtn.setMinimumSize(new java.awt.Dimension(120, 30));
        Thongkebtn.setPreferredSize(new java.awt.Dimension(132, 40));
        Thongkebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongkebtnActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        Nhanvienbtn1.setBackground(new java.awt.Color(38, 170, 226));
        Nhanvienbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Nhanvienbtn1.setForeground(new java.awt.Color(255, 255, 255));
        Nhanvienbtn1.setText("Nhân Viên");
        Nhanvienbtn1.setMaximumSize(new java.awt.Dimension(32, 32));
        Nhanvienbtn1.setPreferredSize(new java.awt.Dimension(132, 40));
        Nhanvienbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nhanvienbtn1ActionPerformed(evt);
            }
        });

        Kmbtn.setBackground(new java.awt.Color(38, 170, 226));
        Kmbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Kmbtn.setForeground(new java.awt.Color(255, 255, 255));
        Kmbtn.setText("Khuyến mãi");
        Kmbtn.setMaximumSize(new java.awt.Dimension(32, 32));
        Kmbtn.setPreferredSize(new java.awt.Dimension(132, 40));
        Kmbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KmbtnMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KmbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                KmbtnMouseReleased(evt);
            }
        });
        Kmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KmbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DanhmucLayout = new javax.swing.GroupLayout(Danhmuc);
        Danhmuc.setLayout(DanhmucLayout);
        DanhmucLayout.setHorizontalGroup(
            DanhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DanhmucLayout.createSequentialGroup()
                .addGroup(DanhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DanhmucLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DanhmucLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(DanhmucLayout.createSequentialGroup()
                .addGroup(DanhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DanhmucLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Kmbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DanhmucLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DanhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sanphambtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thongkebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nhanvienbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nhaphang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DanhmucLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        DanhmucLayout.setVerticalGroup(
            DanhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DanhmucLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sanphambtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Nhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Kmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Nhanvienbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Thongkebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Danhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainchinh, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Danhmuc, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addComponent(mainchinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NhaphangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhaphangActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NhaphangActionPerformed

    private void SanphambtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SanphambtnActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_SanphambtnActionPerformed

    private void ThongkebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongkebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThongkebtnActionPerformed

    private void KmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KmbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KmbtnActionPerformed

    private void Nhanvienbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nhanvienbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nhanvienbtn1ActionPerformed


    private void KmbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KmbtnMousePressed


    }//GEN-LAST:event_KmbtnMousePressed

    private void KmbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KmbtnMouseReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_KmbtnMouseReleased

    private void KmbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KmbtnMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_KmbtnMouseEntered


    private void SanphambtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanphambtnMouseClicked
        // TODO add your handling code here:
        mainchinh.removeAll();
        mainchinh.revalidate();
        mainchinh.add(new Snpham());
    }//GEN-LAST:event_SanphambtnMouseClicked
    
    private void NhaphangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhaphangMouseClicked
        // TODO add your handling code here:
        mainchinh.removeAll();
        mainchinh.revalidate();
        mainchinh.add(new NhapSanpham());
    }//GEN-LAST:event_NhaphangMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new MAIN().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Danhmuc;
    private javax.swing.JButton Kmbtn;
    private javax.swing.JButton Nhanvienbtn1;
    private javax.swing.JButton Nhaphang;
    private javax.swing.JButton Sanphambtn;
    private javax.swing.JButton Thongkebtn;
    private javax.swing.JPanel Title1;
    private GUI.SvgImage1 back;
    private GUI.SvgImage1 home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainchinh;
    // End of variables declaration//GEN-END:variables
}
