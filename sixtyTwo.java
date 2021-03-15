import java.util.Scanner;

public class sixtyTwo {
    public static int call(String a) {
        //     if(a != null && a.trim().isEmpty())
        //         return 0;
        //     else
        //     return 1;
        // }
        return (a != null && a.trim().isEmpty()) ? 0 : 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        sc.close();
        String result = (call(m) == 0) ? "The String is Null or empty" : "The string is not Empty or Null";
        System.out.println(result);

    }

}
