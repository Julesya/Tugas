/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray04;

import java.util.Scanner;

/**
 * perkalian matrix
 * @author USER
 */
public class Latihanarray04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 int row1,col1,row2,col2;
        int[][] A;
        int[][] B;
        int[][] C;
      
        Scanner Baca = new Scanner(System.in);
        System.out.print("Ordo baris Matriks Pertama = ");row1=Baca.nextInt();
        System.out.print("Ordo kolom Matriks Pertama = ");col1=Baca.nextInt();
        System.out.print("Ordo baris Matriks Kedua   = ");row2=Baca.nextInt();
        System.out.print("Ordo kolom Matriks Kedua   = ");col2=Baca.nextInt();
        
        if(col1==row2){
        A = new int[row1][col1];
        B = new int[row2][col2];
        C = new int[row1][col2];
        
        System.out.println("Baca Matriks A =");
        for (int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
              System.out.print("A("+i+","+j+")= ");
               A[i][j]=Baca.nextInt();  
            }
                
        }
        
        System.out.println("\n\nBaca Matriks B =");
        for (int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
              System.out.print("B("+i+","+j+")= ");
               B[i][j]=Baca.nextInt();  
            }
                
        }
        
        System.out.println("\nC=A*B");
        for (int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
               C[i][j]=0;
               for(int k=0;k<col1;k++)
               C[i][j]+=A[i][k]*B[k][j];  
            }
                
        }
       System.out.println("\nMatriks  A:");
        for (int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
            
               System.out.print(A[i][j]+" ");  
            }
          System.out.println(" ");       
        }
        System.out.println("\nMatriks  B:");
        for (int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
            
               System.out.print(B[i][j]+" ");  
            }
          System.out.println(" ");       
        }
        
        System.out.println("\nMatriks  C:");
        for (int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
            
               System.out.print(C[i][j]+" ");  
            }
          System.out.println(" ");       
        }
        }
        else 
            System.out.println("Ordo kolom matriks pertama tidak sama dengan ordo baris matriks kedua");
    }
    }

            