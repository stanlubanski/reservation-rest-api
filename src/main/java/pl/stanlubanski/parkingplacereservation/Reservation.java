package pl.stanlubanski.parkingplacereservation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {

    private @Id @GeneratedValue Long reservationId;
    private String clientName;
    private int spotNumber;
    private int spotLevel;
    private String forDisabled;

    Reservation(String clientName, int spotNumber, int spotLevel, String forDisabled) {
        this.clientName = clientName;
        this.spotNumber = spotNumber;
        this.spotLevel = spotLevel;
        this.forDisabled = forDisabled;
    }

    public long getID() {
        return this.reservationId;
    }

    public String getClientName() {
        return this.clientName;
    }

    public int getSpotNumber() {
        return this.spotNumber;
    }

    public int getSpotLevel() {
        return this.spotLevel;
    }

    public String getForDisabled() {
        return this.forDisabled;
    }

    public void setReservationID(Long reservationId) {
        this.reservationId = reservationId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public void setSpotLevel(int spotLevel) {
        this.spotLevel = spotLevel;
    }

    public void setForDisabled(String forDisabled) {
        this.forDisabled = forDisabled;
    }

}

