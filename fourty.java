import java.util.Scanner;

public class fourty {
    public static String call(String a) {
        

        if (a.isEmpty()) {
            return a;
        }
       return call(a.substring(1))+a.charAt(0);        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m;
        m = sc.nextLine();
        sc.close();
        System.out.println("The reverse sentace is : "+call(m)); 
    } 
}
