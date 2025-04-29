package com.dm.kiosk.main;

import java.util.Scanner;

public class DiscountPolicy {

    public void execute() {
        double total = Kiosk.cart.getTotalPrice();
        double discountedTotal=0;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                 discountedTotal = ((100 - customerType.국가유공자.discountRate) / 100) * total;
                break;
            case 2:
                discountedTotal = ((100 - customerType.군인.discountRate) / 100) * total;
                break;
            case 3:
                discountedTotal = ((100 - customerType.학생.discountRate) / 100) * total;
                break;
            case 4:
                discountedTotal = ((100 - (customerType.일반.discountRate + 1)) / 100) * total;
                break;
        }
        System.out.printf("주문이 완료되었습니다. 금액은 %.2f원 입니다.\n\n",discountedTotal);
        Kiosk.cart.cartItems.clear();
    }
}
