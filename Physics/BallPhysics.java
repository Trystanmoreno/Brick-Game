package Physics;
import GameObjects.*;

public class BallPhysics {

    public static void updateBall(int windowX, Paddle paddle, Ball ball){ //Brick brick (TO DO)

        ball.move();

        wallCollision(ball, windowX);

        paddleCollision(ball, paddle);

    }
    


        //needs revision
    private static void wallCollision(Ball ball, int windowX){
         if(ball.getX() <= 0 || ball.getX()+ ball.size() >= windowX){
            ball.revX();
        }

        if(ball.getY() <= 0){
            ball.revY();
        }
    }


    private static void paddleCollision(Ball ball, Paddle paddle){
        float ballCenter = (ball.getX()+ball.size()/2);
        float paddleCenter = (paddle.getX()+ paddle.getWidth()/2);

        if(ball.getY() + ball.size() >= paddle.getY() &&
        ball.getPrevY() + ball.size() <= paddle.getY() &&
        ball.getX() + ball.size() >= paddle.getX() &&
        ball.getX() <= paddle.getX() + paddle.getWidth() && Math.sin(ball.getAngle())>0){

            ball.setY(paddle.getY()-ball.size());

            float offset = ((ballCenter - paddleCenter)/(paddle.getWidth()/2));
            
            double maxBounce = Math.PI/3;
            ball.setAngle(-Math.PI/2 + offset * maxBounce);
        }
    }
}
