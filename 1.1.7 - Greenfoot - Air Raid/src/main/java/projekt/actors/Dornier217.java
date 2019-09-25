package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;
import projekt.DemoApp;
import projekt.GameAPI;

public class Dornier217 extends Actor {
    final int btnNONE = 0, btnLEFT = 1, btnRIGHT = 3;

    public void act() {
        if (Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 1);
        } else if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 1);
        } else if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 1, getY());
        } else if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 1, getY());
        }

        MouseInfo mi = Greenfoot.getMouseInfo();
        if (Greenfoot.mousePressed(null) && Greenfoot.mouseClicked(this)) {
            int button = mi.getButton();
            if (button == btnLEFT) System.out.println("Left");
            if (button == btnRIGHT) System.out.println("Right");
        }
        if (Greenfoot.mouseClicked(null) && Greenfoot.mouseClicked(this)) {
            int button = mi.getButton();
            if (button == btnLEFT) {
                System.out.println("No left");
                DemoApp.mouseClickXLeft = Greenfoot.getMouseInfo().getX();
                DemoApp.mouseClickYLeft = Greenfoot.getMouseInfo().getY();
            }
            if (button == btnRIGHT) {
                System.out.println("No right");
            }
        }




        /*


        if (Greenfoot.mouseClicked(this) && DemoApp.canDetectXY) {
            DemoApp.canDetectXY = false;
            GameAPI.getTargetGrid();
<<<<<<< HEAD
            System.out.println("Clicked");
            System.out.println(DemoApp.canDetectXY);
        }

        */
=======
            System.out.println(DemoApp.hasSelectedItem);
        }

        System.out.println(DemoApp.hasSelectedItem);
>>>>>>> a73e18e92270b6fdde2bcfdcea833d3b09ee0f02
    }

    public static void fly() {

    }
}
