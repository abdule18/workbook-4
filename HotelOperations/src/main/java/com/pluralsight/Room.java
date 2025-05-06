package com.pluralsight;

public class Room {
    private int numberOfbed;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfbed, double price) {
        this.numberOfbed = numberOfbed;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
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
        return (!this.occupied) && (!this.dirty);
    }

    public void checkIn() {
        this.occupied = true;
        this.dirty = true;
    }


    public void checkOut() {
        this.occupied = false;
    }

    public void cleanroom() {
        this.dirty = false;
    }

}
