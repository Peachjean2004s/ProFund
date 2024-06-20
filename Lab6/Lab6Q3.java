package Lab6;

public class Lab6Q3 {
    public static void main(String[] args) {
        String str = "KMITl";
        System.out.println("Original String : " + str);
        System.out.println("Replace String : "+ ChangeMI(str));
        
    }

    static String ChangeMI(String s){
        return s.replace("MI","CSP");
    }
}
