package practical;
import java.util.Arrays;
public class demoArray123 {
    public static void main(String[] args) {
        int a[] = { -1, 2, 3, -4, 5, -6, 8,
                7,  5,  4,  -3,  -2,  1,  0 };
        int n = a.length;
       new demoArray123 ().sortUsingHash (a, n);
    }
    public int absolute(int x)
    {
        if (x < 0)
            return (-1 * x);
        return x;
    }
    public void sortUsingHash(int a[], int n)
    {
        int max = Arrays.stream(a).max().getAsInt();
        int min
                = new demoArray123 ().absolute(Arrays.stream(a).min().getAsInt());
        int hashpos[] = new int[max + 1];
        int hashneg[] = new int[min + 1];
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0)
                hashpos[a[i]] += 1;
            else
                hashneg[new demoArray123 ().absolute(a[i])] += 1;
        }
        for (int i = min; i > 0; i--) {
            if (hashneg[i] > 0) {
                for (int j = 0; j < hashneg[i]; j++) {
                    System.out.print((-1) * i + " ");
                }
            }
        }
        for (int i = 0; i <= max; i++) {
            if (hashpos[i] > 0) {
                for (int j = 0; j < hashpos[i]; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

