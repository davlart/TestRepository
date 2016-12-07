import java.util.Scanner;

/**
 * Created by ArthurArt on 13.10.2016.
 */
public class Task11 {
    public static void main(String[] args) {
        final  int S = 109;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hours =0;
        int minuts = 0;
        hours = n/60;
        minuts = n%60;
        while(hours>=24){
            hours=hours/ 24;
        }


        System.out.print(hours+":"+minuts);

    }
}
