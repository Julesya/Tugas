/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstruktursekuensial05;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * konversi suhu
 * @author USER
 */
public class Latihanstruktursekuensial05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Baca = new Scanner (System.in);
      float c,r,f,k;
      out.print("Celcius= "); c= Baca.nextFloat();
      r= 4/5f*c;
      f= 9/5*c+32;
      k= 273+c;
      out.println("Reamur= "+r);
      out.println("Fahrenheir= "+f);
      out.println("Kelvin= "+k);

    
}
}