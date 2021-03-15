
import java.util.Scanner;

public class seventeen {

    public static int call(int a) {

        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            return call(a - 1) + call(a - 2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci series ");

        for (int i = 0; i <= m; i++) {
            System.out.print(call(i)+",");
        }

    }
}
