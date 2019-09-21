package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Dornier217 extends Actor {
    public void act() {
        if (Greenfoot.isKeyDown("w")){
            move(1);
        } else if (Greenfoot.isKeyDown("s")) {
            move(-1);
        }

    }
}
