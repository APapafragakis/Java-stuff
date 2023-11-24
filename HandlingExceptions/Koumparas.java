package HandlingExceptions;

public class Koumparas {
    /**
     * capacity is the number of money that Koumparas can hold
     * capacity > 0
     */
    int capacity;
    /**
     *flag shows if the Koumparas is broken or not
     */
    boolean flag;
    /**
     *money is an array that holds the money we put each time
     * money[] > 0
     */
    double[] money;

    /**
     *index shows the times that we added money on Koumparas
     * index => 0 && index <= capacity
     */
    int index;

    /**
     * constructor initialize the attributes
     * @param capacity
     * constructor
     * pre condition: capacity > 0
     */
    public Koumparas(int capacity){
        this.capacity = capacity;
        flag = false;
        money = new double[capacity];
        index = 0;
    }

    /**
     * Adds money on Koumparas
     * @param money
     * @throws KoumparasIsFullException, KoumparasIsBrokenException
     * transformer
     * pre condition: money > 0
     */
    public void add(double money)throws KoumparasIsFullException, KoumparasIsBrokenException{
        if(index == capacity){
            throw new KoumparasIsFullException();
        }else if(flag){
            throw new KoumparasIsBrokenException();
        }else{
            this.money[index] = money;
            index++;
        }
    }

    /**
     *Checks if the Koumparas is broken or not
     * @return boolean
     * observer
     */
    public boolean Check(){
        return flag;
    }

    public void Break()throws KoumparasIsBrokenException{
        if(flag) throw new KoumparasIsBrokenException();
        this.flag = true;
    }

    /**
     *ValueK return the total money of Koumparas
     * @return double
     * @throws KoumparasIsNotBrokenException
     * accessor
     * post condiotion: sum >= 0
     */
    public double ValueK()throws KoumparasIsNotBrokenException{
        double sum = 0;
        if(!flag){
            throw new KoumparasIsNotBrokenException();
        }
        for(int i = 0; i<index; i++){
            sum = sum + money[i];
        }
        return sum;
    }
}