package pattern;

public class p5 {

    public static void main(String args[]) {
        int n = 5;
        int i = 1;
        while (i <= n) {
            int j = 1;
            int k = 1;
            while (j < i) {
                System.out.print("  ");
                j++;
            }
            while (k <= 2 * (n - i) + 1) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
            i++;
        }
    }

}