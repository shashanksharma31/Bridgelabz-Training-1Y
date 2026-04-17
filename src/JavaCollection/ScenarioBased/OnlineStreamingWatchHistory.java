package JavaCollection.ScenarioBased;
import java.util.*;

class Movie{
    String name;
    String genre;

    Movie(String name,String genre){
        this.name=name;
        this.genre=genre;
    }

    public String toString(){
        return name+" ("+genre+")";
    }
}

public class OnlineStreamingWatchHistory{
    public static void main(String[] args){

        List<Movie> allMovies=new ArrayList<>();
        allMovies.add(new Movie("Inception","SciFi"));
        allMovies.add(new Movie("Interstellar","SciFi"));
        allMovies.add(new Movie("Titanic","Romance"));
        allMovies.add(new Movie("Avengers","Action"));

        Queue<Movie> upNext=new LinkedList<>();
        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(1));
        upNext.add(allMovies.get(2));

        Stack<Movie> history=new Stack<>();
        Set<String> genres=new HashSet<>();

        System.out.println("Watching Process:");

        while(!upNext.isEmpty()){
            Movie m=upNext.remove();
            System.out.println("Watching: "+m);

            history.push(m);
            genres.add(m.genre);
        }

        System.out.println("\nWatch History:");
        for(Movie m:history){
            System.out.println(m);
        }

        System.out.println("\nUnique Genres Watched:");
        for(String g:genres){
            System.out.println(g);
        }

        System.out.println("\nRecommendations:");
        for(Movie m:allMovies){
            if(genres.contains(m.genre)){
                System.out.println(m);
            }
        }
    }
}