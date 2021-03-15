import java.util.Scanner;

public class fourtyNine {

    public static void call(String a,int[] b) {

        for (int i = 0; i < a.length(); i++) {
            b[(int) a.charAt(i)]++;
        }
      
        for (int i = 0; i < 256; i++) {
            if (b[i] != 0) {
                  System.out.println((char) i  + " = " + b[i] );
            }
        }
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
         String m;

         int arr[] = new int[100];
         
         System.out.println("Enter a String : ");
         m = sc.nextLine();
         sc.close();
         call(m, arr);
  
         
    } 
}
