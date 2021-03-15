
import java.util.Scanner;

public class sixteen {

    public static void call(int a) {

        int total = 0;
        if (a == 0) {
            System.out.println("Multipication of negetive number doesn't exist");
        } else {
            for (int i = 1; i <= 10; i++) {

                total = a * i;
                System.out.println(a + " X " + i + " = " + total);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        sc.close();
        System.out.println(" Multification table of " + m + " is :");
        call(m);

    }
}
