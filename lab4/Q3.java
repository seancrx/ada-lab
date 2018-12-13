// when n=100, answer should be 5151
// f(n) = f(n - 1) + (n + 1)
// f(1) = 3

/**
 * Q3
 */
public class Q3 {

    public static void main(String[] args) {
        System.out.println("Days needed: "+countDays(100));
    }

    private static int countDays(int n) {
        if (n == 1) {
            return 3;
        }
        return countDays(n-1) + n+1;
    }
}