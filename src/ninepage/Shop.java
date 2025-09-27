public class Shop {
    String[] items = {"Bread", "Potion", "Sword"};
    int[] prices = {5, 12, 50};

    public void printCatalog() {
        System.out.println("=== Shop Catalog ===");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %-10s - %d coins%n", i, items[i], prices[i]);
        }
    }

    public void sell(Hero hero, int index) {
        if (index >= 0 && index < items.length) {
            hero.buy(items[index], prices[index]);
        } else {
            System.out.println("Invalid item index.");
        }
    }
}
