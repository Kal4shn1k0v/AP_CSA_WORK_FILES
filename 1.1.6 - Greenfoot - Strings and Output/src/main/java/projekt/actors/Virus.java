package projekt.actors;

import greenfoot.Actor;
import projekt.worlds.MyWorld;

public class Virus extends Actor {

    public void act() {

        if (this.isTouching(WhiteCell.class)) {
            getWorld().removeObject(this);
            MyWorld.virusKills++;
        }
    }
}
