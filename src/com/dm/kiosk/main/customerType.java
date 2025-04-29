package com.dm.kiosk.main;

import java.util.HashMap;

public enum customerType {
    국가유공자(10, 1),
    군인(5, 2),
    학생(3, 3),
    일반(0, 4);

    double discountRate;
    int typeNumber;

    customerType(double discountRate, int typeNumber) {
        this.discountRate = discountRate;
        this.typeNumber = typeNumber;
    }
}
