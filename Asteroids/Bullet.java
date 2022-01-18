import processing.core.PApplet;
public class Bullet extends Floater
{
    int lifeTime;
    public Bullet(PApplet applet_, Spaceship theShip)
    {
        super(applet_);
        myCenterX = theShip.getX();
        myCenterY = theShip.getY();
        myXspeed = theShip.getXSpeed();
        myYspeed = theShip.getYSpped();
        myPointDirection = theShip.getPointDirection();
        accelerate(6);
    }
    @Override
    public void show()
    {
        applet.fill(59, 95, 176);
        applet.stroke(59, 95, 176);
        applet.translate((float)myCenterX, (float)myCenterY);

        //convert degrees to radians for rotate()
        float dRadians = (float)(myPointDirection * (Math.PI / 180));

        //rotate so that the polygon will be drawn in the correct direction
        applet.rotate(dRadians);

        //draw the polygon
        applet.rect(0,-1,10,2);

        //"unrotate" and "untranslate" in reverse order
        applet.rotate(-1 * dRadians);
        applet.translate(-1 * (float)myCenterX, -1 * (float)myCenterY);

        lifeTime++;
    }
    public double getX()
    {
        return myCenterX;
    }
    public double getY()
    {
        return myCenterY;
    }
    public int getLife()
    {
        return lifeTime;
    }
}