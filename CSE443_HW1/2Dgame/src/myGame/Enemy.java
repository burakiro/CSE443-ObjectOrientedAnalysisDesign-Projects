package myGame;

import javax.swing.*;
import java.awt.*;

/**
 * Enemy class.
 */
public class Enemy {

    public Image img;
    private int x,y;

    /**
     * Class constructor.
     */
    public Enemy(int startX, int startY, String location) {

        x = startX;
        y = startY;
        ImageIcon l = new ImageIcon(location);
        img = l.getImage();
    }


    public Rectangle getBounds()
    {
        return new Rectangle(x,y, 58, 54);
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public Image getImage()
    {
        return img;
    }
    public void move (int dx){
        x = x - dx;
    }

}
