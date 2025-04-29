package com.dm.kiosk.main;

/*세부 메뉴 속성 가지는 클래스*/

import java.util.Objects;

public class MenuItem {

    private String itemName;
    private double price;
    private String description;
    private int num;


    public MenuItem(String itemName, double price, String description, int num) {
        this.description = description;
        this.price = price;
        this.itemName = itemName;
        this.num = num;
    }


    public String getItemName() {
        return itemName;
    }

    public void setNameItem(String nameItem) {this.itemName = nameItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNum() {return this.num;}

    public void setNum(int num) {this.num = num;}


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem item = (MenuItem) o;
        return price == item.price && num == item.num && Objects.equals(itemName, item.itemName) ;
    }

    /*hash() 파라미터 순서에따라 해시값이 달라진다. 순서를 같게 유지한다.*/
    public int hashCode() {
        return Objects.hash(itemName, price, num);
    }
}

/*Map의 키로 MenuItem 객체를 쓰려면 equals() hashcode() 를 필수로 오버라이드해야한다. 반드시 전부 넣어야하는건아니다. description 처럼 긴 String은 빼도된다.
* HashMap에서 hashCode()와 equals()는 "완벽히 일관성"이 있어야 한다.
원칙 : hashCode()를 계산할 때 사용한 모든 필드(변수)는, equals()에서도 반드시 비교해줘야 한다. HashCode가 같은 값이 저장 되면 다른객체인데 같다고 판단가능, 해시코드는 다르지만 equals에서 같다고 할수도있음
* hashcode에 투입된 변수를 정확히 같이 비교하는게 해쉬맵의 검색 빠르기 이후 정확성을 보장하는것. 빨리 대충 검색하되 판단은 제대로한다. 틀리면 빨리 넘어간다.
* hashcode는 서치용이고 정말 같은지 true/false 는 직접 대조해보는 방식이다.
* hashcode()의 파라미터로 int a, int b int c를 넣어 키값을 만들었다면, 찾을때도 똑같이 abc를 넣어서 hashcode를 만들어 찾아야한다.*/