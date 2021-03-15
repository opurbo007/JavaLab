import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;  

public class fiftySeven {

    public static void call(String a) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(a);
            System.out.println(date);  
        } catch (Exception e) {
            System.out.println("This kind of string format not allow.You can only enter string in dd/MM/yyyy in this format");
        }   
 }

 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String m = sc.nextLine();
    sc.close();
    call(m);
  
}  
}  

