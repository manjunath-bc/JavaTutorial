import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the number");
        int number = sc.nextInt();
        switch (number) {
           case 1 : System.out.println("burger");
                    break;
           case 2 : System.out.println("pizza");
                    break;
           case 3 : System.out.println("milkshake");
                    break;
           default : System.out.println("please order");
        }
    }
    
}
