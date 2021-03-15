import java.util.Scanner;

public class fiftyFour {
        public static void call(int a) {
            int k = 0;
            for (int i = 1; i <= a; ++i, k = 0) {
                for (int j = 1; j <= a - i; ++j) {
                  System.out.print("  ");
                }
                while (k != 2 * i - 1) {
                  System.out.print("* ");
                  ++k;
                }  
                System.out.println();
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
