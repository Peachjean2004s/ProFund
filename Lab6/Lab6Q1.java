package Lab6;

public class Lab6Q1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(ChecksortArr(array));
    }
    static Boolean ChecksortArr(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1] ){
                return false ;
            }
        }
        return true ;
    }
}
