package com.dm.kiosk.main;

public class OrderView implements View{
    @Override
    public void emptyShow() {

    }

    @Override
    public void hasItemShow() {
        System.out.println("Proceeding with the order");
        System.out.println("\n[ORDERS]");
        for(MenuItem temp : Kiosk.cart.cartItems.keySet()){
            System.out.println(temp.getItemName()+" | "+temp.getPrice()+"₩  | "+temp.getDescription());
        }
        System.out.println("TOTAL : "+Kiosk.cart.getTotalPrice());
        System.out.println("1. 주문   2. 메뉴판 ");


    }
}
