import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find odd or even");
        int A = sc.nextInt();
        if(A%2 == 0){
            System.out.println("the given number is even");
        }
        else{
            System.out.println("the given number is odd");
        }

    }
}
