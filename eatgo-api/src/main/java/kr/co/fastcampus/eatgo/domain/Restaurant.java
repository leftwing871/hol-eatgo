package kr.co.fastcampus.eatgo.domain;


import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final long id;
    private final String name;
    private final String address;

    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return name + " in " + address;
    }

    public Object getAddress() {
        return address;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }


    public void setMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            addMenuItem(menuItem);
        }
    }
}
