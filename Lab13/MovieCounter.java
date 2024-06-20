package Lab13;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieCounter {
    private ArrayList<Movie> availableList = new ArrayList<>();
    private ArrayList<Movie> checkOutList = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------");
        MovieCounter location1 = new MovieCounter();
        MovieCounter location2 = new MovieCounter();

        System.out.println("From constructor -> we are open!");
        System.out.println("From constructor -> we are open!");
        System.out.println("location 1");
        location1.showAvailableList();
        System.out.println("location 2");
        location2.showAvailableList();
        System.out.println("-----------------------------------------------");
        System.out.println("location 1");
        location1.checkOut(1);
        location1.showCheckOutList();
        location1.showAvailableList();
        System.out.println("-----------------------------------------------");
        System.out.println("location 2");
        location2.checkOut(2);
        location2.showCheckOutList();
        location2.showAvailableList();
    }


    public MovieCounter() {
        try (Scanner sc = new Scanner(Paths.get("Lab13/movies2.csv"))) {
            while (sc.hasNext()) {
               try {
                String row = sc.nextLine();
                String [] tokens = row.split(",");
                String title = tokens[0];
                int releasedyear = Integer.parseInt(tokens[1]);
                double rating = Double.parseDouble(tokens[2]);
                Movie movie = new Movie(title, releasedyear, rating);
                availableList.add(movie);
               } catch (Exception e) {
                // TODO: handle exception
                continue;
               }

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


    public void showAvailableList() {
        System.out.println("The following titles are available");
        for (Movie m : availableList) {
            System.out.println(m);
        }
    }
    
    public void showCheckOutList() {
        System.out.println("The following titles have been checked out.");
        for (Movie m : checkOutList) {
            System.out.println(m);
        }
    }

    public void checkOut(int index) {
        if (index >= 0 && index < availableList.size()) {
        checkOutList.add(availableList.remove(index));
        }
        else {
            System.out.println("Invalid index");
        }
    }
}


