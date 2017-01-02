package frame;

import javax.swing.*;

/**
 * Created by fangxue on 16/12/18.
 */
public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("hello swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);
    }
}
