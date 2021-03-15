import java.util.Arrays;
import java.util.Scanner;

public class sixty {
    public static char[] call1 (String b) {
      
        char[] ch = b.toCharArray();
        return ch;
 
    }
    
    public static String call2(char a) {
        String st = Character.toString(a);
        return st;
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        char n = sc.next().charAt(0);
        sc.close();
     
    
        System.out.println("The charcters are" + Arrays.toString(call1(m)));
        System.out.println("The String is: " +  call2(n));
      
    }
}
