public class SecondPage {
    public static void main(String[] args) {
        int coins = 42;
        int price = 20;

        if (coins < price) {
            System.out.println("Not enough");
        } else if (coins == price) {
            System.out.println("Enough for exact purchase");
        } else {
            if (coins >= 2 * price) {
                int discounted = price - (price * 20 / 100);
                System.out.println("20% discount applied! New price: " + discounted);
            } else {
                System.out.println("You can buy it without discount!");
            }
        }
    }
}
