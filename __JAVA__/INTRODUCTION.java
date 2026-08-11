package __JAVA__;

import java.util.Scanner;

/**
 * INTRODUCTION
 */
public class INTRODUCTION {

    public static void main(String[] args) {
        System.out.println("enter two number :");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        // just swap for the larger element
        double temp = num1 ;
        num1 = num1>num2?num1:num2;
        num2 = temp<num2?temp:num2;

        System.out.println("GCD of the two number is :"+GCD(num1,num2));
        System.out.println("LCM of the two number is :"+LCM(num1, num2));

    }
    public static double GCD(double num1,double num2){
        while(true){
            if(num1%num2==0){
                return num2;
            }
            else{
                double temp = num1%num2;
                num1 = num2;
                num2=temp;
            }
        }
    }
    public static double LCM(double num1,double num2){
        double temp = (num1*num2)/GCD(num1,num2);
        return temp;
    }
}