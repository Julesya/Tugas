/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstrukturkasus01;
import static java.lang.System.out;
/**
 *
 * @author USER
 */
public class Latihanstrukturkasus01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int intA= 8 , intB= 40;
       out.println("operator Relasional");
       out.println("---------------------");
       out.println("(intA = 8 dan intB = 40");
       out.print("1. !(intA == intB bernilai "+(!(intA == intB)));
       out.print(" ekuivalen ");
       out.println("intA != intB bernilai"+(intA != intB));
       out.print("2. !(intA != intB bernilai "+(!(intA != intB)));
       out.print(" ekuivalen ");
       out.println("intA == intB bernilai "+(intA == intB));
       out.print("3. !(intA> intB bernilai "+(!(intA > intB)));
       out.print(" ekuivalen ");
       out.println("intA <= intB bernilai "+(intA <= intB));
       out.print("4. !(intA <= int B bernilai "+(!(intA <= intB)));
       out.print(" ekuivalen ");
       out.println("intA > intB bernilai "+(intA > intB));
       
       out.println("Operator Logika");
       out.println("---------------");
       out.print("1. !(true || false) bernilai "+(!(true || false)));
       out.print(" ekuivalen ");
       out.println("false && true brnilai "+ (false && true));
       out.print("2. !(true && false) bernilai"+(!(true && false)));
       out.print(" ekuivalen ");
       out.println("false || true bernilai "+ (false|| true ));
             
       
               
               }
    
}
