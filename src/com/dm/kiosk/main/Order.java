package com.dm.kiosk.main;

import java.util.Scanner;

public class Order {

    public void execute(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        switch (val){
            case 1:
                System.out.println("주문이 완료되었습니다. 금액은"+" 입니다.");
                Kiosk.cart.cartItems.clear();
                return;
            case 2:
                return;
        }
    }
}
