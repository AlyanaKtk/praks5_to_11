package pr5.randshapes;

import javax.swing.*;
import java.awt.*;

public class tester extends JFrame {

    JPanel bottomPanel = new JPanel();
    panel draw = new panel();
    public static void main(String args[]) {
        new tester();
    }
    public tester() {
        super("Figures");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520, 420);
        JButton addRandomShapes = new JButton("20 случайных фигур");
        addRandomShapes.addActionListener(e -> onAddShapesClick());
        bottomPanel.add(addRandomShapes);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(draw, BorderLayout.CENTER);
        setVisible(true);

    }
    private void onAddShapesClick() {
        draw.drawRandom();
        repaint();
    }
}