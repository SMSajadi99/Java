import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800,900);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);

        frame.setTitle("App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
    }
}
