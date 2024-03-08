import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import javax.swing.text.Utilities;
import javax.swing.text.*;
import javax.swing.text.BadLocationException;
import java.util.ArrayList;



class MyFrame extends JFrame {

    private JTextField txt_ma;
    private JTextField txt_ho;
    private JTextField txt_ten;

    private JRadioButton nam;
    private JRadioButton nu;
    private JRadioButton khac;

    private JComboBox<String> d;
    private JComboBox<String> m;
    private JComboBox<String> y;

    private JComboBox<String> k;

    private JCheckBox b1;
    private JCheckBox b2;
    private JCheckBox b3;
    private JTextArea t;
    private int selectedStudent = -1; // biến đánh dấu sinh viên được chọn
    private ArrayList<String> Str = new ArrayList<String>(); //datatables lưu thông tin các sinh viên

    MyFrame() {
        setTitle("Danh sách sinh viên");
        setSize(500, 550);
        setLayout(new GridLayout(8,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        JLabel ma = new JLabel("Nhập mã SV: ");
        txt_ma = new JTextField(8);
        p1.add(ma);
        p1.add(txt_ma);
        add(p1);

        JPanel p2 = new JPanel();
        JLabel ho = new JLabel("Nhập Họ SV: ");
        txt_ho = new JTextField(8);
        p2.add(ho);
        p2.add(txt_ho);
        JLabel ten = new JLabel("Nhập Tên SV: ");
        txt_ten = new JTextField(8);
        p2.add(ten);
        p2.add(txt_ten);
        add(p2);

        JPanel p3 = new JPanel();
        JLabel gt = new JLabel("Giới tính: ");
        ButtonGroup bg = new ButtonGroup();
        nam = new JRadioButton("nam");
        nu = new JRadioButton("nữ");
        khac = new JRadioButton("khác");
        p3.add(gt);
        bg.add(nam); bg.add(nu); bg.add(khac);
        p3.add(nam); p3.add(nu); p3.add(khac);
        add(p3);

        JPanel p4 = new JPanel();
        JLabel ngaysinh = new JLabel("Ngày sinh: ");
        JLabel ns = new JLabel("dd/mm/yyyy");
        Font originalFont = ns.getFont();
        Font italicFont = originalFont.deriveFont(Font.ITALIC);
        ns.setFont(italicFont);
        String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        String[] year = {"1985","1986","1987","1988","1989","1990","1991","1992","1993","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2023","2023","2023","2024"};
        d = new JComboBox<>(day);
        m = new JComboBox<>(month);
        y = new JComboBox<>(year);
        p4.add(ngaysinh);
        p4.add(d);
        p4.add(m);
        p4.add(y);
        p4.add(ns);
        add(p4);

        JPanel p5 = new JPanel();
        JLabel khoa = new JLabel("Khoa: ");
        String[] opt = {"CNTT","Sư phạm toán","Kỹ thuật điện","Toán ứng dụng","Sư phạm mầm non","Quản trị kinh doanh","Ngành du lịch","Tâm lý học","Ngôn ngữ Anh","Tiếng Việt học"};
        k = new JComboBox<>(opt);
        p5.add(khoa);
        p5.add(k);
        add(p5);

        JPanel p6 = new JPanel();
        JLabel st = new JLabel("Sở thích: ");
        b1 = new JCheckBox("Đá banh");
        b2 = new JCheckBox("Cầu lông");
        b3 = new JCheckBox("Bóng rổ");
        p6.add(st);
        p6.add(b1); p6.add(b2); p6.add(b3);
        add(p6);

        JPanel p7 = new JPanel();
        JLabel lb7 = new JLabel("Sở thích: ");
        JButton g = new JButton("Thêm");
        JButton g1 = new JButton("Xóa");
        JButton g2 = new JButton("Sửa");
        p7.add(g);  p7.add(g1);  p7.add(g2);
        add(p7);

        JPanel p8 = new JPanel();
        // Tạo JTextArea
        t = new JTextArea(5, 40);
        // Tạo JScrollPane và đặt JTextArea vào đó
        JScrollPane scrollPane = new JScrollPane(t);
        // Thêm JScrollPane vào JPanel
        p8.add(scrollPane);
        // Thêm JPanel vào JFrame
        add(p8);
        
        g.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String maSV = txt_ma.getText();
                String hoSV = txt_ho.getText();
                String tenSV = txt_ten.getText();
                String gioiTinh = "";
                if (nam.isSelected())
                    gioiTinh = "Nam";
                else if (nu.isSelected())
                    gioiTinh = "Nữ";
                else if (khac.isSelected())
                    gioiTinh = "Khác";
                    int birthYear = Integer.parseInt((String)y.getSelectedItem());
                    int currentYear = LocalDate.now().getYear();
                    int tuoi = currentYear - birthYear;
                String khoaSV = (String) k.getSelectedItem();
                String soThich = "";
                if (b1.isSelected())
                    soThich += "Đá banh ";
                if (b2.isSelected())
                    soThich += "Cầu lông ";
                if (b3.isSelected())
                    soThich += "Bóng rổ ";
     String ngaysinh = d.getSelectedItem() + "/" + m.getSelectedItem() + "/" + y.getSelectedItem();
                String sinhVienInfo = "- " + maSV + " - "
                                    +  hoSV + " " + tenSV + " - "
                                    +  gioiTinh + " - "
                                    +  ngaysinh + " - " + tuoi + " tuổi - "
                                    +  khoaSV + " - "
                                    + soThich + "\n";
                Str.add(sinhVienInfo);
                t.setText("");
                for(String x : Str){
                    t.append(x);
                }
            }
        });


        g1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lấy vị trí con trỏ hiện tại
                    int Position = t.getCaretPosition();
                    // Xác định dòng chứa con trỏ
                    int lineNumber = t.getLineOfOffset(Position);
                    // Lấy vị trí bắt đầu và kết thúc của dòng
                    int startOffset = t.getLineStartOffset(lineNumber);
                    int endOffset = t.getLineEndOffset(lineNumber);
                    // Lấy nội dung của dòng
                    String lineText = t.getText(startOffset, endOffset - startOffset);
                    for(int i = 0; i < Str.size(); i++){
                        if(Str.get(i).contains(lineText)){
                            // Xóa sinh viên
                            Str.remove(i);
                            break;
                        }
                    }
                    t.setText(""); // Reset lại JTextArea
                    // Cập nhật lại nội dung của JTextArea dựa trên ArrayList đã được cập nhật
                    for (String item : Str) {
                        t.append(item);
                    }
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }
        });
         
        
     g2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            // Lấy vị trí con trỏ hiện tại
            int Position = t.getCaretPosition();
            // Xác định dòng chứa con trỏ
            int lineNumber = t.getLineOfOffset(Position);
            // Lấy vị trí bắt đầu và kết thúc của dòng
            int startOffset = t.getLineStartOffset(lineNumber);
            int endOffset = t.getLineEndOffset(lineNumber);
            // Lấy nội dung của dòng
            String lineText = t.getText(startOffset, endOffset - startOffset);
            for(int i = 0; i < Str.size(); i++){
                if(Str.get(i).contains(lineText)){
                    // Xóa dòng cũ
                    Str.remove(i);
                    // Thêm dòng mới
                    String maSV = txt_ma.getText();
                    String hoSV = txt_ho.getText();
                    String tenSV = txt_ten.getText();
                    String gioiTinh = "";
                    if (nam.isSelected())
                        gioiTinh = "Nam";
                    else if (nu.isSelected())
                        gioiTinh = "Nữ";
                    else if (khac.isSelected())
                        gioiTinh = "Khác";
                    int birthYear = Integer.parseInt((String)y.getSelectedItem());
                    int currentYear = LocalDate.now().getYear();
                    int tuoi = currentYear - birthYear;
                    String khoaSV = (String) k.getSelectedItem();
                    String soThich = "";
                    if (b1.isSelected())
                        soThich += "Đá banh ";
                    if (b2.isSelected())
                        soThich += "Cầu lông ";
                    if (b3.isSelected())
                        soThich += "Bóng rổ ";
                    String ngaysinh = d.getSelectedItem() + "/" + m.getSelectedItem() + "/" + y.getSelectedItem();
                    String sinhVienInfo = "- " + maSV + " - "
                                        +  hoSV + " " + tenSV + " - "
                                        +  gioiTinh + " - "
                                        +  ngaysinh + " - " + tuoi + " tuổi - "
                                        +  khoaSV + " - "
                                        + soThich + "\n";
                    Str.add(i, sinhVienInfo);
                    break;
                }
            }
            t.setText(""); // Reset lại JTextArea
            // Cập nhật lại nội dung của JTextArea dựa trên ArrayList đã được cập nhật
            for (String item : Str) {
                t.append(item);
            }
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
});

         
          
        

        setVisible(true);
    }
}

public class btSV {
    public static void main(String[] args) {
        new MyFrame();
    }
}
