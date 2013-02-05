package lab3;

/**
 * @author Joe
 */
public class SoldierCharacter extends Character{
    public SoldierCharacter() {
        jumpBehavior = new NormalJump();
    }
}
