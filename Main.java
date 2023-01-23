

import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
        int[][] res = new int[2][2];
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah elemen matriks A : ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println("Masukkan elemen baris ke : " + i + " kolom ke " + j);
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        
        System.out.println("Masukkan elemen matriks B : ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println("Masukkan elemen baris ke : " + i + " kolom ke " + j);
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        
        System.out.println("Matriks A");
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(a[i][j]+"    ");
            }
            System.out.println("");
        }
        System.out.println("Matriks B = ");
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(b[i][j]+"    ");
            }
            System.out.println("");
        }

        System.out.println("Hasil Penjumlahan");
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                res[i][j] = a[i][j]+b[i][j];
                System.out.print(res[i][j]+"    ");
            }
            System.out.println("");
        }

        System.out.println("Hasil Pengurangan");
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(a[i][j]-b[i][j]+"  ");
            }
            System.out.println("");
        }

            System.out.println("Hasil Perkalian");
            int satu = (a[0][0]*b[0][0] + a[0][1]*b[1][0]);
            int dua = (a[0][0]*b[0][1] + a[0][1]*b[1][1]);
            int tiga = (a[1][0]*b[0][0] + a[1][1]*b[1][0]);
            int empat = (a[1][0]*b[0][1] + a[1][1]*b[1][1]);
            
            System.out.println(satu+" "+dua+" ");
            System.out.println("");
            
            System.out.print(tiga+" "+empat+" ");
        }
    }