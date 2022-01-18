import processing.core.PApplet;

import java.util.Random;

public class Asteroid extends Floater
{
    private double speed;
    private int scale;

    public Asteroid(PApplet applet_)
    {
        super(applet_);
        Random r = new Random();
        scale = r.nextInt(3) + 1;
        corners = 12;
        xCorners = new int[]{10, 10, 20, 20, 10, 10, -10, -10, -20, -20, -10, -10};
        yCorners = new int[]{20, 10, 10, -10, -10, -20, -20, -10, -10, 10, 10, 20};
        for (int i = 0; i < corners; i++)
        {
            xCorners[i] *= scale;
            yCorners[i] *= scale;
        }
        myColor = 0;
        myStrokeColor = 255;
        myCenterX = Math.random() * applet.width;
        myCenterY = Math.random() * applet.height;
        myXspeed = (Math.random() * 4) - 2;
        myYspeed = (Math.random() * 4) - 2;
        myPointDirection = 0;
        speed = (Math.random() * 4) -2 ;
    }

    @Override
    public void move()
    {
        super.move();
        super.turn(speed);
    }
    public double getX()
    {
        return myCenterX;
    }
    public double getY()
    {
        return myCenterY;
    }
    public int getScale()
    {
        return scale;
    }
}