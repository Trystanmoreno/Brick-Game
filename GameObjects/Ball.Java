package GameObjects;
import java.awt.*;

public class Ball {
    int size;
    float speed;
    float x;
    float y;
    int dx = 1;
    int dy = -1;

    public Ball(int x, int y, float speed, int size){
        this.size = size;
        this.speed = speed;
        this.x = x; //1 = right, -1 = left
        this.y = y; // -1 = up, 1 = down

    }

    public int size() {
        return size;
    }
    
    public float getSpeed(){
        return speed;
    }

    public float getX(){
        return x;
    }
    
    public float getY(){
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
        g.fillOval((int) x,(int)y,size,size);
    }

     public void move(){
        x += dx*speed;
        y += dy*speed;
    }

    public void revX(){
        dx *= -1;
    }

    public void revY(){
        dy *= -1;
    }
}

