package bookMyShowDp;

public class Seat {
    int id;
    int row;
    int col;
    SeatCategory seatCategory;
    Seat(int id,SeatCategory seatCategory){
        this.id=id;
        this.seatCategory=seatCategory;
    }
}
