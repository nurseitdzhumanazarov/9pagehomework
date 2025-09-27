import java.util.Random;

public class EighthPage {
    public static void main(String[] args) {
        Hero h1 = new Hero("Alex", 20, 10);
        Hero h2 = new Hero("Mila", 20, 10);
        Shop shop = new Shop();
        Random rand = new Random();

        for (int round = 1; round <= 10; round++) {
            Hero current = (round % 2 == 1) ? h1 : h2;
            int action = 1 + rand.nextInt(3); // 1=run,2=work,3=rest

            switch (action) {
                case 1 -> current.run();
                case 2 -> current.work();
                case 3 -> current.rest();
            }

            if (rand.nextBoolean()) { // randomly buy something
                shop.sell(current, rand.nextInt(3));
            }
        }

        System.out.println("\n--- Results ---");
        h1.printStatus();
        h2.printStatus();

        int score1 = h1.coins + h1.inventory.size();
        int score2 = h2.coins + h2.inventory.size();

        if (score1 > score2) {
            System.out.println("Winner: " + h1.getName());
        } else if (score2 > score1) {
            System.out.println("Winner: " + h2.getName());
        } else {
            System.out.println("It's a tie!");
        }
    }
}
