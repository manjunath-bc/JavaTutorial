import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE Number");
        int N=sc.nextInt();
        char ch='a';
        for (int i = 1; i <=N; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
                ch++;
                
            }
            System.out.println();
        }
    }
}
