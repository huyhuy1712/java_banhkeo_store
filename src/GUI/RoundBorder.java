/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

/**
 *
 * @author anhhu
 */
class RoundBorder extends AbstractBorder {
    private int radius;
    private Color borderColor;

    // Đổi tên hoặc thêm tham số cho hàm tạo
    RoundBorder(int radius) {
        this.radius = radius;
    }

    // Nếu bạn muốn có thêm một hàm tạo khác, thêm tham số hoặc thay đổi kiểu tham số
    RoundBorder(int radius, Color borderColor) {
        this.radius = radius;
        this.borderColor = borderColor;
    }
}



