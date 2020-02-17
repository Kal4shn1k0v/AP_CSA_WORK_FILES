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

        playPiano();
        Greenfoot.stop();
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
        for(int n = 1; n < 6; n++){
            this.setImage("spin-" + n + ".png");
            this.wait(6);
            spinAwayToPlay(true);
        }
        twoPlayMoves(8);
        Greenfoot.playSound("snoopy.wav");
        twoPlayMoves(10);
        for(int n = 6; n > 0; n--){
            this.setImage("spin-" + n + ".png");
            this.wait(6);
            spinAwayToPlay(true);
        }
        this.setImage("cat.png");
    }

    public void wait(int time) {
        Greenfoot.delay(time);
    }

    public void twoPlayMoves(int howMany){
        for (int n = 0; n < howMany; n++) {
            setImage("cat-play-3-piano.png");
            wait(6);
            setImage("cat-play-4B-piano.png");
            wait(6);
            spinAwayToPlay(false);
        }
    }

    public void spinAwayToPlay(boolean spin){
        if(spin){
            System.out.println("Its spinning!");
        } else {
            System.out.println("Its not spinning!");
        }
    }
}
