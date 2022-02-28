package fosalgo;

public class Latihan9 {

    public static void main(String[] args) {
//        int[][] dataI = new int[6][];
//        
//        dataI[0] = new int[4];
//        dataI[0][0] = 12;
//        dataI[0][1] = 7;        
//        dataI[0][2] = 8;
//        dataI[0][3] = 9;
//        
//        dataI[1] = new int[2];
//        dataI[1][0] = 9;
//        dataI[1][1] = 23;  
//        
//        
//        dataI[2] = new int[3];
//        dataI[2][0] = 47;
//        dataI[2][1] = 68;        
//        dataI[2][2] = 3;
//        
//        dataI[3] = new int[5];
//        dataI[3][0] = 37;
//        dataI[3][1] = 5;        
//        dataI[3][2] = 10;
//        dataI[3][3] = 2;
//        dataI[3][4] = 83;
//        
//        dataI[4] = new int[1];
//        dataI[4][0] = 14;
//        
//        dataI[5] = new int[2];
//        dataI[5][0] = 29;
//        dataI[5][1] = 17;

        int[][] dataI = {
            {12, 7, 8, 9},
            {9, 23},
            {47, 68, 3},
            {37, 5, 10, 2, 83},
            {14},
            {29, 17}
        };

        dataI[4][0] = 34;
        
        for (int m = 0;
                m < dataI.length;
                m++) {
            for (int n = 0; n < dataI[m].length; n++) {
                System.out.print(dataI[m][n] + " ");
            }
            System.out.println();
        }

    }
}
