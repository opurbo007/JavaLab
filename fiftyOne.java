import java.util.ArrayList;
import java.util.Scanner;

public class fiftyOne {

    public static void call(ArrayList<String> a ,int b) {
        String tmp;
        for(int i = 0;i<=b;++i){
            for (int j = i + 1; j <= b; ++j) {
                if (a.get(i).compareTo(a.get(j)) > 0) {

                    tmp = a.get(i);
                    a.set(i, a.get(j)); 
                    a.set(j, tmp);
                 }
         }
    }

    System.out.print("In lexicographical order:");
    for (int i = 0;i<=b;i++){
        System.out.println(a.get(i));
    }

  }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = 0;
    ArrayList <String> arr = new ArrayList<String>();

    System.out.println("How many element are in Array");
    m = sc.nextInt();
    System.out.println("Enter elements:");
    for (int i = 0; i <= m; i++) {
        arr.add(sc.nextLine());
    }

    sc.close();
    call(arr,m);
    

  }

}

