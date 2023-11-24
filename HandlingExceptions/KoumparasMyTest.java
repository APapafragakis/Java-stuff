package HandlingExceptions;

import static java.lang.Math.pow;

public class KoumparasMyTest {
    public static void main(String[] args) {
        Koumparas instance = new Koumparas(100);
        try {
            for(int i = 0; i<10; i++){
                instance.add(2);
            }
            if(instance.Check()){
                System.out.println("Status of Koumparas: Broken");
            }else{
                System.out.println("Status of Koumparas: Not Broken");
            }
            instance.Break();
            System.out.println("Value of Koumparas: " + instance.ValueK());
        } catch (KoumparasIsBrokenException  | KoumparasIsFullException | KoumparasIsNotBrokenException err1) {
            System.err.println(err1);
        }
    }
}
