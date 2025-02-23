import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of inputs:");
        int n=sc.nextInt();
        int sum=0;
        double result=0;
        for (int i = 0; i <n; i++) {
             {
                System.out.println("Enter the score of "+(i+1)+":");
                sum+=sc.nextInt();
            }
            //result=sum/n;
        }
        result=sum/n;
        System.out.println(result);
    }
}
