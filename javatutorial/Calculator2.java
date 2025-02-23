import java.util.*;
public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("enter operator");
        char answer =sc.next().charAt(0);
        System.out.println("enter b");
        int b = sc.nextInt();
        switch (answer) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;  
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);   
                 break;
            case'%':System.out.println(a%b);            
            default:
            System.out.println("enter the vslued number");
        }
    }    
}
