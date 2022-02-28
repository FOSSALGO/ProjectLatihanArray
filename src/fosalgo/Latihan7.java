package fosalgo;

public class Latihan7 {

    public static void main(String[] args) {
//        String[][] dataG = {
//            {"Iwan", "Majene"},
//            {"Budi", "Polewali"},
//            {"Ani", "Mamuju"},
//            {"Rhoma", "Mamasa"}
//        };

        String dataG[][] = new String[4][];
        
        dataG[0]    = new String[2];
        dataG[0][0] = "Iwan";
        dataG[0][1] = "Majene";
        
        dataG[1]    = new String[2];
        dataG[1][0] = "Budi";
        dataG[1][1] = "Polewali";
        
        dataG[2]    = new String[2];
        dataG[2][0] = "Ani";
        dataG[2][1] = "Mamuju";
        
        dataG[3]    = new String[2];
        dataG[3][0] = "Rhoma";
        dataG[3][1] = "Mamasa";

        for (int i = 0; i < dataG.length; i++) {
            for (int j = 0; j < dataG[i].length; j++) {
                System.out.print(dataG[i][j] + " ");
            }
            System.out.println();
        }
    }
}
