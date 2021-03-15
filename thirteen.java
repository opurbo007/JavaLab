
import java.util.Scanner;


public class thirteen {
  
    public static void call(char a) {
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            System.out.println(a + " is Alphabat");

        } else {
            System.out.println(a + " is Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char m;
        m = sc.next().charAt(0);
        sc.close();
        call(m);

    }  
}
