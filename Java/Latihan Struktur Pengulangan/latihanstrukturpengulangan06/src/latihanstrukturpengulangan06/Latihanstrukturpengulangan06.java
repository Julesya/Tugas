/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturpengulangan06;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Latihanstrukturpengulangan06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner Baca = new Scanner(in);
        out.print("banyaknya data= "); n= Baca.nextInt();
        if(n>0) {
            int i=1;
            float x,max,min,total;
            out.print("data ke"+i+" = ");
            x= Baca.nextInt();
            max=x; min=x; total=x;
        for(i=2;i<n;i++) {
            out.print("data ke"+i+" = ");
            x= Baca.nextInt();
            total +=x;
            if (max<x) max=x;
            else if (min>x) min=x;         
        }
        float range= max-min;
        float rata2=total/n;
        out.println("Bilangan Terbesar= "+max);
        out.println("Bilangan Terkecil= "+min);
        out.println("Range= "+range);
        out.println("Tota= "+total);
        out.println("Rata-Rata= "+rata2);
    }
   }
}

