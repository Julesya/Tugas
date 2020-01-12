/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturpengulangan02;
import static java.lang.System.out;
/**
 * menggunakan pernyataan FOR, WHILE DAN DO-WHILE
 * @author USER
 */
public class Latihanstrukturpengulangan02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int i;
        out.println("for:");
        for(i=1;i<10;i++) {
            if(i<10) out.print(i+", ");
            else out.print(i+". ");
    }
        out.println("\n\nwhile:");
        i=1;
        while (i<=10){
            out.print(i+" ");
            i++;
    }
        out.println("\n\ndo while:");
        i=1;
        do {
            out.print(i+" ");
            i++;
        } while (i<=10);
        out.println("\n");
 }
        
       
        }
        
    
    

