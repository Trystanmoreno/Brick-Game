package Frames;
import GameObjects.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GameFrame extends MyFrame implements KeyListener, ActionListener{
    Timer timer;
    Paddle paddle;

    public GameFrame(){
        super("Game");
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();

        paddle = new Paddle(0,0,5,120,20);
        //updates when screen is resized or first displayed
        this.addComponentListener(new ComponentAdapter(){
            @Override
            public void componentResized(ComponentEvent e){
                paddle.setX((getWidth() - paddle.getWidth())/2);
                paddle.setY((getHeight()-paddle.getHeight())-20);
            }
        });
       
       
        timer = new Timer(16, this);
        timer.start();
    }

    

    @Override
    public void paint(Graphics g){
        super.paint(g);
        paddle.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        repaint();
    }

    @Override 
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()== KeyEvent.VK_A){
            paddle.setX(paddle.getX()-paddle.getSpeed());
        }
        if(e.getKeyCode()== KeyEvent.VK_D){
            paddle.setX(paddle.getX()+paddle.getSpeed());
        }

        if(paddle.getX() < 0){
            paddle.setX(0);
        }

        if(paddle.getX() + paddle.getWidth() > getWidth()){
            paddle.setX(getWidth()-paddle.getWidth());
        }



    }

    @Override 
    public void keyReleased(KeyEvent e){}
    @Override
    public void keyTyped(KeyEvent e){}
}

