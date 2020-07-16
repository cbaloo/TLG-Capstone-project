package com.game.room;

import com.game.person.Staff;

public class Lobby extends Room {
    //INSTANT VARIABLE
    private Staff staff;
    private String roomMessage = "You are now in the TLG Lobby";

    //CONSTRUCTOR
    public Lobby() {
        super();
        setName(Name.LOBBY);
        setStaff(new Staff("Jeannette"));
    }

    //ACCESSOR METHODS
    public Staff getStaff() {
        return staff;
    }

    private void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getRoomMessage() {
        return roomMessage;
    }

    @Override
    public String toString() {
        return "Lobby{" +
                "name=" + getName() + ", " +
                getStaff() + "\n" +
                getRoomMessage() + " } ";
    }
}