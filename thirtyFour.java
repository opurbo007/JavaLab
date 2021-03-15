import java.util.Scanner;

public class thirtyFour {
    public static int call(int a) {
      
        // if (a > 0) {
        //     return a + call(a - 1);
        // } else {
        //     return 0;
        // }
        return  (a > 0) ? (a + call(a - 1)) : 0;
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
