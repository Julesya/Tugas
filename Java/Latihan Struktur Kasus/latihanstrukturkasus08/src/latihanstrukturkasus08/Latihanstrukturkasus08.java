/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturkasus08;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * Baca 2 bilangan bulat yaitu intA dan intB
 * 
 * @author USER
 */
public class Latihanstrukturkasus08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner Baca = new Scanner(in);
     int intA,intB;
     out.print("Pembilang = ");intA= Baca.nextInt();
     out.print("Pemnyebut = ");intB= Baca.nextInt();
     
     out.print(intA+"/"+intB+" = ");
     if(intB !=0) out.println(intA/intB);
     else if (intA !=0) out.println("Tak Terhingga");
     else out.println("Tidak Terdefinisi");
    }
    
}
