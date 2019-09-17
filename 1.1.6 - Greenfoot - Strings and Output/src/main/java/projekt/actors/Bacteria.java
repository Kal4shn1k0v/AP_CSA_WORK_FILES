package projekt.actors;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import projekt.worlds.MyWorld;

public class Bacteria extends Actor {
    public int velocity;

    private GreenfootSound slurpsound = new GreenfootSound("slurp.wav");

    public Bacteria(int speed) {
        if (speed !=0 ) {
            velocity = speed;
        } else {
            velocity = speed + 3;
        }
    }

    public void act() {
        setLocation(getX()-velocity, getY());
        turn(3);
        
        if (getX() == 0) {
            getWorld().removeObject(this);
            int scoreloopend = 15;
            int scoreloop;
            for (scoreloop = 0; scoreloop < scoreloopend; scoreloop++) {
                MyWorld.score--;
            }
        } else if (this.isTouching(WhiteCell.class)) {
            slurpsound.play();
            int scoreloopend = 20;
            int scoreloop;
            for (scoreloop = 0; scoreloop < scoreloopend; scoreloop++) {
                MyWorld.score++;
            }
            getWorld().removeObject(this);
        }
    }
}
