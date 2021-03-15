
import java.util.Scanner;

public class fourteen {

    public static int call(int a) {

        int total = 0;
        for (int i = 1; i <= a; i++) {
            total += i;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, sum;
        m = sc.nextInt();
        sc.close();
        sum = call(m);
        System.out.println("The sum of netural numbers is = " + sum);

    }

}
