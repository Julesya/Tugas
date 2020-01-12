/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstruktursekuensial06;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * menghitung persegi panjang
 * @author USER
 */
public class Latihanstruktursekuensial06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner (System.in);
        int p,l,k,L;
        out.print("Panjang= "); p= Baca.nextInt ();
        out.print("Lebar= "); l=Baca.nextInt ();
        L= p*l;
        k= 2*(p+l);
        out.println("Luas= "+L); 
        out.println("Keliling= "+k);
        
    }
    
}
