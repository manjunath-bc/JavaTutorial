import java.util.*;
public class areaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of side of a square");
        int length = sc.nextInt();
        int area = length*length;
        System.out.println("area of square is: "+ area);
    }
    
}
