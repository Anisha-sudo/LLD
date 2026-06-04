package bookMyShowDp;

import bookMyShowDp.service.TheatreService;

import java.util.List;

public class TheatreController {
    TheatreService theatreService;

    TheatreController(){
        this.theatreService=new TheatreService();
    }
    public void addScreen(Theatre theatre,Screen screen){
        theatre.addScreen(screen);
    }

    public void addTheatre(List<Theatre> theatrelist){
        theatreService.addTheatre(theatrelist);

    }
    public void  attachShowToScreen(Screen screen,Show show){
        screen.attachShow(show);
    }



}
