import java.util.*;
public class salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary");
        double salary = sc.nextDouble();
        double finalsalary = (salary-50000);
        System.out.println("salary after deduction of 50000: " + finalsalary);
        double remainingsalary = (finalsalary-2400);
        System.out.println("salary after deducting 2400 is: "+remainingsalary);
    }
}