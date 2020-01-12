/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturpengulangan04;
import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
/**
 * fungsi for
 * @author USER
 */
public class Latihanstrukturpengulangan04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,n;
        Scanner Baca = new Scanner(in);
        out.print("Banyaknya suku= "); n= Baca.nextInt();
        out.print("for:");
         for(i=1;i<n;i++) {
             out.print(i+",");
             
         }
         out.println(i+".");
    }
    
}
