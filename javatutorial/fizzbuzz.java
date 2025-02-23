import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");

        int N = sc.nextInt();
        if(N%3==0 && N%5!=0){
            System.out.println("fizz");
        }
        else if(N%5==0 &&N%3!=0){
            System.out.println("buzz");
        }
        else if(N%3==0 && N%5==0){
            System.out.println("fizzbuzz");

        }
        else{
            System.out.println(N);
        }

    }
}
