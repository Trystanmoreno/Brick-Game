package Frames;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class GameFrame extends MyFrame implements KeyListener, ActionListener{
    private int score = 0;

    int plX = 550; //initial X
    int plY = 690; // initial Y
    int plS = 5; //Player speed
    int plW = 100; //player Witdht
    int plH = 20; // player Height
    

    Timer timer;

    public GameFrame(){
        super("Game");
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();

        timer = new Timer(16, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.WHITE);

        g.setColor(new Color(200,200,200));
        g.fillRect(plX, plY, plW, plH);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        repaint();
    }

    @Override 
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()== KeyEvent.VK_A){
            plX-= plS;
        }
        if(e.getKeyCode()== KeyEvent.VK_D){
            plX+= plS;
        }

        if(plX < 0){
            plX = 0;
        }
        if(plX + plW > getWidth()){
            plX = getWidth()-plW;
        }

    }

    @Override 
    public void keyReleased(KeyEvent e){}
    @Override
    public void keyTyped(KeyEvent e){}
}

