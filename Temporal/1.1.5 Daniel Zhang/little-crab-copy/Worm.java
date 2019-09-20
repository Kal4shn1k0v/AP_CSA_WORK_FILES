import greenfoot.*;

public class Worm extends Actor {
    private boolean istouching;
    private GreenfootSound slurpsound = new GreenfootSound("slurp.wav");

    public static int wormsEaten = 0;

    public Worm() {
        getImage().scale(50,50);
    }

    public void act() {
        if (isTouching(Crab.class)) {
            //slurpsound.play(); //not working correctly
            wormsEaten++;
            //System.out.println(wormsEaten);
            getWorld().removeObject(this);
        }
    }
}
