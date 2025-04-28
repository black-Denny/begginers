package com.dm.kiosk.main;

import java.util.*;
/*필드->*/


public class Cart {
    HashMap<MenuItem, Integer> cartItems = new HashMap<>();

    public void addCart(MenuItem item) {
        cartItems.put(item, cartItems.getOrDefault(item, 0) + 1);
    }

    public void showCart() {
        for (Map.Entry<MenuItem, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey().getItemName() + " : " + entry.getValue() + "개");
        }
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }

    public double getTotalPrice() {
       return cartItems.entrySet().stream().mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue()).sum();
    }

}
/*1. 카트가 비어있는지 확인하는 메소드 arrya.isEmpty사용 인풋 없음 아웃풋 boolean,
 2. cart.add(), 맵에다 저장한다. Map<MenuItem, 수량> 에 아이템 추가하는 메소드 Kiosk Menu.menuItemList에서  in MenuItem out없음 ,
3. Cart에 담긴 모든 아이템을 조회 출력하는 메소드
* */

/*카트 클래스에서 메뉴정보를 받는게 문제인데, 만약에 메뉴를 다받는다고 해보자. 쿠팡같은건 수십만개를 받아야한다. 따라서 메뉴전체를 받아 카운트만 하는 아이디어는 안된다.
갯수정보를 저장하거나 불러올 아이디어가 떠오르지 않아 hashmap의 밸류로 하였다.
 * */

/*HashMap을 익명클래스로 처음에 오버라이드했다. 자동완성으로 되었다. 하나하나 구현해야되는데 안했다. 이렇게 한뒤 entrySet을 호출하니
* 익명클래스에 오버라이드 하지 않은(자동으로 추가되지 않은) 인터페이스 추상메소드 entrySet이 실행되었다. 익명클래스 오버라이드를 하지 않았다면
* HashMap 클래스의 오버라이드된 entrySet을 호출하여 정상작동된다.   */