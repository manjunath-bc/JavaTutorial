import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the body temperature");
        double temperature =sc.nextDouble();
        if (temperature>=103.5){
            System.out.println("you hava a fever");
        }
        else{
            System.out.println("you are free from fever");
        }
            
        }

    }
