package GameObjects;
import java.awt.*;

public class Ball {
    int size;
    float speed, x, y, prevY;
    double angle;

    public Ball(){
        this(10,0,10,20);
    }

    public Ball(int x, int y, float speed, int size){
        this.size = size;
        this.speed = speed;
        this.x = x; //1 = right, -1 = left
        this.y = y; // -1 = up, 1 = down
        angle = Math.PI/2;

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

    public float getPrevY(){
        return prevY;
    }

    public double getAngle(){
        return angle;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setSpeed(float speed){
        this.speed = speed;
    }

    public void setY(float y){
        this.y = y;
    }

    public void setX(float x){
        this.x = x;
    }

    public void setAngle(double angle){
        this.angle = angle;
    }

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillOval((int) x,(int)y,size,size);
    }

     public void move(){
        prevY = y;
        x += Math.cos(angle) * speed;
        y += Math.sin(angle) * speed;
    }

    public void revX(){
        angle = Math.PI - angle;
    }

    public void revY(){
        angle = -angle;
    }

    
}

