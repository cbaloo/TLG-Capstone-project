package com.game.room;

import com.game.person.Staff;

public class Lobby extends Room {
    //INSTANT VARIABLE
    private Staff staff;

    //CONSTRUCTOR
    public Lobby(){
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

    @Override
    public String toString() {
        return "Lobby{" +
                "name=" + getName() +", "+
                getStaff()+"} ";
    }
}
