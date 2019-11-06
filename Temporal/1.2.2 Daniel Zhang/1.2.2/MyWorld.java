import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World {


    public MyWorld() {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        setup();
        //setupLine();
    }

    public static int size = 190;

    public void setup() {

        int direction = 0;

        for (int i = 1; i <= 19; i++) {
            Bubble bubble = new Bubble(size, direction);
            addObject(bubble, 450, 300);
            //bubble.setRotation(direction);
            direction += 20;
            size -= 10;
            if (size == 0){
                size ++;
            }
            System.out.println(size);
        }
    }

    public void setupLine() {
        int x = 0;
        int y = 0;
        for (int i = 1; i <= 20; i++) {
            //Bubble bubble = new Bubble();
            //addObject(bubble, x, y);
            x = x + 45;
            y = y + 30;
        }
    }
}
