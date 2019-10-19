import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor {
    public static String temp; //Never used.

    public ScoreBoard(String text, String time) { //Create score panel.
        setImage(new GreenfootImage("Score: " + text + "    Time: " + time, 18, Color.WHITE, Color.BLACK));
    }

    public void act() { //Movement.

    }
}
