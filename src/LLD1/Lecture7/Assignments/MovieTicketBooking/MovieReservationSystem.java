package LLD1.Lecture7.Assignments.MovieTicketBooking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MovieReservationSystem {
    private int availableSeats;
    private final Lock reservationLock;

    //TODO: Initialise the constructor

    public MovieReservationSystem(int totalSeats) {
        //initialises lock and the total seats available for reservation
        this.availableSeats = totalSeats;
        reservationLock = new ReentrantLock();
    }

    //TODO: Implement this method and try to book numSeats number of movie tickets
    public boolean reserveSeats(int numSeats) {

        //TODO: acquire the lock before starting the operation (Do not remove the try-finally block)
        try {
            //write the logic here for booking the desired number of seats
            reservationLock.lock();
            if (getAvailableSeats() >= numSeats) {
                this.availableSeats -= numSeats;
                return true;
            } else {
                return false;
            }
        } finally {
            //TODO: release the lock as this will always be executed
            reservationLock.unlock();
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}