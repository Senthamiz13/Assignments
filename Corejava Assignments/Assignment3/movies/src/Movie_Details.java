import java.util.*;
class Movie_Details {

    String mov_Name;
    String lead_actor;
    String lead_actress;
    String genre;

    Movie_Details(String mov_Name, String lead_actor, String lead_actories, String genre){
        this.mov_Name=mov_Name;
        this.lead_actor=lead_actor;
        this.lead_actress=lead_actories;
        this.genre=genre;
    }

    public String getMov_Name() {
        return mov_Name;
    }

    public void setMov_Name(String mov_Name) {
        this.mov_Name = mov_Name;
    }

    public String getLead_actor() {
        return lead_actor;
    }

    public void setLead_actor(String lead_actor) {
        this.lead_actor = lead_actor;
    }

    public String getLead_actories() {
        return lead_actress;
    }

    public void setLead_actories(String lead_actories) {
        this.lead_actress = lead_actories;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        String s = getMov_Name() + " " + getLead_actor() + " " + getLead_actories() + " " + getGenre();
        return s;
    }

}