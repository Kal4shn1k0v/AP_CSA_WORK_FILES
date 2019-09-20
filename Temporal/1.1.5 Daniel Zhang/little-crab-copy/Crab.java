    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    public class Crab extends Actor {
        private GreenfootImage image1 = new GreenfootImage("crab1.png");
        private GreenfootImage image2 = new GreenfootImage("crab2.png");
    
        public static boolean anotherImage = false;
    
        public Crab() {
            getImage().scale(50,50);
        }
    
        public void switchImage() {
            if (getImage().equals(image1)) {
                setImage (image2);
            }
            else {
                setImage (image1);
            }
        }
    
    
        //getWorld().addObject(new Worm(), Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(1000));
    
         public void death() {
        getWorld().addObject(new Loose(), 500,500);
    }

    public void win() {
        getWorld().addObject(new Win(), 500,500);
    }

    public void act() {
        //switches images
        switchImage();

        //moves
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 12);
        } else if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 12);
        } else if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 12, getY());
        } else if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 12, getY());
        } else if (Greenfoot.isKeyDown("q")) {
            turn(-3);
        } else if (Greenfoot.isKeyDown("e")) {
            turn(3);
        }

        if (Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("w")) {
            setLocation(getX() - 12, getY() - 12);
        } else if (Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 12, getY() - 12);
        } else if (Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("s")) {
            setLocation(getX() + 12, getY() + 12);
        } else if (Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 12, getY() + 12);
        }

        if (Worm.wormsEaten >= 10) {
            win();
        }

        if (isTouching(Lobster.class)) {
            death();
            getWorld().removeObject(this);
        }
    }
}

