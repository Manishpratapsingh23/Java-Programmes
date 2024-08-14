package pattern;

public class p4 {

    public static void main(String args[]) {
        int n = 5;
        int i = 0;
        while (i <n) {
            int j = 1;
            int k=1;
            while (j <n-i) {
                System.out.print("  ");
                j++;
            }
            while(k<=2*i+1)
            {
            System.out.print("* ");
            k++;
            }
            System.out.println();
            i++;
        }
    }

}