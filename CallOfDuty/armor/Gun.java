package CallOfDuty.armor;

public abstract class Gun {
    final int power;

    public Gun(int power){
        this.power = power;
    }

    public int getPower(){return power;}
}
