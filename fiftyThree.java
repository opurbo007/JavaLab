public class fiftyThree {
    

    public static void call(int[] a, int[] b) {

        int diff;

        if (a[0] < b[0]) {
            a[0] += 24;
        }

        if (a[1] < b[1]) {
            a[1] += 60;
            a[0]--;
        }

        if (a[2] < b[2]) {
            a[2] += 60;
            a[1]--;
        }

        for (int j = 0; j < b.length; j++) {
            diff = a[j] - b[j];
            System.out.print(diff + " : ");
        }
    }
    
    public static void main(String[] args) {

        int[] start = { 20, 30, 40 };
        int[] end = { 2, 55, 50 };
        call(start, end);

    }
}
