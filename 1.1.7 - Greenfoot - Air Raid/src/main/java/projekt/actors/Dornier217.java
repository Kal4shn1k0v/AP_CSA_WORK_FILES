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

        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.mousePressed(null) && Greenfoot.mouseClicked(this)) {
            int button = mouse.getButton();
            if (button == btnLEFT) System.out.println("Left");
            if (button == btnRIGHT) System.out.println("Right");
        }
        if (Greenfoot.mouseClicked(null)) {
            int button = mouse.getButton();
            if (button == btnLEFT && Greenfoot.mouseClicked(this)) {
                int XLeft = Greenfoot.getMouseInfo().getX();
                int YLeft = Greenfoot.getMouseInfo().getY();
                //System.out.println(DemoApp.mouseClickXLeft);
                //System.out.println(DemoApp.mouseClickYLeft);
                GameAPI.XYtoGrid(XLeft, YLeft);
            }
            if (button == btnRIGHT) {
                int XRight = Greenfoot.getMouseInfo().getX();
                int YRight = Greenfoot.getMouseInfo().getY();
                GameAPI.XYtoGrid(XRight, YRight);
                GameAPI.GridToXY(GameAPI.mouse);
                //System.out.println(DemoApp.mouseClickXRight);
                //System.out.println(DemoApp.mouseClickYRight);
            }
        }




        /*


        if (Greenfoot.mouseClicked(this) && DemoApp.canDetectXY) {
            DemoApp.canDetectXY = false;
            GameAPI.getTargetGrid();
            System.out.println("Clicked");
            System.out.println(DemoApp.canDetectXY);
        }*/
    }
    public static void fly() {

    }
}
