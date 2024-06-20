package Lab7;

public class Lab7Q2_3 {

        public static void main(String[] args) {
            String str = "hello world, welcome to the universe";
            String sub1 = "hello";
            String sub2 = "universe";
            
            boolean result = containsAndBefore(str, sub1, sub2);
            System.out.println(result);
        }
    
        public static boolean containsAndBefore(String s, String sub1, String sub2) {
            int myIndexSub1 = myIndexOf(s, sub1, 0);
            int myIndexSub2 = myIndexOf(s, sub2, myIndexSub1 + sub1.length());

            if(myIndexSub1 == -1 || myIndexSub2 == -1){
                return false  ;
            }
            return true ;

        }
    
        public static int myIndexOf(String str, String sub, int idx){
            if(idx < 0 || idx > str.length()){
                return - 1 ;
            }
    
            for (int i = idx ; i < str.length(); i++) {
                int check = 0 ;
                for (int j = 0; j < sub.length(); j++) {
                    check++;
                    if(str.charAt(i+j) != sub.charAt(j)){
                        break;
                        
                    }
                }
                if (check  == sub.length()) {
                    return i;
                }
            }
            return -1 ;
        }
    
    
}
