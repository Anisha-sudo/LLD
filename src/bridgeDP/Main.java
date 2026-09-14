package bridgeDP;

import bridgeDP.AbstractImplementation.MarketingNotification;
import bridgeDP.AbstractImplementation.Notification;
import bridgeDP.AbstractImplementation.PaymentNotification;
import bridgeDP.ConcreteImplementn.Email;
import bridgeDP.ConcreteImplementn.SMS;

public class Main {

    public static void main(String[] args) {
        Notification notification=new PaymentNotification(new SMS());
        notification.notifyUser();
        Notification notification1=new PaymentNotification(new Email());
        notification1.notifyUser();
        Notification notification2=new MarketingNotification(new Email());
        notification2.notifyUser();
    }
}
