// ripped this from the internet
// increases font size so the in class demos look better
// - Reese

// Students:
// Don't worry about any of this

import javax.swing.plaf.FontUIResource;
import javax.swing.UIManager;
import java.awt.Font;
import java.util.Enumeration;

public class FontAdjusterSec1 {

    public static void adjustFontSize(int adjustment) {
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource) {
                FontUIResource orig = (FontUIResource) value;
                Font newFont = new Font(orig.getName(), orig.getStyle(), orig.getSize() + adjustment);
                UIManager.put(key, new FontUIResource(newFont));
            }
        }
    }
}
