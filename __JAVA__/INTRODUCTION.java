package __JAVA__;
import java.util.Scanner;

public class INTRODUCTION{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int nums = sc.nextInt();
        if (PrimeNumber(nums)){
            System.out.println("number is prime :"+nums);
        }
        else{
            System.out.println("number is not prime :"+nums);
        }
    }
    public static boolean PrimeNumber(int nums){
        for(int i =2;i<Math.sqrt((double)nums);i++){
            if(nums%i == 0

            ){
                return false;
            }
        }
        return true;
    }
}