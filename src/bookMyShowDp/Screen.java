package bookMyShowDp;

import java.sql.Array;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Screen {
    int screenId;
   String screenType;
   int screenSize;
   int screenCapacity;
    List<Seat> seatList;
    public Map<LocalDate,Show> timeShowMap=new HashMap<>();
    Screen(int id,String screenType,int screensize,int screenCapacity,List<Seat> seatList){
      this.screenId=id;
      this.screenType=screenType;
      this.screenSize=screensize;
      this.screenCapacity=screenCapacity;
      this.seatList=seatList;

    }
    public void attachShow(Show show){
        timeShowMap.put(LocalDate.now(), show);
    }
}
