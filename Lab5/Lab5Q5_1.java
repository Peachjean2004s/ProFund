package Lab5;

public class Lab5Q5_1 {
    public static void main(String[] args) {
        int n = 10 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(i == j || j == (n - 1) - i ){
                System.out.print(" ");
               }
               else{
                System.out.print("x");
               }
            }
            System.out.println("");
        }
    }
}
