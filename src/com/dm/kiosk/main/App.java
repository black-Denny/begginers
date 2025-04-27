package com.dm.kiosk.main;

public class App {
    public static void main(String[] args) {

        Menu burgerMenu = new Menu(Menu.ItemCategory.BURGER);//다른 클래스에서 참조하고싶을떄 static X, 싱글톤도 사용 경우의 수 상 안좋음. 의존성 주입이 답
        burgerMenu.addMenuItem("Shack Burger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거",1);
        burgerMenu.addMenuItem("Smoke Shack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",2);
        burgerMenu.addMenuItem("Shroom Burger", 10.0, "베지테리언 버거",3);
        burgerMenu.addMenuItem("Shack Stack", 13.9, "포토벨로 버섯패티를 기반으로 야채가 들어간 기본버거",4);

        Kiosk kiosk = new Kiosk(burgerMenu);
        kiosk.start();
    }


}

