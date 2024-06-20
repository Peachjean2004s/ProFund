package Lab4;

public class Lab4Q2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        int sum = 0;
        if (a > b) {
            sum = a;
            if (b > c) {
                sum = a + b;
            } else {
                sum = a + c;
            }
        } else {
            sum = b + c;
        }
        System.out.println(sum);
    }
}
