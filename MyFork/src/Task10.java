import java.util.Scanner;

/**
 * Created by U_LIVT33513 on 08.10.2016.
 */
public class Task10 {


    public static void main(String[] args) {
       final  int S = 109;
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        int s = v*t;

        if(s>109)
            s = s-((s/109)*109);
      System.out.print(s);

    }

}
