import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        int number= sc.nextInt();
        if (number>=0) {
            System.out.println("the number is positive");
            
        }
        else{
            System.out.println("the number is negative");
        }
    }
}
