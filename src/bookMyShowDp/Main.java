package bookMyShowDp;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Seat> getSeats(int capacity){
        List<Seat> seatList=new ArrayList<>();
        for(int i=0;i<capacity;i++){
            seatList.add(new Seat(i,SeatCategory.SILVER));
        }
        return seatList;
    }

    public static  void main(String[] args) {

        /////////////theatre setup//////////////
        Screen screen1=new Screen(1,"2D",500,50,getSeats(50));
        Screen screen2=new Screen(2,"3D",400,30,getSeats(30));

        Theatre theatre1 = new Theatre(City.BLR,"PVR",Arrays.asList(screen1));
        Theatre theatre2 = new Theatre(City.BLR,"INOX",Arrays.asList(screen1,screen2));
        Theatre theatre3 = new Theatre(City.DELHI,"PVR",Arrays.asList(screen1,screen2));
        Theatre theatre4= new Theatre(City.DELHI,"INOX",Arrays.asList(screen1,screen2));
        Theatre theatre5= new Theatre(City.MUMBAI,"PVR",Arrays.asList(screen1,screen2));

        TheatreController theatreController1=new TheatreController();
        theatreController1.addScreen(theatre1,screen2);
        theatreController1.addTheatre(Arrays.asList(theatre1,theatre2,theatre3,theatre4,theatre5));
     ////////////////movie creation//////////////////////
        Movie movie1 =new Movie("BAHUBALI");
        Movie movie2 =new Movie("singham");

     ////////////show creation/////////////////////////////
        Show show1=new Show(1, LocalDate.now(), LocalTime.now(),movie1,screen1,getSeats(100));
        Show show2=new Show(1, LocalDate.now(), LocalTime.now(),movie2,screen2,getSeats(100));

     ////////////////show attach to screen//////////////////
        theatreController1.attachShowToScreen(screen1,show1);
        theatreController1.attachShowToScreen(screen2,show2);

     //////create user//////////////////////////////////////
        


    }

}
