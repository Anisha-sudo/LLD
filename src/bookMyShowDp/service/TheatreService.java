package bookMyShowDp.service;

import bookMyShowDp.Movie;
import bookMyShowDp.Screen;
import bookMyShowDp.Show;
import bookMyShowDp.Theatre;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TheatreService {
    Map<Enum,List<Theatre>> cityTheatreListMap;

   public void addTheatre(List<Theatre> theatre){
       for(Theatre t: theatre) {
           cityTheatreListMap.put(t.city, Arrays.asList(t));
       }
    }
    public List<Theatre> getTheatreByCity(String city, String movie, LocalDate time){
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

    public List<Movie> getMovies(String city, LocalDate date){
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
