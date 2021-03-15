
import java.util.Scanner;

public class eight {

    public static void call(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonet");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.next().charAt(0);
        sc.close();
        call((char) m);

    }
}
