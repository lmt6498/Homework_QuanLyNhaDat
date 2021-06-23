package com.codegym;

public class NhaDat {
    private int tradingID;
    private String tradingDate;
    private double price;
    private double area;

    public NhaDat() {

    }

    public NhaDat(int tradingID) {
        this.tradingID = tradingID;
    }

    public NhaDat(int tradingID, String tradingDate, double price, double area) {
        this.tradingID = tradingID;
        this.tradingDate = tradingDate;
        this.price = price;
        this.area = area;
    }

    public int getTradingID() {
        return tradingID;
    }

    public void setTradingID(int tradingID) {
        this.tradingID = tradingID;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public void setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "NhaDat{" +
                "tradingID=" + tradingID +
                ", tradingDate='" + tradingDate + '\'' +
                ", price=" + price +
                ", area=" + area +
                '}';
    }

    public void displayTotal() {
    }

    public void display() {
        System.out.println("NhaDat{" +
                "tradingID=" + getTradingID() +
                ", tradingDate=" + getTradingDate() +
                ", price=" + getPrice() +
                ", area=" + getArea() +
                '}');
    }
}
