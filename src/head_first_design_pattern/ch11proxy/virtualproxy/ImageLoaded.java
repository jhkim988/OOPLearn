package head_first_design_pattern.ch11proxy.virtualproxy;

public class ImageLoaded implements ImageState {
    volatile ImageIcon imageIcon;

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c, g, x, y);        
    }
}
