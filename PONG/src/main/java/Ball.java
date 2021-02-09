import java.awt.*;

public class Ball {
    public Rect rect;
    public Rect leftPaddle, rightPaddle;

    private double vy = 10.0;
    private double vx = -290.0;

    public Ball(Rect rect, Rect leftPaddle, Rect rightPaddle) {
        this.rect = rect;
        this.leftPaddle = leftPaddle;
        this.rightPaddle = rightPaddle;
    }

    public double calculateNewVelocityAngle(Rect paddle) {
        double relativeIntersectY = (paddle.y + (paddle.height / 2.0)) - (this.rect.y + (this.rect.y / 2.0));
        double normalIntersectY = relativeIntersectY / (paddle.height / 2.0);
        double theta = normalIntersectY * Constants.MAX_ANGLE;
        return theta;
    }

    public void update(double dt) {
        if (vx < 0) {
            if (this.rect.x <= leftPaddle.x + this.leftPaddle.wight && this.rect.x + this.rect.wight >= this.leftPaddle.x &&
                    this.rect.y >= this.leftPaddle.y && this.rect.y <= this.leftPaddle.y + this.leftPaddle.height) {
                this.vx *= -1;
                this.vy *= -1;

            } else if (this.rect.x + this.rect.wight < this.leftPaddle.x) {
                System.out.println("you lost");
            }

        } else if (vx > 0) {

            if (this.rect.x + this.rect.wight >= this.rightPaddle.x && this.rect.x <= this.rightPaddle.x + this.rightPaddle.wight &&
                    this.rect.y >= this.rightPaddle.y && this.rect.y <= this.rightPaddle.y + this.leftPaddle.height) {
                this.vx *= -1;
                this.vy *= -1;

            } else if (this.rect.x + this.rect.wight > this.rightPaddle.x + this.rightPaddle.wight) {
                System.out.println("AI lost");
            }


        }
            if (vy > 0) {
                if (this.rect.y + this.rect.height > Constants.SCREEN_HEIGHT) {
                    this.vy *= -1;
                }
            } else if (vy < 0) {
                if (this.rect.y < Constants.TOOLBAR_HEIGHT) {
                    this.vy *= -1;
                }
            }


            this.rect.x += vx * dt;
            this.rect.y += vy * dt;
        }
    }


