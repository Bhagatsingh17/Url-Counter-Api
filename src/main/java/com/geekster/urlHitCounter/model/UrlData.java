package com.geekster.urlHitCounter.model;

public class UrlData {
    private String userName;
    private int count;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public UrlData(int count) {
        this.count = count;
    }

    public UrlData(String userName, int count) {
        this.userName = userName;
        this.count = count;
    }

    @Override
    public String toString() {
        return "UrlData{" +
                "userName='" + userName + '\'' +
                ", count=" + count +
                '}';
    }
}
