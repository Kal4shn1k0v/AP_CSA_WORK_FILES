import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
