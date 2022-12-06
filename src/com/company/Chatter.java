package com.company;

public class Chatter extends Client{
    public String nickname;
    public Chatroom chatroom;

    public Chatter(String login, String password, String nickname) {
        super(login, password);
        this.nickname = nickname;
    }

    public void sendMessage(String message){
        System.out.println(nickname + " has sent a  message: " + message);
        chatroom.relayMessage(this, message);
    }

    public void receiveMessage(String message){
        System.out.println(nickname + " received message: " + message);
    }


}
