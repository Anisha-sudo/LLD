package bridgeDP.AbstractImplementation;

import bridgeDP.ConcreteImplementn.NotificationSender;

public class PaymentNotification extends Notification{

    public PaymentNotification(NotificationSender notificationSender){
        this.notificationSender=notificationSender;
    }
    public void notifyUser(){
        System.out.print("Payment notification sent");
        notificationSender.sendNotification();
    }
}
