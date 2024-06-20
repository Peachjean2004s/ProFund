package Lab5;

public class Lab5Q4 {
    public static void main(String[] args) {
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int women = 0;
        int men = 0 ;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W'){
                women ++;
            }
            else {
                men++;
            }

        }
        System.out.println("Number of Women : " + women);
        System.out.println("Number of Men : " + men);
    }
}
