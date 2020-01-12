/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstruktursekuensial04;
import static java.lang.System.out;
/**
 * menukar dua buah bilangan
 * @author USER
 */
public class Latihanstruktursekuensial04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a= 9, b= 7, c;
      out.println("Sebelum Ditukar");
      out.println("a="+a+"b="+b);
      c=a; a=b; b=c;
      out.println("Sesudah ditukar");
      out.println("a="+a+"b="+b);
    }
    
}
