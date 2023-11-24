package Draw;

public class Drawing {
    private int activeCapacity;
    private SolidShape[] array;

    Drawing(){
        array = new SolidShape[1000];
        activeCapacity = 0;
    }

    public void SetActive(int activeCapacity){
        this.activeCapacity = activeCapacity;
    }

    public int GetActive(){
        return activeCapacity;
    }

    public void add(SolidShape s){
        if(activeCapacity<=1000) array[activeCapacity] = s;
        activeCapacity++;
    }

    public String toString(){
        double sumFaces = 0;
        double sumVertices = 0;
        double sumEdges = 0;
        double sumVolume = 0;
        for(int i = 0; i<activeCapacity; i++){
            sumFaces = sumFaces + array[i].getNumberOfFaces();
            sumVertices = sumVertices + array[i].getNumberOfVertices();
            sumEdges = sumEdges + array[i].getNumberOfEdge();
            sumVolume = sumVolume + array[i].getVolume();
        }
        String result = "Number of shapes: " + activeCapacity + '\n';
        result = result + "Total Faces: " + sumFaces + '\n';
        result = result + "Total vertices: " + sumVertices + '\n';
        result = result + "Total edges: " + sumEdges + '\n';
        result = result + "Total volume: " + String.format("%.3f",sumVolume) + '\n';
        return result;
    }
}


