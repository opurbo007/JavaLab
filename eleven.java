
import java.util.Scanner;

public class eleven {

    public static void call(int a) {
        if (a % 400 == 0) {
            System.out.println(a + " is a leap year");
        } else if (a % 100 == 0) {
            System.out.println(a + " is not a leap year");
        } else if (a % 4 == 0) {
            System.out.println(a + " is a leap year");
        } else {
            System.out.println(a + " is not a leap year");
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