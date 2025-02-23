import java.util.*;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your salary");
        int salary = sc.nextInt();
        int tax ;
        if( salary  <500000){
            tax=0; 

        }
        else if ( salary >=500000 && salary< 1000000) {
            tax = (int) (salary-salary*0.2);
            
        }
        else {
            tax=(int) (salary-salary*0.3);
        }
        System.out.println("your salary after deducting tax :" + tax);
    }
    
}
