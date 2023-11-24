import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ask3{

    static void File_R(){
        try {
            FileInputStream fis = new FileInputStream("Resources/gr.dic.txt");
            String temp;
            int count = 0;
            int sum = 0;
            int pal = 0;
            Scanner sc = new Scanner(fis);
            while(sc.hasNextLine()) {
                temp = sc.nextLine();
                count++;
                sum = sum + temp.length();
                if(Ask2.isPalindromikiFrash(temp)){
                    pal++;
                }
            }
            System.out.println("Πλήθος λέξεων: " + count );
            System.out.println("Μέσο πλήθος λέξεων: " + String.format("%.4f",(double)sum/count));
            System.out.println("Παλινδρομικές λέξεις: " + pal);
            System.out.println("Ποσοστό παλινδρομικών λέξεων: " + String.format("%.4f",((double)pal/count)*100));

            sc.close();
        } catch(IOException e)   {
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        long start = System.currentTimeMillis();
        File_R();
        long end = System.currentTimeMillis();
        float sec = (end - start) / 1000F;
        System.out.println("Time: " + sec + " seconds");
    }
}

