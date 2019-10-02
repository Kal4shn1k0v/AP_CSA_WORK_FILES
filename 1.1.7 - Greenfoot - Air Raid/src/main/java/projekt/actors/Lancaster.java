package projekt.actors;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import projekt.GameAPI;
import projekt.icons.Fabrik;

public class Lancaster extends Actor {
    //Variable declaration.
    private int temp1 = 1;
    private int friendlyPositionX;
    private int friendlyPositionY;

    //Sets texture.
    private GreenfootImage texture  = new GreenfootImage("lancaster.png");

    public void act() {
        if (temp1 == 1) {
            texture.scale(40, 40);
            setImage(texture);
            //System.out.println("Set texture.");
            temp1--;
        }

        Fabrik fabrik = getWorld().getObjects(Fabrik.class).get(0);

        if (Greenfoot.getRandomNumber(1) < 1) {
            friendlyPositionX = fabrik.getX();
            friendlyPositionY = fabrik.getY();
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
        }
    }
}
