package LLD.ParkingLotSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingSlotMain {
    public static void main(String[] args) throws Exception {
        ParkingLotService parkingLotService = new ParkingLotService(100);

        Ticket ticketA = parkingLotService.park(new Vechicle("A", VechicleType.BIKE));
        Ticket ticketB = parkingLotService.park(new Vechicle("A", VechicleType.CAR));
        parkingLotService.park(new Vechicle("A", VechicleType.BIKE));
        parkingLotService.park(new Vechicle("A", VechicleType.BIKE));

        parkingLotService.unPark(ticketA);
        parkingLotService.unPark(ticketB);

        Ticket ticketC = parkingLotService.park(new Vechicle("A", VechicleType.BIKE));

        for(int i =0;i<10;i++){
            parkingLotService.park(new Vechicle("A", VechicleType.CAR));
        }

    }
}
