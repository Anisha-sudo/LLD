package bookMyShowDp.service;

import bookMyShowDp.*;
import java.time.LocalDate;
import java.util.*;

public class TheatreService {
    Map<City,List<Theatre>> cityTheatreListMap=new HashMap<>();

    public void addTheatre(Theatre theatre) {
        cityTheatreListMap
                .computeIfAbsent(theatre.city, c -> new ArrayList<>())
                .add(theatre);
    }
    public void addTheatre1(Theatre theatre){
        cityTheatreListMap.computeIfAbsent(theatre.city,c->new ArrayList<>()).add(theatre);
        //both ways to inset into a map in java.
        List<Theatre>th=cityTheatreListMap.getOrDefault(theatre.city,new ArrayList<>());
        th.add(theatre);
        cityTheatreListMap.put(theatre.city,th);
    }
    public List<Theatre> getTheatreByCity(City city, String movie, LocalDate time){
       List<Theatre>theatreForMovie = new ArrayList<>();
       List<Theatre> theatres= cityTheatreListMap.get(city);
       theatres.forEach(t ->{
           List<Screen> screenList =t.screenList;
           screenList.forEach(sl-> {
               if (sl.timeShowMap.get(time).movie.movieName.equals(movie)) {
                   theatreForMovie.add(t);
               }
           });
       });
       return theatreForMovie;
    }

    public List<Movie> getMovies(City city, LocalDate date){
        List<Movie>allMovies = new ArrayList<>();
        List<Theatre> theatres= cityTheatreListMap.get(city);
        theatres.forEach(t ->{
            List<Screen> screenList =t.screenList;
            screenList.forEach(sl-> {
                allMovies.add(sl.timeShowMap.get(date).movie);

            });
        });
        return allMovies;
    }

    public List<Show> getShows(Theatre theatre,String movie,LocalDate date){
      List<Screen>screenList=theatre.screenList;
      List<Show>showList= new ArrayList<>();
      screenList.forEach(screen ->{
          if(screen.timeShowMap.get(date).movie.movieName.equals(movie)){
              showList.add(screen.timeShowMap.get(date));
          }
      });
      return showList;
    }
}
