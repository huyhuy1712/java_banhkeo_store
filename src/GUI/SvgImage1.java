package GUI;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Cursor;
import javax.swing.Icon;
import javax.swing.JLabel;

public class SvgImage1 extends JLabel{
    private FlatSVGIcon svgIcon;

    public SvgImage1() {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    
    
    public void setSVGImage(String image, int width, int height) {
        svgIcon = new FlatSVGIcon(image, width, height);
        setIcon((Icon) svgIcon);
    }
}
