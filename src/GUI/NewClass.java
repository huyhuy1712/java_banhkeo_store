import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import static java.awt.PageAttributes.ColorType.COLOR;

public class NewClass {

    private static Object JTable1;
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("First Row Color Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo JTable
        JTable jTable1 = new JTable();

        // Tạo DefaultTableModel với tiêu đề cột
        DefaultTableModel model = new DefaultTableModel(
                new Object [][] {
                    
                },
                new String [] {
                    "ID Nhân Viên", "CCCD", "Họ&Tên", "SDT", "Tuổi", "Chức vụ", "Trạng Thái"
                }
                ;
                       jTable1.setBackground(Color.PINK); // Đặt màu hồng cho bảng

        );

        // Đặt DefaultTableModel cho JTable
        jTable1.setModel(model);


        // Thêm JTable vào JScrollPane
        JScrollPane jScrollPane1 = new JScrollPane(jTable1);
        // Thêm JScrollPane vào JFrame
        frame.add(jScrollPane1);

        // Cập nhật lại JTable để hiển thị thay đổi màu
        model.fireTableDataChanged();

        // Hiển thị JFrame
        frame.pack();
        frame.setVisible(true);
    }
}
