import processing.core.PApplet;
public class HighScoreGame extends PApplet
    {
    private HighScoreBall b;
    private HighScorePaddle p;
    private Score s;
    public static void main(String[] args)
    {
        PApplet.main("HighScoreGame");
    }
    public void settings()
    {
        size(500, 500);
    }
    public void setup()
    {
        p = new HighScorePaddle(this);
        s = new Score(this);
        b = new HighScoreBall(this, p, s);
    }
    public void draw()
    {
        background(0);
        b.move();
        b.display();
        p.move();
        p.display();
        s.display();
    }
}