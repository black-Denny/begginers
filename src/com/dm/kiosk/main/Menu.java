package com.dm.kiosk.main;

/*MenuItem 클래스를 관리하는 클래스 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함합니다.*/

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    /*여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 카테고리 이름 필드를 갖습니다.*/
    enum ItemCategory {
        BURGER(1),
        FRIES(2),
        BEVERAGE(3);

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
    private ArrayList<ItemCategory> categoryList = new ArrayList<>(Arrays.asList(ItemCategory.values()));
    private ArrayList<MenuItem> menuItemList = new ArrayList<>();
    private ItemCategory itemCategory;

    public void addMenuItem(String itemName, double price, String description, int num) {
        MenuItem temp = new MenuItem(itemName, price, description, num);
        menuItemList.add(temp);
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void showMenuItem() {
        int i = 1;
        for (MenuItem temp : menuItemList) {
            System.out.println(i + ". " + temp.getItemName() + " " + temp.getPrice() + " " + temp.getDescription());
            i++;
        }
    }

    public ArrayList<MenuItem> getMenuItemList() {return menuItemList;}

    public ArrayList<ItemCategory> getCategoryList() {
        return categoryList;
    }




}
