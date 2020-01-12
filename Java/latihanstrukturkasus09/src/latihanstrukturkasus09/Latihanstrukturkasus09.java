/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturkasus09;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * mencetak nilai fungsi f(x)=8 untuk 0<=x<=30
 * mencetak nilai fungsi f(x)=15 untuk x<0 atau x>30
 * @author USER
 */
public class Latihanstrukturkasus09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Baca = new Scanner(in);
    int x,f;
    out.print("x = "); x= Baca.nextInt();
    if((x<0) || (x>30)) f=15;
    else f=8;  //0<=x<=30
    
    out.println("f("+x+") = "+f);
    
    
    }
    
}
