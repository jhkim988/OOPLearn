package head_first_design_pattern.ch11proxy.virtualproxy;

public interface ImageState {
    int getIconWidth();
    int getIconHeight();
    void paintIcon(Component c, Graphics g, int x, int y);
}
