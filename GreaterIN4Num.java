import java.util.*;
public class GreaterIN4Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int a = sc.nextInt();
        System.out.println("enter your number");
        int b = sc.nextInt();
        System.out.println("enter your number");
        int c = sc.nextInt();
        System.out.println("enter your number");
        int d = sc.nextInt();
        if (a>b && b>c && c>d){
            System.out.println(a);
        }
        else if(b>c && c>d ){
            System.out.println(b);  
        }
        else if (c>d) {
            System.out.println(c);
        }
        else{
            System.out.println(d);
        }
    }
    
}
