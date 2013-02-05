package lab3;

/**
 *
 * @author jrankin2
 */
public abstract class Character {
    private int xPosition, yPosition;
    private int xVelocity, yVelocity;
    JumpBehavior jumpBehavior;
    
    public Character(){
        jumpBehavior = new NormalJump();
    }
    
    public void jump(){
        //jump
        jumpBehavior.jump();
    }
    
    public void setJumpBehavior(JumpBehavior j){
        jumpBehavior = j;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
}
