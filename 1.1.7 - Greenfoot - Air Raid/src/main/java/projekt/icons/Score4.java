package projekt.icons;

import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.GreenfootImage;

public class Score4 extends Actor {
    public Score4(int FuelSupply) {
        setImage(new GreenfootImage("Remaining fuel supply: " + FuelSupply + " M Liters", 18, Color.BLACK, Color.WHITE));
    }
}
