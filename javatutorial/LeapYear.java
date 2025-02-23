import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the year to find weather it's a leap year or not");
        int year = sc.nextInt();
        if ((year%4==0)) {
            System.out.println("its a leap year");
            
        }
        else {
            System.out.println("it's not a leap year");
        }
    }
}
