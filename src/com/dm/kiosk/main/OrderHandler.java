package com.dm.kiosk.main;

import java.util.Scanner;

public class OrderHandler {

    public void execute(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        switch (val){
            case 1:
                System.out.println("TOTAL : "+Kiosk.cart.getTotalPrice());
                return;
            case 2:
                return;
        }
    }
}
