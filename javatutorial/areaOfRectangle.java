import java.util.*;
public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter length and breath.");
        int length= sc.nextInt();
        int breath= sc.nextInt();
        int area= length*breath;
        System.out.println("area of recctangle is: "+area);
        
    }
}
