import processing.core.PApplet;
public class HighScorePaddle
{
    private float x;
    private float y;
    private float xSpeed;
    private int xSize;
    private int ySize;
    private PApplet applet;

    public HighScorePaddle(PApplet applet_)
    {
        applet = applet_;
        x = applet.width/2;
        y = applet.height - 20 ;
        xSpeed = 10;
        xSize = 60;
        ySize = 10;
    }
    public void display()
    {
        applet.fill(255);
        applet.rect(x, y, xSize, ySize);
    }
    public void move()
    {
        if(applet.keyPressed)
        {
            if (applet.key == applet.CODED)
            {
                if (applet.keyCode == applet.LEFT)
                {
                    x -= xSpeed;
                }
                if (applet.keyCode == applet.RIGHT)
                {
                    x += xSpeed;
                }
            }
        }
    }
    public float getX()
    {
        return x;
    }
    public float getSpeed()
    {
        return xSpeed;
    }
    public void setSpeed(float s)
    {
        xSpeed = s;
    }
}