package pr5;
import javax.swing.*;

public class getpath extends JFrame {
    public static void main(String[] args) {
            new getpath(args[0]);
    }
    public getpath(String path) {
        this.setTitle("Image");
        this.setSize(6000, 6000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource(path)));
        this.add(label);
        this.setVisible(true);
    }
}