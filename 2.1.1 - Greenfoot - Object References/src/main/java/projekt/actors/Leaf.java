package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;


public class Leaf extends Actor {
    GreenfootImage img1 = new GreenfootImage("leaf-green.png");
    GreenfootImage img2 = new GreenfootImage("leaf-brown.png");
    private int speed;

    public Leaf() {
        setImage(img1);
        speed = Greenfoot.getRandomNumber(3) + 1;      // random speed: 1 to 3
        setRotation(Greenfoot.getRandomNumber(360));
    }

    int once = 0;

    public void act() {
        while(once == 0){
            GreenfootImage myimage = new GreenfootImage("leaf-green.png");
            setImage(myimage);
            once ++;
        }

        if (isAtEdge()) {
            turn(180);
        }

        move(speed);

        if (Greenfoot.getRandomNumber(100) < 50) {
            turn(Greenfoot.getRandomNumber(5) - 2);   // -2 to 2
        }
    }

    public void changeImage() {
        if (getImage() == img1) {
            setImage(img2);
        } else {
            setImage(img1);
        }
    }
}
