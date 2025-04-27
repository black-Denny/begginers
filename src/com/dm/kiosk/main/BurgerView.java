package com.dm.kiosk.main;

/*디스플레이와 입력값 전달*/

public class BurgerView implements View {

    private Menu menu;

    public BurgerView(Menu menu) {
        this.menu = menu;
    }

    public void emptyShow() {
        System.out.println("[BURGER MENU]");
        int i = 1;
        for(MenuItem temp : menu.getMenuItemList()) {
            System.out.println(i+". ["+temp.getItemName()+"] "+temp.getPrice()+" ₩  | "+temp.getDescription());
            i++;
        }
        System.out.println("0. 뒤로가기");
    }

    public void hasItemShow() {

        System.out.println("[BURGER MENU]");
        int i = 1;
        for(MenuItem temp : menu.getMenuItemList()) {
            System.out.println(i+". ["+temp.getItemName()+"] "+temp.getPrice()+" ₩  | "+temp.getDescription());
            i++;
        }
        System.out.println("0. 뒤로가기");

    }


}
