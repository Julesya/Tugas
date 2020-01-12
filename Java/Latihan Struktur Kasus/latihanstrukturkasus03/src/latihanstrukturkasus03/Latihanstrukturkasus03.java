/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturkasus03;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * mencetak bilangan terbesar dari 2buah bilangan
 * @author USER
 */
public class Latihanstrukturkasus03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Baca = new Scanner(in);
       int B1,B2;
       out.print("Bilangan Pertama = "); B1= Baca.nextInt();
       out.print("Bilangan Kedua = "); B2= Baca.nextInt();
       out.print("\nBilangan Terbesar dari "+B1+" dan "+B2+" adalah ");
       if (B1>B2)  out.println(B1);
       else out.println(B2);
    }
    
}
