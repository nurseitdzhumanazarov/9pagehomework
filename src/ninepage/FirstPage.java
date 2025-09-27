public class FirstPage {
    public static void main(String[] args) {
        String heroName = "Alex";
        int coins = 42;
        String[] items = {"Bread", "Potion", "Sword"};
        int[] prices = {5, 12, 50};

        System.out.println("Hero: " + heroName + ", Coins: " + coins);
        System.out.println("Item       | Price | Can Buy");
        System.out.println("-----------+-------+---------");

        for (int i = 0; i < items.length; i++) {
            int canBuy = coins / prices[i];
            System.out.printf("%-10s | %5d | %3d%n", items[i], prices[i], canBuy);
        }
    }
}
