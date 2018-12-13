import java.util.Arrays;

/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        long times[] = new long[100];
        for (int i=0; i<times.length; i++) {
            long startTime = System.nanoTime();
            int[] a = {4, 3, 6, 2, 5};
            // reverseArray(a);
            System.out.println(Arrays.toString(reverseArray(a)));
            // System.out.println("Time taken: "+ (System.nanoTime() - startTime));
            times[i] = System.nanoTime() - startTime;
        }
        long total = 0;
        for (long l : times) {
            total += l;
        }
        System.out.println("Average time for "+times.length+" rounds is: "+total/times.length);
    }

    private static int[] reverseArray(int[] a) {
        return reverse(a, 0);
    }

    private static int[] reverse(int[] a, int i) {
        if (i == a.length) {
            return a;
        }
        int[] b = new int[a.length];
        return reverse(a, b, i);
    }

    private static int[] reverse(int[] a, int[] b, int i) {
        if (i == b.length) {
            return b;
        }
        b[i] = a[a.length-1-i];
        return reverse(a, b, i+1);
    }
}