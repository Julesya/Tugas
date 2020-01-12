/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturkasus07;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * mencetak bilang terbesar dan terkecil dari 5 buah bilangan
 * menggunakan 2 variable bantuan (BB) (BK)
 * @author USER
 */
public class Latihanstrukturkasus07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner(in);
        int B1,B2,B3,B4,B5,BB,BK;
        out.print("B1 = "); B1= Baca.nextInt();
        out.print("B2 = "); B2= Baca.nextInt();
        out.print("B3 = "); B3= Baca.nextInt();
        out.print("B4 = "); B4= Baca.nextInt();
        out.print("B5 = "); B5= Baca.nextInt();
        
        BB=B1;BK=B1;
        
        if (BB<B2) BB=B2;
        else if (BK>B2) BK=B2;
        
        if (BB<B3) BB=B3;
        else if (BK>B3) BK=B3;
        
        if (BB<B4) BB=B4;
        else if (BK>B4) BK=B4;
        
        if (BB<B5) BB=B5;
        else if (BK>B5) BK=B5;
        
        out.println("Bilangan Terbesar = "+BB);
        out.println("Bilangan Terkecil = "+BK);
        
                
        
        
    }
    
}
