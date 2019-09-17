package projekt.actors;

import greenfoot.*;
import projekt.worlds.MyWorld;

public class WhiteCell extends Actor {
    private GreenfootSound deathsound = new GreenfootSound("death.wav");

    public void act() {
        checkKeyPress();
    }

    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-4);
        }
        
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+4);
        }

        if (this.isTouching(Virus.class)) {
            die();
        }
    }

    public void die(){
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
