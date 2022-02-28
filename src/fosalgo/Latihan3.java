package fosalgo;

import java.util.Arrays;

public class Latihan3 {
    public static void main(String[] args) {
        char[]dataC = {'y', 'Q', 'L', '#', 'k', '@', 'z'};
        System.out.println(Arrays.toString(dataC));
        
        System.out.print("[");
        for (int i = 0; i < dataC.length; i++) {
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(dataC[i]);
        }
        System.out.println("]");
    }
}
