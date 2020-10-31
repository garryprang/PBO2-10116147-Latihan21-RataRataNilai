/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10116147.latihan21.rataratanilai;
import java.util.Scanner;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menghitung rata-rata nilai mahasiswa.
 */

public class PBO210116147Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner rrt = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Banyaknya mahasiswa\t\t: ");
        n = rrt.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Nilai mahasiswa ke-"+i+"\t\t: ");
                x = rrt.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println ("Rata-rata nilai mahasiswa\t: "+rata);
        System.out.println("");
        System.out.println("Developed by Garry Prang");    
    }
    
}
