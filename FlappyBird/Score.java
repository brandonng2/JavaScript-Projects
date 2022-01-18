import processing.core.PApplet;
public class Score
{
    private int score;
    private PApplet applet;
    public Score(PApplet applet_)
    {
        applet = applet_;
        score = 0;
    }

    public void incrementScore()
    {
        score ++;
    }
    public void display()
    {
        applet.fill(255, 255, 255);
        applet.textSize(70);
        applet.text(score, applet.width /2, 100);
    }
}