
import java.util.Scanner;

public class fiveteen {

    public static void call(int a) {

        int total = 1;
        if (a < 0) {
            System.out.println("Factorial of negetive number doesn't exist");
        } else {
            for (int i = 1; i <= a; i++) {
                total *= i;
            }
            System.out.println("Factorial of " + a + " is = " + total);
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
