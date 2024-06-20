package Lab5;

public class Lab5Q4_2 {
    public static void main(String[] args) {
        String s1 = "I am happy"; // 0 with s1 = s1.toLowerCase();
        String s2 = "xyz"; // -1
        System.out.println(checkVowel(s1));
        System.out.println(checkVowel(s2));
    }

    static int checkVowel(String s) {
        char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
        String lowStr = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            for (char c : vowel) {
                if(c == lowStr.charAt(i)){
                    return 0 ;
                }
            }
        }
        return -1;
    }

    // static int checkVowel(String s) {
    //     char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
    //     String lowStr = s.toLowerCase();
    //     for (int i = 0; i < s.length(); i++) {
    //             if(lowStr.charAt(i) == 'a' || lowStr.charAt(i) == 'e' || lowStr.charAt(i) == 'i' || lowStr.charAt(i) == 'o' || lowStr.charAt(i) == 'u'  ){
    //                 return 0 ;
    //             }
    //     }
    //     return -1 ;
    // }
}
