package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý Nhà đất: ");
            System.out.println("1. Thêm giao dịch: ");
            System.out.println("2. Tính tổng số lượng:");
            System.out.println("3. Xóa giao dịch theo ngày:");
            System.out.println("4. Hiển thị:");
            System.out.println("5. Tính tiền giao dịch theo ngày:");
            System.out.println("6. Tìm giao dịch theo mã giao dịch:");
            System.out.println("7. Sắp xếp theo mã giao dịch:");
            System.out.println("0. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại giao dịch:");
                    System.out.println("1. Giao dịch đất: ");
                    System.out.println("2. Giao dịch nhà: ");
                    int choice1 = Integer.parseInt(sc.nextLine());
                    switch (choice1) {
                        case 1:
                            int tradingID = getTradingID(sc);
                            String tradingDate = getString(sc);
                            double price = getPrice(sc);
                            double area = getArea(sc);
                            System.out.println("Nhập loại đất(1.A,2.B,3.C): ");
                            int soilType = Integer.parseInt(sc.nextLine());
                            QuanLyNhaDat.addSoil(tradingID, tradingDate, price, area, soilType);
                            QuanLyNhaDat.show();
                            break;
                        case 2:
                            int tradingID1 = getTradingID(sc);
                            String tradingDate1 = getString(sc);
                            double price1 = getPrice(sc);
                            double area1 = getArea(sc);
                            System.out.println("Nhập địa chỉ: ");
                            String address = sc.nextLine();
                            System.out.println("Nhập loại nhà (1.Cao cấp, 2.Thường): ");
                            int houseType = Integer.parseInt(sc.nextLine());
                            QuanLyNhaDat.addHouse(tradingID1, tradingDate1, price1, area1, address, houseType);
                            QuanLyNhaDat.show();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chọn loại giao dịch:");
                    System.out.println("1. Giao dịch đất: ");
                    System.out.println("2. Giao dịch nhà: ");
                    int choice2 = Integer.parseInt(sc.nextLine());
                    switch (choice2) {
                        case 1:
                            System.out.println("Số lượng giao dịch đất: ");
                            QuanLyNhaDat.countDat();
                            break;
                        case 2:
                            System.out.println("Số lượng giao dịch nhà: ");
                            QuanLyNhaDat.countNha();
                            break;
                    }
                    break;
                case 3:
                    String dateRemove = getString(sc);
                    QuanLyNhaDat.removeByDate(dateRemove);
                    QuanLyNhaDat.show();
                    break;
                case 4:
                    System.out.println("Hiển thị");
                    QuanLyNhaDat.show();
                    break;
                case 5:
                    System.out.println("Tính tiền theo ngày: ");
                    QuanLyNhaDat.totalPriceByDate();
                    break;
                case 6:
                    System.out.println("Tìm kiếm theo ID: ");
                    QuanLyNhaDat.findByID();
                    break;
                case 7:
                    System.out.println("Sắp xếp theo ID: ");
                    QuanLyNhaDat.sortByID();
                    QuanLyNhaDat.show();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    private static double getArea(Scanner sc) {
        System.out.println("Nhập diện tích: ");
        double area = Double.parseDouble(sc.nextLine());
        return area;
    }

    private static double getPrice(Scanner sc) {
        System.out.println("Nhập đơn giá: ");
        return Double.parseDouble(sc.nextLine());
    }

    private static String getString(Scanner sc) {
        System.out.println("Nhập ngày giao dịch: ");
        return sc.nextLine();
    }

    private static int getTradingID(Scanner sc) {
        System.out.println("Nhập mã giao dịch: ");
        return Integer.parseInt(sc.nextLine());
    }
}

