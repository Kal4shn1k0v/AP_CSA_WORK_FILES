import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Arrays;

public class MyWorld extends World
{

    
    public MyWorld()
    {    
        super(819, 340, 1);
        prepare();
    }
    
    private void prepare() {
        addObjects();
    }
    
    private void addObjects() {
        //Adds white keys
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

        //Adds black keys
        addObject(ccH, 96, 50);
        addObject(cdH, 160, 50);
        addObject(cfH, 284, 50);
        addObject(cgH, 348, 50);
        addObject(caH, 412, 50);
        addObject(dcH, 537, 50);
        addObject(ddH, 600, 50);
    }
    
    private GreenfootImage background = new GreenfootImage("wood.jpg");
    private GreenfootImage whiteTextureInactive = new GreenfootImage("white-key.png");
    private GreenfootImage whiteTextureActive = new GreenfootImage("white-key-down.png");
    private GreenfootImage blackTextureInactive = new GreenfootImage("black-key.png");
    private GreenfootImage blackTextureActive = new GreenfootImage("black-key-down.png");

    private static String[] whiteIndex = {"cc","cd","ce","cf","cg","ca","cb","dc","dd","de","df","dg"};
    private static String[] blackIndex = {"ccH","cdH","cfH","cgH","caH","dcH","ddH"};

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

    BlackKey ccH = new BlackKey();
    BlackKey cdH = new BlackKey();
    BlackKey cfH = new BlackKey();
    BlackKey cgH = new BlackKey();
    BlackKey caH = new BlackKey();
    BlackKey dcH = new BlackKey();
    BlackKey ddH = new BlackKey();

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
                    System.out.println(currentKey);
                    display(currentKey);
                } else if (Arrays.asList(Sound.blackKeys).contains(currentKey)) {
                    Sound.playBlackSound(currentKey);
                    Sound.blackOnce = 1;
                    display(currentKey);
                }
                isDown = false;
            }
        } else {
            //cc.setImage(whiteTextureInactive);
        }
    }

    private void display(String Keyname) {
        if (Arrays.asList(Sound.whiteKeys).contains(Keyname)) {
            System.out.println(whiteIndex[Arrays.asList(Sound.whiteKeys).indexOf(Keyname)]);
            if (Keyname.equals("a")) {
                cc.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                cc.setImage(whiteTextureInactive);
            } else if (Keyname.equals("s")) {
                cd.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                cd.setImage(whiteTextureInactive);
            } else if (Keyname.equals("d")) {
                ce.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                ce.setImage(whiteTextureInactive);
            } else if (Keyname.equals("f")) {
                cf.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                cf.setImage(whiteTextureInactive);
            } else if (Keyname.equals("g")) {
                cg.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                cg.setImage(whiteTextureInactive);
            } else if (Keyname.equals("h")) {
                ca.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                ca.setImage(whiteTextureInactive);
            } else if (Keyname.equals("j")) {
                cb.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                cb.setImage(whiteTextureInactive);
            } else if (Keyname.equals("k")) {
                dc.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                dc.setImage(whiteTextureInactive);
            } else if (Keyname.equals("l")) {
                dd.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                dd.setImage(whiteTextureInactive);
            } else if (Keyname.equals(";")) {
                de.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                de.setImage(whiteTextureInactive);
            } else if (Keyname.equals("'")) {
                df.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                df.setImage(whiteTextureInactive);
            } else if (Keyname.equals("enter")) {
                dg.setImage(whiteTextureActive);
                Greenfoot.delay(10);
                dg.setImage(whiteTextureInactive);
            }
        } else if (Arrays.asList(Sound.blackKeys).contains(Keyname)) {
            System.out.println(blackIndex[Arrays.asList(Sound.blackKeys).indexOf(Keyname)]);
            if (Keyname.equals("w")) {
                ccH.setImage(blackTextureActive);
                Greenfoot.delay(10);
                ccH.setImage(blackTextureInactive);
            } else if (Keyname.equals("e")) {
                cdH.setImage(blackTextureActive);
                Greenfoot.delay(10);
                cdH.setImage(blackTextureInactive);
            } else if (Keyname.equals("t")) {
                cfH.setImage(blackTextureActive);
                Greenfoot.delay(10);
                cfH.setImage(blackTextureInactive);
            } else if (Keyname.equals("y")) {
                cgH.setImage(blackTextureActive);
                Greenfoot.delay(10);
                cgH.setImage(blackTextureInactive);
            } else if (Keyname.equals("u")) {
                caH.setImage(blackTextureActive);
                Greenfoot.delay(10);
                caH.setImage(blackTextureInactive);
            } else if (Keyname.equals("o")) {
                dcH.setImage(blackTextureActive);
                Greenfoot.delay(10);
                dcH.setImage(blackTextureInactive);
            } else if (Keyname.equals("p")) {
                ddH.setImage(blackTextureActive);
                Greenfoot.delay(10);
                ddH.setImage(blackTextureInactive);
            }
        }
    }
}
