
import java.util.Scanner;

public class six {

    public static void call(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap\nFirst number " + a);
        System.out.println("Second number " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        System.out.println("Before swap \nFirst number " + m);
        System.out.println("Second number " + n);

        call(m, n);

    }

}
