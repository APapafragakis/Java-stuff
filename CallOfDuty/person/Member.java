package CallOfDuty.person;

import csd.uoc.gr.A23.armor.Gun;
import csd.uoc.gr.A23.exception.DeadCharacterException;
import csd.uoc.gr.A23.utilities.Utilities;

public abstract class Member extends GunCarrier implements Character{
    final String name;
    int health;
    boolean bodyArmor;
    int iq;
    int physicalStrength;


    public Member(String name, int health, Gun gun, boolean bodyArmor, int iq, int physicalStrength){
        super(gun);
        this.name = name;
        this.bodyArmor = bodyArmor;
        this.iq = iq;
        this.physicalStrength = physicalStrength;
        this.health = health;
    }
    public boolean isAlive(){
        return health > 0;
    }

    public int getHealth(){
        return health;
    }

    public void damageHealth(int damage){
        health = health - damage;
    }

    public int calculateAtomicPower(){
        return iq + physicalStrength;
    }

    public String getName(){
        return name;
    }

    public boolean hasBodyArmor(){
        return bodyArmor;
    }

    public void fight(Character adversary) throws DeadCharacterException {
        int totalDamage = 0;
        int power = this.gun.getPower();
        if(!(adversary.isAlive() && this.isAlive())) throw new DeadCharacterException();
        if(adversary instanceof Member){
            if(adversary instanceof Insider){
                totalDamage = 2;
            }else{
                if(((Member) adversary).hasBodyArmor()){
                    totalDamage = power/2 + (this.calculateAtomicPower() - adversary.calculateAtomicPower());
                }else{
                    totalDamage = power + (this.calculateAtomicPower() - adversary.calculateAtomicPower());
                }
            }
        }
        adversary.damageHealth(adversary.getHealth()-totalDamage);
    }

    public int handleHostage(){
        return Utilities.getRandomVal(-2,2);
    }

}
