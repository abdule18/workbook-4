package com.pluralsight;

public class Room {
    private int numberOfbed;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;
    private boolean checkIn;
    private boolean checkOut;
    private boolean cleanroom;

    public Room(int numberOfbed, double price, boolean occupied, boolean dirty, boolean available, boolean checkIn, boolean checkOut, boolean cleanroom) {
        this.numberOfbed = numberOfbed;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cleanroom = cleanroom;
    }

    public int getNumberOfbed() {
        return numberOfbed;
    }

    public void setNumberOfbed(int numberOfbed) {
        this.numberOfbed = numberOfbed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isCleanroom() {
        return cleanroom;
    }

    public void setCleanroom(boolean cleanroom) {
        this.cleanroom = cleanroom;
    }
}
