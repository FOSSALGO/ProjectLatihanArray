package fosalgo;

import java.util.Vector;

public class Latihan11 {
    public static void main(String[] args) {
        Vector vector1 = new Vector();
        
        if(vector1.isEmpty()){
            System.out.println("VECTOR MASIH KOSONG");
        }else{
            System.out.println(vector1.toString());
        }
        
        vector1.add(23);
        vector1.add(25.73);
        vector1.add("Pemrograman Java");
        
        Orang org1 = new Orang("Rhoma", "Mamasa", 23);
        vector1.add(org1);
        
        vector1.add(12);
        
        if(vector1.isEmpty()){
            System.out.println("VECTOR MASIH KOSONG");
        }else{
            System.out.println(vector1.toString());
        }
        
        if(vector1.contains(12)){
            System.out.println("Ada 12 di dalam vector");
        }
        
        vector1.remove(4);
        if(vector1.isEmpty()){
            System.out.println("VECTOR MASIH KOSONG");
        }else{
            System.out.println(vector1.toString());
        }
        
    }
}
