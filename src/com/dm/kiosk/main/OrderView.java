package com.dm.kiosk.main;

public class OrderView implements View{
    @Override
    public void emptyShow() {

    }

    @Override
    public void hasItemShow() {
        System.out.println("Proceeding with the order");
        System.out.println("\n[ORDERS]");
        Kiosk.cart.cartItems.entrySet().stream().forEach(item -> System.out.println
                (item.getKey().getItemName()+" | "+item.getKey().getPrice()+"₩  | "+item.getKey().getDescription()));
        System.out.println("TOTAL : "+Kiosk.cart.getTotalPrice());
        System.out.println("1. 주문   2. 메뉴판 ");
    }
}

/*hashMap을 stream객체로 반환받기 위해서 먼저 set(entrySet)으로 반환받은 다음 stream객체로 반환받는다. set타입으로 참조되니까 key를 통해 값에 접근한다.  */
