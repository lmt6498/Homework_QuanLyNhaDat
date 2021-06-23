package com.codegym;

public class Nha extends NhaDat {
    private String andress;
    private int houseType;

    public Nha() {

    }

    public Nha(String andress, int houseType) {
        this.andress = andress;
        this.houseType = houseType;
    }

    public Nha(int tradingID, String tradingDate, double price, double area, String andress, int houseType) {
        super(tradingID, tradingDate, price, area);
        this.andress = andress;
        this.houseType = houseType;
    }

    public String getAndress() {
        return andress;
    }

    public void setAndress(String andress) {
        this.andress = andress;
    }

    public int getHouseType() {
        return houseType;
    }

    public void setHouseType(int houseType) {
        this.houseType = houseType;
    }

    public double totalNha(double area, double price, int houseType) {
        double total = 0;
        if (houseType == 1) {
            total = area * price;
        } else if (houseType == 2) {
            total = area * price * 0.9;
        } else {
            System.out.println("Loại nhà không hợp lệ");
        }
        return total;
    }

    @Override
    public String toString() {
        return "Nha{" +
                "andress='" + andress + '\'' +
                ", houseType='" + houseType + '\'' +
                '}';
    }

    public void displayTotal() {
        System.out.println(totalNha(getArea(), getPrice(), getHouseType()));
    }

    public void display() {
        System.out.println("NhaDat{" +
                "tradingID=" + getTradingID() +
                ", tradingDate=" + getTradingDate() +
                ", andress=" + getAndress() +
                ", houseType=" + getHouseType() +
                ", price=" + getPrice() +
                ", area=" + getArea() +
                '}');
    }
}
