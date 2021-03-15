
import java.util.Scanner;

public class nine {

    public static int call(int a, int b, int c) {

        int largest = 0;

        if ((a >= b) && (a >= c)) {
            largest = a;
        } else if (b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 0, k = 0, result;
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();
        result = call(m, n, k);
        System.out.println("Largest number is = "+result);

    }
}
