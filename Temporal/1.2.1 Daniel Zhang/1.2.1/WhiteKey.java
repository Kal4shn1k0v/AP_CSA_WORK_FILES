import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


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
