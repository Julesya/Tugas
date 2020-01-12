/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfungsidanrekursif02;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Latihanfungsidanrekursif02 {
public static double Keliling(double x,double y) {
    return(2*(x+y));
}
public static double Luas(double x,double y) {
    return(x+y);
}
    public static void main(String[] args) {
        Scanner Baca = new Scanner(in);
        double panjang,lebar;
        out.print("Panjang= ");panjang= Baca.nextDouble();
        out.print("Lebar= ");lebar= Baca.nextDouble();
        out.println("Keliling= "+Keliling(panjang,lebar));
        out.println("Luas= "+Luas(panjang,lebar));
        
    }
    
}
