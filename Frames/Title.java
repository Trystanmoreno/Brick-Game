package Frames;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.border.Border;



public class Title extends MyFrame implements ActionListener{
    JButton startButton;
    
    public Title(){
        
        super("Brick Game" );
        
        Border border = BorderFactory.createLineBorder(Color.BLUE,3);

        //label
        JLabel titleText = new JLabel("Brick Game");
        titleText.setHorizontalAlignment(JLabel.CENTER);
        titleText.setVerticalAlignment(JLabel.TOP);
        titleText.setForeground(new Color(0x000000));
        titleText.setFont(new Font("Serif",Font.BOLD,36));
        titleText.setBounds(460,50,400,100);
        
        //button
        startButton = new JButton("Start");
        startButton.setBounds(550,200,150,25);
        startButton.addActionListener(this);
        
        this.setLayout(null);
        this.add(startButton);
        this.add(titleText);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == startButton){
            System.out.println("Pressed");
            GameFrame game = new GameFrame();
            game.setVisible(true);

            this.setVisible(false);
            this.dispose();

            
        }
    }
    
}

    

    



