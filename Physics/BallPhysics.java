package Physics;
import GameObjects.*;

public class BallPhysics {
    public static void UpdateBall(int windowX, int windowY, Paddle paddle, Ball ball){ //Brick brick (TO DO)
        float ballCenter = (ball.getX()+ball.size()/2);
        float paddleCenter = (paddle.getX()+ paddle.getWidth()/2);

        ball.move();

        //wall collisions
        if(ball.getX() <= 0 || ball.getX()+ ball.size() >= windowX){
            ball.revX();
        }

        if(ball.getY() <= 0){
            ball.revY();
        }

        //paddle collision 
        if(ball.getPrevY()+ball.size() <= paddle.getY() && ball.getY()+ball.size() >= paddle.getY() && ballCenter>= paddle.getX() 
        && ballCenter<= paddle.getX()+paddle.getWidth() && Math.sin(ball.getAngle())>0){

            ball.setY(paddle.getY()-ball.size());

            float offset = ((ballCenter - paddleCenter)/(paddle.getWidth()/2));
            
            double maxBounce = Math.PI/3;
            ball.setAngle(-Math.PI/2 + offset * maxBounce);
        }

        
    }
   
}
