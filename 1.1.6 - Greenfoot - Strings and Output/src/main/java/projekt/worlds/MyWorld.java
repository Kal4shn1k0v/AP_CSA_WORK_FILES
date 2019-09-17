package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;
import greenfoot.World;
import projekt.actors.*;

public class MyWorld extends World {
    //Global variables
    public static int score = 0;
    public static int time = 0;

    private GreenfootSound deathsound = new GreenfootSound("death.wav");

    //Declare actors
    private Bacteria bacteria;
    private Lining lining;
    private WhiteCell whiteCell;

    public MyWorld() {
        super(780, 360, 1);
        prepare();
    }

    public void act() {
        addBacteria();
        addWall();
        addVirus();
        addRedCell();
        showText();

        if (score < 0) {
            die();
        }

        if (time > 20000) {
            win();
        }

        time++;
    }

    private void addBacteria() {
        if (Greenfoot.getRandomNumber(100) < 3) {
            addObject(new Bacteria(Greenfoot.getRandomNumber(3)), 779, Greenfoot.getRandomNumber(360));
        }
    }

    private void addWall() {
        if (Greenfoot.getRandomNumber(100) < 4) {
            addObject(new Lining(), 779, 359);
            addObject(new Lining(), 779, 3);
        }
    }

    private void addVirus() {
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Virus(), 779, Greenfoot.getRandomNumber(360));
        }
    }

    private void addRedCell() {
        if (Greenfoot.getRandomNumber(100) < 6) {
            addObject(new RedCell(Greenfoot.getRandomNumber(3), Greenfoot.getRandomNumber(6)), 779, Greenfoot.getRandomNumber(360));
        }
    }

    private void prepare() {
        addObjects();
    }

    private void die() {
        Greenfoot.stop();
        System.out.println("Dead");
        deathsound.play();
    }

    private void win() {
        Greenfoot.stop();
        WinPanel winPanel = new WinPanel(Integer.toString(score));
        addObject(winPanel, 300, 300);
    }

    private void addObjects() {
        WhiteCell whitecell = new WhiteCell();
        addObject(whitecell, 83, 179);
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        addObject(lining6, 114, 359);
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        addObject(lining8, 114, 359);
        Lining lining9 = new Lining();
        addObject(lining9, 114, 359);
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
    }

    private void showText() {
        ScoreBoard scoreBoard = new ScoreBoard(Integer.toString(score), Integer.toString(time));
        addObject(scoreBoard, 100, 50);
    }
}
