package lab3;

/**
 * @author Joe
 */
public class Lab3Startup {
    public static void main(String[] args){
        new Lab3Startup();
    }
    
    public Lab3Startup(){
        Character soldier = new SoldierCharacter();
        Character tank = new TankCharacter();
        soldier.jump();
        tank.jump();
    }
}
