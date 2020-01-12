/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfungsidanrekursif03;
import static java.lang.System.out;
/**
 *
 * @author USER
 */
public class Latihanfungsidanrekursif03 {
public static int deret(int n){
       if(n>0)
           return(deret(n-1)+n);
       else
           return(0);       
}
public static int deret1(int a,int b,int n){
        if(n>0)
            return(deret1(a,b,n-1)+a+(n-1)*b);
        else
            return(0);
}
public static int fak(int n){
        if(n>0)
            return(n*fak(n-1));
        else
            return(1);
}
public static int pangkat(int a,int n){
        if(n>0)
            return(a*pangkat(a,n-1));
        else
            return(1);
}
public static int fibo(int n){
        if (n>0)
            return(fibo(n-1)+fibo(n-2));
        else
            return(1);
}
public static int GCD(int a,int b){
        if(b!=0) 
            return GCD(b,a%b);
        else 
            return (a);          
}
    public static void main(String[] args) {
     out.println(deret(4));
     out.println(deret1(3,4,6));
     out.println(fak(9));
     out.println(pangkat(6,4));
     out.println(fibo(8));
     out.println(GCD(45,60));
     out.println(GCD(60,45));
    }   
}
