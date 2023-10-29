package org.example.util;

import javax.swing.*;
import java.awt.*;

public class QRCodeFrameImage extends JPanel {
    private String imagePath;

    public QRCodeFrameImage(String imagePath) {
        this.imagePath = imagePath;
    }

    public void paint(Graphics g) {
        super.paint(g);
        ImageIcon icon = new ImageIcon(imagePath);
        g.drawImage(icon.getImage(), 0, 0, 540, 540, this);
    }

}