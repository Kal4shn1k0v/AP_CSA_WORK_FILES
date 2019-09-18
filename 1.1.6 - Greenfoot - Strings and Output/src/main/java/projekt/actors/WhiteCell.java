package projekt.actors;

import greenfoot.*;
import projekt.worlds.MyWorld;

public class WhiteCell extends Actor {
    private GreenfootSound deathsound = new GreenfootSound("death.wav");

    public void act() { //Movement.
        checkKeyPress();
    }

    private void checkKeyPress() { //Movement detection.
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-4);
        }
        
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+4);
        }

        if (this.isTouching(Virus.class)) { //Trigger death condition.
            die();
        }
    }

    public void die(){ //Death conditions and results.
        //Greenfoot.stop();
        //System.out.println("Dead");
        deathsound.play();

        int scoreloopend = 100;
        int scoreloop;
        for (scoreloop = 0; scoreloop < scoreloopend; scoreloop++) {
            MyWorld.score--;
        }
    }
}
