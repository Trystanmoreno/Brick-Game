package Physics;
import GameObjects.*;

public class BallPhysics {
    public static void UpdateBall(int windowX, int windowY, Paddle paddle, Ball ball){ //Brick brick (TO DO)
        ball.move();

        if(ball.getX() <= 0 || ball.getX()+ ball.size() >= windowX){
            ball.revX();
        }
        
        if(ball.getY() <= 0){
            ball.revY();
        }


        //if(ball.getY()- ball.size()){

        //}
    }
   
}
