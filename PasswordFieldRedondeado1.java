package Paquete;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PasswordFieldRedondeado1 extends JPasswordField {

    private int radio = 20;

    public PasswordFieldRedondeado1() {
        setOpaque(false); 
        setBorder(new EmptyBorder(10, 10, 10, 10)); 
    }

    public void setRadio(int radio) {
        this.radio = radio;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Elimina cualquier código que dibuje un borde aquí.
        // Si quieres dibujar el borde tú mismo, hazlo así:
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(new Color(200,200,200)); // gris claro
        g2.setStroke(new BasicStroke(2));
        g2.drawRoundRect(1, 1, getWidth()-3, getHeight()-3, radio, radio);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // SIN BORDE (lo dejamos vacío)
    }
}
