package Draw;

import static java.lang.Math.pow;

public class Cube extends SolidShape{
    private int side;

    Cube(){}

    Cube(int side, double x, double y, double z){
        super(x,y,z);
        this.side = side;
    }

    public void SetSide(int side){
        this.side = side;
    }

    public int GetSide(){
        return side;
    }

    public int getNumberOfFaces(){return 6;}
    public int getNumberOfVertices(){
        return 8;
    }
    public int getNumberOfEdge(){return 12;}
    public double getVolume(){return pow(side,3);}

    public String toString(){
        String result = "Cube " + super.toString() + '\n';
        result = result + "side: " + side + '\n';
        return result;
    }
}
