
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class ten {

    public static void call(int a, int b, int c) {

        double x, y, num;
        num = (b * b) - 4 * a * c;

        if (num < 0) {
            System.out.println("Roots are negetive so its imaginary");

        } else if (num == 0) {

            x = -b / (2 * a);
            System.out.println("Both Roots are equel and the root is = " + x);
        } else {
            x = ((-b + sqrt(num)) / (2 * a));
            y = ((-b - sqrt(num)) / (2 * a));
            System.out.println("Roots are real \nthe root is = " + x + " and second root is= \n " + y);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 0, k = 0;
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();
        call(m, n, k);

    }
}
