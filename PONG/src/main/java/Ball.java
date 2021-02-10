import java.awt.*;

public class Ball {
    public Rect rect;
    public Rect leftPaddle, rightPaddle;

    private double vy = 10.0;
    private double vx = -250.0;

    public Ball(Rect rect, Rect leftPaddle, Rect rightPaddle) {
        this.rect = rect;
        this.leftPaddle = leftPaddle;
        this.rightPaddle = rightPaddle;
    }

    public double calculateNewVelocityAngle(Rect paddle) {
        double relativeIntersectY = (paddle.y + (paddle.height / 2.0)) - (this.rect.y + (this.rect.height / 2.0));
        double normalIntersectY = relativeIntersectY / (paddle.height / 2.0);
        double theta = normalIntersectY * Constants.MAX_ANGLE;
        return theta;
    }

    public void update(double dt) {
        if (vx < 0) {
            if (this.rect.x + (vx *  dt) < leftPaddle.x + leftPaddle.wight) {
                if (this.rect.y + (vy *  dt) > leftPaddle.y &&
                        this.rect.y + (vy *  dt) + this.rect.height < leftPaddle.y + leftPaddle.height) {
                    double theta = calculateNewVelocityAngle(leftPaddle);
                    double newVx = Math.abs((Math.cos(theta)) * Constants.BALL_SPEED);
                    double newVy = (-Math.sin(theta)) * Constants.BALL_SPEED;

                    double oldSign = Math.signum(vx);
                    this.vx = newVx * (-1.0 * oldSign);
                    this.vy = newVy;

                }
            }

        } else if (vx >= 0.0) {

            if (this.rect.x + (vx * dt) + rect.wight > rightPaddle.x) {
                if (this.rect.y + (vy *  dt) > rightPaddle.y &&
                        this.rect.y + (vy * dt) + this.rect.height < rightPaddle.y + rightPaddle.height) {

                    double theta = calculateNewVelocityAngle(rightPaddle);
                    double newVx = Math.abs((Math.cos(theta)) * Constants.BALL_SPEED);
                    double newVy = (-Math.sin(theta)) * Constants.BALL_SPEED;

                    double oldSign = Math.signum(vx);
                    this.vx = newVx * (-1.0 * oldSign);
                    this.vy = newVy;
                }
            }
        }
        if (vy > 0.0) {
            if (this.rect.y + (vy * dt) + this.rect.height > Constants.SCREEN_HEIGHT - Constants.INSETS_BOTTOM) {
                vy *= -1.0;
            }
        } else if (vy < 0.0) {
            if (this.rect.y + (vy * dt) < Constants.TOOLBAR_HEIGHT) {
                vy *= -1.0;
            }
        }


        this.rect.x += vx * dt;
        this.rect.y += vy * dt;
    }
}


