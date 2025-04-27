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

    public void setNemaItem(String nemaItem) {
        this.itemName = nemaItem;
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

    public void setNum(int num) {this.num = num;}

    public int getNum() {return this.num;}

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
* hashcode는 서치용이고 정말 같은지 true/false 는 직접 대조해보는 방식이다.*/