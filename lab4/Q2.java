import java.util.Arrays;

/**
 * Q2
 */
public class Q2 {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] a = {3,7,11,12,15,19,24,33,41,55};
        System.out.println("Search 11: "+binarySearch(a,0,a.length,11)+". Time taken: "+(System.nanoTime()-startTime));
        System.out.println("Search 56: "+binarySearch(a,0,a.length,56)+". Time taken: "+(System.nanoTime()-startTime));
        System.out.println("Search 33: "+binarySearch(a,0,a.length,33)+". Time taken: "+(System.nanoTime()-startTime));
        System.out.println("Search 1: "+binarySearch(a,0,a.length,1)+". Time taken: "+(System.nanoTime()-startTime));
    }

    private static boolean binarySearch(int[] a, int start, int end, int x) {
        if (start<end) {
            int mid = start + (end - start) / 2;
            if (x < a[mid]) {
                return binarySearch(a, start, mid, x);
            } else if (x > a[mid]) {
                return binarySearch(a, mid+1, end, x);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // private static boolean binarySearch(int[] a, int x) {
    //     int center = a[(a.length-1)/2];
    //     System.out.println("Center: "+center);
    //     if (x == center) {
    //         return true;
    //     } else if (a.length==1) {
    //         return false;
    //     } else {
    //         int[] b = new int[(a.length-1)/2];
    //         System.out.println(Arrays.toString(b));
    //         if (x < center) {
    //             for (int i=0; i<(a.length-1)/2; i++) {
    //                 b[i] = a[i];
    //             }
    //         } else {
    //             int bi = 0;
    //             for (int i=(a.length-1)/2; i<a.length; i++) {
    //                 System.out.println("Current a[i]: "+a[i]);
    //                 // b[bi] = a[i];
    //                 System.out.println(Arrays.toString(a));
    //                 bi++;
    //             }
    //         }
    //         return binarySearch(b, x);
    //     }
    // }
}