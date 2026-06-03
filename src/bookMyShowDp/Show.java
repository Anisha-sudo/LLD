package bookMyShowDp;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Show {
    int showId;
    Date showDate;
    Time showTime;
    Movie movie;
    Screen screen;
    List<Seat> seatList;
}
