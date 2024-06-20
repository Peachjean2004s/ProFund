package Lab1;

import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        //double[] arr = { 170.2, 165.5, 180.3, 175.0, 169.8 };
        Scanner sc = new Scanner(System.in);
        System.out.println("จำนวนคน : ");
        int People = sc.nextInt();
        double [] Height =new double [People];
        for(int i = 0 ; i < People ; i++){
        Height[i] = sc.nextDouble();
        }

        /* เรียงความสูง */
        for (int i = 0; i < Height.length - 1; i++) {
            for (int j = 0; j < Height.length - 1; j++) {
                if (Height[j] < Height[j + 1]) {
                    double temp = Height[j];
                    Height[j] = Height[j + 1];
                    Height[j + 1] = temp;
                }
            }
        }

        /* ปริ้น 3  อันดับแรก */
        System.out.println("3 อันดับแรก");
        for (int i = 0; i < 3; i++) {
            System.out.println("อันดับ" + (i + 1) + " " + Height[i]);
        }

        sc.close();
    }


}