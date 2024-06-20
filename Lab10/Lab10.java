package Lab10;

import java.util.Arrays;

public class Lab10 {
    public static void main(String[] args) {
        int[] appearIn = { 1, 2, 3 };
        int[] occ = { 1, 2, 3, 2, 4, 2 };
        int[] negativ = { 1, -2, 3, 4, -5 };
        System.out.println(appearsIn(appearIn, 2, 0));
        System.out.println(occurrences(occ, 2, 0));
        System.out.println(Arrays.toString(negativesToZero(negativ,0)));

    }

    public static boolean appearsIn(int[] a, int n, int index) {
        if (index == a.length) {
            return false;
        }
        if (a[index] == n) {
            return true;
        }
        return appearsIn(a, n, index + 1);

    }

    public static int occurrences(int[] a, int n, int idx) {
        if (a.length == idx) {
            return 0;
        }
        if (a[idx] == n) {
            return 1 + occurrences(a, n, idx + 1);
        } else {
            return occurrences(a, n, idx + 1);
        }

    }

    public static int[] negativesToZero(int[] a,int idx ) {
        if (idx == a.length) {
          return a;  
        }
        if(a[idx] < 0){
            a[idx] = 0 ;
        }
        return negativesToZero(a, idx+1);
    }
}
