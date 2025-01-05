import java.util.*;
public class PrintTheLargestOf3Num {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("please enter a number");
      int a =  sc.nextInt();
      System.out.println("please enter a number");
      int b =  sc.nextInt();
      System.out.println("please enter a number");
      int c =  sc.nextInt();
      if ( a>b && a>c){
        System.out.println(a);
      }
      else if (b>a && b>c){
        System.out.println(b);
      }
      else {
        System.out.println(c);
      }


    }
    
}
