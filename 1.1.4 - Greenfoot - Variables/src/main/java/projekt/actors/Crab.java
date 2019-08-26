package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Crab extends Actor {
    boolean istouching = false;
    int time = 1000000;
    int randomDirection = Greenfoot.getRandomNumber(2);


    public Crab() {
        getImage().scale(50,50);
    }

    public void act() {
        move(4);
        if(time == 1000000) {
            setRotation(Greenfoot.getRandomNumber(90));
            time++;
        }

        //Random turns
        if(randomDirection == 1) {
            turn(Greenfoot.getRandomNumber(15));
            randomDirection = Greenfoot.getRandomNumber(2);
        }
        else {
            turn(Greenfoot.getRandomNumber(-15));
            randomDirection = Greenfoot.getRandomNumber(2);
        }

        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(180));
        }
    }
}
