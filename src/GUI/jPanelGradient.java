/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */ 
class jPanelGradient extends JPanel {
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float width= getWidth();
       
        int height = getHeight();
          Color col1 = new Color(38,170,236);
        Color col2 = new Color(242,108,148);
      
        GradientPaint gp = new GradientPaint(100,100,col1, (float) (width/1.2),height,col2);
        g2d.setPaint(gp);
        g2d.fillRect(0,0, (int) width, height);
    }
}
   
