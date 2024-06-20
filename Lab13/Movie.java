package Lab13;

public class Movie {
    private String title ;
    private int releasedyear ;
    private double rating ;

    
    public Movie(String title, int releasedyear, double rating) {
        this.title = title;
        this.releasedyear = releasedyear;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }
    public double getRating() {
        return rating;
    }
    public int getReleasedyear() {
        return releasedyear;
    }

    public String toString(){
        return getTitle() + "("+ releasedyear+", " + rating +")";
    }

    
    
}