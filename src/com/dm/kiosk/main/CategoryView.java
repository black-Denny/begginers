package com.dm.kiosk.main;

public class CategoryView implements View{

    private Menu menu;

    public CategoryView(Menu menu) {
        this.menu = menu;
    }

    public void emptyShow() {

        System.out.println("[MAIN MENU]");
        for(Menu.ItemCategory temp : menu.getCategoryList()) {
            System.out.println(temp.num + ". " + temp.toString());

        }
        System.out.println("0. EXIT");
    }

    public void hasItemShow(){
        
        for(Menu.ItemCategory temp : menu.getCategoryList()) {
            System.out.println(temp.num + ". " + temp.toString());

        }
        System.out.println("0. EXIT");
        System.out.println("\n[ORDER MENU]");
        System.out.println("4. ORDERS");
        System.out.println("5. CANCEL");
    }
}
