package pr5.randshapes;

import java.awt.*;
import java.util.Random;

public class circle extends shape {
    private int radius;

    @Override
    public void drawFigure(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }

    @Override
    public void randomFill() {
        Random rand = new Random();
        color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        x = rand.nextInt(300);
        y = rand.nextInt(300);
        radius = 10 + rand.nextInt(41);
    }
}