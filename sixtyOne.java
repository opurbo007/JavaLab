import java.util.Scanner;

public class sixtyOne {

    public static String call(int a) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };

        boolean found = false;
        for (int n : num) {
            if (n == a) {
                found = true;
                break;
            }
        }
            // if (found)
            //     System.out.println(a + " is found");
            // else
            //     System.out.println(a + " is not found");
             
       return (found) ? a + " is found" : a + " is not found";  
    
    }

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();
        
        System.out.println( call(m));
            
 }
}