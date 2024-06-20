package Lab5;

public class Lab5Q5_2 {
    public static void main(String[] args) {
        int n = 4 ;
        for (int i = 0 ; i < n ; i++ ) {
            for (int j = n ; j > n - i - 1 ; j--) {
                System.out.print( j + " ");
            }
            System.out.println(" ");
        }
    }
}
