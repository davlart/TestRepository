import java.util.Scanner;

/**
 * Created by U_LIVT33513 on 08.10.2016.
 */
public class Task8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x=x/10;
        x = x-(x/10)*10;
        System.out.print(x);

    }
}
