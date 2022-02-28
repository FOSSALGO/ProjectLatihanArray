package fosalgo;

import java.util.Vector;

public class Latihan14 {
    public static void main(String[] args) {
        Vector<String> vector02 = new Vector<>();
        
        System.out.println(vector02);
        
        vector02.add("Iwan");
        vector02.add("Budi");
        System.out.println(vector02);
        
        
        vector02.add(1, "Ani");
        vector02.add(1, "37");
        System.out.println(vector02);
        
        System.out.println("Menggunakan method get");
        for(int i=0;i<vector02.size();i++){
            System.out.print(vector02.get(i)+" ");
        }
    }
}
