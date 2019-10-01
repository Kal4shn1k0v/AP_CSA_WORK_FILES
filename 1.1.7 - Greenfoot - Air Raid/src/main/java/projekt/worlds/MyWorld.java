package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.MouseInfo;
import greenfoot.World;
import projekt.Data;
import projekt.GameAPI;
import projekt.actors.Spitfire;
import projekt.icons.*;
import projekt.actors.Dornier217;
import projekt.actors.Messerschmitt262;
import projekt.buttons.*;

public class MyWorld extends World {
    //Declare variables.
    final int btnNONE = 0, btnLEFT = 1, btnRIGHT = 3;

    public MyWorld() {
        super(1600, 1000, 1);
        prepare();
    }

    public void act() { /*
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (Greenfoot.mousePressed(null)) {
            int button = mi.getButton();
            if (button == btnLEFT) {
                System.out.println("Left");
            }
            if (button == btnRIGHT) {
                System.out.println("Right");
            }
        }
        if (Greenfoot.mouseClicked(null)) {
            int button = mi.getButton();
            if (button == btnLEFT) {
                int XLeft = Greenfoot.getMouseInfo().getX();
                int YLeft = Greenfoot.getMouseInfo().getY();
                //System.out.println(DemoApp.mouseClickXLeft);
                //System.out.println(DemoApp.mouseClickYLeft);
                GameAPI.XYtoGrid(XLeft, YLeft);
                int XRight = Greenfoot.getMouseInfo().getX();
                int YRight = Greenfoot.getMouseInfo().getY();
                GameAPI.XYtoGrid(XRight, YRight);
                GameAPI.GridToXY(GameAPI.mouseClickXgridResult, GameAPI.mouseClickYgridResult);
                System.out.println(GameAPI.placementX + ", " + GameAPI.placementY);
            }
            if (button == btnRIGHT) {
                System.out.println("No right");
            }
        } */
    }

    private void prepare() {
        addObjects();
    }

    private void addObjects() {
        addButtons();
        addVehicles();
        addScore();
    }

    private void addButtons() {
        addObject(new MesserschmittIcon(), 50, 50);
        addObject(new HeinkelIcon(), 100, 50);
        //addObject(new DornierIcon(), 100, 50);
        addObject(new AddFactory(), 50, 100);
        //addObject(new Luftflotte(), 72, 638);
        addMisc();
    }

    private void addMisc() {
        addObject(new Airfield(), 1460, 260);
        addObject(new Airfield(), 1180, 500);
        addObject(new Airfield(), 780, 740);
        addObject(new Airfield(), 1260, 820);
        addObject(new Airfield(), 580, 900);
        addObject(new Airfield(), 420, 940);
        addObject(new Airfield(), 980, 740);
        addObject(new Airfield(), 1460, 500);
        addObject(new Airfield(), 1300, 580);
        addObject(new Fabrik(), 1460, 940);
        addObject(new Fabrik(), 1460, 780);
        addObject(new Fabrik(), 940, 820);
        addObject(new Fabrik(), 1100, 780);
        addObject(new Fabrik(), 1220, 700);
        addObject(new Fabrik(), 780, 980);
        addObject(new Fabrik(), 1060, 980);
        Fabrik.friendlyProductionPower = 7;
        addObject(new EnemyFabrik(), 940, 420);
        addObject(new EnemyFabrik(), 380, 620);
        addObject(new EnemyFabrik(), 540, 380);
        addObject(new EnemyFabrik(), 820, 180);
        addObject(new EnemyFabrik(), 740, 220);
        addObject(new EnemyFabrik(), 660, 60);
        addObject(new EnemyFabrik(), 860, 420);
        addObject(new EnemyFabrik(), 740, 380);
        addObject(new EnemyFabrik(), 1060, 300);
        addObject(new EnemyFabrik(), 940, 220);
        EnemyFabrik.enemyProductionPower = 10;
    }

    private void addEnemyVehicles() {
        int xGrid1 = (int) (Math.random() * (19 - 5)) + 5;
        int yGrid1 = (int) (Math.random() * (14 - 3)) + 3;

        if (Greenfoot.getRandomNumber(500) < 1) {
            GameAPI.GridToXY(xGrid1, yGrid1);
            addObject(new Spitfire(), GameAPI.placementX, GameAPI.placementY);
        }

        int xGrid2 = (int) (Math.random() * (19 - 5)) + 5;
        int yGrid2 = (int) (Math.random() * (14 - 3)) + 3;

        if (Greenfoot.getRandomNumber(1000) < 1){
            GameAPI.GridToXY(xGrid2, yGrid2);
            addObject(new EnemyFabrik(), GameAPI.placementX, GameAPI.placementY);
        }
    }

    private void addVehicles() { //Added vehicles for testing.
        addObject(new Dornier217(), 500, 500);
        //addObject(new Messerschmitt262(), 600, 600);
    }

    private void addScore() {
        Score1 score1 = new Score1(Data.productionPotency);
        addObject(score1, 150, 200);
        Score2 score2 = new Score2(Data.productionPoints);
        addObject(score2, 150, 250);
        Score3 score3 = new Score3(Data.enemyPotency);
        addObject(score3, 150, 300);
        Score4 score4 = new Score4(Data.fuelSupply);
        addObject(score4, 150, 350);
    }

    public  void updateScore() {
        
    }
}
