import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateGUI
{
    private static void createAndShowGUI() 
    {
        //Create and set up the window.
        JFrame frame = new JFrame("TabDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        //Create and set up the content pane.
        TabDemo demo = new TabDemo();
        demo.addComponentToPane(frame.getContentPane());
    
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

}