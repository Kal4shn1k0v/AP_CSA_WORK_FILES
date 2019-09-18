package projekt;

import greenfoot.Greenfoot;
import greenfoot.export.GreenfootScenarioApplication;

import javax.swing.*;

public class DemoApp extends GreenfootScenarioApplication {
    public static void main(String[] args) {
        resolution();

        GreenfootScenarioApplication.launch(args);
    }

    private static void resolution() {
        JFrame frame = new JFrame("Battle of Britain");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        JPanel panel = new JPanel();

        frame.add(panel);

        JLabel label = new JLabel("Please select your screen resolution.");
        label.setVisible(true);

        panel.add(label);

        String[] resolutionList = {"1920 X 1080", "1680 X 1050", "1536 X 864"};

        final JComboBox<String> screen = new JComboBox<String>(resolutionList);

        screen.setVisible(true);
        panel.add(screen);

        JButton accept = new JButton("OK");
        panel.add(accept);





        //1920 X 1080", "1680 X 1050", "1536 X 864
    }
}
