package com.dm.kiosk.main;

public class App {
    public static void main(String[] args) {

        Menu burgerMenu = new Menu(Menu.ItemCategory.BURGER);//다른 클래스에서 참조하고싶을떄 static X, 싱글톤도 사용 경우의 수 상 안좋음. 의존성 주입이 답
        burgerMenu.addMenuItem("Shack Burger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거",1);
        burgerMenu.addMenuItem("Smoke Shack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",2);
        burgerMenu.addMenuItem("Cheeseburger  ", 10.0, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",3);
        burgerMenu.addMenuItem("Hamburger", 13.9, "비프패티를 기반으로 야채가 들어간 기본버거",4);

        Kiosk kiosk = new Kiosk(burgerMenu);
        kiosk.start();
    }


}

/*- [ ]  **요구사항이 가지는 의도**
    - [ ]  **의도** : 고급 자바 기능을 활용해 프로그램의 효율성과 코드의 가독성을 개선하는 것을 목표로 합니다.
    - [ ]  **목적**
        - [ ]  Enum을 통해 상수를 안전하게 관리하고, 프로그램 구조를 간결하게
        - [ ]  제네릭을 활용하여 데이터 유연성을 높이고, 재사용 가능한 코드를 설계
        - [ ]  스트림 API를 사용하여 데이터를 필터링하고, 간결한 코드로 동작을 구현
        - [ ]  **Enum을 활용한 사용자 유형별 할인율 관리하기**
    - [ ]  사용자 유형의 Enum 정의 및 각 사용자 유형에 따른 할인율 적용
        - [ ]  예시 : 군인, 학생, 일반인
    - [ ]  주문 시, 사용자 유형에 맞는 할인율 적용해 총 금액 계산
- [ ]  **람다 & 스트림을 활용한 장바구니 조회 기능**
    - [ ]  기존에 생성한 Menu의 MenuItem을 조회 할 때 스트림을 사용하여 출력하도록 수정
    - [ ]  기존 장바구니에서 특정 메뉴 빼기 기능을 통한 스트림 활용
        - [ ]  예시 : 장바구니에 SmokeShack 가 들어 있다면, stream.filter를 활용하여 특정 메뉴 이름을 가진 메뉴 장바구니에서 제거*/