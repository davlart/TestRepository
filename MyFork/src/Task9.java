import java.util.Scanner;

/**
 * Created by U_LIVT33513 on 08.10.2016.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //int numb1 = x/100;
       // int numb2 =  (x/10-(x/100)*10) ;
       // int numb3 = (x-(x/10)*10) ;
       // int sum = numb1+numb2+numb3;
        x = x/100+x/10%10+x%10;
        System.out.print(x);

    }
}
