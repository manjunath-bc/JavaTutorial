import java.util.*;
public class StudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the marks");
        int marks = sc.nextInt();
        String result = marks >= 35  ? "pass" : "fail";
        System.out.println(result);
        
             
    }
    
}
