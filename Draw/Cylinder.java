package Draw;

import static java.lang.Math.pow;

public class Cylinder extends SolidShape {
    private double radius, heigh;

    Cylinder(){}

    Cylinder(double radius, double heigh, double x, double y, double z){
        super(x,y,z);
        this.heigh = heigh;
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setHeigh(double heigh){
        this.heigh = heigh;
    }

    public double getRadius(){
        return radius;
    }
    public double getHeigh(){
        return heigh;
    }
    public int getNumberOfFaces(){ return 2;}
    public int getNumberOfEdge(){return 2;}
    public double getVolume(){
        return p * pow(radius,2) * heigh;
    }

    public String toString(){
        String result = "Cylinder " + super.toString() + '\n';
        result = result + "radius: " + radius + '\n';
        result = result + "heigh: " + heigh + '\n';
        return result;
    }
}
