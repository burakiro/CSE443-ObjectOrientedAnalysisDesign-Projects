package com.CAPv2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Board implements ActionListener  {
    int oldI = 0, oldJ = 0;
    Color first;
    public JPanel getMainFrame() {
        return MainFrame;
    }
    Random rand = new Random();
    private int ClickCount = 0;
    private JPanel MainFrame;
    private JPanel EnemyAndMe;
    private JTextField TESTTESTTESTTextField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JButton button38;
    private JButton button39;
    private JButton button40;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button45;
    private JButton button46;
    private JButton button47;
    private JButton button48;
    private JButton button49;
    private JButton button50;
    private JButton button51;
    private JButton button52;
    private JButton button53;
    private JButton button54;
    private JPanel Tile;
    private JButton[][] buttons = new JButton[6][9];
    private JLabel Label0;




    public Board() {
        buttons[0][0] = this.button1;
        buttons[0][0].addActionListener(this);
        buttons[0][1] = this.button2;
        buttons[0][2] = this.button3;
        buttons[0][3] = this.button4;
        buttons[0][4] = this.button5;
        buttons[0][5] = this.button6;
        buttons[0][6] = this.button7;
        buttons[0][7] = this.button8;
        buttons[0][8] = this.button9;
        buttons[1][0] = this.button10;
        buttons[1][1] = this.button11;
        buttons[1][2] = this.button12;
        buttons[1][3] = this.button13;
        buttons[1][4] = this.button14;
        buttons[1][5] = this.button15;
        buttons[1][6] = this.button16;
        buttons[1][7] = this.button17;
        buttons[1][8] = this.button18;
        buttons[2][0] = this.button19;
        buttons[2][1] = this.button20;
        buttons[2][2] = this.button21;
        buttons[2][3] = this.button22;
        buttons[2][4] = this.button23;
        buttons[2][5] = this.button24;
        buttons[2][6] = this.button25;
        buttons[2][7] = this.button26;
        buttons[2][8] = this.button27;
        buttons[3][0] = this.button28;
        buttons[3][1] = this.button29;
        buttons[3][2] = this.button30;
        buttons[3][3] = this.button31;
        buttons[3][4] = this.button32;
        buttons[3][5] = this.button33;
        buttons[3][6] = this.button34;
        buttons[3][7] = this.button35;
        buttons[3][8] = this.button36;
        buttons[4][0] = this.button37;
        buttons[4][1] = this.button38;
        buttons[4][2] = this.button39;
        buttons[4][3] = this.button40;
        buttons[4][4] = this.button41;
        buttons[4][5] = this.button42;
        buttons[4][6] = this.button43;
        buttons[4][7] = this.button44;
        buttons[4][8] = this.button45;
        buttons[5][0] = this.button46;
        buttons[5][1] = this.button47;
        buttons[5][2] = this.button48;
        buttons[5][3] = this.button49;
        buttons[5][4] = this.button50;
        buttons[5][5] = this.button51;
        buttons[5][6] = this.button52;
        buttons[5][7] = this.button53;
        buttons[5][8] = this.button54;

        buttons[0][1].addActionListener(this);
        buttons[0][2].addActionListener(this);
        buttons[0][3].addActionListener(this);
        buttons[0][4].addActionListener(this);
        buttons[0][5].addActionListener(this);
        buttons[0][6].addActionListener(this);
        buttons[0][7].addActionListener(this);
        buttons[0][8].addActionListener(this);
        buttons[1][0].addActionListener(this);
        buttons[1][1].addActionListener(this);
        buttons[1][2].addActionListener(this);
        buttons[1][3].addActionListener(this);
        buttons[1][4].addActionListener(this);
        buttons[1][5].addActionListener(this);
        buttons[1][6].addActionListener(this);
        buttons[1][7].addActionListener(this);
        buttons[1][8].addActionListener(this);
        buttons[2][0].addActionListener(this);
        buttons[2][1].addActionListener(this);
        buttons[2][2].addActionListener(this);
        buttons[2][3].addActionListener(this);
        buttons[2][4].addActionListener(this);
        buttons[2][5].addActionListener(this);
        buttons[2][6].addActionListener(this);
        buttons[2][7].addActionListener(this);
        buttons[2][8].addActionListener(this);
        buttons[3][0].addActionListener(this);
        buttons[3][1].addActionListener(this);
        buttons[3][2].addActionListener(this);
        buttons[3][3].addActionListener(this);
        buttons[3][4].addActionListener(this);
        buttons[3][5].addActionListener(this);
        buttons[3][6].addActionListener(this);
        buttons[3][7].addActionListener(this);
        buttons[3][8].addActionListener(this);
        buttons[4][0].addActionListener(this);
        buttons[4][1].addActionListener(this);
        buttons[4][2].addActionListener(this);
        buttons[4][3].addActionListener(this);
        buttons[4][4].addActionListener(this);
        buttons[4][5].addActionListener(this);
        buttons[4][6].addActionListener(this);
        buttons[4][7].addActionListener(this);
        buttons[4][8].addActionListener(this);
        buttons[5][0].addActionListener(this);
        buttons[5][1].addActionListener(this);
        buttons[5][2].addActionListener(this);
        buttons[5][3].addActionListener(this);
        buttons[5][4].addActionListener(this);
        buttons[5][5].addActionListener(this);
        buttons[5][6].addActionListener(this);
        buttons[5][7].addActionListener(this);
        buttons[5][8].addActionListener(this);

        for(int i=0;i<6;i++){
            for(int j=0;j<9;j++){
                int randomColor = rand.nextInt(999);
                randomColor +=1;
                if(randomColor % 3 == 0)
                    buttons[i][j].setBackground(Color.red);
                if(randomColor % 3 == 1)
                    buttons[i][j].setBackground(Color.green);
                if(randomColor % 3 == 2)
                    buttons[i][j].setBackground(Color.blue);
            }
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ClickCount++;
        JButton clickedButton = (JButton)e.getSource();
        for(int i=0;i<6;i++){
            for(int j=0;j<9;j++){
                if(buttons[i][j] == clickedButton){
                    oldI = i; oldJ = j;
                }
            }
        }
        if(ClickCount % 2 ==0){
            clickedButton.setBackground(first);
            buttons[oldI][oldJ].setBackground(clickedButton.getBackground());

        }
        first = clickedButton.getBackground();

    }



    }

