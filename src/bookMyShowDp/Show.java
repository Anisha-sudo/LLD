package bookMyShowDp;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Show {
    int showId;
    Date showDate;
    Time showTime;
    Movie movie;
    Screen screen;
    List<Seat> seatList;


    public Show(int i, LocalDate now, LocalTime now1, Movie movie, Screen screen1, List<Seat> seats) {
        this.showId=showId;

    }
}
