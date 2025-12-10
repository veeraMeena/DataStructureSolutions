package LLD.ParkingLotSystem;

import java.util.Date;

public class Ticket {
    int ticketId;
    int slotId;
    long entryTime;
    String vechicleNumber;

    public Ticket(int ticketId, int slotId, long entryTime, String vechicleNumber) {
        this.ticketId = ticketId;
        this.slotId = slotId;
        this.entryTime = entryTime;
        this.vechicleNumber = vechicleNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", slotId=" + slotId +
                ", entryTime=" + entryTime +
                ", vechicleNumber='" + vechicleNumber + '\'' +
                '}';
    }
}
