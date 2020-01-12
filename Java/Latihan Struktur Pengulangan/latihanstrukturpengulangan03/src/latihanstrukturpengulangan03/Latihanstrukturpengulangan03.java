/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturpengulangan03;
import static java.lang.System.out;
/**
 *
 * @author USER
 */
public class Latihanstrukturpengulangan03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i, n=9;
       out.println("for:");
       
       for(i=1;i<n;i++) {   
            out.print(i+" ");

       }
       
       out.println("\n\nwile:");   
       i=1;
       while (i<n){
            out.print(i+" ");
            i++;
       }
       out.println("\n\ndo while:");
       i=1;  
       do {
           out.print(i+" ");
           i++;  
       } while(i<n);
        out.print(" ");
    }
    
}
