package GUI;


import java.awt.*;
import javax.swing.*;

public class FrameSwing extends JFrame {
    
    public FrameSwing() {}

//  Konstruktor mit LayoutManager:
    public static FrameSwing erzeugeFrameSwing(String title, int width, int height, LayoutManager lm) {
        FrameSwing frame = new FrameSwing();
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(lm);
        
        return frame;
    }
    
//    Konstruktor ohne LayoutManager:
    public static FrameSwing erzeugeFrameSwing(String title, int width, int height) {
        FrameSwing frame = new FrameSwing();
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        return frame;
    }
    
//    leerer Konstruktor:
    public static FrameSwing erzeugeFrameSwing() {
        FrameSwing frame = new FrameSwing();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        return frame;
    }

    public static void main(String[] args) {

        FrameSwing frame = FrameSwing.erzeugeFrameSwing("Hello, World!", 300, 300, new FlowLayout());
        JButton b1= new JButton("Quit");
        frame.add(new JLabel("Label-Text im Frame"));
        frame.add(b1);
        
        frame.setVisible(true);
        

    }
}
