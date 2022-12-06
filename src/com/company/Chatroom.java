package com.company;

import java.util.ArrayList;
import java.util.List;

public class Chatroom {
    List<Chatter> members = new ArrayList<>();

    public Chatroom(){

    }

    public void addMember(Chatter chatter){
        members.add(chatter);
    }

    public void relayMessage(Chatter user ,String message){
        for(Chatter member : members){
            if(!member.equals(user))
            member.receiveMessage(message);
        }
    }
}
