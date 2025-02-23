import java.util.Scanner;

public class GmtToIat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     System.out.println("please enter" );
        int day=sc.nextInt();
        int hour=sc.nextInt();
        int minute=sc.nextInt();

        hour+=5;
        minute+=30;
        if (minute>=60){  
            hour++;
            minute-=60;
        }
        if(hour>=24){
            day++;
            hour-=24;
        }
        System.out.println("day:"+day+" hour:"+hour+" minute:"+minute);
    }
}
