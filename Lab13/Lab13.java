package Lab13;

import java.nio.file.Paths;
import java.util.*;

public class Lab13 {
    private static ArrayList<Movie> availableList = new ArrayList<>();

    public static void main(String[] args) {
        demo1();
        System.out.println("-demo2--");
        demo2();
        System.out.println("-demo3--");
        demo3();
        System.out.println("-demo4--");
        demo4();
    }

    static void demo1() {
        try (Scanner sc = new Scanner(Paths.get("Lab13/movies.csv"))) {
            while (sc.hasNext()) {
                String row = sc.nextLine();
                String[] tokens = row.split("  ,");
                for (String i : tokens)
                    System.out.println(row);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OUT");
        }
    }

    static void demo2() {
        try (Scanner sc = new Scanner(Paths.get("Lab13/movies.csv"))) {
            while (sc.hasNext()) {
                String row = sc.nextLine();
                String[] tokens = row.split(",");
                String title = tokens[0];
                int releasedYear = Integer.parseInt(tokens[1]);
                double rating = Double.parseDouble(tokens[2]);
                Movie m = new Movie(title, releasedYear, rating);
                System.out.println(m);
            }
        } catch (Exception e) {
            System.out.println("OUT");
        }
    }

    static void demo3() {
        try (Scanner sc = new Scanner(Paths.get("Lab13/movies2.csv"))) {
            int rowNum = 0;

            while (sc.hasNext()) {
                String row = sc.nextLine();
                try {
                    String[] tokens = row.split(",");
                    String title = tokens[0];
                    int releasedYear = Integer.parseInt(tokens[1]);
                    double rating = Double.parseDouble(tokens[2]);
                    Movie m = new Movie(title, releasedYear, rating);
                    System.out.println(m);
                    rowNum++;
                } catch (Exception e) {
                    System.out.println("At row " + rowNum + ", exception named " + e + "...skip");
                    continue;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception

        }
    }

    static void demo4() {
        try (Scanner sc = new Scanner(Paths.get("Lab13/movies2.csv"))) {
            while (sc.hasNext()) {
               try {
                String row = sc.nextLine();
                String[] tokens = row.split(",");
                String title = tokens[0];
                int releasedYear = Integer.parseInt(tokens[1]);
                double rating = Double.parseDouble(tokens[2]);
                Movie m = new Movie(title, releasedYear, rating);
                availableList.add(m);
               } catch (Exception e) {
                // TODO: handle exception
                continue;
               }
            }
        } catch (Exception e) {
            System.out.println("Oop");
        }
        for (Movie i : availableList) {
            System.out.println(i);
        }
    }
}
