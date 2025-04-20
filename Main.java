//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Menu fishMenu = new Menu();
        Menu italianFishMenu = new Menu();

        MenuItem italianFish1 = new MenuItem("Fish 1");
        MenuItem italianFish2 = new MenuItem("Fish 2");
        MenuItem italianFish3 = new MenuItem("Fish 3");

        italianFishMenu.add(italianFish1);
        italianFishMenu.add(italianFish2);
        italianFishMenu.add(italianFish3);

        Menu japonFishMenu = new Menu();

        MenuItem japon1 = new MenuItem("Japon 1");
        MenuItem japon2 = new MenuItem("Japon 2");

        Menu littleJaponMenu = new Menu();
        MenuItem littleJapon1 = new MenuItem("Japon 3");

        littleJaponMenu.add(littleJapon1);

        japonFishMenu.add(japon1);
        japonFishMenu.add(japon2);
        japonFishMenu.add(littleJaponMenu);

        fishMenu.add(japonFishMenu);
        fishMenu.add(italianFishMenu);

        Menu soupMenu = new Menu();
        Menu italianSoupMenu = new Menu();
        Menu japonSoupMenu = new Menu();

        soupMenu.add(italianSoupMenu);
        soupMenu.add(japonSoupMenu);

        Menu mainMenu = new Menu();

        mainMenu.add(fishMenu);
        mainMenu.add(soupMenu);

        mainMenu.display();
    }
}