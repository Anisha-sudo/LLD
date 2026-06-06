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
        Show show1=new Show(1, LocalDate.now(), LocalTime.now(),movie1,screen1);
        Show show2=new Show(1, LocalDate.now(), LocalTime.now(),movie2,screen2);

     ////////////////show attach to screen/////////////////////////
        theatreController1.attachShowToScreen(screen1,show1);
        theatreController1.attachShowToScreen(screen2,show2);

     //////create user//////////////////////////////////////////////
        User user =new User(1,"Anisha");
     /////get list of all movies in city and given date and time////
       List<Movie>movieList=theatreController1.getMovies("BANGALORE",LocalDate.now());

     /////////get all theatre by city and movie and date&time///////
        List<Theatre>theatreList =theatreController1.getTheatreByCity("Bangalore",movieList.get(0).movieName,LocalDate.now());
     for (Theatre t:theatreList){
         System.out.println("available theatre are:"+t);
     }
     //////////////After user select thetre///////////////////////////

        Theatre selectedTheatre = theatreList.get(0);
        System.out.println("Selected Theatre: " + selectedTheatre.theatreName);

     ///////show all shows available//////////////////////////////////

        List<Show> listShows=theatreController1.getShows(selectedTheatre,movieList.get(0).movieName,LocalDate.now());
        Show selectedShow=listShows.get(0);

     //////user selects seats for selectedShow//////////////////

     List<Integer> listSeatsSelected= List.of(1, 2, 3);
        System.out.println("Selected Seats: " + listSeatsSelected);

     /////////booking+payment////////////////////////////
        BookingController bookingController =new BookingController();
        bookingController.bookSeats(user,selectedShow,listSeatsSelected);






    }

}
