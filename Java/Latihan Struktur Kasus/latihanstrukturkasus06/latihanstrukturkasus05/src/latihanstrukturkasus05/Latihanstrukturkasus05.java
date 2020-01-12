/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturkasus05;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * mencetak bilangan terbesar dari 5 buah bilangan 
 * menggunakan 1 variable bantu (B)
 * @author USER
 */
public class Latihanstrukturkasus05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner(in);
        int B1,B2,B3,B4,B5,B;
        out.print("B1 = "); B1= Baca.nextInt();
        out.print("B2 = "); B2= Baca.nextInt();
        out.print("B3 = "); B3= Baca.nextInt();
        out.print("B4 = "); B4= Baca.nextInt();
        out.print("B5 = "); B5= Baca.nextInt();   
        
        B=B1;
        
        out.print("Bilangan Terbesar = ");
        if (B<B2) B=B2;
        if (B<B3) B=B3;
        if (B<B4) B=B4;  
        if (B<B5) B=B5;   
        
        out.println(B);
    }
    
}
