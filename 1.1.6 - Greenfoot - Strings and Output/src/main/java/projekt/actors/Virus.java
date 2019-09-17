package projekt.actors;

import greenfoot.Actor;
import projekt.worlds.MyWorld;

public class Virus extends Actor {

    public void act() {
        setLocation(getX()-2, getY());
        turn(1);

        if (getX() == 0) {
            getWorld().removeObject(this);
        } else if (this.isTouching(WhiteCell.class)) {
            getWorld().removeObject(this);
        }
    }
}
