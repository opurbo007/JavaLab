
import java.util.Scanner;

public class five {

    public static int call(int a, int b) {

     
        int Remainder = a % b;

        return Remainder;
    }

    public static int call2(int a, int b) {

        int Quotient = a / b;

        return Quotient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, num, num2;
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        num = call(m, n);
        num2 = call2(m, n);

        System.out.println("Reminder is " + num);
        System.out.println("Quotient is " + num2);
    }
}
