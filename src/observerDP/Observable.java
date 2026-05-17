package observerDP;

import java.util.List;

public interface Observable {
   public int getSize();
   public void setObserverList(List<notification> observerList);
   public void update(int val);

}
