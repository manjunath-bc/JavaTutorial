import java.util.*;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter the first number");
        float firstnumber=sc.nextFloat();
        System.out.println("please enter the second number");
        float secondnumber=sc.nextFloat();
        float sum=firstnumber+secondnumber;
        System.out.println("sum of two numbers is: "+sum);
    }
}
