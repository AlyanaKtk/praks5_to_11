package pr5;
import javax.swing.*;

public class animation extends JFrame {
    public static void main(String[] args) {
        new animation();

    }
    public animation() {
        this.setTitle("Animation");
        this.setSize(620, 640);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource("cat.gif")));
        this.add(label);
        this.setVisible(true);
    }
}

