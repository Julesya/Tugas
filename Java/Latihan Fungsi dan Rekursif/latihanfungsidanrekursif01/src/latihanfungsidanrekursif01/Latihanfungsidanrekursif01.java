/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfungsidanrekursif01;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
/**
 *
 * @author USER
 */
public class Latihanfungsidanrekursif01 {

    public static double reamur(double X) {
        return (4/5.0*X);
    }
    public static double fahrenheit(double X) { 
        return (9/5.0*X+32);
    }  
    public static double kelvin(double X) {
        return (273+X);  
    }
    public static void cetak(String s, double X) {
        out.println(s+" = "+X);
    }
    public static void main(String[] args) {
      Scanner Baca = new Scanner(in);
       int C;
       out.print("Celcius= "); C= Baca.nextInt();
       cetak("celcius",C);
       cetak("reamur",reamur(C));
       cetak("fahrenheit",fahrenheit(C));
       cetak("kelvin",kelvin(C));
    }
    
}
