package fosalgo;

import java.util.Arrays;

public class Latihan10 {
    public static void main(String[] args) {
        String[] dataJ = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        System.out.println("Original: "+Arrays.toString(dataJ));
        
        System.out.println("-----------------------------");
        String[] dataK = new String[9];
        System.arraycopy(dataJ, 1, dataK, 2, 7);
        System.out.println("Copy-1  : "+Arrays.toString(dataK));
        
        System.out.println("-----------------------------");
        String[] dataL = Arrays.copyOf(dataJ, 16);
        System.out.println("Copy-2  : "+Arrays.toString(dataL));
        
        System.out.println("-----------------------------");
        String[] dataM = Arrays.copyOfRange(dataJ, 2, 15);
        System.out.println("Copy-3  : "+Arrays.toString(dataM));
        
        System.out.println("-----------------------------");
        String[] dataN = dataJ.clone();
        System.out.println("Copy-4  : "+Arrays.toString(dataN));
        
        System.out.println("-----------------------------");
        String[] dataO = new String[15];
        for (int i = 0; i < dataO.length; i++) {
            String value = null;
            if(i<dataJ.length){
                value = dataJ[i];
            }
            dataO[i] = value;
        }
        System.out.println("Copy-5  : "+Arrays.toString(dataO));
    }
}
