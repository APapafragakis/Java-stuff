package Draw;

public class Tester {
    public static void main(String[] args){
        Drawing drawing = new Drawing();
        Drawing drawing2 = new Drawing();
        for(int i=0; i<50; i++){
           Sphere sphere = new Sphere(1,1,1,i+1);
           drawing.add(sphere);
       }
        System.out.println(drawing);
        for(int i = 0; i<50; i++){
            if(i%2==0){
                Sphere sphere2 = new Sphere(1,1,1,i+1);
                drawing2.add(sphere2);
            }else{
                Cube cube = new Cube(i+1,2,2,3);
                drawing2.add(cube);
            }
        }
        System.out.println(drawing2);
    }
}
