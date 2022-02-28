package fosalgo;

import java.util.Arrays;

public class Latihan2 {
    public static void main(String[] args) {
        double[] dataB = {12.4, 35.754, 9.31, 8.627};
        
        System.out.println("Cara 1 ------------------------");
        for (int i = 0; i < dataB.length; i++) {
            System.out.println(dataB[i]);
        }
        
        System.out.println("Cara 2 ------------------------");
        for(double nilai : dataB){
            System.out.println(nilai);
        }
        
        System.out.println("Cara 3 ------------------------");
        System.out.println(Arrays.toString(dataB));
    }
}
