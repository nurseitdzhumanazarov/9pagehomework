import java.util.Scanner;

public class NinthPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hero hero = new Hero("Alex", 0, 10);
        Shop shop = new Shop();
        boolean won = false;

        while (!won) {
            hero.printStatus();
            shop.printCatalog();
            System.out.println("Choose action: 1=Run 2=Work 3=Rest 4=Buy 5=Inventory");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> hero.run();
                case 2 -> hero.work();
                case 3 -> hero.rest();
                case 4 -> {
                    System.out.println("Enter item index: ");
                    int idx = sc.nextInt();
                    shop.sell(hero, idx);
                }
                case 5 -> hero.printStatus();
                default -> System.out.println("Invalid choice");
            }

            if (hero.hasItem("Sword") && hero.inventory.size() >= 3) {
                won = true;
                System.out.println("Victory! You bought the Sword of Victory and 2 more items!");
            }
        }
    }
}
