package pattern;

public class p2 {

    public static void main(String args[]) {
        int n = 5;
        int i = 1;
        while (i <= n) {
            int j=1;
            while (j <= n) {
                if (i == 1 || j == 1 || i == 5 || j == 5)
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