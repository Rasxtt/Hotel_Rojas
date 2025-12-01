package Paquete;

import java.awt.*;
import javax.swing.*;

public class PanelRedondeado extends JPanel {

    private int radio = 40; // Ajusta cuanto quieras

    public PanelRedondeado() {
        setOpaque(false);
    }

    public void setRadio(int radio) {
        this.radio = radio;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radio, radio);

        g2.dispose();
        super.paintComponent(g);
    }
}