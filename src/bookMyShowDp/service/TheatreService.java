package bookMyShowDp.service;

import bookMyShowDp.Theatre;

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
}
