package com.company;

public abstract class Client {
    public String login;
    protected String password;

    public Client(String login, String password){
        this.login = login;
        this.password = password;
    }


}
