/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstruktursekuensial07;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * menghitung rangkaianseri dan paralel
 * @author USER
 */
public class Latihanstruktursekuensial07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Baca = new Scanner(System.in);
       Double R1,R2,R3,RS,RP;
       out.print("R1= "); R1= Baca.nextDouble ();
       out.print("R2= "); R2= Baca.nextDouble ();
       out.print("R3= "); R3= Baca.nextDouble ();
       RS=R1+R2+R3;
       RP=(1/(1/R1)+(1/R2)+(1/R3));
       out.println("Rangkaian Seri ="+RS);
       out.println("Rangkaian Paralel ="+RP);
    
}
}
