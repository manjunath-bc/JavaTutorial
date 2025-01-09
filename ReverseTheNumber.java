import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the number");
        int i =sc.nextInt();
        // while(i>0){
        //     int lastdigit=i%10;
        //     System.out.print(lastdigit);
        //     i=i/10;
        while (i>0) {
            int lastdigit =i%10;
            i=i/10;
            System.out.print(lastdigit);
            
        
        }
    }
}
