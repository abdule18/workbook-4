package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @Test
    public void checkIn_after_occupancyShouldBeTrue(){
        //arrange
        Room r = new Room(1, 250);

        //act
        r.checkIn();
        //assert
        assertTrue(r.isOccupied());
    }

    @Test
    public void checkIn_after_dirtyShouldBeTrue(){
        Room r = new Room(2, 500);

        //act
        r.checkIn();
        //assert
        assertTrue(r.isDirty());
    }
    @Test
    public void checkIn_after_availableShouldBeFalse(){
        Room r = new Room(2, 500);
        r.checkIn();
        //act
        r.checkOut();
        //assert
        assertFalse(r.isAvailable());
    }

    @Test
    public void checkOut_after_occupancyShouldBeFalse(){
        //arrange
        Room r = new Room(2, 500);
        r.checkIn();
        //act
        r.checkOut();
        //assert
        assertFalse(r.isAvailable());
    }

    @Test
    public void checkOut_after_dirtyShouldBeTrue(){
        Room r = new Room(2, 500);

        //act
        r.checkIn();
        //assert
        assertTrue(r.isDirty());
    }

    @Test
    public void checkOut_after_availableShouldBeFalse(){
        Room r = new Room(2, 500);
        r.checkIn();
        //act
        r.checkOut();
        //assert
        assertFalse(r.isAvailable());
    }


    @Test
    public void cleanRoom_after_occupancyShouldBeFalse(){
        //arrange
        Room r = new Room(2, 500);
        r.checkIn();
        //act
        r.checkOut();
        //assert
        assertFalse(r.isAvailable());
    }

    @Test
    public void cleanRoom_after_dirtyShouldBeFalse(){
        Room r = new Room(2, 500);

        //act
        r.checkIn();
        //assert
        assertTrue(r.isDirty());
    }

    @Test
    public void cleanRoom_after_availableShouldBeTrue(){
        Room r = new Room(2, 500);
        r.checkIn();
        //act
        r.checkOut();
        //assert
        assertFalse(r.isAvailable());
    }
  
}