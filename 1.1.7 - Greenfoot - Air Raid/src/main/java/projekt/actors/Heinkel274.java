package projekt.actors;

import greenfoot.*;
import projekt.Data;
import projekt.GameAPI;
import projekt.worlds.MyWorld;

public class Heinkel274 extends Actor {
    //Variable declaration.
    private int temp1 = 1;
    private int temp2 = 0;
    private boolean selectedThis = false;
    private boolean dead = false;
    final int btnNONE = 0, btnLEFT = 1, btnRIGHT = 3;

    //Sets texture.
    private GreenfootImage texture1  = new GreenfootImage("heinkel.png");
    private GreenfootImage texture2  = new GreenfootImage("explosion.png");


    public void act() {
        if (temp1 == 1) {
            texture1.scale(40,40);
            setImage(texture1);
            System.out.println("Set texture.");
            temp1--;
        }

        MouseInfo mouse = Greenfoot.getMouseInfo(); //Core movement.
        if (Greenfoot.mousePressed(null) && Greenfoot.mouseClicked(this)) {
            int button = mouse.getButton();
            if (button == btnLEFT) System.out.println("Left");
            if (button == btnRIGHT) System.out.println("Right");
        }

        if (Greenfoot.mouseClicked(null) && !dead) {
            int button = mouse.getButton();
            if (button == btnLEFT && Greenfoot.mouseClicked(this)) {
                int XLeft = Greenfoot.getMouseInfo().getX();
                int YLeft = Greenfoot.getMouseInfo().getY();
                //System.out.println(DemoApp.mouseClickXLeft);
                //System.out.println(DemoApp.mouseClickYLeft);
                GameAPI.XYtoGrid(XLeft, YLeft);
                selectedThis = true;
            }
            if (button == btnRIGHT && selectedThis && !dead) {
                int XRight = Greenfoot.getMouseInfo().getX();
                int YRight = Greenfoot.getMouseInfo().getY();
                GameAPI.XYtoGrid(XRight, YRight);
                GameAPI.GridToXY(GameAPI.mouseClickXgridResult, GameAPI.mouseClickYgridResult);
                if (!GameAPI.outOfBounds) {
                    Data.fuelSupply--;
                    GameAPI.moveAnimation(1, this.getX(), this.getY(), GameAPI.placementX, GameAPI.placementY);
                    int X = GameAPI.placementX - this.getX();
                    int Y = GameAPI.placementY - this.getY();
                    System.out.println("X: " + X);
                    System.out.println("Y: " + Y);
                    System.out.println(GameAPI.actorAngle);
                    if (X == 0 && Y > 0) {
                        setRotation(GameAPI.actorAngle + 180);
                    }
                    if (X == 0 && Y < 0) {
                        setRotation(GameAPI.actorAngle);
                    }
                    if (Y == 0 && X > 0) {
                        setRotation(GameAPI.actorAngle + 0);
                    }
                    if (Y == 0 && X < 0) {
                        setRotation(GameAPI.actorAngle + 180);
                    }
                    if (X > 0 && Y > 0) {
                        setRotation(90 - GameAPI.actorAngle + 90);
                    }
                    if (X > 0 && Y < 0) {
                        setRotation(GameAPI.actorAngle);
                    }
                    if (X < 0 && Y > 0) {
                        setRotation(GameAPI.actorAngle + 180);
                    } if (X < 0 && Y < 0) {
                        setRotation(90 - GameAPI.actorAngle + 270);
                    }
                    System.out.println(GameAPI.actorAngle);
                    GameAPI.actorAngle = 0;
                    int initialX = this.getX();
                    int initialY = this.getY();
                    GameAPI.moveAnimation(1, initialX, initialY, GameAPI.placementX, GameAPI.placementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    Greenfoot.delay(1);
                    GameAPI.moveAnimation(2, initialX, initialY, GameAPI.placementX, GameAPI.placementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    Greenfoot.delay(1);
                    GameAPI.moveAnimation(3, initialX, initialY, GameAPI.placementX, GameAPI.placementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    Greenfoot.delay(1);
                    GameAPI.moveAnimation(4, initialX, initialY, GameAPI.placementX, GameAPI.placementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    Greenfoot.delay(1);
                    GameAPI.moveAnimation(5, initialX, initialY, GameAPI.placementX, GameAPI.placementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    this.setLocation(GameAPI.intermediatePlacementX, GameAPI.intermediatePlacementY);
                    Greenfoot.delay(1);
                    this.setLocation(GameAPI.placementX, GameAPI.placementY);
                    selectedThis = false;
                } else if (GameAPI.outOfBounds) {
                    GameAPI.outOfBounds = false;
                    selectedThis = false;
                    GameAPI.placementError("Out of bounds!");
                }
                //System.out.println(DemoApp.mouseClickXRight);
                //System.out.println(DemoApp.mouseClickYRight);
            }
        }

        if (this.isTouching(Spitfire.class)) {
            texture2.scale(40,40);
            setImage(texture2);
            Greenfoot.delay(2);
            getWorld().removeObject(this);
        }
    }
}
