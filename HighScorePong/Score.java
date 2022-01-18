import processing.core.PApplet;
public class Score
{
    private int score;
    private PApplet applet;
    public Score(PApplet applet_)
    {
        applet = applet_;
    }

    public void incrementScore()
    {
        score ++;
    }
    public void display()
    {
        applet.fill(255, 255, 255);
        applet.textSize(40);
        applet.text(score, applet.width /2, 50);
    }
}
