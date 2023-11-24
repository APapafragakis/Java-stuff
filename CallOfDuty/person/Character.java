package CallOfDuty.person;

public interface Character {
    public boolean isAlive();
    public int getHealth();
    public void damageHealth(int damage);
    public int calculateAtomicPower();
}
