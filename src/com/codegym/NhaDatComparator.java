package com.codegym;

import java.util.Comparator;

public class NhaDatComparator implements Comparator<NhaDat> {

    @Override
    public int compare(NhaDat o1, NhaDat o2) {
        if (o1.getTradingID() > o2.getTradingID()) {
            return 1;
        } else return -1;
    }
}
