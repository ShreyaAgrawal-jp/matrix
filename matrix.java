import java.io.*;
import java.util.*;
public class matrix {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the dimentions of first matrix: ");
        int x=s.nextInt();
        int y=s.nextInt();       
        int m1[][]=new int[x][y];
        int m3[][]=new int[x][y];
        int m4[][]=new int[x][y];
        System.out.println("enter the values for first matrix: ");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                 m1[i][j]=s.nextInt();
            }     
        }
        System.out.println("enter the dimentions of second matrix: ");
        int x1=s.nextInt();
        int y1=s.nextInt();       
        int m2[][]=new int[x1][y1];
        System.out.println("enter the values for second matrix: ");
        for(int i=0;i<x1;i++){
            for(int j=0;j<y1;j++){
                 m2[i][j]=s.nextInt();
            }     
        }
        //addition
        if(x!=x1 && y!=y1)
            System.out.println("matrices cannot be added!");
        else{
            System.out.println("sum: ");
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                     m3[i][j]=m1[i][j]+m2[i][j];
                }     
            }
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                     System.out.println(m3[i][j]);
                }     
            }
        }
        //multiplication
        if(y != x1)
            System.out.println("matrices cannot be multiplied!");
        else{
            System.out.println("product: ");
        for(int i=0;i<x;i++){
            for(int j=0;j<y1;j++){
                 m4[i][j]=0;
                 for(int k=0;k<y;k++){
                     int a = m1[i][k]*m2[k][j];
                     m4[i][j]=m4[i][j]+a;
                 }
            }     
        }
        for(int i=0;i<x;i++){
                for(int j=0;j<y1;j++){
                     System.out.println(m4[i][j]);
                }     
            }
        }
        
    }   
}
