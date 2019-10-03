/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan05;

import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
/**
 * Baca 2 bilangan bulat yaitu intA dan intB
 * hitung intA/intB dan cetak hasilnya,jika intB<>0
 * jika tidak,cetak pesan bernilai tidak berhingga ,untuk intA<>0
 * atau cetak pesan tidak terdefinisi ,untuk intA = intB =0
 * @author USER
 */
public class Latihan05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner(System.in);
        int intA,intB;
        out.print("Pembilang = "); intA= Baca.nextInt();
        out.print("Penyebut  = "); intB= Baca.nextInt();
        
        out.print(intA+"/"+intB+" = ");
        if (intB !=0) out.println(intA/intB);
        else if (intA != 0) out.println("tak berhingga");
        else out.println("tidak terdefinisi");// TODO code application logic here
    }
    
}
