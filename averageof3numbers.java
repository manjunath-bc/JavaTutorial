import java.util.*;
public class averageof3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a,b,c");
        int a = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        double average =((a+b+c)/3);
        System.out.println("average of a b c is: "+average);


    }
}
