import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lobster extends Actor {
    boolean istouching = false;
    int time = 1000000;
    int randomDirection = Greenfoot.getRandomNumber(2);


    public Lobster() {
        getImage().scale(50,50);
    }

    public void act() {
        //Moves
        move(12);
        if(time == 1000000) {
            setRotation(Greenfoot.getRandomNumber(90));
            time++;
        }

        //Turns
        if(randomDirection == 1) {
            turn(15);
            randomDirection = Greenfoot.getRandomNumber(2);
        }
        else {
            turn(-15);
            randomDirection = Greenfoot.getRandomNumber(2);
        }

        //Detects edge
        if(isAtEdge()) {
            turn(Greenfoot.getRandomNumber(180));
        }
    }
}
