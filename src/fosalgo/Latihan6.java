package fosalgo;

import java.util.Arrays;

public class Latihan6 {
    public static void main(String[] args) {
//        int[][] dataF = {
//            {12, 7, 8, 9},
//            {9, 23, 10, 2},
//            {47, 68, 3, 5}
//        };
        
        int[][] dataF = new int[3][4];
        dataF[0][0] = 12;
        dataF[0][1] = 7;
        dataF[0][2] = 8;
        dataF[0][3] = 9;
        
        dataF[2][0] = 47;
        dataF[2][1] = 68;
        dataF[2][2] = 3;
        dataF[2][3] = 5;
        
        dataF[1][0] = 9;
        dataF[1][1] = 23;
        dataF[1][2] = 10;
        dataF[1][3] = 2;
        
        System.out.println("--------------------");
        for (int m = 0; m <dataF.length; m++) {
            for(int n=0; n<dataF[m].length;n++){
                System.out.print(dataF[m][n]+" ");
            }
            System.out.println();
        }
        
        System.out.println("-------------------");
        for (int m = 0; m <dataF.length; m++) {
            System.out.println(Arrays.toString(dataF[m]));
        }
        
        System.out.println("----------------------");
        for(int[]baris : dataF){
            for(int elemen : baris){
                System.out.print(elemen+" ");
            }
            System.out.println( );
        }
        
        System.out.println("---------------------------");
        for(int[]baris : dataF){
            for(int k=0;k<baris.length;k++){
                System.out.print(baris[k]+" ");
            }
            System.out.println();
        }
        
        System.out.println("--------------------------");
        for(int k=0;k<dataF.length;k++){
            for(int elemen : dataF[k]){
                System.out.print(elemen+" ");
            }
            System.out.println();
        }
    }
}
