/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas08;

import static java.lang.System.out;
import java.util.Scanner;

/**
 * Konversi Detik
 * @author USER
 */
public class Tugas08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d,H,J,M,D;
    Scanner Baca = new Scanner(System.in);
    out.print("Masukkan jumlah detik = ");d=Baca.nextInt();
    D=d;
    H=D/86400; D=D%86400;
    J=D/3600; D=D%3600;
    M=D/60; D=D%60;
    out.print(d+" detik = ");
    out.print(H+" hari + ");
    out.print(J+" jam + ");
    out.print(M+" menit + ");
    out.println(D+" detik.");// TODO code application logic here
    }
    
}
