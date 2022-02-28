package fosalgo;

import java.util.ArrayList;

public class Latihan12 {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        
        System.out.println(arrayList1);
        
        arrayList1.add(12);
        arrayList1.add(35.87);
        arrayList1.add("Pemrograman Java");
        System.out.println(arrayList1);
        
        Orang org2 = new Orang("Aninumous", "Mamuju", 18);
        arrayList1.add(org2);
        System.out.println(arrayList1);
        
        arrayList1.add('G');
        arrayList1.add(true);
        System.out.println(arrayList1);
        
        if(arrayList1.contains(35.87)){
            System.out.println("Ada 35.87");
        }
        
        arrayList1.remove(35.87);
        System.out.println(arrayList1);
        
        arrayList1.add(0, 79);
        arrayList1.add(0, 59);
        arrayList1.add(2, "Pemrograman Dasar");
        System.out.println(arrayList1);
        
        System.out.println(arrayList1.size());
        
    }
}
