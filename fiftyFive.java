import java.util.Scanner;

public class fiftyFive {

        public static void call(String a) {

            String s = a.replaceAll("\\s", ""); 
            System.out.println(s);
         }
         
         public static void main(String[] args) {
     
             Scanner sc = new Scanner(System.in);
             String m = sc.nextLine();
             sc.close();
             call(m);
     
         }
}
