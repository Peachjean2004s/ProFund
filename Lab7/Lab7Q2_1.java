package Lab7;

public class Lab7Q2_1 {
    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";
        System.out.println(isRotationOf(str1, str2));
        
    }
    static boolean isRotationOf(String str1, String str2){
        return (str1.length() == str2.length() && (str1 + str1).contains(str2));
    }
}
