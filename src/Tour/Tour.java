package Tour;

public interface Tour {
    String getName();
    double getPrice();
    int getAvailableSeats();
    void reservedSeats(int seats);
}
