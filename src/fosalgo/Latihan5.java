package fosalgo;

public class Latihan5 {
    public static void main(String[] args) {
        String[] dataE = new String[6];
                
        dataE[3] = "Rhoma";
        dataE[5] = "Inu";        
        dataE[1] = "Budi";
        dataE[4] = "Ical";
        dataE[0] = "Iwan";
        dataE[2] = "Ani";
        
        for (String dataE1 : dataE) {
            System.out.println(dataE1);
        }
        System.out.println("------------------");
        dataE[2] = "Aninumous";
        for (String dataE1 : dataE) {
            System.out.println(dataE1);
        }
    }
}
