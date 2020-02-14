package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;
import projekt.DemoApp;

public class Block extends Actor {
    private int delta = 2;

    int once = 0;

    public void act() {
        while(once == 0){
            GreenfootImage myimage = new GreenfootImage("block-light.png");
            setImage(myimage);
            once ++;
        }
        move();
        checkEdge();
        checkMouseClick();
        checkLeaf();
    }

    private void move() {
        setLocation(getX() + delta, getY());
    }

    private void checkEdge() {
        if (isAtEdge()) {
            delta = -delta;  // reverse direction
            World world = getWorld();
            world.addObject(new Leaf(),this.getX(),this.getY());
        }
    }

    private void checkMouseClick() {
        if (Greenfoot.mouseClicked(null)) {
            // do this when the mouse is clicked. currently: nothing.
        }
    }

    private void checkLeaf(){
        Leaf leaf = (Leaf)getOneIntersectingObject(Leaf.class);
        if(leaf != null) {
            Leaf.class.turn(DemoApp.getRandom(1, 360));
        }
    }
}
