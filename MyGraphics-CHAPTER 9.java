package mygraphics;

import java.awt.*;
import javax.swing.*;

public class MyGraphics extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 24));
        g.drawString("Archery Training", 100, 30);
        g.setColor(Color.BLUE);
        g.drawLine(10, 30, 380, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 120, 90, 90, 450, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 120, 90, 90, 400, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 120, 90, 90, 350, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 120, 90, 90, 300, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 120, 90, 90, 250, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 120, 90, 90, 200, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 120, 90, 90, 150, 30);
        
        g.setColor(Color.RED);
        g.fillArc(199, 290, 90, 90, 450, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 290, 90, 90, 400, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 290, 90, 90, 350, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 290, 90, 90, 300, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 290, 90, 90, 250, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 290, 90, 90, 200, 30);
        g.setColor(Color.RED);
        g.fillArc(199, 290, 90, 90, 150, 30);
        
        g.setColor(Color.RED);
        g.fillArc(19, 190, 90, 90, 450, 30);
        g.setColor(Color.RED);
        g.fillArc(19, 190, 90, 90, 400, 30);
        g.setColor(Color.RED);
        g.fillArc(19, 190, 90, 90, 350, 30);
        g.setColor(Color.RED);
        g.fillArc(19, 190, 90, 90, 300, 30);
        g.setColor(Color.RED);
        g.fillArc(19, 190, 90, 90, 250, 30);
        g.setColor(Color.RED);
        g.fillArc(19, 190, 90, 90, 200, 30);
        g.setColor(Color.RED);
        g.fillArc(19, 190, 90, 90, 150, 30);
        
        g.setColor(Color.RED);
        int[] xPoints = {60, 90, 120};  // Adjusted for a smaller arrowhead
        int[] yPoints = {470, 420, 470}; // Adjusted for a smaller arrowhead
        g.fillPolygon(xPoints, yPoints, 3);       
        g.fillRect(88, 470, 5, 100);          // Adjusted width and height for a smaller shaft
        g.drawLine(88, 470, 73, 60);   
        g.drawLine(88, 470, 103, 60);  
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(">>>>>>");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        MyGraphics graphicsPanel = new MyGraphics();
        frame.add(graphicsPanel);

        frame.setVisible(true);
    }
}
