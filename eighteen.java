import java.util.Scanner;

public class eighteen {
 
    public static int call(int a, int b) {
        while (b != 0) {
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0,n=0;
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        int GCD=call(m,n);
        System.out.println("GCD of two numbers are = "+GCD);
    }   
}
