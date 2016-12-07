import java.util.Scanner;

/**
 * Created by ArthurArt on 13.10.2016.
 */
public class Task12 {
    public static void main(String[] args) {
        final  int S = 109;
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        double fi = h*30 + m*0.5+ s*0.0083;


        System.out.print(fi);

    }

}