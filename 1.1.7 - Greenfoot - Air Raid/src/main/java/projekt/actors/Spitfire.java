package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import projekt.GameAPI;
import projekt.worlds.MyWorld;

import java.util.Random;

public class Spitfire extends Actor {
    //Declares variable.
    private int friendlyPositionX;
    private int friendlyPositionY;
    private static int RandomYDestination;
    private static int RandomXDestination;
    private int temp1 = 1;
    private int temp2 = 0;

    //Sets texture.
    private GreenfootImage texture1  = new GreenfootImage("spitfire.png");
    private GreenfootImage texture2  = new GreenfootImage("explosion.png");

    private static void RandomMovement() {
        int XUpperLim = 6;
        int YUpperLim = 3;
        int XDownwardLim = 13;
        int YDownwardLim = 13;
        Random rX = new Random();
        Random rY = new Random();
        RandomXDestination = rX.nextInt(XDownwardLim - XUpperLim) + XUpperLim;
        RandomYDestination = rY.nextInt(YDownwardLim - YUpperLim) + YUpperLim;
        GameAPI.GridToXY(RandomXDestination, RandomYDestination);
        RandomXDestination = GameAPI.placementX;
        RandomYDestination = GameAPI.placementY;
    }

    public void act() {
        if (temp1 == 1) {
            texture1.scale(40,40);
            setImage(texture1);
            System.out.println("Set texture.");
            temp1--;
        }

        if (this.isTouching(Messerschmitt109.class)) {
            texture2.scale(40,40);
            setImage(texture2);
            Greenfoot.delay(2);
            getWorld().removeObject(this);
        }

        if (getWorld().getObjects(Heinkel274.class).isEmpty()){
            RandomMovement();

            friendlyPositionX = RandomXDestination;
            friendlyPositionY = RandomYDestination;
            GameAPI.moveAnimation(1, this.getX(), this.getY(), friendlyPositionX, friendlyPositionY);
            int X = friendlyPositionX - this.getX();
            int Y = friendlyPositionY - this.getY();
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
            this.setLocation(friendlyPositionX, friendlyPositionY);
        } else if (!getWorld().getObjects(Heinkel274.class).isEmpty()) {
            Heinkel274 heinkel274 = getWorld().getObjects(Heinkel274.class).get(0);

            double hypotenuse = Math.sqrt(Math.pow(getX()-heinkel274.getX(),2)+Math.pow(getY()-heinkel274.getY(),2));

            if (hypotenuse <= 200) {
                friendlyPositionX = heinkel274.getX();
                friendlyPositionY = heinkel274.getY();
                GameAPI.moveAnimation(1, this.getX(), this.getY(), friendlyPositionX, friendlyPositionY);
                int X = friendlyPositionX - this.getX();
                int Y = friendlyPositionY - this.getY();
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
                this.setLocation(friendlyPositionX, friendlyPositionY);
            } else {

            }
        } else {

        }
    }
}
