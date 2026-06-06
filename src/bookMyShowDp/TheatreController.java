package bookMyShowDp;

import bookMyShowDp.service.TheatreService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class TheatreController {
    TheatreService theatreService;

    TheatreController(){
        this.theatreService=new TheatreService();
    }
    public void addScreen(Theatre theatre,Screen screen){
        theatre.addScreen(screen);
    }

    public void addTheatre(List<Theatre> theatrelist){
        theatreService.addTheatre(theatrelist);

    }
    public void  attachShowToScreen(Screen screen,Show show){
        screen.attachShow(show);
    }
    public List<Theatre> getTheatreByCity(String city, String movie, LocalDate time){
        return theatreService.getTheatreByCity(city,movie,time);
    }

    public List<Movie> getMovies(String city, LocalDate date){
              return theatreService.getMovies(city,date);
    }

    public List<Show>getShows(Theatre theatre,String movie,LocalDate date){
        return theatreService.getShows(theatre,movie,date);

    }



}
