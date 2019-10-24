package projekt.worlds;

import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;
import projekt.actors.WhiteKey;
import projekt.actors.Sound;

import java.util.Arrays;

public class MyWorld extends World {
    private GreenfootImage background = new GreenfootImage("wood.jpg");
    private GreenfootImage textureInactive = new GreenfootImage("white-key.png");
    private GreenfootImage textureActive = new GreenfootImage("white-key-down.png");

    private boolean isDown = false;

    WhiteKey cc = new WhiteKey();
    WhiteKey cd = new WhiteKey();
    WhiteKey ce = new WhiteKey();
    WhiteKey cf = new WhiteKey();
    WhiteKey cg = new WhiteKey();
    WhiteKey ca = new WhiteKey();
    WhiteKey cb = new WhiteKey();
    WhiteKey dc = new WhiteKey();
    WhiteKey dd = new WhiteKey();
    WhiteKey de = new WhiteKey();
    WhiteKey df = new WhiteKey();
    WhiteKey dg = new WhiteKey();

    public void act() {
        this.setBackground(background);

        String currentKey = Greenfoot.getKey();
        boolean temp = Arrays.stream(Sound.whiteKeys).anyMatch("n"::equals);

        if (currentKey != null) {
            if (!isDown && Greenfoot.isKeyDown(currentKey)) {
                isDown = true;
                display("bruh");
                if (Arrays.asList(Sound.whiteKeys).contains(currentKey)) {
                    Sound.playWhiteSound(currentKey);
                    Sound.whiteOnce = 1;
                    System.out.println("1");
                } else if (Arrays.asList(Sound.blackKeys).contains(currentKey)) {
                    Sound.playBlackSound(currentKey);
                    Sound.blackOnce = 1;
                    System.out.println("2");
                }
                isDown = false;
            }
        } else {
            cc.setImage(textureInactive);
        }
    }

    private void display(String Keyname) {
        cc.setImage(textureActive);
        Greenfoot.delay(10);
        cc.setImage(textureInactive);
    }

    public MyWorld() {
        super(819, 340, 1);
        prepare();
    }

    private void prepare() {
        addObjects();
    }

    private void addObjects() {
        addObject(cc, 63, 126);
        addObject(cd, 126, 126);
        addObject(ce, 189, 126);
        addObject(cf, 252, 126);
        addObject(cg, 315, 126);
        addObject(ca, 378, 126);
        addObject(cb, 441, 126);
        addObject(dc, 504, 126);
        addObject(dd, 567, 126);
        addObject(de, 630, 126);
        addObject(df, 693, 126);
        addObject(dg, 756, 126);


    }
}
