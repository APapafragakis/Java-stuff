package A12;

import java.text.Normalizer;
import java.util.Locale;
import java.util.Scanner;
import java.lang.*;

public class Ask2{
    public static boolean isPalindromikiFrash(String s){
        int count = 0;
        s = Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9α-ωΑ-Ω]", "");
        char[] first_sentence = new char [s.length()];
        char[] second_sentence = new char [s.length()];
        for (int i = 0; i < s.length(); i++) {
            first_sentence[i] = s.charAt(i);
        }
        for(int i = 0; i<s.length(); i++){
            second_sentence[s.length()-i-1] = s.charAt(i);
        }
        for(int i=0; i<s.length(); i++){
            if(first_sentence[i] == second_sentence[i]){
                count++;
            }
        }
        if(count == s.length()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String nextLine = in.nextLine();
        if(isPalindromikiFrash(nextLine)){
            System.out.println("Η φράση είναι παλινδρομική.");
            System.out.println("Time: " + System.nanoTime() + " ns");
        }else{
            System.out.println("Η φράση δεν είναι παλινδρομική.");
            System.out.println("Time: " + System.nanoTime() + " ns");
        }
    }
}

