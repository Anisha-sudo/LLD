package bookMyShowDp.controller;

import bookMyShowDp.*;
import bookMyShowDp.service.TheatreService;

import java.time.LocalDate;
import java.util.List;

public class TheatreController {
    TheatreService theatreService;

    public TheatreController(){
        this.theatreService=new TheatreService();
    }
    public void addScreen(Theatre theatre,Screen screen){
        theatre.addScreen(screen);
    }

    public void addTheatre(List<Theatre> theatrelist){
        theatrelist.forEach(theatre -> {
            theatreService.addTheatre(theatre);
                });
    }
    public void  attachShowToScreen(Screen screen, Show show){
        screen.attachShow(show);
    }
    public List<Theatre> getTheatreByCity(City city, String movie, LocalDate time){
        return theatreService.getTheatreByCity(city,movie,time);
    }

    public List<Movie> getMovies(City city, LocalDate date){
              return theatreService.getMovies(city,date);
    }

    public List<Show>getShows(Theatre theatre,String movie,LocalDate date){
        return theatreService.getShows(theatre,movie,date);

    }



}
