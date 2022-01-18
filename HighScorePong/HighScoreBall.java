import processing.core.PApplet;

public class HighScoreBall
{
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int size;
    private PApplet applet;
    private HighScorePaddle paddle;
    private Score s;

    public HighScoreBall(PApplet applet_, HighScorePaddle paddle, Score s_)
    {
        applet = applet_;
        x = applet.width / 2;
        y = applet.height / 2;
        xSpeed = 4;
        ySpeed = 3;
        size = 20;
        this.paddle = paddle;
        s = s_;
    }
    public void display()
    {
        applet.fill(255, 255, 255);
        applet.ellipse(x, y, size, size);
    }

    public void move()
    {
        x += xSpeed;
        y += ySpeed;

        if ( x > applet.width - 5 || x < 5)
        {
            xSpeed *= -1;
        }
        if (y < 5)
        {
            ySpeed *= -1;
        }
        if (collision1())
        {
            ySpeed *= -1.2;
            xSpeed *= 1.2;
            paddle.setSpeed((float)(paddle.getSpeed() * 1.2));
        }
    }
    private boolean collision1()
    {
        if (x > paddle.getX() - 10 && x < paddle.getX() + 70 && y > applet.height - 30 && y < applet.height - 20)
        {
            s.incrementScore();
            return true;
        }
        return false;
    }
}