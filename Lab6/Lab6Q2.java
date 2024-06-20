package Lab6;

public class Lab6Q2 {
    public static void main(String[] args) {
        String[] magnets = {"10", "10", "01", "10", "01", "01", "10", "10"}; // แม่เหล็กที่กำหนด
        int numberOfGroups = countMagnetGroups(magnets);
        System.out.println("Number of groups: " + numberOfGroups);
    }

    public static int countMagnetGroups(String[] magnets) {
        int groups = 0;
        String Pole ="10";
        for (int i = 0; i < magnets.length ; i++) {
            if (magnets[i].equals(Pole)) {
                groups++;
            }
        }
        return groups;
    }
}
