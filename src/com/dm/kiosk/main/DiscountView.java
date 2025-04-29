package com.dm.kiosk.main;

import java.util.Arrays;

public class DiscountView {
    public void show() {
        Arrays.stream(customerType.values()).forEach(type -> System.out.println(type.typeNumber+". "+type+" : "+type.discountRate+"%"));
    }
}

/*enum의 constant와 member를 스트림으로 출력하기를 원함. enum에만 있는 valuew() 메소드로 해당 enum 타입의 배열을 반환받고, 배열을 stream객체로 만들기 위해서만 존재하는 스태틱 메소드
 * Arrays.stream()메소드를 사용하였다.*/