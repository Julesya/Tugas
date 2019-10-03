/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodseridanpararel;

import java.util.Scanner;

/**
 * 
 * @author USER 
 */
public class MetodSeridanPararel {
private static double Seri(double r1,double r2,double r3){
        return (r1+r2+r3);
    }
    private static double Paralel (double r1,double r2,double r3){
        return (1/(1/r1)+(1/r2)+(1/r3));
    }
    
    public static void main(String [] args ){
        Scanner Baca = new Scanner(System.in);
        double r1,r2,r3;
        System.out.print("Hambatan pertama = "); r1=Baca.nextDouble();
        System.out.print("Hambatan kedua = "); r2=Baca.nextDouble();
        System.out.print("Hambatan kettiga = "); r3=Baca.nextDouble();
        System.out.print("\n");
        System.out.println("Rangkaian Seri = "+Seri(r1,r2,r3));
        System.out.println("Rangkaian Paralel = "+Paralel(r1,r2,r3));
    }
}
        
   


    