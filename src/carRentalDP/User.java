package carRentalDP;

import java.util.UUID;

public class User {
    public UUID userId;
    String name;
    String email;
    String phoneNumber;
     public  User(String username, String email, String phoneNumber) {
         this.userId=UUID.randomUUID();
         this.name=username;
         this.email=email;
         this.phoneNumber=phoneNumber;
     }
}
