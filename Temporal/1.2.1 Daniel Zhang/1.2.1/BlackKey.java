import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackKey extends Actor{
    private GreenfootImage textureInactive = new GreenfootImage("black-key.png");
    private GreenfootImage textureActive = new GreenfootImage("black-key-down.png");

    public BlackKey() {
        setImage(textureInactive);
        getImage().scale(37, 173);
    }

    public void act() {

    }

}