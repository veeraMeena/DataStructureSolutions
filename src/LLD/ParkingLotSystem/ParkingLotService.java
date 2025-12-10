package LLD.ParkingLotSystem;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ParkingLotService {

    HashMap<Integer, ParkingLot> parkingLotHashMap = new HashMap<>();
    PriorityQueue<Integer> freeSlots = new PriorityQueue<>();

    public ParkingLotService(int capacity){
        for(int i=1;i<=100;i++){
            parkingLotHashMap.put(i, new ParkingLot(i));
            freeSlots.add(i);
        }
    }

    public Ticket park(Vechicle vechicle) throws Exception {
        if(freeSlots.isEmpty()){
            throw new Exception("Parking slot is full");
        }
        int slotId = freeSlots.poll();
        ParkingLot parkingLot =  parkingLotHashMap.get(slotId);
        parkingLot.isOccupied=true;
        Ticket ticket = new Ticket(slotId, slotId, 0L, vechicle.number);
        System.out.println("Allocated "+ticket);
        return  ticket;
    }

    public void unPark(Ticket ticket){
        if(parkingLotHashMap.get(ticket.slotId).isOccupied){
            parkingLotHashMap.get(ticket.slotId).isOccupied=false;
            freeSlots.add(ticket.slotId);
            System.out.println("UnPark Sucesfull for slot"+ ticket.slotId);
        }else{
            System.out.println("wrong ticket");
        }
    }
}
