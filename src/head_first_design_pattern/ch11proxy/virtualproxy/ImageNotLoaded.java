package head_first_design_pattern.ch11proxy.virtualproxy;

public class ImageNotLoaded implements ImageState {
    ImageProxy imageProxy;

    @Override
    public int getIconWidth() {
        return 800;
    }
    
    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x+300, y+190);
        if (!imageProxy.retrieving) {
            imageProxy.retrieving = true;
            imageProxy.retrievalThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        imageProxy.setImageIcon(new ImageIcon(imageProxy.imageURL, "Album Cover"));
                        c.repaint();
                        imageProxy.setImageState(imageProxy.getLoadedState());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            imageProxy.retrievalThread.start();
        } 
    }
}
