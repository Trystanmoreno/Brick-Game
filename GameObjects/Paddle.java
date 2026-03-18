package GameObjects;
import java.awt.*;

public class Paddle{
    private int x, y, speed, width, height;
    
    public Paddle(){
        this(0,0,10,120,15);
    }

    public Paddle(int x, int y, int speed, int width,int height){
        this.x =x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public void moveR(){
        x += speed;
    }

    public void moveL(){
        y += speed;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getSpeed(){
        return speed;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(x,y,width,height);
    }
}
