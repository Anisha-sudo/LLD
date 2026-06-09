package bookMyShowDp;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    //3dscreen,2dscreen etc
    public City city;
    String theatreName;
    public List<Screen> screenList;
    Theatre(City city,String name ,List<Screen>screenList){
        this.city=city;
        this.theatreName=name;
        this.screenList= new ArrayList<>(screenList);
    }
    public void addScreen(Screen screen){
        screenList.add(screen);
    }

}
