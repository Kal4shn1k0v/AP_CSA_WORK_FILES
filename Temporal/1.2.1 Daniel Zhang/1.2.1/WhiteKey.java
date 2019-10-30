import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteKey extends Actor {
    private GreenfootImage textureInactive = new GreenfootImage("white-key.png");
    private GreenfootImage textureActive = new GreenfootImage("white-key-down.png");

    public WhiteKey() {
        setImage(textureInactive);
        getImage().scale(63, 280);
    }

    private boolean isDown = false;

    public void act() {

        
    }
}