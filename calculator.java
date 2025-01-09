import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        char answer =sc.next().charAt(0);
        switch (answer) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;  
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);          
            default:
            System.out.println("enter the vslued number");
            
        }
    }
    
}
