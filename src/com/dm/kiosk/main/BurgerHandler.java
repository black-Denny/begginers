package com.dm.kiosk.main;
/*입력받은 값을 각 로직으로 조건분기에 따라 분배, 실행*/

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.dm.kiosk.main.Kiosk.cart;

public class BurgerHandler {

    /*switch case는 추가 수정 삭제에서 극악임. for문으로 자동으로 돌아야 하고 포맷을 정해야함*/


    String a = "[Shack Burger] " + 6.9 + "원 \n->토마토, 양상추, 쉑소스가 토핑된 치즈버거!";
    Scanner sc;
    Menu menu;
    int input;

    public BurgerHandler(Menu menu, Scanner sc) {
        this.menu = menu;
        this.sc = sc;
    }

    public void execute() {
        while (true) {
            input = sc.nextInt();
            if(input > menu.getMenuItemList().size() || input < 0) {
                System.out.println("0 부터 "+menu.getMenuItemList().size()+"까지의 숫자를 입력하시오");
                continue;
            }
            for (int i = 0; i < menu.getMenuItemList().size(); i++) {
                if (input == menu.getMenuItemList().get(i).getNum()) {
                    System.out.println(menu.getMenuItemList().get(i).getDescription());
                    System.out.println("장바구니에 담으시겠습니까?(1. 예     2. 아니오)");
                    int response = sc.nextInt();
                    if(response == 1) {
                        cart.addCart(menu.getMenuItemList().get(i));
                        System.out.println(menu.getMenuItemList().get(i).getItemName()+"가 장바구니에 추가되었습니다.");
                        cart.showCart();
                        return;
                    } else if(response == 2) {
                        return;
                    } else throw new InputMismatchException();

                } else if (input == 0) return;
            }

        }


    }
}
