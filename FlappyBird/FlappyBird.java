import processing.core.PApplet;

public class FlappyBird extends PApplet
{
    private Block p;
    private Bird b;
    private Score s;

    public static void main(String[] args)
    {
        PApplet.main("FlappyBird");
    }

    public void settings()
    {
        size(500, 750);
    }

    public void setup()
    {

        p = new Block(this);
        b = new Bird(this, s);
        s = new Score(this);
    }

    public void draw()
    {
        background(0);
        p.display();
        p.move();
        b.display();
        b.move();
        s.display();
        if (b.getY() <= (p.getDistance() + 15) && (b.getX() >= p.getX() && b.getX() <= p.getX() + 100))
        {
            exit();
        }
        else if (b.getY() >= (p.getDistance() + 200 - 15) && (b.getX() >= p.getX() && b.getX() <= p.getX() + 100))
        {
            exit();
        }
        else
        {
            s.incrementScore();
        }

    }
}


