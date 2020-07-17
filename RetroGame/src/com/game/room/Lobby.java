package com.game.room;

import com.game.person.Staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lobby extends Room {
    //INSTANT VARIABLE
    private Staff staff;
    private String roomMessage="\n\nYOU ARE IN THE LOBBY AND SEE MANY CLASSROOMS.";
    private List<String> actions=new ArrayList(Arrays.asList(
       "ENTER JAVA",
       "ENTER JAVASCRIPT",
       "ENTER ALGORITHM",
       "ENTER LINUX",
       "ENTER PYTHON",
       "ENTER CAPSTONE",
       "ENTER BREAKOUT"
    ));

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

    public String getRoomMessage() {
        return roomMessage;
    }
    public void setRoomMessage(String roomMessage){
        this.roomMessage=roomMessage;
    }

    public List<String> getActions() {
        return actions;
    }


    @Override
    public String toString() {
        return "Lobby{" +
                "name=" + getName() +", "+
                getStaff()+"} ";
    }
}
