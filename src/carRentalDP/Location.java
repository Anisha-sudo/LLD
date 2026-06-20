package carRentalDP;

import java.util.Objects;

public class Location {
    String name;
    public  int pincode;
    String address;



    @Override
    public int hashCode() {
        return Objects.hash(pincode);
    }
     @Override
     public boolean equals(Object obj){
        if(this==obj)return true;
        if(!(obj instanceof Location)){
            return false;
        }
        return ((Location) obj).pincode==this.pincode;
     }
}
