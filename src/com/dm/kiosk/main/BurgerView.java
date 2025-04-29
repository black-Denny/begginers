package com.dm.kiosk.main;

/*디스플레이와 입력값 전달*/

import java.util.concurrent.atomic.AtomicInteger;

public class BurgerView implements View {

    private Menu menu;

    public BurgerView(Menu menu) {
        this.menu = menu;
    }

    public void emptyShow() {
        /*스트림 사용하여 조회*/
        System.out.println("[BURGER MENU]");
        AtomicInteger i = new AtomicInteger(1);
        /*temp 에서 자동으로 알아서 타입이 지정됨*/
        menu.getMenuItemList().stream().forEach(temp -> System.out.println(i+". ["+temp.getItemName()+"] "+temp.getPrice()+" ₩  | "+temp.getDescription()));
        System.out.println("0. 뒤로가기");
    }

    public void hasItemShow() {
        /*스트림 사용하여 조회*/
        System.out.println("[BURGER MENU]");
        AtomicInteger i = new AtomicInteger(1);
        menu.getMenuItemList().stream().forEach(temp -> System.out.println(i+". ["+temp.getItemName()+"] "+temp.getPrice()+" ₩  | "+temp.getDescription()));
        System.out.println("0. 뒤로가기");


    }


}
