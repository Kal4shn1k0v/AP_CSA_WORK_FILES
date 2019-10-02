package projekt.buttons;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.MouseInfo;
import projekt.GameAPI;
import projekt.actors.Messerschmitt109;
import projekt.icons.Airfield;

public class MesserschmittIcon extends Actor {
    //Variable declaration.
    private int temp1 = 1;
    private boolean selectedThis = false;
    final int btnNONE = 0, btnLEFT = 1, btnRIGHT = 3;

    private GreenfootImage texture  = new GreenfootImage("messerschmitt.png");

    public void act() {
        if (temp1 == 1) {
            texture.scale(40,40);
            setImage(texture);
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
                GameAPI.airfieldPlacementControl(GameAPI.mouseClickXgridResult, GameAPI.mouseClickYgridResult);
                if (!GameAPI.outOfBounds && GameAPI.isAnAirfield) {
                    System.out.println("placement");
                    getWorld().addObject(new Messerschmitt109(), GameAPI.placementX, GameAPI.placementY);
                    selectedThis = false;
                    GameAPI.outOfBounds = false;
                    GameAPI.isAnAirfield = false;
                    GameAPI.isFriendlyTerritory = false;
                } else if (GameAPI.outOfBounds) {
                    selectedThis = false;
                    GameAPI.outOfBounds = false;
                    GameAPI.isAnAirfield = false;
                    GameAPI.isFriendlyTerritory = false;
                    //GameAPI.territoryError("Invalid Territory!");
                }
            }
        }
    }
}
