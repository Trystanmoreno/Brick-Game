package GameObjects;
import java.awt.*;

public class Ball {
    int size;
    int speed;
    int x;
    int y;

    public Ball(int x, int y, int speed, int size){
        this.size = size;
        this.speed = speed;
        this.x = x;
        this.y = y;

    }

    public int getSize() {
        return size;
    }
    
    public int getSpeed(){
        return speed;
    }

    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillOval(x,y,size,size);
    }
}

