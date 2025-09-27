import java.util.ArrayList;

public class Hero {
    private String name;
    public int coins;
    public int energy;
    public ArrayList<String> inventory;

    public Hero(String name, int coins, int energy) {
        this.name = name;
        this.coins = coins;
        this.energy = energy;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public boolean hasItem(String item) {
        return inventory.contains(item);
    }

    public void printStatus() {
        System.out.println("Hero: " + name + " | Coins: " + coins + " | Energy: " + energy);
        System.out.println("Inventory: " + inventory);
    }

    public void run() {
        energy--;
        System.out.println(name + " ran! Energy left: " + energy);
    }

    public void work() {
        coins += 10;
        energy -= 2;
        System.out.println(name + " worked! +10 coins, -2 energy.");
    }

    public void rest() {
        energy = Math.min(20, energy + 5);
        System.out.println(name + " rested! Energy: " + energy);
    }

    public void buy(String item, int price) {
        if (coins >= price) {
            coins -= price;
            addItem(item);
            System.out.println(name + " bought " + item);
        } else {
            System.out.println("Not enough coins for " + item);
        }
    }
}
