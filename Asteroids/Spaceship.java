import processing.core.PApplet;
public class Spaceship extends Floater
{
    public Spaceship(PApplet applet_)
    {
        super(applet_);
        corners = 4;
        xCorners = new int[]{-8,16,-8,-3};
        yCorners = new int[]{-8, 0, 8, 0};
        myColor = 255;
        myCenterX = applet.width / 2;
        myCenterY = applet.height / 2;
        myXspeed = 0;
        myYspeed = 0;
        myPointDirection = 0;
    }
    public void hyperSpeed()
    {
        myXspeed = 0;
        myYspeed = 0;
        myPointDirection = Math.random() * 360;
        myCenterX = Math.random() * applet.width;
        myCenterY = Math.random() * applet.height;
    }
    public double getX()
    {
        return myCenterX;
    }
    public double getY()
    {
        return myCenterY;
    }
    public double getXSpeed()
    {
        return myXspeed;
    }
    public double getYSpped()
    {
        return myYspeed;
    }
    public double getPointDirection()
    {
        return myPointDirection;
    }
}