package pr5.randshapes;

import java.awt.*;

public abstract class shape {
    protected int x, y;
    protected Color color;

    public abstract void drawFigure(Graphics g);
    public abstract void randomFill();
}
