public class ThirdPage {
    public static void main(String[] args) {
        int target = 50;
        int monthly = 7;
        int bonus = 10;
        int coins = 0;
        int month = 0;

        System.out.println("Month | Coins total");
        System.out.println("------+------------");

        while (coins < target) {
            month++;
            coins += monthly;
            if (month % 4 == 0) {
                coins += bonus;
            }
            System.out.printf("%5d | %5d%n", month, coins);
        }

        System.out.println("It takes " + month + " months to buy the sword!");
    }
}
