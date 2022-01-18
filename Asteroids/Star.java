import processing.core.PApplet;

public class Star
{
    private int myX, myY;
    private PApplet applet;
    public Star(PApplet applet)
    {
        myX = (int) (Math.random() * applet.height);
        myY = (int) (Math.random() * applet.width);
        this.applet = applet;
    }

    public void show()
    {
        applet.fill(255, 255, 255);
        applet.stroke(255, 255, 255);
        applet.ellipse(myX, myY, 3, 3);
    }
}