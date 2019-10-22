package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;
import projekt.actors.DisplayWhiteKey;

public class MyWorld extends World {
    private GreenfootImage background = new GreenfootImage("wood.jpg");

    public void act() {
        this.setBackground(background);
    }

    public MyWorld() {
        super(819, 340, 1);
        prepare();
    }

    private void prepare() {
        addObjects();
    }

    private void addObjects() {
        addObject(new DisplayWhiteKey(), 63, 126);
        addObject(new DisplayWhiteKey(), 126, 126);
        addObject(new DisplayWhiteKey(), 189, 126);
        addObject(new DisplayWhiteKey(), 252, 126);
        addObject(new DisplayWhiteKey(), 315, 126);
        addObject(new DisplayWhiteKey(), 378, 126);
        addObject(new DisplayWhiteKey(), 441, 126);
        addObject(new DisplayWhiteKey(), 504, 126);
        addObject(new DisplayWhiteKey(), 567, 126);
        addObject(new DisplayWhiteKey(), 630, 126);
        addObject(new DisplayWhiteKey(), 693, 126);
        addObject(new DisplayWhiteKey(), 756, 126);
    }
}
