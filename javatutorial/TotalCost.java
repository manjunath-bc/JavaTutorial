import java.util.*;
public class TotalCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of pencil");
        float pencil = sc.nextFloat();
        System.out.println("enter the price of pen");
        float pen = sc. nextFloat();
        System.out.println("enter the price of paper");
        float paper = sc. nextFloat();
        float totalprice = (pen+pencil+paper);
        System.out.println("total price is "+totalprice);
        float totalpriceWithGST =(totalprice+totalprice*18/100);
        System.out.println("totalpriceWithGST is "+totalpriceWithGST);
        

    }
    
}
