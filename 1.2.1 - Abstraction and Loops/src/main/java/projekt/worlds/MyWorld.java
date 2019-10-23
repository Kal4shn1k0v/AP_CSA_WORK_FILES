package projekt.worlds;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;
import projekt.actors.DisplayWhiteKey;
import projekt.actors.PlaySound;

public class MyWorld extends World {
    private GreenfootImage background = new GreenfootImage("wood.jpg");
    private GreenfootImage textureInactive = new GreenfootImage("white-key.png");
    private GreenfootImage textureActive = new GreenfootImage("white-key-down.png");

    private boolean isDown = false;

    DisplayWhiteKey cc = new DisplayWhiteKey();

    public void act() {
        this.setBackground(background);

        String currentKey = Greenfoot.getKey();
        //System.out.println(currentKey);

        if (currentKey != null) {
            if (!isDown && Greenfoot.isKeyDown(currentKey) ) {
                cc.setImage(textureActive);
                isDown = true;
                PlaySound.playSound(currentKey);
            } else if (isDown && !Greenfoot.isKeyDown(currentKey) ) {
                cc.setImage(textureInactive);
                isDown = false;
                PlaySound.playSound(currentKey);
                PlaySound.once = 1;
            }
        }

        if (Greenfoot.isKeyDown(null)) {
            System.out.println("mems");
        }
    }

    public MyWorld() {
        super(819, 340, 1);
        prepare();
    }

    private void prepare() {
        addObjects();
    }

    private void addObjects() {
        //3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g

        addObject(cc, 63, 126);
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
