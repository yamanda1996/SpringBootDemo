package com.yamanda.springbootdemo.pojo;

public class Email {

    private String sender;
    private String receiver;
    private String msg;

    public Email() {

    }

    public Email(String sender, String receiver, String msg) {
        this.sender = sender;
        this.receiver = receiver;
        this.msg = msg;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return String.format("Email from %s to %s,msg = %s",
                getSender(),getReceiver(),getMsg());
    }
}
