import java.awt.*;

import java.util.ArrayList;

public class Menu implements MenuComponent {

    private ArrayList<MenuComponent> menuItems = new ArrayList<>();

    public Menu() {}

    public void add(MenuComponent menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public void display() {
        for (MenuComponent component : menuItems) {
            component.display();
        }
    }
}
