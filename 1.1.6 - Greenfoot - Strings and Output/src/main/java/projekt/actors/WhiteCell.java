package projekt.actors;

import greenfoot.*;

public class WhiteCell extends Actor {

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
    }
}
