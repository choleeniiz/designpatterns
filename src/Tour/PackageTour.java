package Tour;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();
    private int minSeats;



    public PackageTour(String packageName, List<Tour> tours) {
        this.packageName = packageName;
        this.tours = tours;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }
    @Override
    public String getName() {
        return packageName;
    }


    @Override
    public int getAvailableSeats() {
        int availableSeats = tours.get(0).getAvailableSeats();
        for (Tour t : tours){
            if (t.getAvailableSeats()<availableSeats){
                availableSeats = t.getAvailableSeats();
                minSeats = tours.indexOf(t);
            }
        }

        return availableSeats;
    }

    @Override
    public void reservedSeats(int seats) {
        tours.get(minSeats).reservedSeats(seats);
    }


}
