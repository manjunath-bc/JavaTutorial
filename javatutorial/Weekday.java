import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day number");
        int dayNo=sc.nextInt();
        switch (dayNo) {
            case 1:{System.out.println("weekday"); 
            break;}
            case 2:{System.out.println("weekday");
            break;}
            case 3:{System.out.println("weekday");
            break;}
            case 4:{System.out.println("weekday");
            break;}
            case 5:{System.out.println("weekday");
            break;}
            case 6:{ System.out.println("week end");
            break;}
            case 7:{ System.out.println("week end");
                
                break;}
        
            default:{System.out.println("enter correctly");}
                break;
        }
    }
}
