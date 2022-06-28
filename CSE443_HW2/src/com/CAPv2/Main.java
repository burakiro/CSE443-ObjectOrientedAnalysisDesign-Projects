package com.CAPv2;

import javax.swing.*;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {

        Board myGame = new Board();
        JFrame frame = new JFrame("Board");
        frame.setContentPane(myGame.getMainFrame());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultLookAndFeelDecorated(true);

    }
}
