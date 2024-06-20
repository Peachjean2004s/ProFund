package Lab5;

public class Lab5Q5_4 {
    public static void main(String[] args) {

        int layer = 3;
        int numLines = 4;
        int numStars;
        // ชั้นต้นไม้
        for (int i = 0; i < layer; i++) {
            numStars = (2 * i) - 1;
            for (int j = 0; j < numLines; j++) {
                numStars += 2;
                for (int p = (layer * 2) - i; p >= j; p--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < numStars; k++) {
                    System.out.print("*");
                } // k
                System.out.println();
            } // j
        } // i

        // ขาต้นไม้
        for (int j = 0; j < layer; j++) {
            for (int i = 0; i < (layer * 2) ; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < layer; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
