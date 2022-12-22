package head_first_design_pattern.ch11proxy.virtualproxy;

import java.net.URL;

public class ImageProxy implements Icon {
    private ImageState loadedState = new ImageLoaded();
    ImageState state = new ImageNotLoaded();
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;
    
    public ImageProxy(URL url) {
        this.imageURL = url;
    }

    @Override
    public int getIconWidth() {
        return state.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getIconHeight();
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        state.paintIcon(c, g, x, y);
    }

    public void setImageState(ImageState imageState) {
        this.state = imageState;
    }

    public ImageState getLoadedState() {
        return loadedState;
    }
}
