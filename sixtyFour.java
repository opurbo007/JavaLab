import java.util.Scanner;

public class sixtyFour {

    public static void call(long a) {
       

        long min = (a / 1000) / 60;
        long sec = (a / 1000) % 60;
        System.out.println(min + " minutes " + sec + " second " + a + " millisecond");
    
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long m = sc.nextLong();
    sc.close();
    call(m);
       
    }
}
