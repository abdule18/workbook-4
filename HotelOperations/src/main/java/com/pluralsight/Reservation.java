package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend, int reservationTotal) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double basePrice = 0;

        if(roomType.equalsIgnoreCase("King")){
            basePrice = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            basePrice = 124;
        }

        if(this.weekend){
            basePrice *= 1.10;
        }

        return basePrice;
    }


    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }

}
