 class main {

    public static void main(String[] args) {
        Movie_DetailsList movie = new Movie_DetailsList();
        movie.add_movie("Master", "Vijay", "Malavika", "Action");
        movie.add_movie("Iraivi", "Sethupathi", "Anjali", "Thriller");
        movie.add_movie("Karnan", "Dhanush", "Rasisha", "Drama");
        movie.add_movie("Sulthan", "Karthick", "Rashmika", "Romance");

        for (Movie_Details i: movie.list){
            System.out.println("Movie: "+i.mov_Name+"| Lead Actor: "+i.lead_actor+"| Lead Actress: "+i.lead_actress+"| Genre: "+i.genre);
        }

        movie.sort("genre");
        movie.remove_movie("Sulthan");

        for (Movie_Details i: movie.list){
            System.out.println("Movie: "+i.mov_Name+"| Lead Actor: "+i.lead_actor+"| Lead Actress: "+i.lead_actress+"| Genre: "+i.genre);
        }
    }
}