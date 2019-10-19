import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinPanel extends Actor {
    public WinPanel(String score) { //Create win message.
        setImage(new GreenfootImage("Score: " + score, 30, Color.RED, Color.BLACK));
    }

    public void act() {

    }
}
