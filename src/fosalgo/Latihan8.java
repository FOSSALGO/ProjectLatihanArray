package fosalgo;

public class Latihan8 {
    public static void main(String[] args) {
        Orang[] dataH = new Orang[4];
        
        dataH[0] = new Orang("Iwan", "Majene", 21);        
        dataH[1] = new Orang("Budi", "Polewali", 20);        
        dataH[2] = new Orang("Ani", "Mamuju", 18);        
        dataH[3] = new Orang("Rhoma","Mamasa", 24);
        
        System.out.println("------------------------------");
        for (int i = 0; i < dataH.length; i++) {
            System.out.println(dataH[i]);
        }
        
        System.out.println("------------------------------");
        for(Orang orng : dataH){
            System.out.println(orng);
        }
        
        
    }
}
