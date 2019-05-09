package com.yamanda.springbootdemo.pojo;

public class MessageResponse {
    private String responseMessage;

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public MessageResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
