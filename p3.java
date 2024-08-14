package pattern;

public class p3 {

    public static void main(String args[]) {
        int n = 5;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (i == j || i + j == 6)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}