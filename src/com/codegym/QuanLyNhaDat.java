package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhaDat {
    public static Scanner sc = new Scanner(System.in);
    static ArrayList<NhaDat> list = new ArrayList<>();

    public static void addSoil(int tradingID, String tradingDate, double price, double area, int soilType) {
        list.add(new Dat(tradingID, tradingDate, price, area, soilType));
    }

    public static void addHouse(int tradingID, String tradingDate, double price, double area, String andress, int houseType) {
        list.add(new Nha(tradingID, tradingDate, price, area, andress, houseType));
    }

    public static void countDat() {
        int count = 0;
        for (NhaDat s : list) {
            if (s instanceof Dat) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void countNha() {
        int count = 0;
        for (NhaDat s : list) {
            if (s instanceof Nha) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void removeByDate(String tradingDate) {
        NhaDat target = null;
        for (NhaDat s : list) {
            if (s.getTradingDate().equals(tradingDate)) {
                target = s;
            }
        }
        list.remove(target);
    }

    public static void totalPriceByDate() {
        System.out.println("Nhập ngày: ");
        String tradingDate = sc.nextLine();
        for (NhaDat s : list) {
            if (s instanceof Dat) {
                if (((Dat) s).getTradingDate().equals(tradingDate)) {
                    s.display();
                    System.out.println("Tổng tiền: ");
                    ((Dat) s).displayTotal();
                }
            } else if (s instanceof Nha) {
                if (((Nha) s).getTradingDate().equals(tradingDate)) {
                    s.display();
                    System.out.println("Tổng tiền: ");
                    s.displayTotal();
                }
            }
        }
    }

    //    static void findByTradingID() {
//        NhaDatComparator sort = new NhaDatComparator();
//        list.sort(sort);
//        System.out.println("Nhập id:");
//        int id = sc.nextInt();
//        int index = Collections.binarySearch(list,new NhaDat(id),sort);
//        System.out.println(list.get(index));
//    }
    public static int timKiemNhiPhan(ArrayList<NhaDat> list, int dau, int cuoi, int id) {
        sortByID();
        int giua = (dau + cuoi) / 2;
        if (id > list.get(cuoi).getTradingID() || id < list.get(dau).getTradingID()) {
            return -1;
        } else if (cuoi < dau) {
            return -1;
        } else if (id == list.get(giua).getTradingID()) {
            return giua;
        } else if (id > list.get(giua).getTradingID()) {
            return timKiemNhiPhan(list, giua + 1, cuoi, id);
        } else return timKiemNhiPhan(list, dau, giua - 1, id);
    }

    public static void findByID() {
        int head = 0;
        int tail = list.size() - 1;
        System.out.print("Nhập ID muốn tìm: ");
        int index = Integer.parseInt(sc.nextLine());
        int temp = timKiemNhiPhan(list, head, tail, index);
        System.out.println(list.get(temp));
    }

    static void sortByID() {

        Comparator idComparator = new NhaDatComparator();
        list.sort(idComparator);
    }

    static void show() {
        for (NhaDat s : list) {
            s.display();
        }
    }
}

