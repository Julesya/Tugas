/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistika;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author hp-ProBook
 */

public class Statistika {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ADT a = new ADT();
        a.n = 5; // mengisi data
        a.angka = new float[]{5,2,3,5,5}; //ngisi array
        
        System.out.println ("Penjumlahan = " + a.penjumlahan() );
        System.out.println ("Rata-rata = " + a.mean());
        System.out.println ("Minimal = " + a.min());
        System.out.println ("Maksimum = " + a.max());
        System.out.println ("Selisih = " + a.range());
        System.out.println ("Standard Deviasi = " + a.std());
        a.sort (); 
        System.out.println ("Nilai Tengah = " + a.median());
        System.out.println ("Modus = " + a.modus());
    }
    
}
