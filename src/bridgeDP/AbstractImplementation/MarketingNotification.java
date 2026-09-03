package bridgeDP.AbstractImplementation;

import bridgeDP.ConcreteImplementn.NotificationSender;

public class MarketingNotification extends Notification{

    public MarketingNotification(NotificationSender notificationSender){
        this.notificationSender=notificationSender;
    }
    public void notifyUser(){
        System.out.print("Marketing notification sent");
        notificationSender.sendNotification();
    }
}
