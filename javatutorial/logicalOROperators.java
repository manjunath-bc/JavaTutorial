import java.util.*;
public class logicalOROperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of a");
        int a= sc.nextInt();
        System.out.println("enter value of b");
        int b= sc.nextInt();
        System.out.println("enter value of c");
        int c= sc.nextInt();
        System.out.println("enter value of d");
        int d= sc.nextInt();
        boolean e=((a>b) || (c>d));
        System.out.println("answer to Logical OR Operator is "+e);
    }
    
}
