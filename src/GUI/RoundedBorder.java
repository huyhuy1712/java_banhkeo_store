/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.border.Border;

/**
 *
 * @author DELL
 */
public class RoundedBorder implements Border{

    
        private int topLeft;
        private int topRight;
        private int bottomLeft;
        private int bottomRight;
        
        public RoundedBorder(int topLeft, int topRight, int bottomLeft, int bottomRight) {
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
        
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(topLeft, topLeft, bottomLeft, bottomRight);
        }
        
        @Override
        public boolean isBorderOpaque() {
            return false;
        }
        
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int r = 15;
            int x0 = x;
            int x1 = x + width - 1;
            int y0 = y;
            int y1 = y + height - 1;
            g2d.drawRoundRect(x0, y0, x1 - x0, y1 - y0, topLeft, topRight);
            g2d.dispose();
        }
    
    
}
