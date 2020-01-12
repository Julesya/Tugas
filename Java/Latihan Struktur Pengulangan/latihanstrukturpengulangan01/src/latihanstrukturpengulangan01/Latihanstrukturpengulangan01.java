/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturpengulangan01;

import static java.lang.System.out;

/**
 * increment dan decrement
 * @author USER
 */
public class Latihanstrukturpengulangan01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n=8;
        out.println("n= "+n);
        n++;
        out.println("Setelah menggunakan n++, nilai n yang sekarang adalah = "+n);
        --n;
        out.println("Setelah menggunakan --n, nilai n yang sekarang adalah = "+n+"/n");
        int X=n++;
        out.println("kasus: X= n++");
        out.println("Nilai Xadalah= "+X);
        out.println("Setelah menggunakan n++, nilai n sekarang adalah "+n);
        out.println("ini artinya ");
        out.println (X= n);
        out.println ("n= n + 1\n");
        
        X=n++;
        out.println ("kasus: X= ++n");
        out.println ("Nilai X adalah "+X);
        out.println ("Setelah menggunakan ++n, nilai n sekarang adalah "+n);
        out.println ("ini artinya");
        out.println ("n= n + 1");
        out.println("X= n");
    }
    
}
