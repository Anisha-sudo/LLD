package carRentalDP;

import java.util.UUID;

public class User {
    public UUID userId;
    String name;
    String email;
    String phoneNumber;
     public  User(){
         this.userId=UUID.randomUUID();
     }
}
