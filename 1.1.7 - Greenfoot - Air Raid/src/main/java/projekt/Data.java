package projekt;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import projekt.icons.Score1;
import projekt.icons.Score2;

public class Data extends Actor {
    //Variable declaration.
    public static int productionPotency;
    public static int productionPoints;
    public static int enemyPotency;
    public static int fuelSupply;

    private GreenfootImage productionPotencyBar;
    private GreenfootImage productionPointsBar;
    private GreenfootImage enemyPotencyBar;

    public Data(int ProductionPotency, int ProductionPoints, int EnemyPotency, int FuelSupply) {
        productionPotency = ProductionPotency;
        productionPoints = ProductionPoints;
        enemyPotency = EnemyPotency;
        fuelSupply = FuelSupply;
    }

    public void act() { //Not used.

    }
}
