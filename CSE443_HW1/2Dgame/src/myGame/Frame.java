package myGame;

import javax.swing.*;
import java.awt.*;

/**
 * Frame class.
 */
public class Frame extends JFrame {
    /**
     * Class constructor.
     */
    public Frame(){

        JFrame frame = new JFrame();

        frame.add(new Board());
        frame.setTitle("Run Run!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,565);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);

    }
    public static void main(String[] args){
        new Frame();

    }
}
