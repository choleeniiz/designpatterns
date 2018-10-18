package Tour;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingleTour japan = new SingleTour("Tokyo1",30000,20);
        System.out.println("Name: "+japan.getName()+" Avaiable seats: "+japan.getAvailableSeats()+" Price: "+japan.getPrice());
        japan.reservedSeats(10);
        System.out.println("Name: "+japan.getName()+" Avaiable seats: "+japan.getAvailableSeats()+" Price: "+japan.getPrice());


        List<Tour> tours = new ArrayList<Tour>();
        tours.add(new SingleTour("Osaka",20000,20));
        tours.add(new SingleTour("Hokkaido",15000,15));
        PackageTour japan2 = new PackageTour("Japan2in1",tours);
        System.out.println("Name: "+japan2.getName()+" Avaiable seats: "+japan2.getAvailableSeats()+" Price: "+japan2.getPrice());

    }
}
