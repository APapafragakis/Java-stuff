package Draw;

import static java.lang.Math.pow;

class Sphere extends SolidShape {
    private double radius;

    Sphere() {}

    Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }

    public void SetRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public int getNumberOfFaces() {
        return 1;
    }

    public double getVolume() {
        return ((4*p/3) * pow(radius, 3));
    }

    public String toString(){
        String result = "Sphere " + super.toString() + '\n';
        result = result + "radius: " + radius + '\n';
        return result;
    }
}
