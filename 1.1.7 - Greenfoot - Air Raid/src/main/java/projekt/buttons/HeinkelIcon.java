package projekt.buttons;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.MouseInfo;
import projekt.GameAPI;
import projekt.actors.Heinkel274;
import projekt.actors.Spitfire;
import projekt.icons.Airfield;
import projekt.worlds.MyWorld;

public class HeinkelIcon extends Actor {
    //Variable declaration.
    private int temp1 = 1;
    private boolean selectedThis = false;
    final int btnNONE = 0, btnLEFT = 1, btnRIGHT = 3;

    private GreenfootImage texture1  = new GreenfootImage("heinkel.png");
    private GreenfootImage texture2  = new GreenfootImage("explosion.png");

    public void act() {
        if (temp1 == 1) {
            texture1.scale(40,40);
            setImage(texture1);
            System.out.println("Set texture.");
            temp1--;
        }

        MouseInfo mi = Greenfoot.getMouseInfo();
        if (Greenfoot.mousePressed(null)  && Greenfoot.mouseClicked(this)) { //Core placement control.
            int button = mi.getButton();
            if (button == btnLEFT) {
                //System.out.println("Left");
            }
            if (button == btnRIGHT) {
                //System.out.println("Right");
            }
        }

        if (Greenfoot.mouseClicked(null)) {
            int button = mi.getButton();
            if (button == btnLEFT && Greenfoot.mouseClicked(this)) {
                //System.out.println("No left");
                int XLeft = Greenfoot.getMouseInfo().getX();
                int YLeft = Greenfoot.getMouseInfo().getY();
                GameAPI.XYtoGrid(XLeft, YLeft);
                selectedThis = true;
            }
            if (button == btnRIGHT && selectedThis) {
                //System.out.println("No right");
                int XRight = Greenfoot.getMouseInfo().getX();
                int YRight = Greenfoot.getMouseInfo().getY();
                GameAPI.XYtoGrid(XRight, YRight);
                GameAPI.GridToXY(GameAPI.mouseClickXgridResult, GameAPI.mouseClickYgridResult);
                GameAPI.territoryPlacementControl(GameAPI.mouseClickXgridResult, GameAPI.mouseClickYgridResult);
                if (!GameAPI.outOfBounds && GameAPI.isFriendlyTerritory) {
                    System.out.println("placement");
                    getWorld().addObject(new Heinkel274(), GameAPI.placementX, GameAPI.placementY);
                    selectedThis = false;
                    GameAPI.isFriendlyTerritory = false;
                } else if (GameAPI.outOfBounds) {
                    selectedThis = false;
                    GameAPI.outOfBounds = false;
                    GameAPI.isFriendlyTerritory = false;
                    GameAPI.territoryError("Invalid Territory!");
                }
            }
        }
    }
}
