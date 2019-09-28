package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.MouseInfo;
import projekt.GameAPI;

public class Heinkel274 extends Actor {
    //Variable declaration.
    private int temp1 = 1;
    private int temp2 = 0;
    final int btnNONE = 0, btnLEFT = 1, btnRIGHT = 3;

    private GreenfootImage texture  = new GreenfootImage("heinkel.png");

    public void act() {
        if (temp1 == 1) {
            texture.scale(40,40);
            setImage(texture);
            System.out.println("Set texture.");
            temp1--;
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
                setLocation(GameAPI.placementX, GameAPI.placementY);
                //System.out.println(DemoApp.mouseClickXRight);
                //System.out.println(DemoApp.mouseClickYRight);
            }
        }
    }
}
