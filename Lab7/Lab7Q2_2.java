package Lab7;

public class Lab7Q2_2 {
    public static void main(String[] args) {
        String str = "hello world";
        String sub = "world";
        int idx = 0;
        int result = myIndexOf(str, sub, idx);
        System.out.println(result);

    }

    public static int myIndexOf(String str, String sub, int idx) {

        // for (int i = 0; i < str.length(); i++) {
        // int check = 0 ;
        // if (str.charAt(i) == sub.charAt(0)) {
        // while (check < sub.length() && str.charAt(i+check) == sub.charAt(check)) {
        // check++;
        // }
        // }
        // if(check == sub.length()){
        // return i ;
        // }
        // }
        // return -1 ;

        for (int i = idx; i < str.length(); i++) {
            int check = 0;
            for (int j = 0; j < sub.length(); j++) {
                if (str.charAt(i + check) == sub.charAt(check)) {
                    check++;
                }
            }
            if (check == sub.length()) {
                return i;
            }
        }
        return -1;
    }

}
