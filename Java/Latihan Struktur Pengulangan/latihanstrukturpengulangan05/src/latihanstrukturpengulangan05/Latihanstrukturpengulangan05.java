/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturpengulangan05;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * mencetak bilangan ganjil dan genap
 * @author USER
 */
public class Latihanstrukturpengulangan05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,n;
    Scanner Baca = new Scanner(in);
    out.print("Banyaknya suku= "); n= Baca.nextInt();
     for(i=1;i<n;i=i+2) {
         out.println(i+" adalah bilangan ganjil");
         out.println((i+1)+" adalah bilangan genap");
     }
    if (n%2 !=0)
        out.println(i+" adalah bilangan ganjil");
    }
    
}
