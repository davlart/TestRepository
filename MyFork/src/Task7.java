import java.util.Scanner;

/**
 * Created by U_LIVT33513 on 08.10.2016.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double bufx = x/10.0;
        x = x/10;
        bufx = bufx - x;
        bufx = bufx*10;
        x = (int) bufx;
        System.out.print(x);

    }
}
