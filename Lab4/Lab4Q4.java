package Lab4;
import java.util.*;

public class Lab4Q4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1 ;
    int nuumber = 1 ;
    int sum = 0 ;

    while (i <= n) {
       for (int k = 1; k < nuumber; k++) {
        if(nuumber % k == 0){
            sum += k ;
        }
       }
       if(sum == nuumber){
        System.out.println("num perfect is : " + nuumber);
        i++;
       }
       sum = 0 ;
       nuumber++ ;
    }



    sc.close();
    }
    
}
