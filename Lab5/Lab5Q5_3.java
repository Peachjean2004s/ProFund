package Lab5;

public class Lab5Q5_3 {
    public static void main(String[] args) {
        int n = 4 ;
        for (int i = 0; i < n; i++) {
            for (int j = n ; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2 ; j++) {
                System.out.print("P");
            }
            System.out.println();
        }
    }
}
