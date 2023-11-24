package Draw;

public class SolidShape {

    public static final double p = 3.14159265;
    private double x,y,z;

    public SolidShape() {}

    SolidShape(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void Setx(double x){
        this.x=x;
    }
    public void Sety(double y){
        this.y=y;
    }
    public void Setz(double z){
        this.z=z;
    }

    public double Getx(){
        return x;
    }

    public double Gety(){
        return y;
    }

    public double Getz(){
        return z;
    }
    public int getNumberOfFaces(){
        return 0;
    }
    public int getNumberOfVertices(){
        return 0;
    }
    public int getNumberOfEdge(){
        return 0;
    }
    public double getVolume(){
        return 0.0;
    }

    public String toString(){
        String result = "Solid shape centered at ("+x+","+y+","+z+") with"+ '\n';
        result = result + "faces: " + getNumberOfFaces() + '\n';
        result = result + "vertices: " + getNumberOfVertices() + '\n';
        result = result + "edges: " + getNumberOfEdge() + '\n';
        result = result + "volume: " + getVolume() + '\n';
        return result;
    }
}
