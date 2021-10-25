package be.intecbrussel;

import javax.swing.*;
import java.awt.*;

public class Graphics extends Canvas {

    public static void main(String[] args) {


        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Graphics();
        canvas.setSize(400, 400);
        frame.add(canvas);
        canvas.setBackground(Color.white);

        frame.pack();
        frame.setVisible(true);


    }

    public void paint(java.awt.Graphics g) {
        g.setColor(Color.black);
        g.fillOval(100, 100, 200, 200);

    }
 public void move() {
        setLocation(getX(), getY() +5);

 }
}


