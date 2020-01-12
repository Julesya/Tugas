/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturkasus10;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * mencetak nilai fungsi f(x)= 0 untuk x<0
 * mencetak nilai fungsi f(x)= 5 untuk 0<=x<=10
 * mencetak nilai fungsi f(x)= 10 untuk 10<=x<=20
 * mencetak nilai fungsi f(x)= 15 untuk 20<=x<=30
 * mencetak nilai fungsi f(x)= 20 untuk x>=40
 * @author USER
 */
public class Latihanstrukturkasus10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner(in);
        int x,f;
        out.print("x = "); x= Baca.nextInt();
        if (x<0) f=0;
        else if (x<10) f=5;
        else if (x<20) f=10;
        else if (x<30) f=15;
        else f=20;
        
        out.println("f("+x+") = "+f);
    }
    
}
