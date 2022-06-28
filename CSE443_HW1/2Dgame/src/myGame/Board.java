package myGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Board Class
 */
public class Board extends JPanel implements ActionListener, Runnable {

    Character myMainCharacter;
    public Image img;
    Timer time;
    int yCordRefer = 172;
    Thread animator;
    Enemy enemy1, enemy2;
    boolean lost = false;

    boolean done2 = false;
    boolean done = false;
    boolean flag = false;



    /**
     * Class constructor.
     */
    public Board() {
        myMainCharacter = new Character();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon i = new ImageIcon("Background.jpg");
        img = i.getImage();
        time = new Timer(5, this);
        time.start();
        enemy1 = new Enemy(myMainCharacter.getX() + 100, 250, "ghost.png");
        enemy2 = new Enemy(700,250,"ghost.png");
    }

    public void actionPerformed(ActionEvent e) {
        checkCollisions();
        myMainCharacter.move();
        if(myMainCharacter.getX()>400)
            enemy1.move(myMainCharacter.getdx());
        if(myMainCharacter.getX() > 500)
            enemy2.move(myMainCharacter.getdx());
        repaint();
    }


    /**
     * Collision checker
     */
public void checkCollisions(){

        Rectangle r1 = enemy1.getBounds();
        Rectangle r2 = enemy2.getBounds();
        Rectangle r3 = myMainCharacter.getBounds();
        if(r3.intersects(r1)){
            lost = true;
        }
}

    /**
     * Paint function
     */
    public void paint(Graphics g) {

        if (myMainCharacter.getdy() == 1 && done2 == false) {
            done2 = true;
            animator = new Thread(this);
            animator.start();
        }

        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        if ((myMainCharacter.getX() - 590) % 2400 == 0)// p.getX() == 590 || p.getX() == 2990)
            myMainCharacter.setnX(0);
        if ((myMainCharacter.getX() - 1790) % 2400 == 0)// p.getX() == 1790 || p.getX() == 4190)
            myMainCharacter.setnX2(0);

        g2d.drawImage(img, 685 - myMainCharacter.getnX2(), 0, null);
        if (myMainCharacter.getX() > 590) {
            g2d.drawImage(img, 685 - myMainCharacter.getnX(), 0, null);
        }
        g2d.drawImage(myMainCharacter.getImage(), 0, yCordRefer, null);

        if (myMainCharacter.getdx() == -1) {
            g2d.drawImage(img, 685 - myMainCharacter.getnX2(), 0, null);
            g2d.drawImage(myMainCharacter.getImage(), 0, yCordRefer, null);
        }

        if(myMainCharacter.getX()> 400)
                g2d.drawImage(enemy1.getImage(), enemy1.getX(), enemy1.getY(), null);
        if(myMainCharacter.getX() > 500)
                g2d.drawImage(enemy2.getImage(), enemy2.getX(), enemy2.getY(), null);
    }

    /**
     * Class Keylisteners.
     */
    private class AL extends KeyAdapter {
        public void keyReleased(KeyEvent e) {
            myMainCharacter.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            myMainCharacter.keyPressed(e);
        }
    }

    public void cycle() {

        if (flag == false)
            yCordRefer--;
        if (yCordRefer == 125)
            flag = true;
        if (flag == true && yCordRefer <= 172) {
            yCordRefer++;
            if (yCordRefer == 172) {
                done = true;
            }
        }
    }

    /**
     * Thread runner
     */
    public void run() {
        long beforeTime, timeDiff, sleep;

        beforeTime = System.currentTimeMillis();


        while (done == false) {

            cycle();
            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = 10 - timeDiff;

            if (sleep < 0)
                sleep = 2;
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }

            beforeTime = System.currentTimeMillis();
        }
        done = false;
        flag = false;
        done2 = false;
    }
}