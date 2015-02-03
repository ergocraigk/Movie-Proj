/**
 * Created by Craig on 1/22/2015.
 */
public class Movie {
    private String name;
    private int year;

    public Movie(String name, int year){
        this.name = name;
        this.year = year;
    }
    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        String result = name + " (" + year + ") ";
        return result;
    }

    public boolean equals(Movie otherMovie) {
        if (this.name.equals(otherMovie.name) && this.year == otherMovie.year) {
            return true;
        }
        return false;
    }
}
