package com.dm.kiosk.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    enum ItemCategory {
        BURGER(1),
        FRIES(2),
        BEVERAGE(3),
        CONCRETES(4);

        int num;

        ItemCategory(int num) {
            this.num = num;
        }

        /*메뉴 카테고리 이름을 반환하는 메서드가 구현되어야 합니다*/
        public String getItemCategory() {
            return this.toString();
        }
    }


    public Menu(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    /*List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경합니다.*/
    /*메뉴 객체 생성하면 자동으로 ItemCategory 상수들 리스트로 전부 저장하는 생성자*/
    private final ArrayList<ItemCategory> categoryList = new ArrayList<>(Arrays.asList(ItemCategory.values()));
    private final ArrayList<MenuItem> menuItemList = new ArrayList<>();
    private final ItemCategory itemCategory;

    public void addMenuItem(String itemName, double price, String description, int num) {
        MenuItem temp = new MenuItem(itemName, price, description, num);
        menuItemList.add(temp);
    }

    public ArrayList<MenuItem> getMenuItemList() {return menuItemList;}

    public ArrayList<ItemCategory> getCategoryList() {
        return categoryList;
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수 -> 책임분리 원칙에 어긋남
 /*   public void showMenuItem() {
        int i = 1;
        for (MenuItem temp : menuItemList) {
            System.out.println(i + ". " + temp.getItemName() + " " + temp.getPrice() + " " + temp.getDescription());
            i++;
        }
    }*/


}
