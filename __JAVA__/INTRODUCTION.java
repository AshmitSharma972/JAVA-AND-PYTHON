package __JAVA__;

import java.util.Scanner;

/**
 * INTRODUCTION
 */
public class INTRODUCTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to enter :");

        char specialt = sc.next().charAt(0);

        if(Character.isLetter(specialt)){
            System.out.println("an aplhabet");
        }
        else if(Character.isDigit(specialt)){
            System.out.println("is the digit");
        }
        else{
            System.out.println("special character");
        }
    }
    
}