package projekt.icons;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import projekt.Data;
import projekt.actors.Heinkel274;
import projekt.actors.Messerschmitt109;
import projekt.actors.Spitfire;
import projekt.worlds.MyWorld;

public class EnemyFabrik extends Actor {
    //Variable declaration.;
    private int temp1 = 1;
    public static int enemyProductionPower;

    //Sets texture.
    private GreenfootImage texture1 = new GreenfootImage("enemyfactory.png");
    private GreenfootImage texture2  = new GreenfootImage("explosion.png");

    public void act() {
        if (temp1 == 1) {
            texture1.scale(40,40);
            setImage(texture1);
            System.out.println("Set texture.");
            temp1--;
        }

        if (this.isTouching(Heinkel274.class)) {
            texture2.scale(40,40);
            setImage(texture2);
            Data.enemyPotency = Data.enemyPotency - 5;
            if (getImage().equals(texture1)) {
                getWorld().removeObject(this);
            }
        }
    }
}
