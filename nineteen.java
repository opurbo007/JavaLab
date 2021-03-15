import java.util.Scanner;

public class nineteen {
    public static int call(int a, int b) {
        while (b != 0) {
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }

    public static int call2(int a, int b, int c) {

        int LCM = (a * b) / c;
        return LCM;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0, n = 0;
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        int GCD = call(m, n);
        int LCM = call2(m, n, GCD);
        System.out.println("LCM of two numbers are = " + LCM);
    }
}
