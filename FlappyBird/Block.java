import processing.core.PApplet;

public class Block
{
    protected int myX, myY, a;
    private PApplet applet;

    public Block(PApplet applet_)
    {
        applet = applet_;
        myX = 500;
        myY = 0;
        a = ((int)((Math.random() * 2)) * 100) + 100;
        System.out.println(myY);
        System.out.println(a);
    }

    public void display()
    {
        applet.fill(255);
        applet.rect(myX, myY, 100, a);
        applet.rect(myX, myY + a + 200, 100,500);
    }

    public void move()
    {
        myX -= 5;
        if (myX <= -100)
        {
            myX = 1000;
            a = ((int)(Math.random() * 4) * 100) + 100;
        }

    }

    public int getX()
    {
        return myX;
    }

    public int getY()
    {
        return myY;
    }

    public int getDistance()
    {
        return a;
    }

}
