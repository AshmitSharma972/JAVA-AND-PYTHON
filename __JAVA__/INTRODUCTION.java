package __JAVA__;
import java.util.Scanner;
/**
 * INTRODUCTION
 */
public class INTRODUCTION {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number A and B :");
        float nums1 = sc.nextFloat();
        float nums2 = sc.nextFloat();
        System.out.println("operation to be preformed :");
        char op = sc.next().charAt(0);

        Calculator(nums1,nums2,op);
        sc.close();
    }

    public static void Calculator(float nusm1,float nums2,char op){
        switch (op) {
            case '+':
                System.out.println("the Addition of the numbers are :" +Addition(nusm1,nums2));                
                break;
            case '-':
                System.out.println("the Subtraction of the numbers are :" +Subtraction(nusm1,nums2));                
                break;
            case '*':
                System.out.println("the Multiplication of the numbers are :" +Mult(nusm1,nums2));                
                break;
            case '/':
                System.out.println("the Division of the numbers are :" +Div(nusm1,nums2));                
                break;
            default:
                break;
        }
    }
    static float Addition(float nums1,float nums2){
        return nums1+nums2;
    }
    static float Subtraction(float nums1,float nums2){
        return nums1 - nums2;
    }
    static float Mult(float nums1,float nums2){
        return nums1 * nums2;
    }
    static float Div(float nums1,float nums2){
        try{
            float res = nums1/nums2;
            return res;
        }
        catch(Exception e){
            System.out.println("division by zero");
            return 0;
        }
    }
}