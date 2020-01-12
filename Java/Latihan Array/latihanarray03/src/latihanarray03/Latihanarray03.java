/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray03;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
/**
 * penjumlahan 2 buah matrix
 * @author USER
 */
public class Latihanarray03 {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int row,col;
        int[][] A;
        int[][] B;
        int[][] C;
      
        Scanner Baca = new Scanner(System.in);
        out.print("Ordo baris= ");row=Baca.nextInt();
        out.print("Ordo kolom= ");col=Baca.nextInt();
        A = new int[row][col];
        B = new int[row][col];
        C = new int[row][col];
        
        out.println("Baca Matriks A =");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              out.print("A("+i+","+j+")= ");
               A[i][j]=Baca.nextInt();  
            }
                
        }
        
        out.println("\n\nBaca Matriks B =");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              System.out.print("B("+i+","+j+")= ");
               B[i][j]=Baca.nextInt();  
            }
                
        }
        
        out.println("\nC=A+B");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            
               C[i][j]=A[i][j]+B[i][j];  
            }
                
        }
       out.println("\nMatriks  A:");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            
               out.print(A[i][j]+" ");  
            }
          out.println(" ");       
        }
        out.println("\nMatriks  B:");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            
               out.print(B[i][j]+" ");  
            }
          out.println(" ");       
        }
        
        out.println("\nMatriks  C:");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            
               out.print(C[i][j]+" ");  
            }
          out.println(" ");       
    }
    
  }
}