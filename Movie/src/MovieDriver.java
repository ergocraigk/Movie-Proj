import java.util.*;

/**
 * Created by Craig Koch on 1/22/2015.
 */
public class MovieDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to Movie Phone!");

        Movie m1 = new Movie("Frozen", 2014);
        Movie m2 = new Movie("Star Trek", 1979);
        Movie m3 = new Movie("Rumble in the Bronx", 1996);
        Movie m4 = new Movie("Rainman", 1989);
        Movie m5 = new Movie("Flashdance", 1989);

        Set<Movie> library = new HashSet<Movie>();
        Set<Movie> favorites = new HashSet<Movie>();
        Set<Movie> watched = new HashSet<Movie>();
        Set<Movie> comedy = new HashSet<Movie>();
        Set<Movie> drama = new HashSet<Movie>();

        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);
        library.add(m5);

        favorites.add(m2);
        favorites.add(m3);

        watched.add(m1);
        watched.add(m2);
        watched.add(m3);

        Iterator<Movie> currentFav = favorites.iterator();
        System.out.println(currentFav.next());
        System.out.println(currentFav.next());

        comedy.add(m1);
        comedy.add(m2);

        drama.add(m2);
        drama.add(m4);

        System.out.println("Library is " + library);
        System.out.println("Favorites is " + favorites);

        setHelper helper = new setHelper();

        Set<Movie> watchedDramas = helper.intersection(watched, drama);
        System.out.println(watchedDramas);

        Set<Movie> unwatched = helper.difference(library, watched);

        //comedies i haven't seen
        Set<Movie> unwatchedComs = helper.difference(unwatched, comedy);

        Set<Movie> unwatchedNewReleases = new HashSet<Movie>();
        Iterator<Movie> currMovie = unwatched.iterator();
        while(currMovie.hasNext()){
            Movie temp = currMovie.next();
            if(temp.getYear() >= 2010){
                unwatchedNewReleases.add(temp);
            }
        }

        Map<Movie, Integer> watchedCount = new HashMap<Movie, Integer>();
        watchedCount.put(m3, 5);
        watchedCount.put(m5, 1);
        watchedCount.put(m1, 0);
        watchedCount.put(m1, 6);

        System.out.println(watchedCount.values());

        Queue<Movie> playList = new Queue<Movie>();

        playList.enqueue(m1);
        playList.enqueue(m2);
        playList.enqueue(m3);
        System.out.println(playList.dequeue());
        System.out.println(playList.dequeue());
        
    }
}
