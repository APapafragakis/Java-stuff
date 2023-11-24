package CallOfDuty.exception;

public class DeadCharacterException extends Exception{
    public DeadCharacterException(){
        super("Your character is dead");
    }
}
