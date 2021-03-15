import java.util.ArrayList;
import java.util.Scanner;

public class fourtyThree {
    public static int call( ArrayList<Integer> a) {

        int large = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > large) {
                large = a.get(i);
            }
        }
        return large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 0;
        ArrayList <Integer> arr = new ArrayList<Integer>();

        System.out.println("How many element are in Array");
        m = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 1; i <= m; i++) {
            arr.add(sc.nextInt());
        }

        sc.close();
        
        System.out.println("The Large numbers is = "+call(arr));

    }
}
