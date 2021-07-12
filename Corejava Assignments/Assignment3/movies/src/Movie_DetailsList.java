import java.util.*;

public class Movie_DetailsList {
    ArrayList<Movie_Details> list = new ArrayList<Movie_Details>();

    public void add_movie(String mov_name, String lead_actor, String lead_actress, String genre) {
        list.add(new Movie_Details(mov_name, lead_actor, lead_actress, genre));
        System.out.println("Movie Added");
    }

    public void remove_movie(String name) {
        for (Movie_Details m : list) {
            if (m.mov_Name.equals(name)) {
                int index = list.indexOf(m);
                list.remove(index);
                System.out.println("Movie Removed");
                break;
            }
        }
    }

    public void remove_AllMovies() {
        list.removeAll(list);
        System.out.println("All movies are removed");
    }

    public void find_movie_by_name(String name) {
        for (Movie_Details m : list) {
            if (m.mov_Name.equals(name)) {
                int index = list.indexOf(m);
                System.out.println(list.get(index));
                break;
            }
        }
    }

    public void find_movie_by_genre(String genre) {
        for (Movie_Details m : list) {
            if (m.genre.equals(genre)) {
                int index = list.indexOf(m);
                System.out.println(list.get(index));
                break;

            }
        }
    }

    class NameComparator implements Comparator<Movie_Details> {
        public int compare(Movie_Details m1, Movie_Details m2) {
            return m1.mov_Name.compareTo(m2.mov_Name);
        }
    }

    class GenreComparator implements Comparator<Movie_Details> {
        public int compare(Movie_Details m1, Movie_Details m2) {
            return m1.genre.compareTo(m2.genre);
        }
    }

    public void sort(String criteria) {
        String a="name";
        if (a.equals(criteria)) {
            Collections.sort(list, new NameComparator());
            for (Movie_Details m : list) {
                System.out.println(m.mov_Name + " " + m.lead_actor + " " + m.lead_actress + " " + m.genre);
            }
        }
        else{
            Collections.sort(list, new GenreComparator());
            for (Movie_Details m : list) {
                System.out.println(m.mov_Name + " " + m.lead_actor + " " + m.lead_actress + " " + m.genre);
            }
        }
    }
}