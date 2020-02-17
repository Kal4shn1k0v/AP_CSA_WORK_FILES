package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;
import projekt.DemoApp;

public class Pear extends Actor {
    public static int speed;
    private int once = 0;

    public Pear(){
        speed = Greenfoot.getRandomNumber(3) + 1;
    }

    public void act(){
        while(once == 0){
            GreenfootImage myimage = new GreenfootImage("pear.png");
            setImage(myimage);
            myimage.scale(40,40);
            once ++;
        }

        move(speed);

        checkEdge();
    }

    private void checkEdge() {
        if (isAtEdge()) {
            if(speed > 0){
                this.setLocation(0, this.getY());
            } else if(speed < 0){
                this.setLocation(600, this.getY());
            }
        }
    }
}
