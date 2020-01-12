/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturkasus04;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * mencetak bilangan terbesar dari 3 buah bilangan 
 * @author USER
 */
public class Latihanstrukturkasus04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner (in);
        int B1,B2,B3;
        out.print("Bilangan Pertama = "); B1= Baca.nextInt();
        out.print("Bilang Kedua = "); B2= Baca.nextInt();
        out.print("Bilangan Ketiga = "); B3= Baca.nextInt();
        out.println("Bilangan Terbesar = ");
        if (B1>B2) 
            if(B1>B3)out.println(B1);
            else out.println(B3);
        else
            if(B2>B3)out.println(B2);
            else out.println(B3);
    }
    
} 
