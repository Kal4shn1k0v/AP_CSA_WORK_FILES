package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.World;
import projekt.actors.Bacteria;
import projekt.actors.Lining;
import projekt.actors.WhiteCell;

public class MyWorld extends World {
    //Declare actors
    private Bacteria bacteria;

    private Lining lining;
    private WhiteCell whiteCell;

    public MyWorld() {
        super(780, 360, 1);
        prepare();
    }

    public void act() {
        if (Greenfoot.getRandomNumber(100) < 3) {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        }
    }

    private void prepare() {
        addObjects();
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
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
    }
}
