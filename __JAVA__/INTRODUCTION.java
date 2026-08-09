package __JAVA__;

import java.util.Scanner;

/**
 * INTRODUCTION
 */
public class INTRODUCTION {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows :");
        int rows = sc.nextInt();
        
        
        // dimond printing
        Diamond(rows);
    }
    public static void Diamond(int rows){
        for(int i =0;i<rows;i++){
            for(int j=0;j<rows-1-i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<2*i+1;j++){
                System.out.print("*");
            }
            
        System.out.println();
        }
        for(int i =rows-2;i>=0;i--){
            for(int j=0;j<rows-1-i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<2*i+1;j++){
                System.out.print("*");
            }
            
        System.out.println();
        }
    }
}