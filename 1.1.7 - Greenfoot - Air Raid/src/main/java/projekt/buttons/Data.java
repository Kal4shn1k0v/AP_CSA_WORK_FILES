package projekt.buttons;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Data extends Actor {
    //Variable declaration.
    private static int productionPotency;
    private static int productionPoints;
    private static int enemyPotency;
    private static int fuelSupply;

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
