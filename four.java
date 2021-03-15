
import java.util.Scanner;

public class four {

    public static void call() {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        int asci = (int) n;
         sc.close();
        System.out.println(asci);

    }

    public static void main(String[] args) {
        call();
    }
}
