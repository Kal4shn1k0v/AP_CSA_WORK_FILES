package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;
import projekt.DemoApp;

import java.util.ArrayList;
import java.util.List;

public class Block extends Actor {
    private int delta = 2;
    private int once = 0;

    public void act() {

        while (once == 0) {
            GreenfootImage myimage = new GreenfootImage("block-light.png");
            setImage(myimage);
            once++;
        }
        move();
        checkEdge();
        checkMouseClick();
        checkLeaf();
        checkPear();
        checkApple();
    }

    private void move() {
        setLocation(getX() + delta, getY());
    }

    private void checkEdge() {
        if (isAtEdge()) {
            delta = -delta;  // reverse direction
            World world = getWorld();
            world.addObject(new Leaf(), this.getX(), this.getY());
        }
    }

    private void checkMouseClick() {
        if (Greenfoot.mouseClicked(null)) {
            List<Leaf> leafList = this.getWorld().getObjects(Leaf.class);

            for(Leaf leaf : leafList){
                leaf.changeImage();
            }
        }
    }

    private void checkLeaf() {
        Leaf leaf = (Leaf) getOneIntersectingObject(Leaf.class);
        if (leaf != null) {
            leaf.turn(DemoApp.getRandom(-90, 90));
        }
    }

    private void checkPear() {
        if(isTouching(Pear.class)) {
            List<Pear> pearList = this.getWorld().getObjects(Pear.class);

            for (Pear pear : pearList) {
                //pear.setLocation(pear.getX()+2, pear.getY());

                Pear.speed = -(Pear.speed);
            }
        }
    }

    private void checkApple(){
        if(isTouching(Apple.class)){
            List<Apple> appleList = this.getWorld().getObjects(Apple.class);

            for (Apple apple : appleList){
                apple.turn(90);
            }
        }
    }
}