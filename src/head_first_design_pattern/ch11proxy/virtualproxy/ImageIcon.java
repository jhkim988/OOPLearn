package head_first_design_pattern.ch11proxy.virtualproxy;

import java.net.URL;

public class ImageIcon implements Icon {

    public ImageIcon(URL url, String name) {

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        
    }
    
}
