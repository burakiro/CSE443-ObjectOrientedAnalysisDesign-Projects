package myGame;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 * Class for character
 */
public class Character {
    private JumpStyle jumpStyle;

    private int x, dx, y,nx,nx2, dy;
    Image myCharImg;

    ImageIcon stickmanIcon = new ImageIcon("stickman.png");
    ImageIcon jumpIcon = new ImageIcon("jump.png");

    /**
     * Class constructor.
     */
    public Character() {
        x = 75;
        nx = 0;
        nx2= 685;
        y = 172;
        myCharImg = stickmanIcon.getImage();
    }

    /**
     * For intersections.
     */
    public Rectangle getBounds()
    {
        return new Rectangle(x,y, 78, 126);
    }

    public void setJumpLevel(JumpStyle formOfJump) {
        formOfJump.jump();
        this.jumpStyle=formOfJump;
    }

    /**
     * Move function.
     */
    public void move() {
                x = x + dx;
                nx2= nx2+dx;
                nx = nx + dx;
    }

    public int getX() {
        return x;
    }

    public int getnX() {
        return nx;
    }

    void setnX(int newNX) {
        nx = newNX;
    }

    public int getnX2() {
        return nx2;
    }

    void setnX2(int newNX2) {
        nx = newNX2;
    }

    public int getdx() {
        return dx;
    }

    public int getdy() {
        return dy;
    }

    public Image getImage() {
        return myCharImg;
    }

    /**
     * Key pressers
     */
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_D)
        {dx = 1;
            myCharImg = stickmanIcon.getImage();
        }

        if (key == KeyEvent.VK_SPACE)
        {dy = 1;
            myCharImg = jumpIcon.getImage();
        }           }

    /**
     * Key releaser
     */
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_D)
            dx = 0;


        if (key == KeyEvent.VK_SPACE)
        {dy = 0;
            myCharImg = stickmanIcon.getImage();}
    }
}
