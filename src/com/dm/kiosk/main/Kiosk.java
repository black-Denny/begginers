package com.dm.kiosk.main;

/*프로그램 순서 및 흐름 제어를 담당하는 클래스
- [ ]  `Scanner`를 사용하여 여러 햄버거 메뉴를 출력합니다.
- [ ]  제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성합니다.
- [ ]  반복문을 이용해서 특정 번호가 입력되면 프로그램을 종료합니다.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {

    final private Menu menu;
    final private Scanner sc = new Scanner(System.in);

    public static Cart cart = new Cart();

    public Kiosk(Menu menu) {
        this.menu = menu;
    }

    /*메뉴 카테고리에서 결정 후 아이템 리스트 출력. 예외처리후 반복, 정상처리 후 루프종료. 리퀘스트 핸들러는 2가지 전부 각각메소드로 처리 */
    public void start() {
        /*RequestHandler를 버전을 두가지로. 메뉴카테고리 핸들러, 각 아이템 핸들러. 객체로 따로 쓸수있게 할건가? 같은 클래스 안에서 다른방법이있나. 각 모듈의 인풋 아웃풋은 어떻게 할건가? 화면이랑은 어떻게 결합할건가
         * "단일책임원칙":객체 하나가 하나의 이유만으로만 변해야한다. */
        View categoryView = new CategoryView(menu);
        View burgerView = new BurgerView(menu);
        BurgerHandler burgerHandler = new BurgerHandler(menu, sc);
        OrderView orderView = new OrderView();
        OrderHandler orderHandler = new OrderHandler();
        DiscountView discountView = new DiscountView();
        DiscountPolicy discountPolicy = new DiscountPolicy();
        int input;

        /*(입력과 입력조건에따른 분기 마스터해야함, 모듈 그리고 논리처리)입력받고 if 하나로 */
        while (true) {
            try {
                if (Kiosk.cart.isEmpty()) {
                    categoryView.emptyShow();
                    input = sc.nextInt();
                    switch (input) {
                        case 0:
                            System.out.println("키오스크 종료");
                            return;
                        case 1:
                            burgerView.emptyShow();
                            burgerHandler.execute();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                } else if(!Kiosk.cart.isEmpty()) {
                    categoryView.hasItemShow();
                    input = sc.nextInt();
                    switch (input) {
                        case 0:
                            System.out.println("키오스크 종료");
                            return;
                        case 1:
                            burgerView.hasItemShow();
                            burgerHandler.execute();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4://Orders
                            orderView.hasItemShow();
                            orderHandler.execute();
                            discountView.show();
                            discountPolicy.execute();
                            break;
                        case 5://Cancel
                            cart.cartItems.clear();
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input Error\n");
                sc.nextLine(); //이건 자바 Scanner.nextInt()가 문자 입력 실패 후에도 입력 버퍼에 남은 데이터를 처리하지 않기 때문에 생기는 전형적인 함정이야.
            } catch (IndexOutOfBoundsException e) {
                System.out.println("1 부터 " + menu.getCategoryList().size() + " 까지의 숫자를 입력하시오.");
            }
        }
    }
}

/*인터페이스 implement한 클래스가 있어. 근데 예를 들어show()메소드를 다시 2가지 버전으로 만들고싶어. 만약 인터페이스를 2개로 만든다면
 이걸 implement하는 다른 클래스도 영향받잖아. 이럴떄 어떻게해야될까*/