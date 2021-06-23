package com.codegym;

public class Dat extends NhaDat {
    private int soilType;

    public Dat() {

    }

    public Dat(int soilType) {
        this.soilType = soilType;
    }

    public Dat(int tradingID, String tradingDate, double price, double area, int soilType) {
        super(tradingID, tradingDate, price, area);
        this.soilType = soilType;
    }

    public int getSoilType() {
        return soilType;
    }

    public void setSoilType(int soilType) {
        this.soilType = soilType;
    }

    @Override
    public String toString() {
        return "Dat{" +
                "soilType='" + soilType + '\'' +
                '}';
    }

    public double totalDat(double area, double price, int soilType) {
        double total = 0;
        if (soilType == 1) {
            total = area * price * 1.5;
        } else if (soilType == 2 || soilType == 3) {
            total = area * price;
        } else {
            System.out.println("Loại đất không hợp lệ!");
        }
        return total;
    }

    public void displayTotal() {
        System.out.println(totalDat(getArea(), getPrice(), getSoilType()));
    }

    public void display() {
        System.out.println("NhaDat{" +
                "tradingID=" + getTradingID() +
                ", tradingDate=" + getTradingDate() +
                ", soilType=" + getSoilType() +
                ", price=" + getPrice() +
                ", area=" + getArea() +
                '}');
    }
}
