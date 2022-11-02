package com.example.springwebsocket.dtos;

public class WsMessage {

    private String sender;
    private String message;

    public WsMessage(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public WsMessage() {

    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "WsMessage{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                '}';
    }



}
