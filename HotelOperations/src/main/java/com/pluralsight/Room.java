package com.pluralsight;

public class Room {
    private int numberOfbed;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int numberOfbed, double price, boolean occupied, boolean dirty, boolean available) {
        this.numberOfbed = numberOfbed;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
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
}
