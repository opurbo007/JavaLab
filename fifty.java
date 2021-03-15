import java.util.Scanner;

public class fifty {
    public static void call(String a) {

        int vowel = 0, con = 0;    
             
        a = a.toLowerCase();    
            
        for(int i = 0; i < a.length(); i++) {           
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {    
                vowel++;    
            }    
          
            else if(a.charAt(i) >= 'a' && a.charAt(i)<='z') {      
                con++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowel);    
        System.out.println("Number of consonants: " + con);    
    }    
    

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
         String m;
         System.out.println("Enter a sentance : ");
         m = sc.nextLine();
         sc.close();
         call(m);
  
         
    } 
}
