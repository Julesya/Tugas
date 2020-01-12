/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray01;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * menhitung standard deviasi
 * @author USER
 */
public class Latihanarray01 {
 int n;
  float[] angka;
    
    int penjumlahan(){
    int result = 0;
    
    for(int i=0;i<n;i++)
        result+= angka[i];
    
    return result;
    }
 float mean(){
     int result = 0;
     result = penjumlahan();
     result/= n;
     
     return result;     
    }
 float std(){
     float mean = mean();
     float x = 0;
     
     for(int i=0;i<n;i++) {
         x += Math.pow(angka[i] = mean, 2);
     }
     
     x /= n-1;
     return (float)Math.sqrt(x);
 }
    public static void main(String[] args) {
        Latihanarray01 a = new Latihanarray01();
        a.n = 4;
        a.angka = new float[]{6,5,7,8};
        out.println("Standard Deviasi = "+a.std());
    }
    
}
