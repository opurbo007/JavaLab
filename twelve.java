
import java.util.Scanner;

public class twelve {

    public static void call(int a) {
        if (a == 0) {
            System.out.println("You enter 0");
        } else if (a < 0) {
            System.out.println(a + " is negetive");
        } else {
            System.out.println(a + " is positive");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        sc.close();
        call(m);

    }

}
