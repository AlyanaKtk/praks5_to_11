package pr5.randshapes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class panel extends JPanel {
    ArrayList<shape> shapes = new ArrayList<shape>();
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setDoubleBuffered(true);
        for (shape s : shapes) s.drawFigure(g);
    }
    public void drawCircle() {
        circle c = new circle();
        c.randomFill();
        shapes.add(c);
    }
    public void drawRect() {
        rectangle r = new rectangle();
        r.randomFill();
        shapes.add(r);
    }
    public void drawRandom() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            if (r.nextInt(40) % 2 == 0) drawRect();
            else drawCircle();
        }
    }
}