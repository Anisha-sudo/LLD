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
        List<Integer> sorted = new ArrayList<>(seatIds);

        //sorting i am doing to avoid deadlock scenario
        Collections.sort(sorted);
        List<ReentrantLock> acquiredLock = new ArrayList<>();
        try{
            for(int id :seatIds) {
                if (seatIdToLockMap.get(id).tryLock()) {
                    acquiredLock.add(seatIdToLockMap.get(id));
                } else {
                    return false;
                }
            }

            for (int seatId : sorted) {
                if (!seatIdToStatusMap.get(seatId).equals("AVAILABLE"))
                    return false; // this actually returns from lockSeats
            }

            sorted.forEach(id->{
             seatIdToStatusMap.put(id,"LOCKED");
         });
         return true;
        }finally{
            acquiredLock.forEach(lock->{
                lock.unlock();
            });
        }


    }

    public void rollbackSeats(List<Integer>seatList){
        seatList.forEach(id->{
            seatIdToStatusMap.put(id,"AVAILABLE");});
    }

    public void updateSeatStatusToBooked(List<Integer>seatList){
        seatList.forEach(id->{
            seatIdToStatusMap.put(id,"BOOKED");});
    }
}
