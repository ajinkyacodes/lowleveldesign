package LLD1.Lecture7.Assignments.TrainReservationSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReservationSystem {
    private final Map<String,Integer> availableSeats;
    private final Map<String, Lock> seatTypeLocks;

    public ReservationSystem(Map<String, Integer> availableSeats) {
        this.availableSeats = new HashMap<>(availableSeats);
        this.seatTypeLocks = new HashMap<>();
        for (String seatType : availableSeats.keySet()) {
            seatTypeLocks.put(seatType, new ReentrantLock());
        }
    }

    // TODO: Complete the reserveSeats() method
    //Do not remove the try-catch block. You must write your code inside it
    // The method will be called concurrently by multiple people trying to book multiple seats at same time
    public boolean reserveSeats(String seatType, int numSeats) {
        //TODO : acquire the lock
        seatTypeLocks.get(seatType).lock();
        try {
            //TODO: try to book required seats of the provided seat type inside the try block
            if(availableSeats.get(seatType)>=numSeats) {
                availableSeats.put(seatType, availableSeats.get(seatType) - numSeats);
                return true;
            }
            return false; // Not enough seats available
        } finally {
            //TODO : release the lock in finally block as this will always execute
            seatTypeLocks.get(seatType).unlock();
        }
    }

    public int getAvailableSeats(String seatType) {
        return availableSeats.get(seatType);
    }
}