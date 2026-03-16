package Frames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame {

    MyFrame(String string){

        this.setTitle(string);
        this.setSize(1280,720); //(X,Y)
        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exits out of app
        this.setVisible(true); 

        //ImageIcon image = new ImageIcon()
        //frame.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(0, 0, 139));
    }

    
}