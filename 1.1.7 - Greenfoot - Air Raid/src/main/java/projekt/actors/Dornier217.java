package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.MouseInfo;
import projekt.DemoApp;
import projekt.GameAPI;

public class Dornier217 extends Actor {
    //Variable declaration.;
    private int temp1 = 1;
    final int btnNONE = 0, btnLEFT = 1, btnRIGHT = 3;

    //Sets texture.
    private GreenfootImage texture  = new GreenfootImage("dornier.png");

    public void act() {
        if (temp1 == 1) {
            texture.scale(40,40);
            setImage(texture);
            System.out.println("Set texture.");
            temp1--;
        }

        if (Greenfoot.isKeyDown("w")){ // Movement testing.
            setLocation(getX(), getY() - 1);
        } else if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 1);
        } else if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 1, getY());
        } else if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 1, getY());
        }

        MouseInfo mouse = Greenfoot.getMouseInfo(); //Core movement.
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
                GameAPI.GridToXY(GameAPI.mouseClickXgridResult, GameAPI.mouseClickYgridResult);
                if (!GameAPI.outOfBounds) {
                    this.setLocation(GameAPI.placementX, GameAPI.placementY);
                } else if (GameAPI.outOfBounds) {
                    GameAPI.outOfBounds = false;
                    GameAPI.placementError("Out of bounds!");
                }
                //System.out.println(DemoApp.mouseClickXRight);
                //System.out.println(DemoApp.mouseClickYRight);
            }
        }
    }

    public static void fly() {

    }
}