package bookMyShowDp;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class Show {
    int showId;
    LocalDate showDate;
    LocalTime showTime;
    public Movie movie;
    Screen screen;

    Map<Integer,String> seatIdToStatusMap = new HashMap<>();
    Map<Integer, ReentrantLock> seatIdToLockMap = new HashMap<>();



    public Show(int id, LocalDate date, LocalTime time, Movie movie, Screen screen) {
        this.showId=id;
        this.movie=movie;
        this.showDate=date;
        this.showTime=time;
        this.screen=screen;
        List<Seat>seatList=screen.seatList;
        seatList.forEach(seat -> {
            seatIdToStatusMap.put(seat.id,"AVAILABLE");
            seatIdToLockMap.put(seat.id, new ReentrantLock());
        });
    }

    public boolean lockSeats(List<Integer> seatIds){
        Collections.sort(seatIds);
        List<ReentrantLock> acquiredLock = new ArrayList<>();
        try{
        seatIds.forEach(id->{
            seatIdToLockMap.get(id).lock();
            acquiredLock.add(seatIdToLockMap.get(id));
        });

         for (int seatId:seatIds){
             if (!seatIdToStatusMap.get(seatId).equals("AVAILABLE"))
                 return false;

         }

         seatIds.forEach(id->{
             seatIdToStatusMap.put(id,"LOCKED");
         });
         return true;
        }finally{
            acquiredLock.forEach(lock->{
                lock.unlock();
            });
        }


    }
}
