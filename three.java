
import java.util.Scanner;

public class three {

    public static int call(int a, int b) {

        int toatal = a * b;

        return toatal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, num;
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        num = call(m, n);

        System.out.println(num);
    }

}
