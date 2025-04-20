import java.awt.*;

public class MenuItem implements MenuComponent {

    String name;

    MenuItem(String name) {
        this.name = name;
    }


    @Override
    public void display() {
        System.out.println("MenuItem:"+name);
    }
}
