import java.util.ArrayList;
import java.util.Scanner;

public class thirtyThree {

    public static int call(int a) {

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        String result;
        boolean con = false;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.println("Enter a positive number number ");
        m = sc.nextInt();
        sc.close();

        if (m > 0) {
            for (int i = 2; i <= m; i++) {
                if (call(i) == 1) {
                    arr.add(i);
                }
            }
            // for (int j = 0; j < arr.size(); j++) {
            //     for (int k = 0; k < arr.size(); k++) {
            //         if (arr.get(j) + arr.get(k) == m) {
            //             System.out.println(arr.get(j)+" + "+arr.get(k)+" = "+m);
            //         }
            //     }
            // }
            for (int j : arr) {
                for (int k : arr) {
                    if (j + k == m) {
                        System.out.println(j + " + " + k + " = " + m);
                        con = true;
                    }

                }
            }
            result = (con == true) ? "Yes, " + m + " can be sum of two prime number"
                    : "No, " + m + " cannot be sum of two prime number";
            System.out.println(result);

        }

        else {
            System.out.println("Sorry 0 and negetive number not allow");
        }
    }
}
 

