import processing.core.PApplet;
import java.util.ArrayList;
import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;

public class AsteroidsGame extends PApplet
{
    private Spaceship ship;
    private Star[] star = new Star[200];
    List<Asteroid> asteroids = new ArrayList<>();
    private int asteroidNumbers = 15;
    List<Bullet> bullets = new ArrayList<>();

    public static void main(String[] args)
    {
        PApplet.main("AsteroidsGame");
    }

    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        ship = new Spaceship(this);
        for (int i = 0; i < star.length; i++)
        {
            star[i] = new Star(this);
        }
        for (int i = 0; i < asteroidNumbers; i++)
        {
            asteroids.add(new Asteroid(this));
        }
    }

    public void draw()
    {
        background(0);
        ship.show();
        ship.move();
        for (int i = 0; i < star.length; i++)
        {
            star[i].show();
        }
        if (keyPressed)
        {
            if (key == 'a')
            {
                ship.turn(-5);
            }
            if (key == 'd')
            {
                ship.turn(5);
            }
            if (key == 'w')
            {
                ship.accelerate(0.1);
            }
        }
        for (int i = 0; i < bullets.size(); i++)
        {
            if (bullets.get(i).getLife() > 100)
            {
                bullets.remove(i);
                i--;
            }
        }
        for (int i = 0; i < asteroids.size(); i++)
        {
            asteroids.get(i).show();
            asteroids.get(i).move();
            if(dist((float)ship.getX(),(float)ship.getY(), (float)asteroids.get(i).getX(), (float)asteroids.get(i).getY()) <= 25 * asteroids.get(i).getScale())
            {
                asteroids.remove(i);
                i--;
            }
        }
        for(int i = 0; i < bullets.size(); i++)
        {
            bullets.get(i).show();
            bullets.get(i).move();
            for (int i2 = 0; i2 < asteroids.size(); i2++)
            {
                if(dist((float)asteroids.get(i2).getX(),(float)asteroids.get(i2).getY(), (float)bullets.get(i).getX(), (float)bullets.get(i).getY()) <= 25 * asteroids.get(i2).getScale())
                {
                    bullets.remove(i);
                    asteroids.remove(i2);
                    i--;
                    i2--;
                    break;
                }
            }
        }
    }
    public void keyPressed()
    {
        if (key == 'f')
        {
            ship.hyperSpeed();
        }
        if (key == ' ')
        {
            bullets.add(new Bullet(this, ship));
        }
    }
}