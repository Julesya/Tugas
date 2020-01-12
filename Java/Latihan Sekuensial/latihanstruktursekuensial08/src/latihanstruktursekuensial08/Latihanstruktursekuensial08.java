/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstruktursekuensial08;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * mengkonversikan detik
 * @author USER
 */
public class Latihanstruktursekuensial08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner (System.in);
        int d,H,J,M,D;
        out.print("Masukan Jumlah Detik = "); d=Baca.nextInt();
        D=d;
        H=D/86400; D=D%86400;
        J=D/3600; D=D%3600;
        M=D/60; D=D%60;
        out.print(d+" detik = ");
        out.print(H+" Hari +");
        out.print(J+" Jam +");
        out.print(M+" Menit +");
        out.println(D+" Detik");
       
        
    }
    
}
