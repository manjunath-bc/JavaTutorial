import java.util.*;
public class ifElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your age");
        int age =sc.nextInt();
        if(age>18){
            System.out.println("you are major");
        }
        else{
            System.out.println("you are minor");
        }
    }
}
