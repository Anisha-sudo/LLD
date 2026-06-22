package carRentalDP;

import java.util.Objects;

public class Location {
    String name;
    public  int pincode;
    String address;

    public Location(String name,int pincode,String address){
        this.name=name;
        this.pincode=pincode;
        this.address=address;
    }

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
