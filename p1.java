package pattern;

public class p1 {
    public static void main(String args[]) {
        int n = 5;
        int i = 1;
        while (i <= n) {
            int j = 0;
            int t = 0;
            while (j < 2 * (i - 1)) {
                System.out.print("  ");
                j++;
            }
            while (t <= n - i) {
                System.out.print("* ");
                t++;
            }
            System.out.println();
            i++;
        }

    }
}
