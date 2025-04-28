package com.dm.kiosk.main;

public class CategoryView implements View{

    private Menu menu;

    public CategoryView(Menu menu) {
        this.menu = menu;
    }
    /*스트림 사용하여 조회*/
    public void emptyShow() {
        System.out.println("[MAIN MENU]");
        for(Menu.ItemCategory temp : menu.getCategoryList()) {
            System.out.println(temp.num + ". " + temp.toString());
        }
        System.out.println("0. EXIT");
    }
    /*스트림 사용하여 조회*/
    public void hasItemShow(){
        System.out.println("[MAIN MENU]");
        for(Menu.ItemCategory temp : menu.getCategoryList()) {
            System.out.println(temp.num + ". " + temp.toString());
        }
        System.out.println("0. EXIT");
        System.out.println("\n[ORDER MENU]");
        System.out.println("4. ORDERS");
        System.out.println("5. CANCEL");
    }
}
