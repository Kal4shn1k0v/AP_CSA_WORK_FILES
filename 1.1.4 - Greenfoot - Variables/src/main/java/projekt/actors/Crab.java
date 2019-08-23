package projekt.actors;

import greenfoot.Actor;

public class Crab extends Actor {
    boolean istouching = false;

    public Crab() {
        getImage().scale(50,50);
    }

    public void act() {
        if(this.isTouching(WallNorth.class) || this.isTouching(WallEast.class) || this.isTouching(WallWest.class) || this.isTouching(WallSouth.class)) {
            System.out.println("IS TOUCHING!!!");
            //istouching = true;
        }
        else {
            istouching = false;
        }

        while(istouching = true) {
            System.out.println("IS TOUCHING!!!");
        }
    }
}
