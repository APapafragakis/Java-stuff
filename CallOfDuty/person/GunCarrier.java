package CallOfDuty.person;

import csd.uoc.gr.A23.armor.Gun;

public class GunCarrier {
    Gun gun;
    public GunCarrier(Gun gun){
        this.gun = gun;
    }

    public Gun getGun(){
        return gun;
    }

    public void setGun(Gun gun){
        this.gun = gun;
    }
}
