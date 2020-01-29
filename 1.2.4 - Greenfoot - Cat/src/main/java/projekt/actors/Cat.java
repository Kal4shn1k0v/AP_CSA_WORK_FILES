package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

public class Cat extends Actor {
    private int temp1 = 1;

    private GreenfootImage texture1  = new GreenfootImage("cat.png");

    public void act(){
        if (temp1 == 1) {
            texture1.scale(40,40);
            setImage(texture1);
            temp1--;
        }


    }

    public Cat() {
    }

    public void walkLeft(int distance) {
        this.walk(distance, -10, "cat-walk.png", "cat-walk-2.png");
    }

    public void walkRight(int distance) {
        this.walk(distance, 10, "cat-walk-right.png", "cat-walk-right-2.png");
    }

    private void walk(int distance, int direction, String img1, String img2) {
        for(int i = 0; i < distance; ++i) {
            this.setImage(img1);
            this.wait(4);
            this.setLocation(this.getX() + direction, this.getY());
            this.setImage(img2);
            this.wait(4);
            this.setLocation(this.getX() + direction, this.getY());
        }

        this.setImage("cat.png");
    }

    public void playPiano() {
        this.walkRight(8);
        Greenfoot.playSound("snoopy.wav");
        this.wait(10);
        this.setImage("spin-1.png");
        this.wait(6);
        this.setImage("spin-2.png");
        this.wait(6);
        this.setImage("spin-3.png");
        this.wait(6);
        this.setImage("spin-3-piano.png");
        this.wait(6);
        this.setImage("spin-4-piano.png");
        this.wait(6);
        this.setImage("spin-5-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(3);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        Greenfoot.playSound("snoopy.wav");
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("cat-play-3-piano.png");
        this.wait(6);
        this.setImage("cat-play-4B-piano.png");
        this.wait(6);
        this.setImage("spin-5-piano.png");
        this.wait(6);
        this.setImage("spin-4-piano.png");
        this.wait(6);
        this.setImage("spin-3-piano.png");
        this.wait(6);
        this.setImage("spin-3.png");
        this.wait(6);
        this.setImage("spin-2.png");
        this.wait(6);
        this.setImage("spin-1.png");
        this.wait(6);
        this.setImage("cat.png");
    }

    public void wait(int time) {
        Greenfoot.delay(time);
    }
}
