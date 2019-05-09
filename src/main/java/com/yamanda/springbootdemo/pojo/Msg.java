package com.yamanda.springbootdemo.pojo;

public class Msg {
    private String title;
    private String context;
    private String etraInfo;

    public Msg(String title, String context, String etraInfo) {
        this.title = title;
        this.context = context;
        this.etraInfo = etraInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getEtraInfo() {
        return etraInfo;
    }

    public void setEtraInfo(String etraInfo) {
        this.etraInfo = etraInfo;
    }
}
