import java.util.Scanner;

public class NumFrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the N value");
        int N=sc.nextInt();
        System.out.println("the numbers are" );
        int counter=1;
         while (counter<=N){
           
            System.out.print(counter);
            
         }

    }
}
