package com.company;

public class Main {

    public static void main(String[] args) {
        Chatroom chatroom = new Chatroom();
        chatroom.addMember(new Chatter("km.maliszewski", "MocneHaslo222", "Tykher"));
        chatroom.addMember(new Chatter("dominik.gizycki", "I<3MassEffect", "Gizux"));
        chatroom.addMember(new Chatter("M.Raczko", "MamAutyzm", "Moarice"));
        chatroom.addMember(new Chatter("Ol.Borzecka", "Olgababolga69240", "Itaela"));
        chatroom.members.get(0).sendMessage("Hej wszystkim!");

    }
}
