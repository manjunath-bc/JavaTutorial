import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int j = 1; j <=n; j++){
            for(int i=1;i<=10;i++) {
        System.out.println(j+"x"+i+"="+j*i); 

            }
         System.out.println("________________");   
        }

    }
}
